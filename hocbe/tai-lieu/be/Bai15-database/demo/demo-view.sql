CREATE TABLE customer (`customerName` varchar(10));
INSERT INTO customer VALUES ('long');
INSERT INTO customer VALUES ('Nam');
INSERT INTO customer VALUES ('Linh');
INSERT INTO customer VALUES ('Trang');

CREATE VIEW allCustomerView
AS 
SELECT 
    customerName AS `name`
FROM
    customer;
    
SELECT * FROM allCustomerView;