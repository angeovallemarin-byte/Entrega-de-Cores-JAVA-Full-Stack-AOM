-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema clientes_y_pedidos
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema clientes_y_pedidos
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `clientes_y_pedidos` DEFAULT CHARACTER SET utf8 ;
USE `clientes_y_pedidos` ;

-- -----------------------------------------------------
-- Table `clientes_y_pedidos`.`clientes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `clientes_y_pedidos`.`clientes` ;

CREATE TABLE IF NOT EXISTS `clientes_y_pedidos`.`clientes` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(70) NOT NULL,
  `direccion` VARCHAR(100) NULL,
  `telefono` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `clientes_y_pedidos`.`pedidos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `clientes_y_pedidos`.`pedidos` ;

CREATE TABLE IF NOT EXISTS `clientes_y_pedidos`.`pedidos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `clientes_id` INT NOT NULL,
  `fecha` DATE NOT NULL,
  `total` DECIMAL NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_pedidos_clientes1`
    FOREIGN KEY ()
    REFERENCES `clientes_y_pedidos`.`clientes` ()
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `clientes_y_pedidos`.`clientes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `clientes_y_pedidos`.`clientes` ;

CREATE TABLE IF NOT EXISTS `clientes_y_pedidos`.`clientes` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(70) NOT NULL,
  `direccion` VARCHAR(100) NULL,
  `telefono` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `clientes_y_pedidos`.`pedidos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `clientes_y_pedidos`.`pedidos` ;

CREATE TABLE IF NOT EXISTS `clientes_y_pedidos`.`pedidos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `clientes_id` INT NOT NULL,
  `fecha` DATE NOT NULL,
  `total` DECIMAL NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_pedidos_clientes1`
    FOREIGN KEY ()
    REFERENCES `clientes_y_pedidos`.`clientes` ()
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
