# Write your MySQL query statement below
#SELECT DISTINCT salary as SecondHighestSalary from Employee
#LIMIT 1 OFFSET 1;

SELECT max(salary) as SecondHighestSalary from Employee
where salary < 
(Select max(salary) from Employee)