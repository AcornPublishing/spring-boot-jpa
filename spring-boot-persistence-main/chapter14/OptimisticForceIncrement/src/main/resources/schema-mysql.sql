-- DML
DROP TABLE IF EXISTS `modification`;
DROP TABLE IF EXISTS `chapter`;

CREATE TABLE IF NOT EXISTS `chapter` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `title` VARCHAR(255),
    `content` VARCHAR(255),
    `version` SMALLINT NOT NULL,
    PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `modification` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `description` VARCHAR(255),
    `modification` VARCHAR(255),
    `chapter_id` BIGINT,
    PRIMARY KEY (`id`));
ALTER TABLE `modification` ADD CONSTRAINT `FK_CHAPTER` FOREIGN KEY (`chapter_id`) REFERENCES `chapter`(`id`);