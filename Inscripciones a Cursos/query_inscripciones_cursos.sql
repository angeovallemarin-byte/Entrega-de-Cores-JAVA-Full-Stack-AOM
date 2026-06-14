USE inscripciones_cursos;

-- Inserta al menos cinco nuevos estudiantes en la tabla «estudiantes».
INSERT INTO estudiantes (nombre, edad) VALUES
('Sara Molina', 25),
('Roberto Rivera', 20),
('María Saldías', 19),
('Bárbara Troncoso', 23),
('Rocío Benítez', 30);

-- Inserta al menos cuatro nuevos cursos en la tabla «cursos». 
INSERT INTO cursos (nombre, duracion) VALUES
('Lógica matemática', '5 meses'),
('Programación Web', '3 meses'),
('Historia de Chile', '2 meses'),
('Comic', '1 mes');

-- Asociar a cuatro de los estudiantes a al menos dos de los cursos dados de alta.
INSERT INTO inscripciones (estudiantes_id, cursos_id) VALUES
(1, 1), (1, 3), -- Sara en Lógica e Historia
(2, 2), (2, 3), -- Roberto en Programación y Historia
(3, 1), (3, 4), -- María en Lógica y Comic
(4, 2), (4, 4); -- Bárbara en Programación y Comic

-- Proyecta a todos los estudiantes y sus respectivos cursos.
SELECT estudiantes.id AS estudiante_id, estudiantes.nombre AS estudiante, GROUP_CONCAT(cursos.nombre SEPARATOR ' , ') AS cursos
FROM estudiantes
LEFT JOIN inscripciones ON estudiantes.id = inscripciones.estudiantes_id
LEFT JOIN cursos ON inscripciones.cursos_id = cursos.id
GROUP BY estudiantes.id, estudiantes.nombre;

/*Código con ambos IDs
SELECT estudiantes.id AS estudiante_id, estudiantes.nombre AS estudiante, GROUP_CONCAT(cursos.id SEPARATOR ' , ') AS cursos_id, GROUP_CONCAT(cursos.nombre SEPARATOR ' , ') AS cursos
FROM estudiantes
LEFT JOIN inscripciones ON estudiantes.id = inscripciones.estudiantes_id
LEFT JOIN cursos ON inscripciones.cursos_id = cursos.id
GROUP BY estudiantes.id, estudiantes.nombre;*/

/*código que muestra a todos los estudiantes, pero sin concatenar todos los cursos
SELECT estudiantes.id AS estudiante_id, estudiantes.nombre AS estudiante, cursos.nombre AS curso
FROM estudiantes
LEFT JOIN inscripciones ON estudiantes.id = inscripciones.estudiantes_id
LEFT JOIN cursos ON inscripciones.cursos_id = cursos.id; */

-- Proyecta todos los estudiantes que están inscritos en un curso específico, utilizando el nombre del curso como criterio de búsqueda.
SELECT estudiantes.id AS estudiante_id, estudiantes.nombre AS estudiantes, estudiantes.edad
FROM estudiantes
INNER JOIN inscripciones ON estudiantes.id = inscripciones.estudiantes_id
INNER JOIN cursos ON inscripciones.cursos_id = cursos.id
WHERE cursos.nombre = 'Programación Web';

-- Proyecta todos los cursos en los que está inscrito un estudiante específico, utilizando su nombre como criterio de búsqueda.
SELECT cursos.id AS curso_id, cursos.nombre AS curso, cursos.duracion
FROM cursos
INNER JOIN inscripciones ON cursos.id = inscripciones.cursos_id
INNER JOIN estudiantes ON inscripciones.estudiantes_id = estudiantes.id
WHERE estudiantes.nombre = 'María Saldías';

-- Cuenta el número de estudiantes inscritos en cada curso y muestra el nombre del curso junto con el número de estudiantes inscritos.
SELECT cursos.id AS curso_id, cursos.nombre AS curso, COUNT(inscripciones.estudiantes_id) AS numero_inscritos
FROM cursos
LEFT JOIN inscripciones ON cursos.id = inscripciones.cursos_id
GROUP BY cursos.id, cursos.nombre;

-- Encuentra los estudiantes que no están inscritos en ningún curso.
SELECT estudiantes.id AS estudiante_id, estudiantes.nombre AS estudiante, estudiantes.edad
FROM estudiantes
LEFT JOIN inscripciones ON estudiantes.id = inscripciones.estudiantes_id
WHERE inscripciones.estudiantes_id IS NULL;