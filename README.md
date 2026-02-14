2026/02/14        

1>  MySQL Queries

password: ****

show databases;

use batch425;

show tables;

create table employee4(id int primary key AUTO_INCREMENT,name varchar(30),mobNo varchar(15) UNIQUE KEY,email varchar(40));

desc employee4;
Field            Type              Null        key             Default            Extra
id                int              No          PRI            NULL          auto_increment
name        varchar(30)            YES                        NULL
mobNo       varchar(15)            YES                         NULL
email       varchar(40)            YES                         NULL                                           

insert into employee4(name,mobNo,email)values('Shruti','3456723896','shruti@gmail.com'),('Onkar','6578456789','onkar@gmail.com'),('Harsh','7654321897','harsh@gmail.com'),('Ganesh','4563479657','ganesh@gmail.com'),('Vaishnavi','5645689807','vaish@gmail.com');

id            name            mobNo                 email
1           Shruti            3456723896      shruti@gmail.com
2           Onkar            6578456789      onkar@gmail.com
3           Harsh            7654321897      harsh@gmail.com
4          Ganesh            4563479657      ganesh@gmail.com
5          Vaishnavi        5645689807       vaish@gmail.com

ALTER TABLE employee4 ADD country varchar(50);

id            name            mobNo                 email                             Counrty
1           Shruti            3456723896      shruti@gmail.com                           NULL
2           Onkar            6578456789      onkar@gmail.com                              NULL
3           Harsh            7654321897      harsh@gmail.com                              NULL
4          Ganesh            4563479657      ganesh@gmail.com                            NULL
5          Vaishnavi        5645689807       vaish@gmail.com                              NULL

ALTER TABLE employee DROP COLUMN Country;

id            name            mobNo                 email
1           Shruti            3456723896      shruti@gmail.com
2           Onkar            6578456789      onkar@gmail.com
3           Harsh            7654321897      harsh@gmail.com
4          Ganesh           4563479657      ganesh@gmail.com
5          Vaishnavi        5645689807       vaish@gmail.com

ALTER TABLE employee RENAME COLUME email TO gmail;

id            name            mobNo                 gmail
1           Shruti            3456723896      shruti@gmail.com
2           Onkar            6578456789      onkar@gmail.com
3           Harsh            7654321897      harsh@gmail.com
4          Ganesh            4563479657      ganesh@gmail.com
5          Vaishnavi         5645689807       vaish@gmail.com

ALTER TABLE RENAME Employee4 TO Employee;
// Table name change to Employee from employee4

select * from employee4 ORDER BY salary ASC;

id            name            mobNo                 email
1           Shruti            3456723896      shruti@gmail.com
2           Onkar            6578456789      onkar@gmail.com
3           Harsh            7654321897      harsh@gmail.com
4          Ganesh            4563479657      ganesh@gmail.com
5          Vaishnavi         5645689807       vaish@gmail.com

select * from employee4 ORDER BY salary DESC;

id            name            mobNo                 email
5          Vaishnavi         5645689807       vaish@gmail.com
4          Ganesh            4563479657      ganesh@gmail.com
3           Harsh            7654321897      harsh@gmail.com
2           Onkar            6578456789      onkar@gmail.com
1           Shruti            3456723896      shruti@gmail.com

select max id from employee4;

5          Vaishnavi      5645689807       vaish@gmail.com

select min id from employee4;

1           Shruti            3456723896      shruti@gmail.com

SELECT * from employee4 WHERE Name LIKE 's%';

1           Shruti            3456723896      shruti@gmail.com

SELECT * FROM employee4 WHERE id IN('1');

1           Shruti            3456723896      shruti@gmail.com

SELECT * FROM employee4 WHERE id NOT IN('1');

2           Onkar          6578456789      onkar@gmail.com
3           Harsh          7654321897      harsh@gmail.com
4          Ganesh          4563479657      ganesh@gmail.com
5          Vaishnavi      5645689807       vaish@gmail.com

SELECT * FROM employee4 WHERE id BETWEEN 3 AND 5;

3           Harsh         7654321897      harsh@gmail.com
4          Ganesh         4563479657      ganesh@gmail.com
5          Vaishnavi      5645689807       vaish@gmail.com

SELECT * FROM employee4 WHERE id NOT BETWEEN 3 AND 5;

1           Shruti           3456723896      shruti@gmail.com
2           Onkar            6578456789      onkar@gmail.com


















