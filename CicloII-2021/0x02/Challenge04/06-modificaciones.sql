UPDATE carnes SET animal = "Res" WHERE nombre = "Filete";
UPDATE carnes SET nombre = "Pernil" WHERE nombre = "Pierna";
UPDATE inventario SET producto = "Pernil" WHERE producto = "Pierna";
DELETE FROM carnes WHERE nombre = "Tenaza";
DELETE FROM inventario WHERE producto = "Tenaza";
