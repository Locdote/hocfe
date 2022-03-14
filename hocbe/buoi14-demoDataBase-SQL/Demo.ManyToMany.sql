create database `QuanHeNhieuNhieu`;
 use `QuanHeNhieuNhieu`;
 
 create table `HocSinh`(
 id_hocsinh int auto_increment,
 ten varchar(225),
 tuoi int,
 xephang varchar(225),
 primary key (id_hocsinh)
 );
 insert into `quanhenhieunhieu`.`hocsinh`
 (id_hocsinh, ten, tuoi, xephang) values
 (1, 'Nguyen Van A', 15, 'A'),
 (2, 'Nguyen Van B', 16, 'B'),
 (3, 'Nguyen Van C', 17, 'C'),
 (4, 'Nguyen Van D', 18, 'D');
 
 create table `MonHoc`(
 id_monhoc int auto_increment,
 ten varchar(225),
 sobuoi int,
 primary key (id_monhoc)
 );
 
  insert into `quanhenhieunhieu`.`monhoc`
 (id_monhoc, ten, sobuoi) values
 (11, 'Toan', 15),
 (22, 'Ly', 16),
 (33, 'Hoa', 17),
 (44, 'Van', 18),
 (55, 'Anh', 18);
 drop table `HocSinh_MonHoc`;
 create table `HocSinh_MonHoc`(
 id int,
 id_hocsinh int,
 id_monhoc int,
 primary key (id),
 constraint `Hocsinh_MonHoc_fk1`
 foreign key hocsinh_monhoc(id_hocsinh) references hocsinh (id_hocsinh),
 constraint `Hocsinh_MonHoc_fk2`
 foreign key hocsinh_monhoc(id_monhoc) references monhoc(id_monhoc)
 );
 insert into `quanhenhieunhieu`.`hocsinh_monhoc`
 (id, id_hocsinh, id_monhoc) values
 (1, 1, 11),
 (2, 1, 22),
 (3, 2, 33),
 (4, 2, 44),
 (5, 1, 55),
 (6, 2, 55),
 (7, 3, 55),
 (8, 4, 55);
 
 
 select * from `hocsinh` hs join `hocsinh_monhoc` hsmh on hs.id_hocsinh = hsmh.id_hocsinh join `monhoc` mh on hsmh.id_monhoc = mh.id_monhoc ;