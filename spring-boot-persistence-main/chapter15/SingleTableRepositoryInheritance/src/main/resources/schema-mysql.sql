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
    `dtype` TINYINT(1) UNSIGNED NOT NULL,   -- have to be unsigned
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `isbn` VARCHAR(255),
    `title` VARCHAR(255),
    `format` VARCHAR(255),
    `size_in` VARCHAR(255),
    `weight_lbs` VARCHAR(255),
    `author_id` BIGINT,
    PRIMARY KEY (`id`));
ALTER TABLE `book` ADD CONSTRAINT FK_AUTHOR FOREIGN KEY (`author_id`) REFERENCES author(`id`);

/*
CREATE TABLE IF NOT EXISTS `ebook` (
    `ebook_book_id` BIGINT NOT NULL,
    `format` VARCHAR(255),
    PRIMARY KEY (`ebook_book_id`));
ALTER TABLE `ebook` ADD CONSTRAINT FK_EBOOK FOREIGN KEY (`ebook_book_id`) REFERENCES book(`id`);

CREATE TABLE IF NOT EXISTS `paperback` (
    `paperback_book_id` BIGINT NOT NULL,
    `size_in` VARCHAR(255),
    `weight_lbs` VARCHAR(255),
    PRIMARY KEY (`paperback_book_id`));
ALTER TABLE `paperback` ADD CONSTRAINT FK_PAPERBACK FOREIGN KEY (`paperback_book_id`) REFERENCES book(`id`);
*/