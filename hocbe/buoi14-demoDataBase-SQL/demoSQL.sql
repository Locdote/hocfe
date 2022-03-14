-- tao moi database
create database `quanlytruonghoc`; 
-- khai bao su dung database
use `QuanLyTruongHoc`;
-- tao moi table
create table `student`(
id char(255), 
`name` varchar(255),
school char(255)
 );
 -- luu du lieu vao table
 insert into `Student` values('11','Nguyen Van A','thuong Cat'),('12','Nguyen Van A','thuong Cat'),('14','Nguyen Van A','thuong Cat');
 -- lay toan bo du lieu trong table
 select * from `Student`;
 -- sua du lieu trong table
 update  `Student` set `school`= 'thuong cat 1';
update  `Student` set `name`= 'sdasda' where `id`='1';
  -- xoa du lieu trong table
  delete from `Student` where `id`='1';