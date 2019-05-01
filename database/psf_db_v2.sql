SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';


CREATE SCHEMA IF NOT EXISTS `psf_db` DEFAULT CHARACTER SET utf8 ;
USE `psf_db` ;

-- -----------------------------------------------------
-- Table `psf_db`.`products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `psf_db`.`products` (
  `ID_PROD` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `PROD_NAME` VARCHAR(100) NOT NULL,
  `PROD_PRICE` DOUBLE(7,2) NOT NULL,
  `DISCOUNT_FOR_PREMIUM_USERS` TINYINT(3) UNSIGNED NULL DEFAULT NULL,
  `PROD_SIZE` TINYINT(3) UNSIGNED NOT NULL,
  `PROD_DESCRIPTION` TEXT NOT NULL,
  `IMAGE` VARCHAR(420) NOT NULL,
  PRIMARY KEY (`ID_PROD`),
  UNIQUE INDEX `ID_PROD` (`ID_PROD` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;


-- -----------------------------------------------------
-- Table `psf_db`.`additions`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `psf_db`.`additions` (
  `ID_ADD` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `ADD_NAME` VARCHAR(100) NOT NULL,
  `ADD_PRICE` DOUBLE(5,2) NOT NULL,
  `products_ID_PROD` BIGINT(20) UNSIGNED NOT NULL,
  PRIMARY KEY (`ID_ADD`, `products_ID_PROD`),
  UNIQUE INDEX `ID_ADD` (`ID_ADD` ASC),
  INDEX `fk_additions_products1_idx` (`products_ID_PROD` ASC),
  CONSTRAINT `fk_additions_products1`
    FOREIGN KEY (`products_ID_PROD`)
    REFERENCES `psf_db`.`products` (`ID_PROD`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;


-- -----------------------------------------------------
-- Table `psf_db`.`order`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `psf_db`.`order` (
  `ID_ORDER` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `ORDER_PRICE` DOUBLE(8,2) NOT NULL,
  `DATE_TIME` DATETIME NOT NULL,
  `DELIVERY_TYPE` VARCHAR(250) NOT NULL,
  `PAYMENT` VARCHAR(250) NOT NULL,
  `products_ID_PROD` BIGINT(20) UNSIGNED NOT NULL,
  PRIMARY KEY (`ID_ORDER`, `products_ID_PROD`),
  UNIQUE INDEX `ID_ORDER` (`ID_ORDER` ASC),
  INDEX `fk_order_products1_idx` (`products_ID_PROD` ASC),
  CONSTRAINT `fk_order_products1`
    FOREIGN KEY (`products_ID_PROD`)
    REFERENCES `psf_db`.`products` (`ID_PROD`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;


-- -----------------------------------------------------
-- Table `psf_db`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `psf_db`.`users` (
  `USER_NAME` VARCHAR(100) NOT NULL,
  `USER_LASTNAME` VARCHAR(200) NOT NULL,
  `ID_USER` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `EMAIL` VARCHAR(254) NOT NULL,
  `USER_TYPE` TINYINT(3) UNSIGNED NOT NULL,
  `ADDRESS` VARCHAR(500) NULL DEFAULT NULL,
  `POINTS` SMALLINT(5) UNSIGNED NOT NULL,
  `MONTHLY_ORDERS` SMALLINT(5) UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`ID_USER`),
  UNIQUE INDEX `ID_USER` (`ID_USER` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;


-- -----------------------------------------------------
-- Table `psf_db`.`orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `psf_db`.`orders` (
  `ID_ORDERS` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `QUANTITY` TINYINT(3) UNSIGNED NOT NULL,
  `users_ID_USER` BIGINT(20) UNSIGNED NOT NULL,
  `order_ID_ORDER` BIGINT(20) UNSIGNED NOT NULL,
  `TOTAL_PRICE` DOUBLE(9,2) NULL,
  PRIMARY KEY (`ID_ORDERS`, `users_ID_USER`, `order_ID_ORDER`),
  UNIQUE INDEX `ID_ORDERS` (`ID_ORDERS` ASC),
  INDEX `fk_orders_users_idx` (`users_ID_USER` ASC),
  INDEX `fk_orders_order1_idx` (`order_ID_ORDER` ASC),
  CONSTRAINT `fk_orders_users`
    FOREIGN KEY (`users_ID_USER`)
    REFERENCES `psf_db`.`users` (`ID_USER`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_orders_order1`
    FOREIGN KEY (`order_ID_ORDER`)
    REFERENCES `psf_db`.`order` (`ID_ORDER`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
