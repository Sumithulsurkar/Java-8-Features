-- LIMIT, TOP, MAX

SELECT TOP 1 SALARY
FROM(SELECT TOP 3 SALARY FROM EMP ORDER BY SALARY DESC)
ORDER BY SALARY

SELECT SALARY LIMIT 1 (SELECT SALARY FROM EMP ORDER BY SALARY DESC LIMIT 3);

DELETE statement is used to delete rows from a table.
DELETE FROM Candidates WHERE CandidateId > 1000;

TRUNCATE command is used to delete all the rows from the table and free the space containing the table.
TRUNCATE TABLE Candidates;

DROP command is used to remove an object from the database.
If you drop a table, all the rows in the table are deleted and the table structure is removed from the database.
DROP TABLE Candidates;

If a table is dropped, all things associated with the tables are dropped as well.
This includes - the relationships defined on the table with other tables, the integrity checks and constraints,
access privileges and other grants that the table has. To create and use the table again in its original form,
all these relations, checks, constraints, privileges and relationships need to be redefined. However,
if a table is truncated, none of the above problems exist and the table retains its original structure.

