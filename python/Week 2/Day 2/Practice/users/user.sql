SELECT * FROM users_shema.users;
SELECT first_name, last_name FROM users;
-- select email from first user
SELECT email
FROM users
where id=1; 
-- select the last user
SELECT *
FROM users
ORDER BY id DESC;

SELECT *
FROM users
LIMIT 2 ,3;

-- update last name with id 
UPDATE users
SET last_name= 'panckaces'
WHERE id=3;

-- delete the user with id= 2 --
DELETE FROM users WHERE id=2;


-- all the users by their first name --
SELECT first_name 
FROM users;

-- 
SELECT first_name
FROM users
ORDER BY first_name DESC;




