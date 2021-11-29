CREATE DATABASE StoreManager;
USE StoreManager;

CREATE TABLE color (
	color_id int primary key,
    color_name varchar(200)
);

CREATE TABLE brand (
	brand_id INT primary key,
    brand_name VARCHAR(500),
    description varchar(500)
);

CREATE TABLE product (
	product_id int primary key,
    product_name varchar(500),
    color_id int,
    brand_id int,
    price int,
    FOREIGN KEY product_brand_foreign (brand_id) references brand(brand_id),
    FOREIGN KEY product_color_foreign (color_id) references color(color_id)
);

CREATE TABLE `order` (
	order_id int primary key,
    order_address varchar(200),
    customer_name varchar(200),
    customer_phone varchar(200)
);

CREATE TABLE order_details (
	order_details_id int primary key,
    order_id int,
    product_id int,
    quantity int,
	FOREIGN KEY order_details_foreign (order_id) references `order`(order_id),
	FOREIGN KEY product_order_foreign (product_id) references product(product_id)
);

