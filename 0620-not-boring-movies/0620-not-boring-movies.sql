# Write your MySQL query statement below
SELECT id,movie,description,rating from Cinema WHERE id%2=1 and description != "boring" Order By rating DESC