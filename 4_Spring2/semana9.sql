CREATE TABLE categorias (
    categoria_id SERIAL PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    status integer NOT NULL
);

CREATE TABLE productos (
    producto_id SERIAL PRIMARY KEY,
    descripcion VARCHAR(255) NOT NULL,
    nombre VARCHAR(255) NOT NULL,
    precio DOUBLE PRECISION NOT NULL,
    status integer NOT NULL,
    categoria_id INT REFERENCES categorias(categoria_id)
);

CREATE TABLE usuarios (
    usuario_id SERIAL PRIMARY KEY,
    email VARCHAR(255) NOT NULL,
    nombre VARCHAR(255) NOT NULL,
    numero_contacto VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(255) NOT NULL,
    status integer NOT NULL
);