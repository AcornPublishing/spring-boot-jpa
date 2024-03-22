-- DML
IF OBJECT_ID(N'dbo.author', N'U') IS NOT NULL
DROP TABLE [dbo].[author];

CREATE TABLE author (
    id BIGINT IDENTITY NOT NULL,
    age INT NOT NULL,
    genre VARCHAR(255),
    name VARCHAR(255),
    PRIMARY KEY (id));