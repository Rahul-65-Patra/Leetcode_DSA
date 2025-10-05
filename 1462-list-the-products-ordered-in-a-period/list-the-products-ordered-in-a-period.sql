# Write your MySQL query statement below

select P.product_name,sum(O.unit) as unit
from Products P
join Orders O on O.product_id = P.product_id
where DATE_FORMAT(O.order_date,'%Y-%m')='2020-02'
GROUP BY P.product_name
having sum(O.unit)>=100
order by O.unit desc
