-- DML
DROP TABLE IF EXISTS `shopping_cart_books`;
DROP TABLE IF EXISTS `shopping_cart`;

CREATE TABLE IF NOT EXISTS `shopping_cart` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `owner` VARCHAR(255),
    PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `shopping_cart_books` (
    `shopping_cart_id` BIGINT NOT NULL,
    `title` VARCHAR(255),
    `index_no` INTEGER NOT NULL);
ALTER TABLE `shopping_cart_books` ADD CONSTRAINT FK_SHOPPING_CART FOREIGN KEY (`shopping_cart_id`) REFERENCES shopping_cart(`id`);