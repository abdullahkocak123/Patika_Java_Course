SELECT city, country FROM city
INNER JOIN country ON city.country_id = country.country_id;
--city and country names from joining city and country tables

SELECT payment_id, first_name, last_name FROM customer
INNER JOIN payment ON customer.customer_id = payment.customer_id;
--payment_id, first_name and last_name from tables; customer & payment

SELECT rental_id, first_name, last_name FROM customer
INNER JOIN rental ON customer.customer_id = rental.customer_id;
--rental_id, first_name and last_name from tables; customer & rental