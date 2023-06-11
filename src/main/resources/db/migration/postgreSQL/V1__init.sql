
-- public.usuarios definition
-- Drop table
-- DROP TABLE public.usuarios;

CREATE TABLE public.usuarios (
	id bigserial NOT NULL,
	data_atualizacao timestamp NOT NULL,
	data_criacao timestamp NOT NULL,
	login varchar(255) NOT NULL,
	senha varchar(255) NOT NULL,
	tipo_usuario varchar(255) NULL,
	CONSTRAINT uk_r8oo98o39ykr4hi57md9nibmw UNIQUE (login),
	CONSTRAINT usuarios_pkey PRIMARY KEY (id)
);
