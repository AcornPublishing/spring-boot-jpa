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

DROP TABLE IF EXISTS `book_audit`;
DROP TABLE IF EXISTS `author_audit`;
DROP TABLE IF EXISTS `revinfo`;

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

CREATE TABLE `revinfo` (
    `rev` INTEGER NOT NULL AUTO_INCREMENT,
    `revtstmp` BIGINT,
    PRIMARY KEY (`rev`));

CREATE TABLE `author_audit` (
    `id` BIGINT NOT NULL,
    `rev` INTEGER NOT NULL,
    `revtype` TINYINT,
    `revend` INTEGER,
    `age` INTEGER NOT NULL,
    `genre` VARCHAR(255),
    `name` VARCHAR(255),
    PRIMARY KEY (`id`, `rev`));
ALTER TABLE `author_audit` ADD CONSTRAINT FK_AUTHOR_AUDIT_REV FOREIGN KEY (`rev`) REFERENCES revinfo(`rev`);
ALTER TABLE `author_audit` ADD CONSTRAINT FK_AUTHOR_AUDIT_REVEND FOREIGN KEY (`revend`) REFERENCES revinfo(`rev`);

CREATE TABLE `book_audit` (
    `id` BIGINT NOT NULL,
    `rev` INTEGER NOT NULL,
    `revtype` TINYINT,
    `revend` INTEGER,
    `isbn` VARCHAR(255),
    `title` VARCHAR(255),
    `author_id` BIGINT,
    PRIMARY KEY (`id`, `rev`));
ALTER TABLE `book_audit` ADD CONSTRAINT FK_BOOK_AUDIT_REV FOREIGN KEY (`rev`) REFERENCES revinfo(`rev`);
ALTER TABLE `book_audit` ADD CONSTRAINT FK_BOOK_AUDIT_REVEND FOREIGN KEY (`revend`) REFERENCES revinfo(`rev`);