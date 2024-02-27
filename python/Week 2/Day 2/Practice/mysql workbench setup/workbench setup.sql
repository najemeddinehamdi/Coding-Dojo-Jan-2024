SELECT * FROM names.names;
SELECT name FROM names.names;
INSERT INTO names(name) 
VALUES('messi');
SELECT name FROM names.names;
SET SQL_SAFE_UPDATES = 0;
DELETE FROM names WHERE id=11 ;
-- update
UPDATE names
SET name = 'najem'
WHERE id=1;