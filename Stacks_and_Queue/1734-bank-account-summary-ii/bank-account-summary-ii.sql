# Write your MySQL query statement below
select Users.name, sum(Transactions.amount) AS balance  from Users left join Transactions on
Users.account=Transactions.account group by(Transactions.account)having balance>10000