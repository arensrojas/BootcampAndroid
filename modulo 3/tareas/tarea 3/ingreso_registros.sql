CREATE TABLE asistentes (
idasistente INT NOT NULL,
nombres VARCHAR(100) NOT NULL,
edad INT NOT NULL,
capacitacion_idcapacitacion INT NOT NULL
);
ALTER TABLE asistentes ADD CONSTRAINT asistentes_pk PRIMARY KEY (idasistente );
CREATE TABLE capacitacion ( idcapacitacion INT NOT NULL,
rutcliente VARCHAR(15) NOT NULL,
dia VARCHAR(25),
hora VARCHAR(5),
lugar VARCHAR(50) NOT NULL,
duracion INT NOT NULL,cantidadasistentes INT
);
ALTER TABLE capacitacion ADD CONSTRAINT capacitacion_pk PRIMARY KEY (idcapacitacion );
ALTER TABLE asistentes
ADD CONSTRAINT
asistentes_capacitacion_fk FOREIGN KEY (
capacitacion_idcapacitacion )
REFERENCES capacitacion ( idcapacitacion );



insert into capacitacion (rutcliente, dia, hora, lugar, duracion, cantidadasistentes) values
(16543786-1, 'lunes', 1000, 'sala1', 45, 30),
(12676474-1, 'martes', 1100, 'sala2', 90, 50),
(18984938-1, 'miercoles', 1200, 'sala3', 45, 25),
(13894756-1, 'jueves', 1600, 'sala4', 90, 50),
(25783488-1, 'viernes', 1700, 'sala5', 45, 40);

insert into asistentes (idasistente, nombres, edad, capacitacion_idcapacitacion) values
(1, 'Mauricio Escarez', 24, 1 ),
(2, 'Felipe Lobos', 20, 2 ),
(3, 'Kendall Rozas', 18, 1 ),
(4, 'Ana Perez', 19, 3 ),
(5, 'Gabriela Millar', 23, 2 ),
(6, 'Gonzalo Sepulveda', 21, 3 ),
(7, 'Rodrigo Urrutia', 18,4 ),
(8, 'Rodrigo Jara', 19, 5 ),
(9, 'Nestor Cantillana', 22,4 ),
(10, 'Valeria Villarroel', 18, 5 );









