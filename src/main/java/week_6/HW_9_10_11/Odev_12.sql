SELECT COUNT(*) FROM film
WHERE length > (
SELECT AVG(length) FROM film
);
--how many films are there which has much length than the average?

SELECT COUNT(*) FROM film
WHERE rental_rate = (
SELECT MAX(rental_rate) FROM film
);
--how many films are there which has highest rental_rate?

SELECT * FROM film
WHERE rental_rate = (
SELECT MIN(rental_rate) FROM film
) 
AND replacement_cost =(
SELECT MIN(replacement_cost) FROM film
);
--films which has minimum rental_rate and minimum replacement_cost


SELECT * FROM payment
WHERE customer_id=(
SELECT customer_id FROM (
SELECT customer_id, COUNT(customer_id) AS customer_count FROM payment
GROUP BY customer_id
ORDER BY COUNT(customer_id) DESC
) AS xxx
WHERE customer_count = (
SELECT MAX(customer_count) FROM(
SELECT COUNT(customer_id) AS customer_count
FROM payment
GROUP BY customer_id
)AS counts
)
);
--customer with maksimum payment

SELECT customer_id, COUNT(customer_id) AS customer_count FROM payment
GROUP BY customer_id
ORDER BY COUNT(customer_id) DESC; --customers with payment counts

SELECT MAX(customer_count) FROM(
SELECT COUNT(customer_id) AS customer_count
FROM payment
GROUP BY customer_id
)AS counts; --number of maksimum payment
