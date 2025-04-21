(
SELECT first_name FROM actor
)
UNION
(
SELECT first_name FROM customer
);
--all first_name's from tables; actor & customer

(
SELECT first_name FROM actor
)
INTERSECT
(
SELECT first_name FROM customer
);
--first name's intersect at tables; actor & csutomer

(
SELECT first_name FROM actor
)
EXCEPT
(
SELECT first_name FROM customer
);
--first_name's which are at table; actor but not at table; customer

(
SELECT first_name FROM actor
)
UNION ALL
(
SELECT first_name FROM customer
);
--all first_name's repititive from tables; actor & customer

(
SELECT first_name FROM actor
)
INTERSECT ALL
(
SELECT first_name FROM customer
);
--first name's repititive intersect at tables; actor & csutomer

(
SELECT first_name FROM actor
)
EXCEPT ALL
(
SELECT first_name FROM customer
);
--first_name's repititive which are at table; actor but not at table; customer
