-- DML
DROP TABLE IF EXISTS `modification` ^;
DROP TABLE IF EXISTS `chapter` ^;
DROP TABLE IF EXISTS `review` ^;
DROP TABLE IF EXISTS `bestseller` ^;
DROP TABLE IF EXISTS `paperback` ^;
DROP TABLE IF EXISTS `ebook` ^;
DROP TABLE IF EXISTS `author_book` ^;
DROP TABLE IF EXISTS `author_books` ^;
DROP TABLE IF EXISTS `book` ^;
DROP TABLE IF EXISTS `author` ^;
DROP TABLE IF EXISTS `publisher` ^;

DROP TABLE IF EXISTS `article` ^;
DROP TABLE IF EXISTS `magazine` ^;

CREATE TABLE IF NOT EXISTS `article` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `title` VARCHAR(255),
    PRIMARY KEY (`id`)) ^;

CREATE TABLE IF NOT EXISTS `book` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `title` VARCHAR(255),
    PRIMARY KEY (`id`)) ^;

CREATE TABLE IF NOT EXISTS `magazine` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `title` VARCHAR(255),
    PRIMARY KEY (`id`)) ^;

CREATE TABLE IF NOT EXISTS `review` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `content` VARCHAR(255),
    `article_id` BIGINT,
    `book_id` BIGINT,
    `magazine_id` BIGINT,
    PRIMARY KEY (`id`)) ^;
ALTER TABLE `review` ADD CONSTRAINT FK_ARTICLE FOREIGN KEY (`article_id`) REFERENCES article(`id`) ^;
ALTER TABLE `review` ADD CONSTRAINT FK_BOOK FOREIGN KEY (`book_id`) REFERENCES book(`id`) ^;
ALTER TABLE `review` ADD CONSTRAINT FK_MAGAZINE FOREIGN KEY (`magazine_id`) REFERENCES magazine(`id`) ^;
