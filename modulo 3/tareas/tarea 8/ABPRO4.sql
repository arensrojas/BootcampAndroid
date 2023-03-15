-- Autor: Javier Fuentes
-- Autor: Leonardo Rojas
-- Descripción: ABPRO4
-- Fecha: 2023-02-03

USE apro4;

/* 
Se crea la tabla capacitacion
*/
CREATE TABLE `capacitacion` (
  `idcapacitacion` int NOT NULL AUTO_INCREMENT,
  `rutcliente` varchar(15) NOT NULL,
  `dia` varchar(25) DEFAULT NULL,
  `hora` varchar(5) DEFAULT NULL,
  `lugar` varchar(50) NOT NULL,
  `duracion` int NOT NULL,
  `cantidadasistentes` int DEFAULT NULL,
  PRIMARY KEY (`idcapacitacion`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/* 
Se crea la tabla asistentes
*/
CREATE TABLE `asistentes` (
  `idasistente` int NOT NULL AUTO_INCREMENT,
  `nombres` varchar(100) NOT NULL,
  `edad` int NOT NULL,
  `capacitacion_idcapacitacion` int NOT NULL,
  PRIMARY KEY (`idasistente`),
  KEY `asistentes_capacitacion_fk` (`capacitacion_idcapacitacion`),
  CONSTRAINT `asistentes_capacitacion_fk` FOREIGN KEY (`capacitacion_idcapacitacion`) REFERENCES `capacitacion` (`idcapacitacion`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*
1. Genere una consulta que permita insertar un registro en la tabla de capacitaciones,
indicando solo los campos que son obligatorios a la consulta.
*/
INSERT INTO capacitacion (rutcliente, lugar, duracion) VALUES ('23344348-9', 'Sala de reuniones', 2);

/*
2. Incluya una sentencia que confirme los cambios incorporados en la sentencia anterior.
*/
COMMIT;

/*
3. Agregue una consulta o instrucción que habilite el auto guardado de instrucciones para un
total de dos sentencias.
*/
SET autocommit=0;

/*
4. Agregue dos consultas para insertar un registro en la tabla de asistentes en cada una.
Incluya en la consulta todos los campos de la tabla en orden descendente respecto de cómo
aparece en la definición de la tabla. Asocie estos registros a la capacitación creada en el
ítem 1 de este ejercicio.
*/
INSERT INTO asistentes (capacitacion_idcapacitacion, edad, nombres) VALUES (1, 30, 'Raul Pérez');
INSERT INTO asistentes (capacitacion_idcapacitacion, edad, nombres) VALUES (1, 44, 'Carlos Gómez');

/*
5. Genere una consulta de actualización del registro insertado en la tabla de capacitaciones,
que permita darles valores a los campos que no fueron considerados en la consulta original.
*/
UPDATE capacitacion SET dia='viernes', hora='10:00', cantidadasistentes=15 WHERE idcapacitacion=1;

/*
6. Genere una consulta que permita eliminar los asistentes anteriormente ingresados, pero en
una sola consulta.
*/
DELETE FROM asistentes WHERE capacitacion_idcapacitacion = 1;

/*
7. Agregue una consulta para deshacer los cambios realizados.
*/
ROLLBACK;