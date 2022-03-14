create database `cuahangsach`;

use `cuahangsach`;
-- drop xoa table
drop table `nhanvien`;
truncate table `nhanvien`;
create table `nhanvien`(
	id int auto_increment,
    `name` blob not null,
    `ngaysinh` datetime default current_timestamp,
    `chucvu` varchar(225),
    idluongthang int,
    primary key(id),
    foreign key idluongthang_id (idluongthang) references luongthang(id)
);
create table `luongthang`(
	id int auto_increment,
    menhgia varchar(225),
    sotien varchar(225),
    primary key(id)
);
-- truncate xoa toan bo du lieu trong table
truncate table `luongthang`;
delete from `luongthang` where id=1;
delete from `luongthang` where id=2;
insert into `cuahangsach`.`luongthang`
(`id`, `menhgia`, `sotien`) values
(2,'dola', '2432345'),
(3,'dola', '243231265'),
(4,'dola', '2444443365'),
(5,'VND', '24522365'),
(1,'VND', '222222222');

update `luongthang` set `menhgia` = 'VND' where `id` = 5 ;
insert into `nhanvien`(`name`, `ngaysinh`, `chucvu`, `idluongthang`) values
('Nguyen van A', now(),'giam doc',1);

insert into `nhanvien` values
(2,'Nguyen van A', now(),'giam doc');

-- inner join 
select * from `nhanvien` nv join `luongthang` lt on nv.idluongthang = lt.id;
-- left join
select * from `nhanvien` nv left join `luongthang` lt on nv.idluongthang = lt.id;
-- right join
select * from `nhanvien` nv right join`luongthang` lt on nv.idluongthang = lt.id;

-- dieu kien de  select
select `menhgia`, `sotien` from `luongthang` where `menhgia` = 'VND' and `sotien`= '24522365' ;
select `menhgia`, `sotien` from `luongthang` where `menhgia` = 'dola' or `sotien`= '24522365' ;
select*from  `luongthang` where `id` in(2,3) ;
select*from  `luongthang` where `id` between 2 and 5 ;
select*from  `luongthang` where `id` is null ;
select*from  `luongthang` where `sotien` like '%24%' ;

select *from `nhanvien`;

