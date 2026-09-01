use sistema_almacen -- Ejecutar antes de insertar todo el query

INSERT INTO tbusuarios (nomUsuarios, pwdUsuarios) 
value ('G1ROCKS7','BARTOLITO');

-- 1. Crear tabla de Almacenes
CREATE TABLE almacenes (
    id_almacen INT AUTO_INCREMENT PRIMARY KEY,
    codigo_almacen VARCHAR(20) NOT NULL UNIQUE,
    nombre VARCHAR(100) NOT NULL,
    estado ENUM('ACTIVO', 'INACTIVO') DEFAULT 'ACTIVO',
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB;

-- 2. Crear tabla de Valorizaciones asociadas al Almacén
CREATE TABLE valorizaciones_almacen (
    id_valorizacion INT AUTO_INCREMENT PRIMARY KEY,
    id_almacen INT NOT NULL,
    tipo_valorizacion VARCHAR(50) NOT NULL, -- Ej: 'KARDEX_PROMEDIO', 'FIFO', 'INVENTARIO_REAL'
    monto_total DECIMAL(12, 2) NOT NULL DEFAULT 0.00,
    moneda VARCHAR(5) DEFAULT 'PEN', -- 'PEN', 'USD'
    fecha_actualizacion DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    CONSTRAINT fk_valorizacion_almacen 
        FOREIGN KEY (id_almacen) 
        REFERENCES almacenes(id_almacen) 
        ON DELETE CASCADE 
        ON UPDATE CASCADE
) ENGINE=InnoDB;