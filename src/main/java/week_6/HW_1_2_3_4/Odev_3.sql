SELECT * FROM country
WHERE country LIKE 'A%a'; --countries starts with'A', ends with 'a'

SELECT * FROM country
WHERE country LIKE '_____%n'; --counntries at least 6 character, ending with 'n'

SELECT * FROM film
WHERE title ILIKE '%t%t%t%t%'; --films which having at least 4 'T' or 't' in title

SELECT * FROM film
WHERE title LIKE 'C%' AND length > 90 AND rental_rate = 2.99; --films having title starting 'C', length more than 90 and rental_rate 2.99

