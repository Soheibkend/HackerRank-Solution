SELECT DISTINCT city 
FROM station 
WHERE SUBSTR(lower(CITY),-1) IN ('a','e','i','o','u');