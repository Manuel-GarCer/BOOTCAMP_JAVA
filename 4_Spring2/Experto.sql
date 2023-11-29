CREATE TABLE Persona (
    persona_id SERIAL PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL
);

CREATE TABLE Direccion (
    direccion_id SERIAL PRIMARY KEY,
    calle VARCHAR(255) NOT NULL,
    persona_id INT REFERENCES Persona(persona_id)
);

CREATE TABLE Libro (
    libro_id SERIAL PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL
);

CREATE TABLE Autor (
    autor_id SERIAL PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL
);

CREATE TABLE LibroAutor (
    libro_id INT REFERENCES Libro(libro_id),
    autor_id INT REFERENCES Autor(autor_id),
    PRIMARY KEY (libro_id, autor_id)
);