--changeSet Roman:2
CREATE TABLE un_group (
  id SERIAL PRIMARY KEY NOT NULL,
  ed_inst_id BIGINT REFERENCES educational_institution (id) NOT NULL,
  name varchar(255) NOT NULL
);
