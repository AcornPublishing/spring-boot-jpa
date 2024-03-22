-- DML
DROP TABLE IF EXISTS `screenshot`;

CREATE TABLE IF NOT EXISTS `screenshot` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `create_on` DATETIME(6),
    `name` VARCHAR(255),
    PRIMARY KEY (`id`));