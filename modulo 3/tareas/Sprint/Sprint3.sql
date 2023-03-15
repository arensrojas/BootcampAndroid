-- Autor: Javier Fuentes
-- Autor: Leonardo Rojas
-- Descripción: Sprint 3
-- Fecha: 2023-03-07

USE Sprint3;

/*
Se crea la tabla cliente
*/
CREATE TABLE `cliente` (  
  `rut_cliente` int NOT NULL,
  `nombres` varchar(30) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `afp` varchar(30) DEFAULT NULL,
  `sistema_salud` int DEFAULT NULL,
  `direccion` varchar(70) DEFAULT NULL,
  `comuna` varchar(50) DEFAULT NULL,
  `edad` int NOT NULL,
  PRIMARY KEY (`rut_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*
Se crea la tabla accidente
*/
CREATE TABLE `accidente` (
  `id_accidente` int NOT NULL AUTO_INCREMENT,
  `dia_accidente` date DEFAULT NULL,
  `hora_accidente` date DEFAULT NULL,
  `lugar_accidente` varchar(50) NOT NULL,
  `origen` varchar(100) DEFAULT NULL,
  `consecuencias` varchar(100) DEFAULT NULL,
  `Cliente_rutcliente` int NOT NULL,
  PRIMARY KEY (`id_accidente`),
  KEY `Cliente_rutcliente_idx` (`Cliente_rutcliente`),
  CONSTRAINT `Cliente_rutcliente` FOREIGN KEY (`Cliente_rutcliente`) REFERENCES `cliente` (`rut_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*
Se crea la tabla capacitacion
*/
CREATE TABLE `capacitacion` (
  `id_capacitacion` int NOT NULL AUTO_INCREMENT,
  `fecha_capacitacion` date DEFAULT NULL,
  `hora_capacitacion` date DEFAULT NULL,
  `lugar_capacitacion` varchar(50) NOT NULL,
  `duracion_capacitacion` int DEFAULT NULL,
  `cantidad_asistentes` int NOT NULL,
  `Capacitacion_Cliente_rutcliente` int NOT NULL,
  PRIMARY KEY (`id_capacitacion`),
  KEY `Cliente_rutcliente_idx` (`Capacitacion_Cliente_rutcliente`),
  CONSTRAINT `Capacitacion_Cliente_rutcliente` FOREIGN KEY (`Capacitacion_Cliente_rutcliente`) REFERENCES `cliente` (`rut_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*
Se crea la tabla asistentes
*/
CREATE TABLE `asistentes` (
  `id_asistente` int NOT NULL AUTO_INCREMENT,
  `nombre_asistente` varchar(100) NOT NULL,
  `edad_assitente` int NOT NULL,
  `Capacitacion_idcapacitacion` int NOT NULL,
  PRIMARY KEY (`id_asistente`),
  KEY `Capacitacion_idcapacitacion_idx` (`Capacitacion_idcapacitacion`),
  CONSTRAINT `Capacitacion_idcapacitacion` FOREIGN KEY (`Capacitacion_idcapacitacion`) REFERENCES `capacitacion` (`id_capacitacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*
Se crea la tabla visita
*/
CREATE TABLE `visita` (
  `id_visita` INT NOT NULL AUTO_INCREMENT,
  `fecha_visita` DATE NOT NULL,
  `hora_visita` TIME NULL,
  `lugar_visita` VARCHAR(50) NOT NULL,
  `comentarios_visita` VARCHAR(250) NOT NULL,
  `Visita_Cliente_rutcliente` INT NOT NULL,  
  PRIMARY KEY (`id_visita`),  
  INDEX `Visita_Cliente_rutcliente_idx` (`Visita_Cliente_rutcliente`),
  CONSTRAINT `Visita_Cliente_rutcliente` FOREIGN KEY (`Visita_Cliente_rutcliente`) REFERENCES `cliente` (`rut_cliente`)
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;