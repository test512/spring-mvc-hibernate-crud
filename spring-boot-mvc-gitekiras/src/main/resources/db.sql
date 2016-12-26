mysql> desc person;
+-----------+--------------+------+-----+---------+----------------+
| Field     | Type         | Null | Key | Default | Extra          |
+-----------+--------------+------+-----+---------+----------------+
| person_id | bigint(20)   | NO   | PRI | NULL    | auto_increment |
| email     | varchar(255) | NO   | UNI | NULL    |                |
| mobile    | varchar(255) | YES  |     | NULL    |                |
| name      | varchar(255) | YES  |     | NULL    |                |
| password  | varchar(255) | YES  |     | NULL    |                |
+-----------+--------------+------+-----+---------+----------------+


INSERT INTO person (email, mobile, name, password) VALUES ('john.cena@gmail.com','1111111','John Cena','12345');
INSERT INTO person (email, mobile, name, password) VALUES ('raj.kumar@gmail.com','1010101','Raj Kumar','54323');
INSERT INTO person (email, mobile, name, password) VALUES ('sudnya.shinde@gmail.com','222222','Sudnya Shinde','324523');
INSERT INTO person (email, mobile, name, password) VALUES ('aditi.singh@gmail.com','32323232','Aditi Singh','5435423');
INSERT INTO person (email, mobile, name, password) VALUES ('praveen.kumar@gmail.com','87867867','Praveen Kumar','4552432');
INSERT INTO person (email, mobile, name, password) VALUES ('ravi.shatri@gmail.com','987976967','Ravi Shastri','3452355');
