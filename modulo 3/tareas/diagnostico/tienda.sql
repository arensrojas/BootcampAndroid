



CREATE DATABASE tienda CHARACTER SET utf8mb4;
USE tienda;
CREATE TABLE fabricante (
id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100) NOT NULL
);


CREATE TABLE producto (
id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100) NOT NULL,
precio DOUBLE NOT NULL,
id_fabricante INT UNSIGNED NOT NULL,
FOREIGN KEY (id_fabricante) REFERENCES fabricante(id)
);

  
  

INSERT INTO fabricante VALUES(1, 'Asus');
INSERT INTO fabricante VALUES(2, 'Lenovo');
INSERT INTO fabricante VALUES(3, 'Hewlett-Packard');
INSERT INTO fabricante VALUES(4, 'Samsung');
INSERT INTO fabricante VALUES(5, 'Seagate');
INSERT INTO fabricante VALUES(6, 'Crucial');
INSERT INTO fabricante VALUES(7, 'Gigabyte');
INSERT INTO fabricante VALUES(8, 'Huawei');
INSERT INTO fabricante VALUES(9, 'Xiaomi');
INSERT INTO producto VALUES(1, 'Disco duro SATA3 1TB', 86.99, 5);
INSERT INTO producto VALUES(2, 'Memoria RAM DDR4 8GB', 120, 6);
INSERT INTO producto VALUES(3, 'Disco SSD 1 TB', 150.99, 4);
INSERT INTO producto VALUES(4, 'GeForce GTX 1050Ti', 185, 7);
INSERT INTO producto VALUES(5, 'GeForce GTX 1080 Xtreme', 755, 6);
INSERT INTO producto VALUES(6, 'Monitor 24 LED Full HD', 202, 1);
INSERT INTO producto VALUES(7, 'Monitor 27 LED Full HD', 245.99, 1);
INSERT INTO producto VALUES(8, 'Portátil Yoga 520', 559, 2);
INSERT INTO producto VALUES(9, 'Portátil Ideapd 320', 444, 2);
INSERT INTO producto VALUES(10, 'Impresora HP Deskjet 3720', 59.99, 3);
INSERT INTO producto VALUES(11, 'Impresora HP Laserjet Pro M26nw', 180, 3);

-- 1. Lista el nombre de todos los productos que hay en la tabla producto.

SELECT nombre FROM producto;


-- 	2. Lista los nombres y los precios de todos los productos de la tabla producto.

SELECT nombre, precio FROM producto;



--	3. Lista todas las columnas de la tabla producto.

SELECT * FROM tienda.producto;



-- 4	Lista el nombre de los productos, el precio en euros y el precio en dólares estadounidenses (USD).

/*
Se modifica la tabla producto
*/
SELECT nombre AS 'nombre de producto', precio AS 'euros', precio * 1.21 AS 'dólares' FROM producto;



/*	5. Lista el nombre de los productos, el precio en euros y el precio en dólares estadounidenses (USD).
	Utiliza los siguientes alias para las columnas: nombre de producto, euros, dólares.
*/
SELECT nombre AS 'nombre de producto', precio AS 'euros', precio * 1.21 AS 'dólares' FROM producto;



/*	6. Lista los nombres y los precios de todos los productos de la tabla producto, convirtiendo los
	nombres a mayúscula.
*/

SELECT UPPER(nombre) AS nombre_en_mayusculas, precio FROM producto;



/*7. Lista los nombres y los precios de todos los productos de la tabla producto, convirtiendo los
	 nombres a minúscula.
*/

SELECT lower(nombre) AS nombre_en_minusculas, precio FROM producto;



/*	8. Lista el nombre de todos los fabricantes en una columna, y en otra columna obtenga en
	mayúsculas los dos primeros caracteres del nombre del fabricante.
*/
SELECT nombre, UCASE(LEFT(nombre, 2)) AS dos_letras_mayusculas FROM fabricante;



