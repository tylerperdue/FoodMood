CREATE TABLE APP.FOODMOODUSER (
    id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), 
    username VARCHAR(25),
    password VARCHAR(25),
    first_name VARCHAR(25),
    last_name VARCHAR(25),
    age INTEGER,
    PRIMARY KEY(id)
);

INSERT INTO APP.FOODMOODUSER (username, password, first_name, last_name, age) VALUES ('test', 'test', 'John', 'Doe', 40);
