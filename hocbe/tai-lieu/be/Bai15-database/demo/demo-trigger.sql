CREATE TABLE customer (`customerName` varchar(10));

DELIMITER $$

CREATE TRIGGER customerInsertTrigger
    BEFORE INSERT
    -- AFTER INSERT
    -- BEFORE DELETE
    -- AFTER DELETE
    -- BEFORE UPDATE
    -- AFTER UPDATE
    ON customer FOR EACH ROW
BEGIN
    IF (NEW.customerName = '') THEN
		SET NEW.customerName = 'Empty';
	END IF;
END$$    

DELIMITER ;

INSERT INTO customer VALUES ('');
SELECT * FROM customer;