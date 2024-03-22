-- DML
DROP TABLE IF EXISTS `book_review`;

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

CREATE TABLE IF NOT EXISTS `book` (
    `id` BIGINT NOT NULL,
    `author` VARCHAR(255),
    `isbn` VARCHAR(255),
    `title` VARCHAR(255),
    PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `book_review` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `content` VARCHAR(255),
    `email` VARCHAR(255),
    `status` VARCHAR(255),
    `book_id` BIGINT NOT NULL,
    PRIMARY KEY (`id`));
ALTER TABLE `book_review` ADD CONSTRAINT FK_BOOK FOREIGN KEY (`book_id`) REFERENCES book(`id`);
