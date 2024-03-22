-- DML
DROP TABLE IF EXISTS `modification`;
DROP TABLE IF EXISTS `chapter`;
DROP TABLE IF EXISTS `review`;
DROP TABLE IF EXISTS `bestseller`;
DROP TABLE IF EXISTS `paperback`;
DROP TABLE IF EXISTS `ebook`;
DROP TABLE IF EXISTS `author_book`;
DROP TABLE IF EXISTS `author_books`;
DROP TABLE IF EXISTS `book_review`;
DROP TABLE IF EXISTS `book`;
DROP TABLE IF EXISTS `author`;
DROP TABLE IF EXISTS `publisher`;

CREATE TABLE IF NOT EXISTS `publisher` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(255) NOT NULL,
    `urc` INTEGER NOT NULL,
    PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `author` (
    `name` VARCHAR(255) NOT NULL,
    `genre` VARCHAR(255),
    `publisher` BIGINT NOT NULL,
    PRIMARY KEY (`name`, `publisher`));
ALTER TABLE `author` ADD CONSTRAINT FK_PUBLISHER FOREIGN KEY (`publisher`) REFERENCES publisher(`id`);

CREATE TABLE IF NOT EXISTS `book` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `isbn` VARCHAR(255),
    `title` VARCHAR(255),
    `name` VARCHAR(255),
    `publisher` BIGINT,
    PRIMARY KEY (`id`));
ALTER TABLE `book` ADD CONSTRAINT FK_AUTHOR FOREIGN KEY (`name`, `publisher`) REFERENCES author(`name`, `publisher`);