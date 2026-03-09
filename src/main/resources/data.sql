
INSERT INTO enderecos (cidade, bairro, endereco) VALUES
('Joinville', 'Centro', 'Rua Blumenau, 123'),
('Joinville', 'Bucarein', 'Rua Paulo Malschitzki, 10'),
('Joinville', 'Aventureiro', 'Rua Arno Waldemar Döhler, 530'),
('Joinville', 'Floresta', 'Rua Visconde de Taunay, 2155'),
('Joinville', 'Boa Vista', 'Rua dos Ipês, 400'),
('Joinville', 'Glória', 'Rua Dona Francisca, 1500'),
('Joinville', 'Iririú', 'Rua Carlos Hess, 200'),
('Joinville', 'Fátima', 'Rua Lauro Müller, 845'),
('Joinville', 'Anita Garibaldi', 'Rua Rio Branco, 300'),
('Joinville', 'Paranaguamirim', 'Rua Joaquim Nabuco, 720'),
('Joinville', 'Costa e Silva', 'Av. Santos Dumont, 1200'),
('Joinville', 'Atiradores', 'Rua XV de Novembro, 640');

-- 1. Ecoponto Centro - amplo, faz coleta
INSERT INTO locais_de_descarte (endereco_id, hora_inicio, hora_fim, faz_coleta) VALUES
    (1, '07:00:00', '18:00:00', true);

-- 2. Ecoponto Bucarein - faz coleta
INSERT INTO locais_de_descarte (endereco_id, hora_inicio, hora_fim, faz_coleta) VALUES
    (2, '08:00:00', '17:00:00', true);

-- 3. Ecoponto Aventureiro - sem coleta
INSERT INTO locais_de_descarte (endereco_id, hora_inicio, hora_fim, faz_coleta) VALUES
    (3, '07:30:00', '16:30:00', false);

-- 4. Ecoponto Floresta
INSERT INTO locais_de_descarte (endereco_id, hora_inicio, hora_fim, faz_coleta) VALUES
    (4, '08:00:00', '18:00:00', true);

-- 5. Ecoponto Boa Vista
INSERT INTO locais_de_descarte (endereco_id, hora_inicio, hora_fim, faz_coleta) VALUES
    (5, '07:00:00', '17:00:00', false);

-- 6. Ecoponto Glória
INSERT INTO locais_de_descarte (endereco_id, hora_inicio, hora_fim, faz_coleta) VALUES
    (6, '08:00:00', '17:00:00', true);

-- 7. Ecoponto Iririú
INSERT INTO locais_de_descarte (endereco_id, hora_inicio, hora_fim, faz_coleta) VALUES
    (7, '07:00:00', '16:00:00', false);

-- 8. Ecoponto Fátima
INSERT INTO locais_de_descarte (endereco_id, hora_inicio, hora_fim, faz_coleta) VALUES
    (8, '08:00:00', '17:30:00', true);

-- 9. Ponto de Entrega Voluntária - Anita Garibaldi
INSERT INTO locais_de_descarte (endereco_id, hora_inicio, hora_fim, faz_coleta) VALUES
    (9, '09:00:00', '16:00:00', false);

-- 10. Ecoponto Paranaguamirim
INSERT INTO locais_de_descarte (endereco_id, hora_inicio, hora_fim, faz_coleta) VALUES
    (10, '07:30:00', '17:00:00', true);

-- 11. Ecoponto Costa e Silva
INSERT INTO locais_de_descarte (endereco_id, hora_inicio, hora_fim, faz_coleta) VALUES
    (11, '08:00:00', '18:00:00', true);

-- 12. Ecoponto Atiradores
INSERT INTO locais_de_descarte (endereco_id, hora_inicio, hora_fim, faz_coleta) VALUES
    (12, '07:00:00', '17:00:00', false);

-- Local 1 (Centro) - Aceita quase tudo
INSERT INTO locais_de_descarte_itens (local_id, item) VALUES
(1, 'OLEO_DE_COZINHA'),
(1, 'PILHAS_E_BATERIAS'),
(1, 'LAMPADAS'),
(1, 'MEDICAMENTO_DOMICILIAR'),
(1, 'CAIXAS_E_BULAS_DE_MEDICAMENTO'),
(1, 'ELETRODOMESTICOS'),
(1, 'ELETROELETRONICOS'),
(1, 'MATERIAIS_RECICLAVEIS'),
(1, 'EMBALAGENS_DE_VIDRO'),
(1, 'MOVEIS'),
(1, 'PNEUS'),
(1, 'TINTA_SOLVENTE_E_VERNIZ');

