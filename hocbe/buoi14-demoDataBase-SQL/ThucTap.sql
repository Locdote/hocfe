create database `ThucTap`;

use `ThucTap`;

create table `Khoa`(
	makhoa char(10),
	tenkhoa char(30),
	dienthoai char(10)
);
insert into `ThucTap`.`Khoa`
(`makhoa`, `tenkhoa`, `dienthoai`) values
('11','Dia Ly', '113'),
('12','QLTN', '114'),
('13','CNTT', '115'),
('14','Dien', '116'),
('15','Dia Ly', '117');

create table `GiangVien`(
	magv int,
	hotengv varchar(30),
	luong decimal(5,2),
	makhoa char(10)
);

insert into `ThucTap`.`GiangVien`
(`magv`, `hotengv`, `luong`, `makhoa`) values
('111','Nguyen Van A', '113', '11'),
('222','Nguyen Van B', '114', '12'),
('333','Nguyen Van C', '115', '13'),
('444','Nguyen Van D', '116', '14'),
('555','Nguyen Van E', '117', '15');

create table `SinhVien`(
	masv int,
	hotensv varchar(30),
	makhoa char(10),
	namsinh int,
	quequan char(30)
);

insert into `ThucTap`.`SinhVien`
(`masv`, `hotensv`, `makhoa`, `namsinh`, `quequan`) values
(11,'Nguyen Thi A', '11', 1991, 'HaNoi'),
(22,'Nguyen Thi B', '12', 1992, 'HaNoi'),
(33,'Nguyen Thi C', '13', 1993, 'HaNoi'),
(44,'Nguyen Thi D', '14', 1994, 'HaNoi'),
(55,'Nguyen Thi E', '15', 1995, 'HaNoi');

create table `DeTai`(
	madt char(10),
	tendt char(30),
	kinhphi int,
	noithuctap char(30)
);

insert into `ThucTap`.`DeTai`
(`madt`, `tendt`, `kinhphi`, `noithuctap`) values
(1,'Tao database', '10000', 'HaNoi'),
(2,'Tao table', '12000', 'HaNoi'),
(3,'Set addtribute', '13000', 'HaNoi'),
(4,'Update table', '14000', 'HaNoi'),
(5,'Delete table', '15000', 'HaNoi');

create table `HuongDan`(
	masv int,
    madt char(10),
    magv int,
    ketqua decimal(5.2)
);

insert into `ThucTap`.`HuongDan`
(`masv`, `madt`, `magv`, `ketqua`) values
(11,'1', '111', '5'),
(22,'2', '222', '6'),
(33,'3', '333', '4'),
(44,'4', '444', '8'),
(55,'5', '555', '9');


select * from `Khoa`;
select * from `GiangVien`;
select * from `SinhVien`;
select * from `DeTai`;
select * from `HuongDan`;