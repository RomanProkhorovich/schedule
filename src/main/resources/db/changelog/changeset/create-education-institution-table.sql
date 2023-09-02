--changeSet Roman:1
CREATE TABLE educational_institution (
   id SERIAL PRIMARY KEY NOT NULL,
   country VARCHAR(255) NOT NULL,
   city VARCHAR(255) NOT NULL,
   name VARCHAR(255) UNIQUE NOT NULL
);
