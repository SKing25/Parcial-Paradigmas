-- Crear la base de datos
CREATE DATABASE PrestamoLaboratorio;

-- Usar la base de datos recién creada
USE PrestamoLaboratorio;

-- Crear tabla Inventario
CREATE TABLE Inventario (
    Iv_codigo VARCHAR(50) PRIMARY KEY,
    Iv_nombre VARCHAR(50),
    Iv_stk INTEGER,
    Iv_Estado VARCHAR(10)
);

-- Crear tabla Estudiante
CREATE TABLE Estudiante (
    Es_identificacion INT PRIMARY KEY,
    Es_nombre_completo VARCHAR(80),
    Es_carrera VARCHAR(50),
    Es_Email VARCHAR(100)
);

-- Crear tabla Préstamo
CREATE TABLE Prestamo (
    Pr_codigo VARCHAR(50) PRIMARY KEY,
    Pr_salon VARCHAR(50),
    Pr_hora_prestamo TIME DEFAULT CURRENT_TIME,
    Iv_codigo VARCHAR(50),
    Es_identificacion INT,
    FOREIGN KEY (Iv_codigo) REFERENCES Inventario(Iv_codigo),
    FOREIGN KEY (Es_identificacion) REFERENCES Estudiante(Es_identificacion)
);
