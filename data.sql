USE gestion_funcionarios;

INSERT INTO departamentos (nombre) VALUES 
('Recursos Humanos'),
('Finanzas'),
('Sistemas');

INSERT INTO cargos (nombre) VALUES 
('Analista'),
('Coordinador'),
('Gerente');

INSERT INTO funcionarios (nombre, apellido, documento, id_departamento, id_cargo) VALUES
('Ana', 'Gomez', '12345', 1, 2),
('Luis', 'Perez', '67890', 2, 1);
