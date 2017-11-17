CREATE TABLE USER (
    id INT PRIMARY KEY, 
    USERNAME TEXT,
    PASSWORD TEXT,
    FIRST_NAME CHAR(25),
    LAST_NAME CHAR(25),
    AGE INT
);

CREATE TABLE FOOD (
    ID INT, 
    NAME CHAR(25),
    TYPE CHAR(25),
    DESCRIPTION CHAR(25),
    TIMESTAMP CHAR(25)
);

CREATE TABLE MOOD (
    ID INT, 
    NAME CHAR(25),
    RATING INT,
    TIMESTAMP CHAR(25)
);