-- Local 2 (Bucarein)
INSERT INTO locais_de_descarte_itens (local_id, item) VALUES
(2, 'MATERIAIS_RECICLAVEIS'),
(2, 'EMBALAGENS_DE_VIDRO'),
(2, 'PILHAS_E_BATERIAS'),
(2, 'LAMPADAS'),
(2, 'OLEO_DE_COZINHA'),
(2, 'RESIDUO_DE_PODA'),
(2, 'LIXO_ORGANICO'),
(2, 'COMPOSTAVEIS');

-- Local 3 (Aventureiro)
INSERT INTO locais_de_descarte_itens (local_id, item) VALUES
(3, 'ENTULHO_DE_CONSTRUCAO_CIVIL'),
(3, 'MOVEIS'),
(3, 'ELETRODOMESTICOS'),
(3, 'MATERIAIS_RECICLAVEIS'),
(3, 'RESIDUO_DE_PODA');

-- Local 4 (Floresta)
INSERT INTO locais_de_descarte_itens (local_id, item) VALUES
(4, 'PILHAS_E_BATERIAS'),
(4, 'LAMPADAS'),
(4, 'ELETROELETRONICOS'),
(4, 'ELETRODOMESTICOS'),
(4, 'OLEO_DE_COZINHA'),
(4, 'MEDICAMENTO_DOMICILIAR'),
(4, 'CAIXAS_E_BULAS_DE_MEDICAMENTO'),
(4, 'SERINGAS_E_AGULHAS_ACOPLADAS_A_SERINGA_DOMICILIAR');

-- Local 5 (Boa Vista)
INSERT INTO locais_de_descarte_itens (local_id, item) VALUES
(5, 'MATERIAIS_RECICLAVEIS'),
(5, 'EMBALAGENS_DE_VIDRO'),
(5, 'LIXO_ORGANICO'),
(5, 'COMPOSTAVEIS'),
(5, 'RESIDUO_DE_PODA');

-- Local 6 (Glória)
INSERT INTO locais_de_descarte_itens (local_id, item) VALUES
(6, 'PNEUS'),
(6, 'TINTA_SOLVENTE_E_VERNIZ'),
(6, 'ENTULHO_DE_CONSTRUCAO_CIVIL'),
(6, 'RESIDUO_DE_FOSSA'),
(6, 'MOVEIS'),
(6, 'ELETRODOMESTICOS');

-- Local 7 (Iririú)
INSERT INTO locais_de_descarte_itens (local_id, item) VALUES
(7, 'MATERIAIS_RECICLAVEIS'),
(7, 'PILHAS_E_BATERIAS'),
(7, 'OLEO_DE_COZINHA'),
(7, 'LAMPADAS'),
(7, 'EMBALAGENS_DE_VIDRO');

-- Local 8 (Fátima)
INSERT INTO locais_de_descarte_itens (local_id, item) VALUES
(8, 'MEDICAMENTO_DOMICILIAR'),
(8, 'CAIXAS_E_BULAS_DE_MEDICAMENTO'),
(8, 'SERINGAS_E_AGULHAS_ACOPLADAS_A_SERINGA_DOMICILIAR'),
(8, 'PILHAS_E_BATERIAS'),
(8, 'LAMPADAS'),
(8, 'ELETROELETRONICOS'),
(8, 'MATERIAIS_RECICLAVEIS');

-- Local 9 (Anita Garibaldi) - PEV simples
INSERT INTO locais_de_descarte_itens (local_id, item) VALUES
(9, 'MATERIAIS_RECICLAVEIS'),
(9, 'EMBALAGENS_DE_VIDRO'),
(9, 'OLEO_DE_COZINHA');

-- Local 10 (Paranaguamirim)
INSERT INTO locais_de_descarte_itens (local_id, item) VALUES
(10, 'ENTULHO_DE_CONSTRUCAO_CIVIL'),
(10, 'RESIDUO_DE_PODA'),
(10, 'MOVEIS'),
(10, 'ELETRODOMESTICOS'),
(10, 'MATERIAIS_RECICLAVEIS'),
(10, 'EMBALAGENS_DE_VIDRO'),
(10, 'LIXO_ORGANICO');

-- Local 11 (Costa e Silva)
INSERT INTO locais_de_descarte_itens (local_id, item) VALUES
(11, 'PILHAS_E_BATERIAS'),
(11, 'LAMPADAS'),
(11, 'TINTA_SOLVENTE_E_VERNIZ'),
(11, 'PNEUS'),
(11, 'OLEO_DE_COZINHA'),
(11, 'ELETROELETRONICOS'),
(11, 'ELETRODOMESTICOS'),
(11, 'MATERIAIS_RECICLAVEIS');

-- Local 12 (Atiradores)
INSERT INTO locais_de_descarte_itens (local_id, item) VALUES
(12, 'MATERIAIS_RECICLAVEIS'),
(12, 'COMPOSTAVEIS'),
(12, 'LIXO_ORGANICO'),
(12, 'EMBALAGENS_DE_VIDRO'),
(12, 'RESIDUO_DE_PODA');