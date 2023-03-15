-- Autor: Javier Fuentes
-- Autor: Leonardo Rojas
-- Descripción: ABPRO2
-- Fecha: 2023-02-27

USE abpro;

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

/*
1. Una consulta que despliegue todas las capacitaciones realizadas un lunes, que hayan
durado menos de una hora y media.
*/
SELECT * FROM capacitacion WHERE dia = 'lunes' AND duracion < 90;

/*
2. Una consulta que despliegue el listado de asistentes, mostrando el apellido y el nombre,
y el RUT del cliente, lugar y duración de la capacitación a la que asistió.
*/
SELECT nombres, edad, rutcliente, lugar, duracion FROM asistentes
JOIN capacitacion ON capacitacion_idcapacitacion = idcapacitacion;

/*
3. Una consulta que despliegue el listado de capacitaciones mostrando RUT del cliente, día
y hora, tales que la cantidad de asistentes registrada en el campo cantasistentes no
coincida con la cantidad existente en la tabla Asistentes.
*/
SELECT rutcliente, dia, hora FROM capacitacion WHERE cantidadasistentes != 
(SELECT COUNT(*) FROM asistentes WHERE capacitacion_idcapacitacion = idcapacitacion);

/*
4. Una consulta que muestre el listado de capacitaciones que tengan más de tres
asistentes registrados en la tabla respectiva. De la tabla de capacitaciones debe mostrar
el lugar, la duración, el día y la hora.
*/
SELECT lugar, duracion, dia, hora
FROM capacitacion
JOIN asistentes ON capacitacion.idcapacitacion = asistentes.capacitacion_idcapacitacion
GROUP BY capacitacion.idcapacitacion
HAVING COUNT(asistentes.idasistente) > 3;




