# Write your MySQL query statement below
select name AS Customers
from Customers Left Join Orders on Customers.id=Orders.CustomerId 
where Orders.id is null;