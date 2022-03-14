create database `QuanLyGiaoDuc`;

use `QuanLyGiaoDuc`;

create table `Student`(
	student_id int auto_increment,
    `name` varchar(225),
    `school` varchar(225),
    primary key(student_id),
    constraint student_class_id foreign key student(class_id) references class(class_id)
);
alter table `Student` add column `class_id` int;
-- alter table `Student` modify column `class_id` int; sua cot
-- alter table `Student` drop column `class_id` ; xoa cot
-- alter table `Student` rename to StudentMoi ; sua ten

alter table `Student` add constraint student_class_id foreign key student(class_id) references class(class_id);

insert into `QuanLyGiaoDuc`.`Student`
(`name`, `school`) values
('Nguyen Van D', 'Thuong Cat'),
('Nguyen Van A', 'Thuong Cat'),
('Nguyen Van B', 'Thuong Cat'),
('Nguyen Van C', 'Thuong Cat');
drop table`class`;
create table `Class`(
class_id int ,
class_name varchar(225),
`vitri` varchar(225),
primary key(class_id)
);

create table `MonHoc`(
	monhoc_id int auto_increment,
    student_id int,
    `name` varchar(225),
    primary key(monhoc_id),
    constraint monhoc_student_key foreign key monhoc(student_id) references student(student_id)
);
select * from `monhoc`;
select * from `student`;