CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  SET N = N - 1;
  RETURN (

      # Write your MySQL query statement below.
        select distinct salary as getNthHighestSalary from Employee ORDER BY salary DESC LIMIT n,1
  );
END