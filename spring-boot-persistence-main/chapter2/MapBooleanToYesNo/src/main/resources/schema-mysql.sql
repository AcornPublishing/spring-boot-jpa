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

CREATE TABLE author (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    age int(11) NOT NULL,
    best_selling varchar(3) NOT NULL,
    genre varchar(255) DEFAULT NULL,
    name varchar(255) DEFAULT NULL,
    PRIMARY KEY (id)
);