/*	9. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando el valor
	del precio.
*/

SELECT nombre, ROUND(precio) AS precio_redondeado FROM producto;


/*	10. Lista los nombres y los precios de todos los productos de la tabla producto, truncando el valor del
	precio para mostrarlo sin ninguna cifra decimal.
*/

SELECT nombre, TRUNCATE(precio, 0) AS 'precio' FROM producto;


/*	11. Lista el identificador de los fabricantes que tienen productos en la tabla producto.
*/	
select id_fabricante from producto;



/*	12. Lista el identificador de los fabricantes que tienen productos en la tabla producto, eliminando los
	identificadores que aparecen repetidos.
*/

SELECT DISTINCT id_fabricante FROM producto;


/*	13. Lista los nombres de los fabricantes ordenados de forma ascendente
*/
SELECT nombre FROM fabricante ORDER BY nombre ASC;

/*	14. Lista los nombres de los fabricantes ordenados de forma descendente.
*/
SELECT nombre FROM fabricante ORDER BY nombre DESC;


/*	15. Lista los nombres de los productos ordenados en primer lugar por el nombre de forma ascendente
	y en segundo lugar por el precio de forma descendente.
*/
SELECT nombre, precio FROM producto ORDER BY nombre ASC, precio DESC;

/*	16. Devuelve una lista con las 5 primeras filas de la tabla fabricante
*/
SELECT * FROM fabricante LIMIT 5;

/*	17. Devuelve una lista con 2 filas a partir de la cuarta fila de la tabla fabricante. La cuarta fila también
	se debe incluir en la respuesta.
*/
SELECT * FROM fabricante LIMIT 3, 2;

/*	18. Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas ORDER
	BY y LIMIT)
*/
SELECT nombre, precio FROM producto ORDER BY precio LIMIT 1;


/*	19. Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER
	BY y LIMIT)¨
*/	
SELECT nombre, precio FROM producto ORDER BY precio DESC LIMIT 1;


/*	20. Lista el nombre de todos los productos del fabricante cuyo identificador de fabricante es igual
	a 2.
*/
SELECT nombre FROM producto WHERE id_fabricante = 2;


/*	21. Lista el nombre de los productos que tienen un precio menor o igual a 120.
*/

SELECT nombre FROM producto WHERE precio <= 120;


/*	22. Lista el nombre de los productos que tienen un precio mayor o igual a 400.
*/
SELECT nombre FROM producto WHERE precio >= 400;

/*	23. Lista el nombre de los productos que no tienen un precio mayor o igual a 400
*/
SELECT nombre FROM producto WHERE NOT precio >= 400;

/*24. Lista todos los productos que tengan un precio entre 80 y 300. Sin utilizar el
	operador BETWEEN.
*/
SELECT nombre FROM producto WHERE precio > 80 AND precio < 300;

/*	25. Lista todos los productos que tengan un precio entre 60 y 200. Utilizando el operador BETWEEN.
*/
SELECT nombre FROM producto WHERE precio BETWEEN 60 AND 200;

/*	26. Lista todos los productos que tengan un precio mayor que 200 y que el identificador de
	fabricante sea igual a 6.
*/
SELECT nombre FROM producto WHERE precio > 200 AND id_fabricante = 6;


/*
27. Lista todos los productos donde el identificador de fabricante sea 1, 3 o 5. Sin utilizar el
operador IN.
*/
SELECT nombre FROM producto WHERE id_fabricante = 1 OR id_fabricante = 3 OR id_fabricante = 5;

/*
28. Lista todos los productos donde el identificador de fabricante sea 1, 3 o 5. Utilizando el
operador IN.
*/
SELECT nombre FROM producto WHERE id_fabricante IN (1, 3, 5);

/*
29. Lista el nombre y el precio de los productos en céntimos (Habrá que multiplicar por 100 el valor del
precio). Cree un alias para la columna que contiene el precio que se llame céntimos.
*/
SELECT nombre, precio * 100 AS centimos FROM producto;

