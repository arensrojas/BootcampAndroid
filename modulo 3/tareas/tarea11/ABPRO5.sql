-- Autor: Javier Fuentes
-- Autor: Leonardo Rojas
-- Descripción: ABPRO5
-- Fecha: 2023-03-03

USE abpro5;

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

