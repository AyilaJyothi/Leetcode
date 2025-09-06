# Write your MySQL query statement below
Select customer_number from Orders Group by customer_number order by count(*) DESC limit 1;