create database `DemoMoiQuanHe`;
use `DemoMoiQuanHe`;

create table `KhachHang`(
id_khach int auto_increment,
ten varchar(225),
tuoi varchar(225),
id_cmnd int,
primary key(id_khach),
foreign key id_cmnd_cmnd(id_cmnd) references cmnd(id_cmnd)
);

insert into `DemoMoiQuanHe`.`KhachHang`
(`id_khach`,`ten`,`tuoi`,`id_cmnd`) values
('1','Nguyen Van A','14','1'),
('3','Nguyen Van B','15','3'),
('4','Nguyen Van C','16','4');

create table `CMND`(
id_cmnd int auto_increment,
ten varchar(255),
diachi varchar(225),
so_cmnd int,
primary key(id_cmnd)
);
insert into `DemoMoiQuanHe`.`CMND`
(`id_cmnd`,`ten`,`diachi`,`so_cmnd`) values
('1','Nguyen Van A','HaNoi1','12345'),
('3','Nguyen Van B','HaNoi2','123456'),
('4','Nguyen Van C','HaNoi3','1234578');

create table `DonHang`(
id_donhang int auto_increment,
sotien varchar(225),
sanphan varchar(225),
ngaymua varchar(225),
id_khachang int,
primary key(id_donhang),
foreign key donhang_id_donhang(id_donhang) references KhachHang(id_khach)
);

insert into `DemoMoiQuanHe`.`DonHang`
(`id_donhang`,`sotien`,`sanphan`,`ngaymua`,`id_khachang`) values
('1','10000','ABC','12/1/2345','1'),
('3','20000','DEF','12/34/56','1'),
('4','30000','GHJ','12/34/578','1');


select * from `KhachHang` kh join `CMND`cmnd on kh.id_cmnd = cmnd.id_cmnd;
select * from `KhachHang` kh join `DonHang` dh on kh.id_khach = dh.id_khachang;