SELECT title, description FROM film; --titles and descritions of films

SELECT * FROM film WHERE length > 60 AND length < 75; --films having length more than 60, less than 75

SELECT * FROM film WHERE rental_rate = 0.99 AND replacement_cost = 12.99 OR replacement_cost = 28.99;
--films rental_rate 0.99 and replacement_cost 12.99 or 28.99

SELECT last_name FROM customer WHERE first_name = 'Mary'; --customers' last_name who has 'Mary' as first_name

SELECT * FROM film WHERE NOT length>60 AND NOT (rental_rate = 2.99 OR rental_rate = 4.99);
--films those length not more than 50 and rental_rate are not 2.99 and 4.99
