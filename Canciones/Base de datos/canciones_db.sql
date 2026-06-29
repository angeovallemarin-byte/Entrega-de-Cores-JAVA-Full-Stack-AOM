USE canciones_db;

INSERT INTO canciones (titulo, artista, album, genero, idioma, fecha_creacion, fecha_actualizacion) 
VALUES 
('Mariposa Tecknicolor', 'Fito Páez', 'Circo Beat', 'Rock', 'Español', '2026-04-23', '2026-06-02'),
('Bohemian Rhapsody', 'Queen', 'A Night at the Opera', 'Rock', 'Inglés', '2026-06-19', '2026-06-19'),
('Rolling in the Deep', 'Adele', '21', 'Soul', 'Inglés', '2010-11-29', '2026-06-24'),
('La Camisa Negra', 'Juanes', 'Mi Sangre', 'Pop Latino', 'Español', '2004-10-12', '2026-06-24'),
('Shape of You', 'Ed Sheeran', '÷', 'Pop', 'Inglés', '2017-01-06', '2026-06-24'),
('Master of Puppets', 'Metallica', 'Master of Puppets', 'Metal', 'Inglés', '1986-03-03', '2026-06-24'),
('Oye Cómo Va', 'Santana', 'Abraxas', 'Latin Rock', 'Español', '1970-09-23', '2026-06-24')
('Antología', 'Shakira', 'Pies Descalzos', 'Pop', 'Español', '2026-05-10', '2026-06-22');

SELECT * FROM canciones;