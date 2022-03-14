create database `DanhSachDienThoai`;

use `DanhSachDienThoai`;

create table `Phone`(
	phone_id int auto_increment,
    `name` varchar(225),
    `ram` varchar(225),
    `color` varchar(225),
    `camera` varchar(225),
    primary key(phone_id)
);
truncate  table `phone`;

select * from `Phone`;