/*	Alumno: Leonardo Rojas Escarez*/


use apro_1;
insert into ventas (Comprador, Vendedor, Cantarticulos , Subtotal ) values
("Leonardo", "Ignacio", 100, 500),
("Mauricio", "Leonardo", 50, 500),
("Juan", "Maria", 20, 500),
("Francisca", "Kendall", 30, 500),
("Kendall", "Francisca", 60, 500),
("Felipe", "Eduardo", 70, 500),
("Lucas", "Arens", 80, 500),
("Sonia Garrido", "Aranzka", 90, 500),
("Arens", "Humberto", 10, 500),
("Aranzka", "Felipe", 40, 500);


update ventas set Impuesto = Cantarticulos * Subtotal * 0.19 , Total = Subtotal + Impuesto;

SELECT * FROM ventas WHERE Cantarticulos > 2;

SELECT idVentas, Comprador, Cantarticulos FROM ventas WHERE Subtotal < 1000;

SELECT * FROM ventas WHERE Vendedor = 'SONIA GARRIDO' AND Total >= 5000 ORDER BY idVentas DESC;

SELECT Vendedor, Comprador, Total FROM ventas WHERE Comprador = 'LUCAS' OR vendedor = 'MARIA';

SELECT * FROM ventas WHERE idVentas IN (2, 5, 6, 9);







