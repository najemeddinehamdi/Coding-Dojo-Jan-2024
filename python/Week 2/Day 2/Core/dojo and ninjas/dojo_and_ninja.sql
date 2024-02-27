SELECT * FROM dojo_and_ninja.dojos;
-- select first dojo
SELECT * FROM ninjas 
JOIN dojos ON dojos.id=ninjas.dojo_id where dojo_id=4;


-- select last dojo
SELECT * FROM ninjas 
JOIN dojos ON dojos.id=ninjas.dojo_id where dojo_id=6;

-- JOIN to retrieve all the ninjas as well as that ninja's dojo
SELECT * FROM ninjas 
JOIN dojos ON dojos.id=ninjas.dojo_id;




