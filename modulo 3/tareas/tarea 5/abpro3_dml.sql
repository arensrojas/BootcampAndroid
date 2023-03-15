-- Autor: Javier Fuentes
-- Autor: Leonardo Rojas
-- Descripción: ABPRO2
-- Fecha: 2023-02-03

USE apro3_dml;

/* 1-Haga las consultas necesarias para convertir las llaves primarias de cada tabla en campos
 autonuméricos.
*/

CREATE TABLE asistentes (
idasistente INT NOT NULL AUTO_INCREMENT,
nombres VARCHAR(100) NOT NULL,
edad INT NOT NULL,
capacitacion_idcapacitacion INT NOT NULL,
PRIMARY KEY (idasistente)
);

CREATE TABLE capacitacion (
idcapacitacion INT NOT NULL AUTO_INCREMENT,
rutcliente VARCHAR(15) NOT NULL,
dia VARCHAR(25),
hora VARCHAR(5),
lugar VARCHAR(50) NOT NULL,
duracion INT NOT NULL,
cantidadasistentes INT,
PRIMARY KEY (idcapacitacion)
);

ALTER TABLE asistentes
ADD CONSTRAINT asistentes_capacitacion_fk FOREIGN KEY (capacitacion_idcapacitacion)
REFERENCES capacitacion (idcapacitacion);

/*
Ingrese manualmente a la tabla Capacitación a lo menos 5 registros, mientras que en la
tabla Asistentes debe ingresar manualmente al menos 10 registros, asociados a
diferentes registros de capacitaciones.
*/



INSERT INTO capacitacion (rutcliente, dia, hora, lugar, duracion, cantidadasistentes) VALUES
('16543786-1', 'lunes', '10:00', 'sala1', 45, 30),
('12676474-1', 'martes', '11:00', 'sala2', 90, 50),
('18984938-1', 'miercoles', '12:00', 'sala3', 45, 25),
('13894756-1', 'jueves', '16:00', 'sala4', 90, 50),
('25783488-1', 'viernes', '17:00', 'sala5', 45, 40);

/*	2- Genere 3 consultas que permitan ingresar datos sobre la tabla Capacitación, sin asignar el
campo idcapacitacion en la consulta misma.
*/
INSERT INTO capacitacion (rutcliente, dia, hora, lugar, duracion, cantidadasistentes) VALUES
('18456783-1', 'lunes', '10:00', 'sala1', 45, 45);

INSERT INTO capacitacion (rutcliente, dia, hora, lugar, duracion, cantidadasistentes) VALUES
('25470845-k', 'martes', '11:00', 'sala2', 60, 90);

INSERT INTO capacitacion (rutcliente, dia, hora, lugar, duracion, cantidadasistentes) VALUES
('23789645-1', 'miercoles', '12:00', 'sala3', 90, 120);




INSERT INTO asistentes (nombres, edad, capacitacion_idcapacitacion) VALUES
('Mauricio Escarez', 24, 1 ),
('Felipe Lobos', 20, 2 ),
('Kendall Rozas', 18, 1 ),
('Ana Perez', 19, 3 ),
('Gabriela Millar', 23, 2 ),
('Gonzalo Sepulveda', 21, 3 ),
('Rodrigo Urrutia', 18,4 ),
('Rodrigo Jara', 19, 5 ),
('Nestor Cantillana', 22,4 ),
('Valeria Villarroel', 18, 5 );

/*	3. Genere 5 consultas que permitan ingresar datos sobre la x tabla Asistentes, sin asignar
el campo idasistente en la consulta misma.
*/

INSERT INTO asistentes (nombres, edad, capacitacion_idcapacitacion) VALUES
('Fernando Godoy', 34, 3 );

INSERT INTO asistentes (nombres, edad, capacitacion_idcapacitacion) VALUES
('Fidel Arrue', 23, 5 );

INSERT INTO asistentes (nombres, edad, capacitacion_idcapacitacion) VALUES
('Rodrigo Carcamo', 44, 2);

INSERT INTO asistentes (nombres, edad, capacitacion_idcapacitacion) VALUES
('Mauricio  Huanel', 18, 3 );

INSERT INTO asistentes (nombres, edad, capacitacion_idcapacitacion) VALUES
('Claudio Codio', 19, 4 );

/*	4. Realice una consulta que permita establecer una restricción de tipo única sobre el campo
		nombres de la tabla Asistentes.
*/

ALTER TABLE asistentes ADD CONSTRAINT unique_nombres UNIQUE (nombres);


/*	5. Realice una consulta que permita actualizar los campos dia a “01/01/2020” y hora a “00:00”
	de la tabla capacitación, para todos aquellos registros tales que el día y la hora son igual a
	un valor nulo.
*/

INSERT INTO capacitacion (rutcliente, lugar, duracion, cantidadasistentes) VALUES
('13747823-1',  'sala3', 45, 30),
('23465834-1', 'sala2', 90, 50);

UPDATE capacitacion SET dia = '01/01/2020', hora = '00:00' WHERE dia IS NULL AND hora IS NULL;



/*	6. Realice una consulta que permita eliminar todas aquellas capacitaciones que no tienen
	asistentes. Esto es, aquellas capacitaciones con el campo cantidadasistentes igual a 0, y sin
	registros relacionados en la tabla
*/


INSERT INTO capacitacion (rutcliente, lugar, duracion, cantidadasistentes) VALUES
('15234567-1',  'sala6', 55, 0),
('24345676-1', 'sala4', 70, 0);

DELETE FROM capacitacion WHERE cantidadasistentes = 0   AND   idcapacitacion NOT IN
 (SELECT DISTINCT idcapacitacion FROM asistentes);

