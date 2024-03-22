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

CREATE TABLE IF NOT EXISTS `author` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(255),
    `genre` VARCHAR(255),
    `age` INTEGER NOT NULL,
    PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `book` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `title` VARCHAR(255),
    `isbn` VARCHAR(255),
    `author_id` BIGINT NOT NULL,
    PRIMARY KEY (`id`));
ALTER TABLE `book` ADD CONSTRAINT `fk_book_author` FOREIGN KEY (`author_id`) REFERENCES `author` (`id`);