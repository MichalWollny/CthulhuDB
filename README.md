1x table without FK,
2x table with FKs

SQL:

CREATE DATABASE IF NOT EXISTS cthulhu_mythos_db;
USE cthulhu_mythos_db;

CREATE TABLE IF NOT EXISTS gods (
    god_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    realm VARCHAR(100)
);

INSERT INTO gods (god_id, name, description, realm) VALUES
    (1, 'Cthulhu', 'A great old one, sleeping beneath the sea in R\'lyeh', 'R\'lyeh'),
    (2, 'Nyarlathotep', 'The crawling chaos, a shape-shifting deity', 'Earth'),
    (3, 'Azathoth', 'The blind idiot god at the center of the universe', 'Center of the Universe'),
    (4, 'Yog-Sothoth', 'The all-in-one and one-in-all, a key and a gate', 'Beyond Time and Space'),
    (5, 'Shub-Niggurath', 'The black goat of the woods with a thousand young', 'Forests'),
    (6, 'Hastur', 'The unspeakable one, linked with madness and the King in Yellow', 'Carcosa'),
    (7, 'Dagon', 'A powerful deep one associated with the sea', 'Oceans'),
    (8, 'Tsathoggua', 'A toad-like deity sleeping beneath the earth', 'N\'kai'),
    (9, 'Nodens', 'The lord of the great abyss, an elder god', 'Dreamlands'),
    (10, 'Yig', 'The father of serpents, a primordial serpent deity', 'Deserts');


CREATE TABLE IF NOT EXISTS locations (
    location_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    region VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS creatures (
    creature_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    origin_location_id INT,
    FOREIGN KEY (origin_location_id) REFERENCES locations(location_id)
);

INSERT INTO locations (location_id, name, region) VALUES
    (1, 'R\'lyeh', 'Pacific Ocean'),
    (2, 'Arkham', 'Massachusetts'),
    (3, 'Innsmouth', 'Massachusetts'),
    (4, 'Dunwich', 'Massachusetts'),
    (5, 'Carcosa', 'Unknown'),
    (6, 'Kadath', 'Dreamlands');

INSERT INTO creatures (creature_id, name, description, origin_location_id) VALUES
    (1, 'Cthulhu', 'A great old one, sleeping beneath the sea in R\'lyeh', 1),
    (2, 'Nyarlathotep', 'The crawling chaos', 5),
    (3, 'Dagon', 'A powerful deep one associated with the sea', 3),
    (4, 'Shub-Niggurath', 'The black goat of the woods with a thousand young', 4),
    (5, 'Hastur', 'The unspeakable one, linked with madness', 5),
    (6, 'Azathoth', 'The blind idiot god at the center of the universe', 6),
    (7, 'Yog-Sothoth', 'The all-in-one and one-in-all', 6);
