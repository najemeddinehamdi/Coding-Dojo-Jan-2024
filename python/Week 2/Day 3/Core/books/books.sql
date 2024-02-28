SELECT * FROM books_schema.users;
update users
set first_name ='bill'
where id=4;


SELECT * FROM users 
JOIN books_users ON users.id = books_users.user_id 
JOIN books ON books.id = books_users.books_id;

INSERT into favorites (user_id, book_id)
VALUES (1, 1);

SELECT id, first_name, last_name from users
JOIN favorites on users.id = favorites.user_id
WHERE favorites.book_id = 3;

DELETE FROM favorites WHERE user_id = 2 AND book_id = 3;	

INSERT into favorites (user_id, book_id)
VALUES (5, 2);

SELECT * from books
JOIN favorites on books.id = favorites.book_id
WHERE favorites.user_id = 3;
SELECT * from users
JOIN favorites on favorites.user_id = users.id
WHERE favorites.book_id = 5;



