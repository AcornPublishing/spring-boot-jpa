-- DML
DROP TABLE IF EXISTS `inventory`;

CREATE TABLE IF NOT EXISTS `inventory` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `quantity` INTEGER NOT NULL,
    `title` VARCHAR(255),
    `version` SMALLINT NOT NULL,
    PRIMARY KEY (`id`));