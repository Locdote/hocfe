CREATE DATABASE DemoMenu;

USE DemoMenu;

DROP TABLE IF EXISTS Menu;
CREATE TABLE Menu (
	id int auto_increment,
    `name` varchar(225),
    `id_cha` int,
    url varchar(225),
    primary key (id)
);

INSERT INTO `demomenu`.`menu`
(`id`, `name`, url, `id_cha`)
VALUES
(1, "Trang Chu", "http://google.com", 0),
(2, "Cac Mau Xe", "http://google.com", 0),
(3, "Gia Xe", "http://google.com", 0),
(4, "Huyndai i10", "http://google.com", 2),
(5, "Xedan", "http://google.com", 2),
(6, "Santafe", "http://google.com", 2),
(7, "Xe Tra Gop", "http://google.com", 0),
(8, "Tin Tuc", "http://google.com", 0),
(9, "Lien He", "http://google.com", 0),
(10, "Lien He", "http://google.com", 3),
(11, "Lien He", "http://google.com", 3),
(12, "Lien He", "http://google.com", 3),
(13, "Lien He", "http://google.com", 3);
