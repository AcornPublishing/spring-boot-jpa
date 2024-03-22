-- DDL
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

CREATE TABLE IF NOT EXISTS `author_book` (
    `author_id` BIGINT NOT NULL,
    `book_id` BIGINT NOT NULL,
    PRIMARY KEY (`author_id`, `book_id`),
    FOREIGN KEY (`author_id`) REFERENCES `author` (`id`),
    FOREIGN KEY (`book_id`) REFERENCES `book` (`id`));
