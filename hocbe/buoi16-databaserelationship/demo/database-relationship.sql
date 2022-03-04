CREATE DATABASE DemoQuanHeTrongDatabase;

USE DemoQuanHeTrongDatabase;

CREATE TABLE `cmnd` (
	id_cmnd int auto_increment,
    ten varchar(225),
    so_cmnd varchar(225),
    diachi varchar(225),
    primary key (id_cmnd)
);

CREATE TABLE `khachang` (
	id_khach int auto_increment,
    ten varchar(225),
    toi varchar(225),
    id_cmnd int,
    primary key (id_khach),
    foreign key id_cmnd_cmnd (id_cmnd) references cmnd(id_cmnd)
);

INSERT INTO `demoquanhetrongdatabase`.`cmnd`
(`id_cmnd`,`ten`,`so_cmnd`,`diachi`) VALUES
(1, "Nguyen Van A", "123456", "Hanoi"),
(2, "Nguyen Van B", "22222222", "Hanoi1"),
(3, "Nguyen Van C", "88888888", "Hanoi2");

INSERT INTO `demoquanhetrongdatabase`.`khachang`
(`id_khach`,`ten`,`toi`,`id_cmnd`)
VALUES
(1, 'Nguyen Van A', '20', 1),
(2, 'Nguyen Van B', '42', 2),
(3, 'Nguyen Van C', '16', 3);

select  * from khachang kh inner join cmnd cm on kh.id_cmnd = cm.id_cmnd;


CREATE TABLE donhang
(
	id_donhang int auto_increment,
    sotien varchar(225),
    sanpham varchar(225),
    ngaymua varchar(225),
    id_khachhang int,
    primary key (id_donhang),
    foreign key donhang_id_khachhang (id_khachhang) references khachang(id_khach)
);

INSERT INTO `demoquanhetrongdatabase`.`donhang`
(`id_donhang`,`sotien`,`sanpham`,`ngaymua`,`id_khachhang`)
VALUES
(1,"123","dien thoai","20-10-2222", 1),
(2,"43","nuoc","20-10-1112", 1),
(3,"232","ban phim","24-10-2222", 1);

select * from khachang kh inner join donhang dh on kh.id_khach = dh.id_khachhang;

