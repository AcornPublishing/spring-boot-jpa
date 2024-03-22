-- DML
DROP TABLE IF EXISTS book cascade;
DROP TABLE IF EXISTS author cascade;

CREATE TABLE IF NOT EXISTS author (
    id BIGSERIAL NOT NULL,
    age INT4 NOT NULL,
    book JSONB,
    genre VARCHAR(255),
    name VARCHAR(255),
    PRIMARY KEY (id));