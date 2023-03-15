-- Autor: Javier Fuentes
-- Autor: Leonardo Rojas
-- Descripción: ABPRO6
-- Fecha: 2023-03-03

USE abpro6;

/*
Se crea la tabla cliente
*/
CREATE TABLE `cliente` (
  `rutcliente` int NOT NULL AUTO_INCREMENT,
  `nombres` varchar(30) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `afp` varchar(30) DEFAULT NULL,
  `sistemasalud` int DEFAULT NULL,
  `direccion` varchar(70) DEFAULT NULL,
  `comuna` varchar(50) DEFAULT NULL,
  `edad` int NOT NULL,
  PRIMARY KEY (`rutcliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*
Se crea la tabla accidente
*/
CREATE TABLE `accidente` (
  `accidenteid` int NOT NULL AUTO_INCREMENT,
  `dia` date DEFAULT NULL,
  `hora` date DEFAULT NULL,
  `lugar` varchar(50) NOT NULL,
  `origen` varchar(100) DEFAULT NULL,
  `consecuencias` varchar(100) DEFAULT NULL,
  `Cliente_rutcliente` int NOT NULL,
  PRIMARY KEY (`accidenteid`),
  KEY `Cliente_rutcliente_idx` (`Cliente_rutcliente`),
  CONSTRAINT `Cliente_rutcliente` FOREIGN KEY (`Cliente_rutcliente`) REFERENCES `cliente` (`rutcliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


/*
Se crea la tabla capacitacion
*/
CREATE TABLE `capacitacion` (
  `idcapacitacion` int NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `hora` date DEFAULT NULL,
  `lugar` varchar(50) NOT NULL,
  `duracion` int DEFAULT NULL,
  `cantidadasistentes` int NOT NULL,
  `Capacitacion_Cliente_rutcliente` int NOT NULL,
  PRIMARY KEY (`idcapacitacion`),
  KEY `Cliente_rutcliente_idx` (`Capacitacion_Cliente_rutcliente`),
  CONSTRAINT `Capacitacion_Cliente_rutcliente` FOREIGN KEY (`Capacitacion_Cliente_rutcliente`) REFERENCES `cliente` (`rutcliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*
Se crea la tabla asistentes
*/
CREATE TABLE `asistentes` (
  `idasistente` int NOT NULL AUTO_INCREMENT,
  `nombres` varchar(100) NOT NULL,
  `edad` int NOT NULL,
  `Capacitacion_idcapacitacion` int NOT NULL,
  PRIMARY KEY (`idasistente`),
  KEY `Capacitacion_idcapacitacion_idx` (`Capacitacion_idcapacitacion`),
  CONSTRAINT `Capacitacion_idcapacitacion` FOREIGN KEY (`Capacitacion_idcapacitacion`) REFERENCES `capacitacion` (`idcapacitacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*
Se modifica la tabla cliente
*/
ALTER TABLE `abpro6`.`cliente` 
CHANGE COLUMN `nombres` `clinombres` VARCHAR(30) NOT NULL ,
CHANGE COLUMN `apellidos` `cliapellidos` VARCHAR(50) NOT NULL ,
CHANGE COLUMN `telefono` `clitelefono` VARCHAR(20) NOT NULL ,
CHANGE COLUMN `afp` `cliafp` VARCHAR(30) NULL ,
CHANGE COLUMN `sistemasalud` `clisistemasalud` INT NULL DEFAULT NULL ,
CHANGE COLUMN `direccion` `clidireccion` VARCHAR(100) NOT NULL ,
CHANGE COLUMN `comuna` `clicomuna` VARCHAR(50) NOT NULL ,
CHANGE COLUMN `edad` `cliedad` INT NOT NULL ;

/*
Se modifica la tabla accidente
*/
ALTER TABLE `abpro6`.`accidente` 
CHANGE COLUMN `dia` `accidia` DATE NOT NULL ,
CHANGE COLUMN `hora` `accihora` TIME NOT NULL ,
CHANGE COLUMN `lugar` `accilugar` VARCHAR(150) NOT NULL ,
CHANGE COLUMN `origen` `acciorigen` VARCHAR(100) NOT NULL ,
CHANGE COLUMN `consecuencias` `acciconsecuencias` VARCHAR(100) NULL DEFAULT NULL ;

/*
Se modifica la tabla capacitacion
*/
ALTER TABLE `abpro6`.`capacitacion` 
DROP COLUMN `cantidadasistentes`,
CHANGE COLUMN `fecha` `capfecha` DATE NOT NULL ,
CHANGE COLUMN `hora` `caphora` TIME NULL DEFAULT NULL ,
CHANGE COLUMN `lugar` `caplugar` VARCHAR(100) NOT NULL ,
CHANGE COLUMN `duracion` `capduracion` INT NULL DEFAULT NULL ;

/*
Se modifica la tabla asistentes
*/
ALTER TABLE `abpro6`.`asistentes` 
ADD COLUMN `asiscorreo` VARCHAR(70) NULL AFTER `asisedad`,
ADD COLUMN `asistelefono` VARCHAR(20) NULL AFTER `asiscorreo`,
CHANGE COLUMN `nombres` `asistnombres` VARCHAR(100) NOT NULL ,
CHANGE COLUMN `edad` `asisedad` INT NOT NULL ;

/*
Se crea la tabla visita
*/
CREATE TABLE `abpro6`.`visita` (
  `idvisita` INT NOT NULL AUTO_INCREMENT,
  `visfecha` DATE NOT NULL,
  `vishora` TIME NULL,
  `vislugar` VARCHAR(50) NOT NULL,
  `viscomentarios` VARCHAR(250) NOT NULL,
  `Visita_Cliente_rutcliente` INT NOT NULL,  
  PRIMARY KEY (`idvisita`),  
  INDEX `Visita_Cliente_rutcliente_idx` (`Visita_Cliente_rutcliente` ASC) VISIBLE,
  CONSTRAINT `Visita_Cliente_rutcliente`
    FOREIGN KEY (`Visita_Cliente_rutcliente`)
    REFERENCES `abpro6`.`cliente` (`rutcliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
