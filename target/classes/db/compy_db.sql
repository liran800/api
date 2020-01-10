-- create db tables from scratch.

--drop if exist
DROP SEQUENCE  IF EXISTS users_seq CASCADE;
DROP TABLE IF EXISTS users;

--create seq:
CREATE SEQUENCE users_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;

--create tables:
CREATE TABLE users (
    id numeric NOT NULL DEFAULT nextval('users_seq'::regclass),
    email character varying NOT NULL,
    first_name character varying NOT NULL,
    last_name character varying NOT NULL,
    mobile character varying,
    list_name character varying,
    profilesJson json,
    remarks character varying,
    start_date date  DEFAULT now(),
    end_date date,
    version integer
)
WITH (
OIDS=FALSE
);
