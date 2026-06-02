# Write your MySQL query statement below
select w1.id from Weather w1 JOIN Weather w2 ON DATEDIFF(w1.recordDate,w2.recordDAte)=1 WHERE w1.temperature>w2.temperature;