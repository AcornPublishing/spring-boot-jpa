-- DDL
DROP TABLE IF EXISTS `hibernate_sequences`;

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

CREATE TABLE IF NOT EXISTS `author` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `age` INTEGER NOT NULL,
    `genre` VARCHAR(255),
    `name` VARCHAR(255),
    PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `book` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `isbn` VARCHAR(255),
    `title` VARCHAR(255),
    `author_id` BIGINT,
    PRIMARY KEY (`id`));
ALTER TABLE `book` ADD CONSTRAINT FK_AUTHOR FOREIGN KEY (`author_id`) REFERENCES author(`id`);

CREATE TABLE IF NOT EXISTS `ebook` (
    `id` BIGINT NOT NULL,
    `isbn` VARCHAR(255),
    `title` VARCHAR(255),
    `author_id` BIGINT,
    `format` VARCHAR(255),
    PRIMARY KEY (`id`));
ALTER TABLE `ebook` ADD CONSTRAINT FK_EBOOK FOREIGN KEY (`author_id`) REFERENCES author(`id`);

CREATE TABLE IF NOT EXISTS `paperback` (
    `id` BIGINT NOT NULL,
    `isbn` VARCHAR(255),
    `title` VARCHAR(255),
    `author_id` BIGINT,
    `size_in` VARCHAR(255),
    `weight_lbs` VARCHAR(255),
    PRIMARY KEY (`id`));
ALTER TABLE `paperback` ADD CONSTRAINT FK_PAPERBACK FOREIGN KEY (`author_id`) REFERENCES author(`id`);

CREATE TABLE IF NOT EXISTS `hibernate_sequences` (
    `sequence_name` VARCHAR(255),
    `next_val` BIGINT,
    PRIMARY KEY (`sequence_name`));
