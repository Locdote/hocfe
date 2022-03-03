-- tao moi database
CREATE DATABASE `QuanLyTruongHoc`;

-- khai bao su dung database nao`
USE `QuanLyTruongHoc`;

-- tao moi table
CREATE TABLE `Student` (
	id char(255),
    `name` varchar(255),
    school varchar(1000)
);

-- lay toan bo du lieu trong table
SELECT * FROM `Student`;

-- luu du lieu xuong table
INSERT INTO `Student` VALUES 
('2', 'Nguyen Van B', 'Thuong Cat'),
('3', 'Nguyen Van C', 'Thuong Cat'),
('4', 'Nguyen Van D', 'Thuong Cat');

-- Sua du lieu trong table
UPDATE `Student` SET `school`='Thuong Cat1';
UPDATE `Student` SET `name`='Nguyen Van CC' WHERE `id`='3';

-- Xoa du lieu trong table
DELETE FROM `Student` WHERE `id`='1';