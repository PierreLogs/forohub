-- Primero agregamos las columnas permitiendo nulos temporalmente
ALTER TABLE usuarios ADD nombre VARCHAR(100);
ALTER TABLE usuarios ADD email VARCHAR(100);

UPDATE usuarios SET nombre = 'Administrador', email = 'admin@forohub.com' WHERE login = 'admin';

ALTER TABLE usuarios MODIFY nombre VARCHAR(100) NOT NULL;
ALTER TABLE usuarios MODIFY email VARCHAR(100) NOT NULL UNIQUE;