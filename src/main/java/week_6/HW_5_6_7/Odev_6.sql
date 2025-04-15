SELECT AVG(rental_rate) FROM film; --average rental_rate of films

SELECT COUNT(*) FROM film
WHERE title LIKE 'C%'; --how many films' title starts with 'C'

SELECT MAX(length) FROM film
WHERE rental_rate = 0.99; --maksimum length of the film which has 0.99 as rental_rate

SELECT COUNT(DISTINCT replacement_cost) FROM film
WHERE length > 150; --how many different replacement_cost values in films having more than 150 length

