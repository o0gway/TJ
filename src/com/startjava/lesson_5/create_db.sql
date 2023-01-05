-- -- Удаление базы данных если уже есть
-- DROP DATABASE IF EXISTS

-- Подключение к базе данных
\c jaegers postgres;

-- Удаление таблицы если она уже существует
DROP TABLE IF EXISTS Jaegers;

-- Создание базы данных Jaegers
CREATE DATABASE Jaegers;

-- Создание таблицы Jaegers
CREATE TABLE Jaegers (
    id SERIAL PRIMARY KEY, 
    modelName TEXT,
    mark CHAR(6), 
    "height(meter)" NUMERIC(4, 2), 
    "weight(kg)" NUMERIC(6, 2), 
    status TEXT, 
    origin TEXT, 
    launch DATE, 
    kaijuKill INTEGER);

-- -- Изменение типа данных столбца
-- ALTER TABLE Jaegers
-- ALTER COLUMN mark TYPE CHAR(6);
-- --
-- ALTER TABLE Jaegers
-- ALTER COLUMN height TYPE NUMERIC(4, 2);
-- --
-- ALTER TABLE Jaegers
-- ALTER COLUMN weight TYPE NUMERIC(6, 2);

-- --Изменение имени столбца
-- ALTER TABLE Jaegers
-- RENAME COLUMN weight TO "weight(kg)";
-- -- 
-- ALTER TABLE Jaegers
-- RENAME COLUMN height TO "height(meter)";

\include_relative init_db.sql

\include_relative queries.sql