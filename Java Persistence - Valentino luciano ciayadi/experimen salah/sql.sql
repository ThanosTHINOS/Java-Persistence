CREATE DATABASE hibernate_example;
USE hibernate_example;

CREATE TABLE employee (
    id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    salary DECIMAL(10, 2),
    PRIMARY KEY (id)
);
