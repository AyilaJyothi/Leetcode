# Write your MySQL query statement below
select name from SalesPerson WHERE sales_id NOT IN(
    select o.sales_id from ORDERS o JOIN Company c ON o.com_id=c.com_id Where c.name='RED'
);