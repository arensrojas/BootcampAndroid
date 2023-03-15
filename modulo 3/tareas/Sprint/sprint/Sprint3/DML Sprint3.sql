USE Sprint3;

INSERT INTO usuario (nombres, apellidos, fecha_nacimiento, rut_usuario)
VALUES
('Juan', 'Perez', '1990-01-01', 12345678),
('Maria', 'Gonzalez', '1985-02-15', 87654321),
('Pedro', 'Rodriguez', '1995-05-20', 56789012);

INSERT INTO cliente (rut_cliente, nombres, apellidos, telefono, afp, sistema_salud, direccion, comuna, edad, usuario_id)
VALUES
(11111111, 'Leonardo', 'Perez', '12345678', 'AFP Modelo', 1, 'Calle 1 #123', 'Providencia', 31, 1),
(22222222, 'Rodolfo', 'Gonzalez', '87654321', 'AFP Provida', 2, 'Calle 2 #456', 'Las Condes', 36, 2),
(33333333, 'Manuel', 'Rodriguez', '56789012', 'AFP Cuprum', 3, 'Calle 3 #789', 'Ñuñoa', 26, 3),
(44444444, 'Pedro', 'Engel', '56789012', 'AFP Cuprum', 3, 'Calle 3 #789', 'Valparaíso', 26, 3);

INSERT INTO accidente (dia_accidente, hora_accidente, lugar_accidente, origen, consecuencias, Cliente_rutcliente)
VALUES
('2022-02-20', '15:30:00', 'Av. Providencia', 'Falla mecánica', 'Daños menores en el vehículo', 11111111),
('2022-03-10', '08:45:00', 'Av. Apoquindo', 'Error del conductor', 'Sin consecuencias', 22222222),
('2022-01-05', '13:20:00', 'Calle 3 #789', 'Falta de señalización', 'Lesiones leves en el conductor', 33333333);

INSERT INTO capacitacion (fecha_capacitacion, hora_capacitacion, lugar_capacitacion, duracion_capacitacion, cantidad_asistentes, Capacitacion_Cliente_rutcliente)
VALUES
('2022-04-15', '09:00:00', 'Auditorio Corporativo', 3, 50, 11111111),
('2022-05-20', '14:00:00', 'Sala de reuniones', 2, 30, 22222222),
('2022-03-05', '10:30:00', 'Sala de capacitación', 4, 70, 33333333);

INSERT INTO asistente (nombre_asistente, edad_assitente, Capacitacion_idcapacitacion, correo_electronico)
VALUES
('Juan Perez', 31, 1, 'example_email1@example.com'),
('Maria Gonzalez', 36, 2, 'user_email_1234@gmail.com'),
('Pedro Rodriguez', 26, 3, 'john_doe@hotmail.com');

INSERT INTO visita (fecha_visita, hora_visita, lugar_visita, comentarios_visita, Visita_Cliente_rutcliente)
VALUES
('2022-06-10', '10:00:00', 'Calle 1 #123', 'Se observan condiciones de seguridad deficientes', 11111111),
('2022-07-20', '15:00:00', 'Calle 2 #456', 'Se recomienda actualizar señalización de emergencia', 22222222),
('2022-08-05', '11:00:00', 'Calle 3 #789', 'Se destaca el uso adecuado de EPPs', 33333333),
('2022-08-05', '11:00:00', 'Calle 3 #789', 'Se destaca el uso adecuado de EPPs', 44444444);

-- Ingresando registros en la tabla chequeo
INSERT INTO chequeo(nombre_chequeo) VALUES ('Chequeo 1');
INSERT INTO chequeo(nombre_chequeo) VALUES ('Chequeo 2');
INSERT INTO chequeo(nombre_chequeo) VALUES ('Chequeo 3');

-- Ingresando registros en la tabla visita_chequeo
INSERT INTO visita_chequeo(estado_cumplimiento, Visita_idvisita, Chequeo_idchequeo) VALUES ('Cumple', 1, 1);
INSERT INTO visita_chequeo(estado_cumplimiento, Visita_idvisita, Chequeo_idchequeo) VALUES ('Cumple con observaciones', 2, 2);
INSERT INTO visita_chequeo(estado_cumplimiento, Visita_idvisita, Chequeo_idchequeo) VALUES ('No Cumple', 3, 3);
INSERT INTO visita_chequeo(estado_cumplimiento, Visita_idvisita, Chequeo_idchequeo) VALUES ('No Cumple', 4, 1);


