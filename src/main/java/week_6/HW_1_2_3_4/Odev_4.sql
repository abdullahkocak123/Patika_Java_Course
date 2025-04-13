SELECT DISTINCT replacement_cost FROM film; --unique replacement_cost valuse at film table

SELECT COUNT(DISTINCT replacement_cost) FROM film; --number of unique replacement_cost values

SELECT * FROM film
WHERE title LIKE 'T%' AND rating = 'G'; --number of films; titles starting with 'T' and rating of 'G'

SELECT COUNT(*) FROM country
WHERE country LIKE '_____'; --number of countries which have 5 letters in name

SELECT COUNT(*) FROM city
WHERE city ILIKE '%R'; --number of cities having 'R' or 'r' as last character in names