/*
30. Lista los nombres de los fabricantes cuyo nombre empiece por la letra S.
*/
SELECT nombre FROM fabricante WHERE nombre LIKE 'S%';

/*
31. Lista los nombres de los fabricantes cuyo nombre termine por la vocal e.
*/
SELECT nombre FROM fabricante WHERE nombre LIKE '%e';

/*
32. Lista los nombres de los fabricantes cuyo nombre contenga el carácter w.
*/
SELECT nombre FROM fabricante WHERE nombre LIKE '%w%';

/*
33. Lista los nombres de los fabricantes cuyo nombre sea de 4 caracteres.
*/
SELECT nombre FROM fabricante WHERE LENGTH(nombre) = 4;

/*
34. Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil en el
nombre.
*/
SELECT nombre FROM producto WHERE nombre LIKE '%Portátil%';

/*
35. Devuelve una lista con el nombre de todos los productos que contienen la cadena Monitor en el
nombre y tienen un precio inferior a 215 .
*/
SELECT nombre FROM producto WHERE nombre LIKE '%Monitor%' AND precio < 215;

/*
36. Lista el nombre y el precio de todos los productos que tengan un precio mayor o igual a 180.
Ordene el resultado en primer lugar por el precio (en orden descendente) y en segundo lugar por
el nombre (en orden ascendente).
*/
SELECT nombre, precio FROM producto WHERE precio >= 180 ORDER BY precio DESC, nombre ASC;

/*
Consultas multitabla (Composición interna)
1. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos los
productos de la base de datos.
*/
SELECT producto.nombre, producto.precio, fabricante.nombre
FROM producto
INNER JOIN fabricante ON producto.id_fabricante = fabricante.id;

/*
2. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos los
productos de la base de datos. Ordene el resultado por el nombre del fabricante, por orden
alfabético.
*/
SELECT producto.nombre, producto.precio, fabricante.nombre
FROM producto
INNER JOIN fabricante ON producto.id_fabricante = fabricante.id
ORDER BY fabricante.nombre ASC;

/*
3. Devuelve una lista con el identificador del producto, nombre del producto, identificador del
fabricante y nombre del fabricante, de todos los productos de la base de datos.
*/
SELECT producto.id, producto.nombre, fabricante.id, fabricante.nombre
FROM producto
INNER JOIN fabricante ON producto.id_fabricante = fabricante.id;

/*
4. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto más
barato.
*/
SELECT producto.nombre, producto.precio, fabricante.nombre
FROM producto
INNER JOIN fabricante ON producto.id_fabricante = fabricante.id
WHERE producto.precio = (SELECT MIN(precio) FROM producto);

/*
5. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto más caro.
*/
SELECT producto.nombre, producto.precio, fabricante.nombre
FROM producto
INNER JOIN fabricante ON producto.id_fabricante = fabricante.id
WHERE producto.precio = (SELECT MAX(precio) FROM producto);

/*
6. Devuelve una lista de todos los productos del fabricante Lenovo.
*/
SELECT producto.nombre, producto.precio, fabricante.nombre
FROM producto
INNER JOIN fabricante ON producto.id_fabricante = fabricante.id
WHERE fabricante.nombre = 'Lenovo';

/*
7. Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio mayor que
200.
*/
SELECT producto.nombre, producto.precio, fabricante.nombre
FROM producto
INNER JOIN fabricante ON producto.id_fabricante = fabricante.id
WHERE fabricante.nombre = 'Crucial' AND producto.precio > 200;

/*
8. Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packardy Seagate.
Sin utilizar el operador IN.
*/
SELECT producto.nombre, producto.precio, fabricante.nombre
FROM producto
INNER JOIN fabricante ON producto.id_fabricante = fabricante.id
WHERE (fabricante.nombre = 'Asus' OR fabricante.nombre = 'Hewlett-Packard' OR fabricante.nombre = 'Seagate');

