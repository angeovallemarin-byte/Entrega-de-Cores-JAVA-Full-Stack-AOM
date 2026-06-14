USE clientes_y_pedidos;

-- Inserta al menos cinco nuevos clientes en la tabla «clientes»
INSERT INTO clientes (nombre, direccion, telefono) VALUES
('María González', 'Condell 1145, Providencia', '+56 9 8765 4321'),
('Camila Fuentes', 'Álvarez 1230, Viña del Mar', '+56 9 7654 3210'),
('Luis Araneda', 'O''Higgins 540, Concepción', '+56 9 4567 8901'),
('Fernanda Carter', 'Picarte 1100, Valdivia', '+56 9 6543 2109'),
('Andrés Mora', 'Huérfanos 1160, Santiago Centro', '+56 9 1234 5678');

-- Inserta al menos diez nuevos pedidos en la tabla «pedidos». 
INSERT INTO pedidos (clientes_id, fecha, total) VALUES
(1, '2026-05-01', 25000),
(2, '2026-05-03', 45000),
(3, '2026-05-05', 18000),
(4, '2026-05-10', 120000),
(5, '2026-05-12', 32000),
(1, '2026-05-15', 65000),
(1, '2026-05-18', 15000),
(2, '2026-05-20', 95000),
(4, '2026-05-22', 27500),
(5, '2026-05-25', 50000);

-- Proyecta todos los clientes de la tabla «clientes» y sus respectivos pedidos.
SELECT clientes.id AS cliente_id, clientes.nombre, pedidos.id AS pedido_id, pedidos.fecha, pedidos.total
FROM clientes 
INNER JOIN pedidos ON clientes.id = pedidos.clientes_id;

-- Proyecta todos los pedidos realizados por un cliente específico, utilizando su ID.
SELECT pedidos.clientes_id AS cliente_id, pedidos.id AS pedido_id, pedidos.fecha, pedidos.total
FROM pedidos
WHERE pedidos.clientes_id = 1;

-- Calcula el total de todos los pedidos para cada cliente.
SELECT clientes.id AS cliente_id, clientes.nombre, SUM(pedidos.total) AS total_gastado
FROM clientes
INNER JOIN  pedidos ON clientes.id = pedidos.clientes_id
GROUP BY clientes.id, clientes.nombre;

-- Elimina un cliente específico de la tabla «clientes» y todos sus pedidos asociados de la tabla «pedidos».
DELETE FROM pedidos
WHERE clientes_id = 4;

DELETE FROM clientes
WHERE id = 4;

-- Proyecta los tres clientes que han realizado más pedidos, ordenados de forma descendente por el número de pedidos.
SELECT clientes.id AS cliente_id, clientes.nombre, COUNT(pedidos.id) AS cantidad_pedidos
FROM clientes
INNER JOIN pedidos ON clientes.id = pedidos.clientes_id
GROUP BY clientes.id, clientes.nombre
ORDER BY cantidad_pedidos DESC
LIMIT 3;

-- Entrega un archivo .sql que contenga todas las consultas que ejecutaste en el entorno de trabajo.





