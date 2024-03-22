-- DML
DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS author;
DROP SEQUENCE IF EXISTS hilo_sequence;

CREATE SEQUENCE hilo_sequence start 1 increment 100;

CREATE TABLE IF NOT EXISTS author (
    id VARCHAR(255) NOT NULL,
    name VARCHAR(255),
    PRIMARY KEY (id));