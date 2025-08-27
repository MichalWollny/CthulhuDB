package services;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseService
{
    private static DatabaseService instance = null;
    private final MysqlDataSource dataSource = new MysqlDataSource();
    private String connectionString = "jdbc:mysql://127.0.0.1:3306/cthulhu_mythos_db";

    public void setConnectionString(String connectionString)
    {
        this.connectionString = connectionString;
        this.dataSource.setURL(connectionString);
    }

    private DatabaseService()
    {
        this.dataSource.setUser("root");
        this.dataSource.setPassword("");

        this.dataSource.setURL(this.connectionString);
    }

    private static DatabaseService getInstance()
    {
        if(DatabaseService.instance == null)
        {
            DatabaseService.instance = new DatabaseService();
        }
        return DatabaseService.instance;
    }

    public static Connection getConnection() throws SQLException
    {
        return DatabaseService.getInstance().dataSource.getConnection();
    }
}
