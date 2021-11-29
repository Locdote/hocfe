DROP TABLE customer;
CREATE TABLE customer (`customerName` varchar(10));
INSERT INTO customer VALUES ('long');

-- Disable checking for non-deterministic functions
-- log_bin_trust_function_creators = 1; in mysql.ini
SET GLOBAL log_bin_trust_function_creators = 1;

DELIMITER //

CREATE FUNCTION getCustomer (limitNum INT)
RETURNS INT
BEGIN
	DECLARE result INT;
	SELECT COUNT(*) INTO result FROM customer LIMIT limitNum;
	RETURN result;
END; //

DELIMITER ;

SELECT getCustomer(10);