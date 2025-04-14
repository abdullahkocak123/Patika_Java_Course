SELECT * FROM film
WHERE title LIKE '%n'
ORDER BY length DESC
LIMIT 5; --Longest 5 films ending with 'n' at title

SELECT * FROM film
WHERE title LIKE '%n'
ORDER BY length
OFFSET 5
LIMIT 5; --Shortest second group of 5 films (6,7,8,9,10) ending with 'n' at title

SELECT * FROM customer
WHERE store_id = 1
ORDER BY last_name DESC
lIMIT 4 --First 4 customers ordered by last_name descending, who has store_id = 1