/*
9. Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packardy Seagate.
Utilizando el operador IN.
*/
SELECT producto.nombre, producto.precio, fabricante.nombre
FROM producto
INNER JOIN fabricante ON producto.id_fabricante = fabricante.id
WHERE fabricante.nombre IN ('Asus', 'Hewlett-Packard', 'Seagate');

/*
10. Devuelve un listado con el nombre y el precio de todos los productos de los fabricantes cuyo
nombre termine por la vocal e.
*/
SELECT producto.nombre, producto.precio, fabricante.nombre
FROM producto
INNER JOIN fabricante ON producto.id_fabricante = fabricante.id
WHERE fabricante.nombre LIKE '%e';

/*
11. Devuelve un listado con el nombre y el precio de todos los productos cuyo nombre de fabricante
contenga el carácter w en su nombre.
*/
SELECT producto.nombre, producto.precio, fabricante.nombre
FROM producto
INNER JOIN fabricante ON producto.id_fabricante = fabricante.id
WHERE fabricante.nombre LIKE '%w%';

/*
12. Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de todos los
productos que tengan un precio mayor o igual a 180. Ordene el resultado en primer lugar por el
precio (en orden descendente) y en segundo lugar por el nombre (en orden ascendente)
*/
SELECT producto.nombre, producto.precio, fabricante.nombre
FROM producto
INNER JOIN fabricante ON producto.id_fabricante = fabricante.id
WHERE producto.precio >= 180
ORDER BY producto.precio DESC, producto.nombre ASC;

/*
13. Devuelve un listado con el identificador y el nombre de fabricante, solamente de aquellos
fabricantes que tienen productos asociados en la base de datos.
*/
SELECT fabricante.id, fabricante.nombre
FROM fabricante
INNER JOIN producto ON producto.id_fabricante = fabricante.id
GROUP BY fabricante.id, fabricante.nombre;

/*
Consultas multitabla (Composición externa)
Resuelva todas las consultas utilizando las cláusulas LEFT JOIN y RIGHT JOIN.

1. Devuelve un listado de todos los fabricantes que existen en la base de datos, junto con los
productos que tiene cada uno de ellos. El listado deberá mostrar también aquellos fabricantes que
no tienen productos asociados.
*/
SELECT f.nombre AS fabricante, p.nombre AS producto, p.precio
FROM fabricante f
LEFT JOIN producto p ON f.id = p.id_fabricante
ORDER BY f.nombre;

/*
2. Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún producto
asociado.
*/
SELECT f.nombre AS fabricante, p.nombre AS producto, p.precio
FROM fabricante f
LEFT JOIN producto p ON f.id = p.id_fabricante
WHERE p.id IS NULL;


/*
3. ¿Pueden existir productos que no estén relacionados con un fabricante? Justifique su respuesta.

Respuesta:
No pueden existir productos que no estén relacionados con un fabricante ya que la tabla de productos tiene una columna llamada 
"id_fabricante" que es una clave foránea que hace referencia a la tabla de fabricantes. 
Esto significa que cada producto debe estar relacionado con un fabricante existente.
*/

/*
Consultas resumen

1. Calcula el número total de productos que hay en la tabla productos.
*/

SELECT count(id) FROM Producto;


/*
2. Calcula el número total de fabricantes que hay en la tabla fabricante.
*/
SELECT count(id) FROM fabricante;

/*
3. Calcula el número de valores distintos de identificador de fabricante aparecen en la
tabla productos.
*/


/*
4. Calcula la media del precio de todos los productos.
*/
SELECT AVG(precio) as media_precio FROM producto;


/*
5. Calcula el precio más barato de todos los productos.
*/
SELECT min(precio) as precio_bajo FROM producto;


/*
6. Calcula el precio más caro de todos los productos.
*/
SELECT max(precio) as precio_alto FROM producto;

/*
7. Lista el nombre y el precio del producto más barato.
*/

