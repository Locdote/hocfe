DROP TABLE customer;
CREATE TABLE customer (`customerName` varchar(10));
INSERT INTO customer VALUES ('long');

DROP PROCEDURE getName;
DELIMITER $$
CREATE PROCEDURE getName(
	IN suffix VARCHAR(10),
    OUT output VARCHAR(100)
)
BEGIN
	DECLARE prefix VARCHAR(10) DEFAULT 'T3H';
	DECLARE chk VARCHAR(100);
    DECLARE x INT;
    
    SELECT * INTO chk FROM customer;
	SET output = CONCAT(prefix, chk ,suffix);
    
    SET x = 1;
    start_loop: LOOP
		IF x < 3 THEN
			SET output = CONCAT(output, '1');
		ELSE
			LEAVE start_loop;
		END IF;
        SET x = x + 1;
    END LOOP;
END$$
DELIMITER ;


CALL getName('HI', @result);
SELECT @result;