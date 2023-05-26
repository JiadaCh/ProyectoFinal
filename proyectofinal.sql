
-- Creacion de cuenta
-- CREATE USER 'jiada'@'%' IDENTIFIED VIA mysql_native_password USING '***';GRANT ALL PRIVILEGES ON *.* TO 'prueba'@'%' REQUIRE NONE WITH GRANT OPTION MAX_QUERIES_PER_HOUR 0 MAX_CONNECTIONS_PER_HOUR MAX_UPDATES_PER_HOUR 0 MAX_USER_CONNECTIONS 0;

-- GRANT ALL PRIVILEGES ON `proyectofinal`.* TO 'jiada'@'%' WITH GRANT OPTION;


CREATE OR REPLACE DATABASE proyectofinal 	CHARACTER SET utf8 COLLATE UTF8_SPANISH2_CI;
USE proyectofinal;


CREATE OR REPLACE TABLE usuario (
  nombre varchar(28),
  contrasena varchar(28) NOT NULL,
  email	VARCHAR(28) UNIQUE,
  CONSTRAINT PRIMARY KEY (nombre)
);

CREATE OR REPLACE TABLE clientes (
  id 			VARCHAR(8),
  nombre 	VARCHAR(20) NOT NULL,
  apellidos varchar(28) NOT NULL,
  direccion varchar(28) NOT NULL,
  email		VARCHAR(28) UNIQUE,
  fechaNac	DATE NOT NULL,
  CONSTRAINT PRIMARY KEY (id)
);

CREATE OR REPLACE TABLE articulos (
  id 		VARCHAR(8),
  nombre VARCHAR(28) 	NOT NULL,
  precio	NUMERIC(5,2) 	NOT NULL,
  stock  INTEGER 			NOT NULL,
  CONSTRAINT PRIMARY KEY (id)
);

CREATE OR REPLACE TABLE pedidos (
  id VARCHAR(8) PRIMARY KEY,
  estado VARCHAR(20) NOT NULL,
  fecha	DATE NOT NULL,
  id_cliente char(8) NOT NULL,
  id_articulo char(8) NOT NULL,
  CONSTRAINT FOREIGN KEY (id_cliente) REFERENCES clientes(id),
  CONSTRAINT FOREIGN KEY (id_articulo) REFERENCES articulos(id)
);

