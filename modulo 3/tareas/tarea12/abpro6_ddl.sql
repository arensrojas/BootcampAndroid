use abpro6_ddl;

-- Autor: Javier Fuentes
-- Autor: Leonardo Rojas
-- Descripción: ABPRO6
-- Fecha: 2023-03-0

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
    
/*
3. Genere una consulta que permita crear una restricción de valor único sobre el campo
“telefono” de la tabla Cliente.
*/

ALTER TABLE cliente ADD CONSTRAINT telefono_unico UNIQUE (telefono);

/*
4. Genere una consulta que permita restringir los valores posibles del campo sistemasalud de
la tabla Cliente al conjunto {1,2}.
*/
ALTER TABLE cliente
ADD CONSTRAINT sistemasalud_restringido CHECK (sistemasalud IN (1,2));

/*
5. Genere las consultas para insertar cuatro registros en la tabla Cliente, y consultas para
insertar siete registros en la tabla Accidente, asociados a los clientes recién ingresados.
*/
INSERT INTO cliente (clinombres, cliapellidos, clitelefono, cliafp, clisistemasalud, clidireccion, clicomuna, cliedad)
VALUES
('Javier', 'Capibara', '123456789', 'AFP Modelo', 1, 'Calle Amenaza Nuclear 123', 'Santiago', 30),
('María', 'González', '987654321', 'AFP Provida', 2, 'Av. Siempreviva 742', 'Concepción', 25),
('Pedro', 'Ulloa', '555335555', 'AFP Habitat', 1, 'Calle de la Amistad 336', 'Antofagasta', 40),
('Laura', 'Muñoz', '444433444', 'AFP Cuprum', 2, 'Calle wallaby 42 sidney', 'Viña del Mar', 35);

INSERT INTO accidente (accifecha, accihora, accilugar, acciorigen, acciconsecuencias,Cliente_rutcliente)
VALUES
('2022-02-10', '14:30:00', 'Calle Las Lauchas Inquietas 595', 'Resbalón en la banqueta', 'Herida en la rodilla', 1),
('2022-02-15', '18:00:00', 'Calle Murmullos 893', 'Colisión vehicular', 'Lesiones leves', 1),
('2022-03-01', '11:00:00', 'Av. Siempreviva 742', 'Caída desde escalera', 'Fractura de tobillo', 2),
('2022-03-03', '10:30:00', 'Av. Los Leones 789', 'Atropello', 'Fractura de pierna', 4),
('2022-03-05', '15:00:00', 'Calle El monte dinosaurio 434', 'Corte con herramienta', 'Herida en la mano', 3),
('2022-03-06', '12:00:00', 'Av. Caballos Desbocados 742', 'Quemadura con líquido caliente', 'Lesiones leves', 2),
('2022-03-08', '09:30:00', 'Calle de los mapaches en pie de guerra 546', 'Caída desde altura', 'Lesiones leves', 3);