SELECT nombre, precio  FROM producto  ORDER BY precio ASC LIMIT 1;


/*
8. Lista el nombre y el precio del producto más caro.
*/
SELECT nombre, precio  FROM producto  ORDER BY precio desc LIMIT 1;

/*
9. Calcula la suma de los precios de todos los productos.
*/
SELECT SUM(Precio) FROM Producto;


/*
10. Calcula el número de productos que tiene el fabricante Asus.
*/
SELECT count(id_fabricante)  FROM producto  WHERe id_fabricante = 'Asus';

/*
11. Calcula la media del precio de todos los productos del fabricante Asus.
*/
SELECT AVG(precio) as promedio FROM producto where id_fabricante = 1;

/*
12. Calcula el precio más barato de todos los productos del fabricante Asus.
*/
SELECT min(precio) as precio_mas_bajo FROM producto where id_fabricante = 1;

/*
13. Calcula el precio más caro de todos los productos del fabricante Asus.
*/
SELECT max(precio) as precio_mas_alto FROM producto where id_fabricante = 1;

/*
14. Calcula la suma de todos los productos del fabricante Asus.
*/
SELECT SUM(Precio) FROM Producto where id_fabricante = 1;

/*
15. Muestra el precio máximo, precio mínimo, precio medio y el número total de productos que tiene
el fabricante Crucial.
*/
SELECT max(precio), min(precio), avg(precio), count(id_fabricante) 
as total_productos FROM producto where id_fabricante = 6;

/*
16. Muestra el número total de productos que tiene cada uno de los fabricantes. El listado también
debe incluir los fabricantes que no tienen ningún producto. El resultado mostrará dos columnas,
una con el nombre del fabricante y otra con el número de productos que tiene. Ordene el
resultado descendentemente por el número de productos.
*/


/*
17. Muestra el precio máximo, precio mínimo y precio medio de los productos de cada uno de los
fabricantes. El resultado mostrará el nombre del fabricante junto con los datos que se solicitan.
*/

SELECT f.nombre AS fabricante, MAX(p.precio) AS precio_maximo, 
MIN(p.precio) AS precio_minimo, AVG(p.precio) AS promedio
FROM producto p
JOIN fabricante f ON p.id_fabricante = id_fabricante
GROUP BY f.nombre;


/*
18. Muestra el precio máximo, precio mínimo, precio medio y el número total de productos de los
fabricantes que tienen un precio medio superior a 200. No es necesario mostrar el nombre del
fabricante, con el identificador del fabricante es suficiente.
*/

SELECT id_fabricante, MAX(precio) as precio_maximo, MIN(precio) as precio_minimo, 
AVG(precio) as promedio, COUNT(*) as numero_productos
FROM producto
GROUP BY id_fabricante
HAVING promedio > 200

/*
19. Muestra el nombre de cada fabricante, junto con el precio máximo, precio mínimo, precio medio y
el número total de productos de los fabricantes que tienen un precio medio superior a 200. Es
necesario mostrar el nombre del fabricante.
*/

/*
20. Calcula el número de productos que tienen un precio mayor o igual a 180.
*/

/*
21. Calcula el número de productos que tiene cada fabricante con un precio mayor o igual a 180.
*/

/*
22. Lista el precio medio los productos de cada fabricante, mostrando solamente el identificador del
fabricante.
*/

/*
23. Lista el precio medio los productos de cada fabricante, mostrando solamente el nombre del
fabricante.
*/

/*
24. Lista los nombres de los fabricantes cuyos productos tienen un precio medio mayor o igual a 150.
*/

/*
25. Devuelve un listado con los nombres de los fabricantes que tienen 2 o más productos.
*/

/*
26. Devuelve un listado con los nombres de los fabricantes y el número de productos que tiene cada
uno con un precio superior o igual a 220 . No es necesario mostrar el nombre de los fabricantes
que no tienen productos que cumplan la condición.
*/













