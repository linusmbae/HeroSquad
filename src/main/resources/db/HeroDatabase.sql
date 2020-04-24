SET MODE PostgreSQL;
CREATE TABLE IF NOT EXISTS heroes
(
id int PRIMARY KEY auto_increment,
name VARCHAR,
age int,
powers VARCHAR,
weakness VARCHAR
);