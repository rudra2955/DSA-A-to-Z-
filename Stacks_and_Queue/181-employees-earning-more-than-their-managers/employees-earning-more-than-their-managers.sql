# Write your MySQL query statement below
select e.name As Employee from Employee e left join Employee m
on e.managerId=m.id where e.salary>m.salary;