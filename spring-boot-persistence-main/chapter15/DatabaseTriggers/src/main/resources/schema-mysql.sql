-- DDL
DROP TABLE IF EXISTS `modification` ^;
DROP TABLE IF EXISTS `chapter` ^;
DROP TABLE IF EXISTS `review` ^;
DROP TABLE IF EXISTS `bestseller` ^;
DROP TABLE IF EXISTS `paperback` ^;
DROP TABLE IF EXISTS `ebook` ^;
DROP TABLE IF EXISTS `author_book` ^;
DROP TABLE IF EXISTS `author_books` ^;
DROP TABLE IF EXISTS `book_review` ^;
DROP TABLE IF EXISTS `book` ^;
DROP TABLE IF EXISTS `author` ^;
DROP TABLE IF EXISTS `publisher` ^;

CREATE TABLE IF NOT EXISTS `book` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `book_isbn` VARCHAR(255),
    `book_title` VARCHAR(255),
    `book_pages` INTEGER,
    PRIMARY KEY (`id`)) ^;

CREATE TABLE IF NOT EXISTS `chapter` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `chapter_title` VARCHAR(255),
    `chapter_pages` INTEGER,
    `book_id` BIGINT,
    PRIMARY KEY (`id`)) ^;
ALTER TABLE `chapter` ADD CONSTRAINT FK_BOOK FOREIGN KEY (`book_id`) REFERENCES book(`id`) ^;