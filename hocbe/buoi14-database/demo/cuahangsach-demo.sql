CREATE DATABASE `cuahangsach`;

USE `cuahangsach`;

-- Xoa bang
DROP TABLE `nhanvien`;

CREATE TABLE `nhanvien`
(
	id INT AUTO_INCREMENT,
    `name` BLOB NOT NULL,
    `ngaysinh` DATETIME DEFAULT NOW(),
    `chucvu` VARCHAR(225),
    idluongthang int,
    primary key (id),
    foreign key idluongthang_id (idluongthang) references luongthang(id)
);

CREATE TABLE `luongthang`
(
	id INT AUTO_INCREMENT,
    menhgia varchar(225),
    sotien varchar(225),
    primary key (id)
);

-- xoa toan bo ban ghi trong 1 bang
TRUNCATE TABLE `nhanvien`;
TRUNCATE TABLE `luongthang`;

delete from `luongthang` where id=1;
delete from `luongthang` where id=2;

INSERT INTO `cuahangsach`.`luongthang`
(`id`,`menhgia`,`sotien`) VALUES
(2,'USD','222233'),
(3,'VND','123'),
(4,'USD','222233'),
(5,'USD','123'),
(6,'USD','2222222'),
(1,'VND','2222222');

INSERT INTO `nhanvien` (`name`, `ngaysinh`, `chucvu`, `idluongthang`) VALUES
('Nguyen Van A', NOW(), 'Ban hang vien', 1);

INSERT INTO `nhanvien` VALUES
(2, 'Nguyen Van A', NOW(), 'Ban hang vien');

SELECT * FROM `nhanvien`;

-- inner join
SELECT * FROM `nhanvien` nv INNER JOIN `luongthang` lt ON nv.idluongthang = lt.id;

-- left join
SELECT * FROM `nhanvien` nv LEFT JOIN `luongthang` lt ON nv.idluongthang = lt.id;

-- right join
SELECT * FROM `nhanvien` nv RIGHT JOIN `luongthang` lt ON nv.idluongthang = lt.id;

SELECT `menhgia`, `sotien` FROM `luongthang`;
SELECT `menhgia`, `sotien` FROM `luongthang` WHERE `menhgia`='VND';
SELECT `menhgia`, `sotien` FROM `luongthang` WHERE `menhgia`='VND' AND `sotien`='123';
SELECT `menhgia`, `sotien` FROM `luongthang` WHERE `menhgia`='VND' OR `sotien`='222233';
SELECT * FROM `luongthang` WHERE `id` IN (2, 5);
SELECT * FROM `luongthang` WHERE `id` BETWEEN 2 AND 5;
SELECT * FROM `luongthang` WHERE `id` IS NULL;
SELECT * FROM `luongthang` WHERE `sotien` LIKE '%22%';

