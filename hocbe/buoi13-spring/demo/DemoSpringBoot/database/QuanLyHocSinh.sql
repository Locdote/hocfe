CREATE DATABASE QuanlyHocSinh;

USE QuanlyHocSinh;

CREATE TABLE `Student`
(
	student_id INT auto_increment,
    `name` VARCHAR(225),
    `school` varchar(225),
    primary key (student_id)
);

INSERT INTO `quanlyhocsinh`.`student`
(`name`,`school`) VALUES
('Nguyen Van D', 'Thuong Cat'),
('Nguyen Van A', 'Thuong Cat'),
('Nguyen Van B', 'Thuong Cat'),
('Nguyen Van C', 'Thuong Cat');
