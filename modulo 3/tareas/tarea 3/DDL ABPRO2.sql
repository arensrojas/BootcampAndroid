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