-- Ingresando registros en la tabla administrativo
INSERT INTO administrativo(rut_administrativo, nombres, apellidos, correo_electronico, area_pertenencia, usuario_id) VALUES (11111111, 'Admin1', 'Apellido1', 'admin1@ejemplo.com', 'Area1', 1);
INSERT INTO administrativo(rut_administrativo, nombres, apellidos, correo_electronico, area_pertenencia, usuario_id) VALUES (22222222, 'Admin2', 'Apellido2', 'admin2@ejemplo.com', 'Area2', 2);
INSERT INTO administrativo(rut_administrativo, nombres, apellidos, correo_electronico, area_pertenencia, usuario_id) VALUES (33333333, 'Admin3', 'Apellido3', 'admin3@ejemplo.com', 'Area3', 3);

-- Ingresando registros en la tabla profesional
INSERT INTO profesional(rut_profesional, nombres, apellidos, telefono, titulo_profesional, usuario_id) VALUES (44444444, 'Prof1', 'Apellido1', '555-1234', 'Titulo1', 1);
INSERT INTO profesional(rut_profesional, nombres, apellidos, telefono, titulo_profesional, usuario_id) VALUES (55555555, 'Prof2', 'Apellido2', '555-5678', 'Titulo2', 2);
INSERT INTO profesional(rut_profesional, nombres, apellidos, telefono, titulo_profesional, usuario_id) VALUES (66666666, 'Prof3', 'Apellido3', '555-9101', 'Titulo3', 3);

-- Ingresando registros en la tabla pago
INSERT INTO pago(rut_cliente, fecha_pago, monto, mes, anio) VALUES (11111111, '2022-01-01', 10000.00, 1, 2022);
INSERT INTO pago(rut_cliente, fecha_pago, monto, mes, anio) VALUES (22222222, '2022-02-01', 20000.00, 2, 2022);
INSERT INTO pago(rut_cliente, fecha_pago, monto, mes, anio) VALUES (33333333, '2022-03-01', 30000.00, 3, 2022);

-- Ingresando registros en la tabla asesoria
INSERT INTO asesoria (fecha_asesoria, motivo, rut_profesional) VALUES 
('2022-01-05', 'Consulta sobre tratamiento de enfermedad', 44444444),
('2022-02-15', 'Asesoría sobre nutrición infantil', 55555555),
('2022-03-20', 'Revisión de exámenes médicos', 66666666);


/*
a) Realice una consulta que permita listar todas las capacitaciones de un cliente en
particular, indicando el nombre completo, la edad y el correo electrónico de los
asistentes.
*/
SELECT c.nombres, c.apellidos, a.edad_assitente, a.nombre_asistente, a.correo_electronico, ca.fecha_capacitacion, ca.lugar_capacitacion
FROM cliente c
JOIN capacitacion ca ON c.rut_cliente = ca.Capacitacion_Cliente_rutcliente
JOIN asistente a ON ca.id_capacitacion = a.Capacitacion_idcapacitacion
WHERE c.rut_cliente = 11111111;


/*
b) Realice una consulta que permita desplegar todas las visitas en terreno realizadas a los
clientes que sean de la comuna de Valparaíso. Por cada visita debe indicar todos los
chequeos que se hicieron en ella, junto con el estado de cumplimiento de cada uno.
*/
SELECT v.id_visita, v.fecha_visita, v.hora_visita, v.lugar_visita, v.comentarios_visita, c.nombres, c.apellidos, ch.nombre_chequeo, vc.estado_cumplimiento
FROM visita v
JOIN cliente c ON v.Visita_Cliente_rutcliente = c.rut_cliente
JOIN visita_chequeo vc ON v.id_visita = vc.Visita_idvisita
JOIN chequeo ch ON vc.Chequeo_idchequeo = ch.id_chequeo
WHERE c.comuna = 'Valparaíso';

/*
c) Realice una consulta que despliegue los accidentes registrados para todos los clientes,
indicando los datos de detalle del accidente, y el nombre, apellido, RUT y teléfono del
cliente al que se asocia dicha situación.
*/
SELECT a.*, c.nombres, c.apellidos, c.rut_cliente, c.telefono
FROM accidente a
JOIN cliente c ON a.Cliente_rutcliente = c.rut_cliente;

