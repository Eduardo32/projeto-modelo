
--Criação do usuario padrão "admin"
INSERT INTO USUARIOS(login, senha, tipo_usuario, data_criacao, data_atualizacao)
VALUES('admin', '$2a$10$WDrDVuiwbFUXeLeoW/ExqOZ5IAsL80EYzgB4Xjpfv7H9A45zmyH/S', 'ADMIN', NOW(), NOW());
