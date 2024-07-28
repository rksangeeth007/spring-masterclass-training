----Commenting this for JPA testing as the schema for inmemory DB will be created automatically by JPA Autoconfiguration.
--You can add the create table schema in a diff file named schema.sql too under resources.

--create table person
--(
--   id integer not null,
--   name varchar(255) not null,
--   location varchar(255),
--   birth_date timestamp,
--   primary key(id)
--);



INSERT INTO person (id, name, location, birth_date )
VALUES(10001,  'Ranga', 'Hyderabad',sysdate());
INSERT INTO person (id, name, location, birth_date )
VALUES(10002,  'James', 'New York',sysdate());
INSERT INTO person (id, name, location, birth_date )
VALUES(10003,  'Pieter', 'Amsterdam',sysdate());