select distinct city from station where SUBSTR(lower(CITY),-1) not IN ('a','e','i','o','u');