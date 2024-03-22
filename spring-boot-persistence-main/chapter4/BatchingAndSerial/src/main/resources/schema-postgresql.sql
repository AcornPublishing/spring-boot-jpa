-- DML
DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS author;
DROP SEQUENCE IF EXISTS hilo_sequence;

CREATE SEQUENCE hilo_sequence start 1 increment 1;

CREATE TABLE IF NOT EXISTS author (
    id BIGSERIAL NOT NULL,
    age INT4 NOT NULL,
    genre VARCHAR(255),
    name VARCHAR(255),
    PRIMARY KEY (id));