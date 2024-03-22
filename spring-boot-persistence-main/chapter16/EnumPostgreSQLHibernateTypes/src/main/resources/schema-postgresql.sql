-- DML
DROP TABLE IF EXISTS book cascade;
DROP TABLE IF EXISTS author cascade;

DROP TYPE IF EXISTS genre_info CASCADE;
CREATE TYPE genre_info AS ENUM ('HORROR', 'ANTHOLOGY', 'HISTORY');

CREATE TABLE IF NOT EXISTS author (
    id BIGSERIAL NOT NULL,
    age INT4 NOT NULL,
    genre genre_info,
    name VARCHAR(255),
    PRIMARY KEY (id));