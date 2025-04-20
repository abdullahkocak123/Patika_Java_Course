SELECT city, country FROM city
LEFT JOIN country ON city.country_id = country.country_id;
--cities and their countries left join on city table

SELECT payment_id, first_name, last_name FROM customer
RIGHT JOIN payment ON customer.customer_id = payment.customer_id;
--payment_id, customer's first_name and last_name on right join customer & payment tables

SELECT rental_id, first_name, last_name FROM customer
FULL JOIN rental ON customer.customer_id = rental.customer_id;
--full join of tables; customer & rental