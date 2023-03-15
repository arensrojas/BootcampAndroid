-- Autor: Javier Fuentes
-- Autor: Leonardo Rojas
-- Descripción: Sprint 3
-- Fecha: 2023-03-08

USE sprint;

/*
Se crea la tabla usuario
*/
CREATE TABLE `usuario` (
  `id_usuario` INT NOT NULL AUTO_INCREMENT,  
  `nombres` VARCHAR(30) NOT NULL,
  `apellidos` VARCHAR(30) NOT NULL,
  `fecha_nacimiento` DATE NOT NULL,
  `rut_usuario` INT NOT NULL,
  PRIMARY KEY (`id_usuario`)  
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;




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
  `usuario_id` INT,
  PRIMARY KEY (`rut_cliente`),
  FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO cliente (rut_cliente,nombres, apellidos, telefono, afp, sistema_salud, direccion, comuna, edad)
VALUES
(23456875,'Javier', 'Capibara', '123456789', 'AFP Modelo', 1, 'Calle Amenaza Nuclear 123', 'Santiago', 30),
(23434652,'María', 'González', '987654321', 'AFP Provida', 2, 'Av. Siempreviva 742', 'Concepción', 25),
(21765938,'Pedro', 'Ulloa', '555335555', 'AFP Habitat', 1, 'Calle de la Amistad 336', 'Antofagasta', 40),
(15458315,'Laura', 'Muñoz', '444433444', 'AFP Cuprum', 2, 'Calle wallaby 42 sidney', 'Viña del Mar', 35);

/*
Se crea la tabla accidente
*/
CREATE TABLE `accidente` (
  `id_accidente` int NOT NULL AUTO_INCREMENT,
  `dia_accidente` date DEFAULT NULL,
  `hora_accidente` time DEFAULT NULL,
  `lugar_accidente` varchar(50) NOT NULL,
  `origen` varchar(100) DEFAULT NULL,
  `consecuencias` varchar(100) DEFAULT NULL,
  `Cliente_rutcliente` int NOT NULL,
  PRIMARY KEY (`id_accidente`),
  KEY `Cliente_rutcliente_idx` (`Cliente_rutcliente`),
  CONSTRAINT `Cliente_rutcliente` FOREIGN KEY (`Cliente_rutcliente`) REFERENCES `cliente` (`rut_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO accidente (dia_accidente, hora_accidente, lugar_accidente, origen, consecuencias, Cliente_rutcliente)
VALUES
('2022-02-10', '00:00:00', 'Calle Las Lauchas Inquietas 595', 'Resbalón en la banqueta', 'Herida en la rodilla', 1),
('2022-02-15', '18:00:00', 'Calle Murmullos 893', 'Colisión vehicular', 'Lesiones leves', 1),
('2022-03-01', '11:00:00', 'Av. Siempreviva 742', 'Caída desde escalera', 'Fractura de tobillo', 2),
('2022-03-03', '10:30:00', 'Av. Los Leones 789', 'Atropello', 'Fractura de pierna', 4),
('2022-03-05', '15:00:00', 'Calle El monte dinosaurio 434', 'Corte con herramienta', 'Herida en la mano', 3),
('2022-03-06', '12:00:00', 'Av. Caballos Desbocados 742', 'Quemadura con líquido caliente', 'Lesiones leves', 2),
('2022-03-08', '09:30:00', 'Calle de los mapaches en pie de guerra 546', 'Caída desde altura', 'Lesiones leves', 3);

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
CREATE TABLE `asistente` (
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
  
/*
Se crea la tabla chequeo
*/
CREATE TABLE `chequeo` (
  `id_chequeo` INT NOT NULL AUTO_INCREMENT,
  `nombre_chequeo` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id_chequeo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*
Se crea la tabla visita_chequeo
*/
CREATE TABLE `visita_chequeo` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `estado_cumplimiento` ENUM('Cumple', 'Cumple con observaciones', 'No Cumple') NOT NULL,
  `Visita_idvisita` INT NOT NULL,
  `Chequeo_idchequeo` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `Visita_idvisita_idx` (`Visita_idvisita`),
  INDEX `Chequeo_idchequeo_idx` (`Chequeo_idchequeo`),
  CONSTRAINT `Visita_idvisita` FOREIGN KEY (`Visita_idvisita`) REFERENCES `visita` (`id_visita`),
  CONSTRAINT `Chequeo_idchequeo` FOREIGN KEY (`Chequeo_idchequeo`) REFERENCES `chequeo` (`id_chequeo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*
Se crea la tabla administrativo
*/
CREATE TABLE `administrativo` (
    `rut_administrativo` INT NOT NULL,
    `nombres` VARCHAR(50) NOT NULL,
    `apellidos` VARCHAR(50) NOT NULL,
    `correo_electronico` VARCHAR(100) NOT NULL,
    `area_pertenencia` VARCHAR(50) NOT NULL,
    `usuario_id` INT,
    PRIMARY KEY (`rut_administrativo`),
    FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id_usuario`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*
Se crea la tabla profesional
*/
CREATE TABLE `profesional` (
	`rut_profesional` INT NOT NULL,
	`nombres` varchar(30) NOT NULL,
	`apellidos` varchar(30) NOT NULL,
	`telefono` varchar(30) NOT NULL,
	`titulo_profesional` varchar(50) DEFAULT NULL,
	`usuario_id` INT,
	PRIMARY KEY (`rut_profesional`),
	FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `pago` (
  `id_pago` INT AUTO_INCREMENT PRIMARY KEY,
  `rut_cliente` INT NOT NULL,
  `fecha_pago` DATE NOT NULL,
  `monto` DECIMAL(10, 2) NOT NULL,
  `mes` INT NOT NULL,
  `anio` INT NOT NULL,
  FOREIGN KEY (`rut_cliente`) REFERENCES `cliente`(`rut_cliente`)
);

CREATE TABLE `asesoria` (
 `id_asesoria` INT AUTO_INCREMENT PRIMARY KEY,
  `fecha_asesoria` DATE NOT NULL,
  `motivo` VARCHAR(100) NOT NULL,
  `rut_profesional` INT NOT NULL,
  FOREIGN KEY (`rut_profesional`) REFERENCES `profesional` (`rut_profesional`)
);



    
   