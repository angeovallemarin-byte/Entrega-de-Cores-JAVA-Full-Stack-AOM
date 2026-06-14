-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema inscripciones_cursos
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema inscripciones_cursos
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `inscripciones_cursos` DEFAULT CHARACTER SET utf8 ;
USE `inscripciones_cursos` ;

-- -----------------------------------------------------
-- Table `inscripciones_cursos`.`estudiantes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `inscripciones_cursos`.`estudiantes` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(70) NOT NULL,
  `edad` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `inscripciones_cursos`.`cursos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `inscripciones_cursos`.`cursos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(70) NOT NULL,
  `duracion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `inscripciones_cursos`.`inscripciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `inscripciones_cursos`.`inscripciones` (
  `estudiantes_id` INT NOT NULL,
  `cursos_id` INT NOT NULL,
  INDEX `fk_inscripciones_estudiantes_idx` (`estudiantes_id` ASC) VISIBLE,
  INDEX `fk_inscripciones_cursos1_idx` (`cursos_id` ASC) VISIBLE,
  CONSTRAINT `fk_inscripciones_estudiantes`
    FOREIGN KEY (`estudiantes_id`)
    REFERENCES `inscripciones_cursos`.`estudiantes` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_inscripciones_cursos1`
    FOREIGN KEY (`cursos_id`)
    REFERENCES `inscripciones_cursos`.`cursos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
