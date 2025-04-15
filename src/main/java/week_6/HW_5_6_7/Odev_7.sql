SELECT rating, COUNT(*) FROM 	film
GROUP BY rating; --films grouped by ratings

SELECT replacement_cost, COUNT(*) FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50 --films grouped by replacement_cost which are more than 50

SELECT store_id, COUNT(*) FROM customer
GROUP BY store_id; --customer numbers grouped by store_id

SELECT country_id, COUNT(*) FROM city
GROUP BY country_id
ORDER BY COUNT(*) DESC
LIMIT 1; --country_id and number of cities it has, which has most cities after grouped by country_id 
