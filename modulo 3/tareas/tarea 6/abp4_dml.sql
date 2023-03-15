
/*	Alumno: Leonardo Rojas Escarez
	Fecha: 03/03/23
*/
use abp_4dml;

insert into ventas ( vendedor, cantarticulos , subtotal, impuesto, total, clientes_idcliente ) values
('Leonardo', 100, 500, 0.19, 59500, 1),
('Mauricio',  50, 500, 0.19, 25.297,2 ),
('Juan', 20, 500, 0.19, 11900,3),
('Francisca',  30, 500, 0.19, 17850,4),
('Kendall',  60, 500, 0.19, 35700,5),
('Felipe',  70, 500, 0.19, 41650,4),
('Lucas',  80, 500, 0.19, 47600,5),
('Fernanda ',  90, 500,0.19, 53550,6),
('Arens',  10, 500, 0.19, 5950, 7),
('Aranzka',  40, 500, 0.19, 223800, 8);

update ventas set impuesto = cantarticulos * subtotal * 0.19 , total = subtotal + impuesto;

insert into clientes ( nombres, apellidos , direccion, telefono ) values
('mauricio', 'escarez', 'quillota', 945367284),
('pedro', 'jara', 'viña_del_mar', 926486485),
('cristian', 'ramirez', 'valparaiso', 982368476),
('claudio', 'perez', 'quillota', 982736458),
('alejandro', 'bernal', 'quilpue', 973928374);

/*	1. Genere tres consultas de inserción de clientes; en las primeras dos deben ir incorporados
todos los datos, mientras que la restante debe estar considerado solo el identificador de
cliente, nombres y apellidos.
*/	

INSERT INTO clientes (idclientes, nombres, apellidos, direccion, telefono) 
VALUES (6, 'Juan', 'Pérez', 'Calle 123', 973928374);


INSERT INTO clientes (idclientes, nombres, apellidos, direccion, telefono) 
VALUES (7, 'María', 'González', 'Avenida 456', 973928374);

INSERT INTO clientes (idclientes, nombres, apellidos) 
VALUES (8, 'Pedro', 'Sánchez');



/*	2. Genere cinco consultas de inserción de registros en la tabla ventas. No se pide un formato
específico de consulta de inserción. Estas ventas deben estar asociadas lógicamente a
alguno de los clientes antes creados.
*/


INSERT INTO ventas (cliente_id, fecha_venta, producto, cantidad, precio_unitario) VALUES 
(1, '2023-03-01', 'Televisor LG 55 pulgadas', 1, 1500.00);

INSERT INTO ventas (cliente_id, fecha_venta, producto, cantidad, precio_unitario) VALUES 
(2, '2023-02-28', 'iPhone 13 Pro', 2, 1300.00);

INSERT INTO ventas (cliente_id, fecha_venta, producto, cantidad, precio_unitario) VALUES 
(3, '2023-02-27', 'Laptop Dell XPS 15', 1, 1800.00);

INSERT INTO ventas (cliente_id, fecha_venta, producto, cantidad, precio_unitario) VALUES
(4, '2023-02-26', 'Samsung Galaxy Watch 4', 1, 300.00);

INSERT INTO ventas (cliente_id, fecha_venta, producto, cantidad, precio_unitario) VALUES 
(5, '2023-02-25', 'Macbook Pro 16', 1, 2200.00);


/*	3. Genere una consulta que permita actualizar el campo total de la tabla ventas, igualándolo
a la suma del subtotal y el impuesto.
*/	

update ventas set impuesto = cantarticulos * subtotal * 0.19 , total = subtotal + impuesto;

/*	4. Finalmente, genere una consulta en la que se elimine un cliente a través de su identificador
(idcliente), y posterior a eso otra consulta que elimine todas las ventas asociadas a dicho
cliente (siempre de acuerdo con el campo idcliente).
*/	

DELETE FROM clientes WHERE idcliente = 6;

DELETE FROM ventas WHERE idcliente = 6;


