-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-10-2023 a las 01:38:58
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vacunacion-g9`
--
CREATE DATABASE IF NOT EXISTS `vacunacion-g9` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `vacunacion-g9`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `centro`
--

CREATE TABLE `centro` (
  `id_centro` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `dirrecion` varchar(100) NOT NULL,
  `telefono` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citavacunacion`
--

CREATE TABLE `citavacunacion` (
  `codCita` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `nroSerieDosis` int(50) NOT NULL,
  `fechaHoraCita` datetime NOT NULL,
  `id_centro` int(11) NOT NULL,
  `fechaHoraColocada` datetime NOT NULL,
  `dosis` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudadano`
--

CREATE TABLE `ciudadano` (
  `dni` int(11) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `celular` int(25) NOT NULL,
  `zona` varchar(20) NOT NULL,
  `patologia` varchar(50) DEFAULT NULL,
  `ambitoTrabajo` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ciudadano`
--

INSERT INTO `ciudadano` (`dni`, `apellido`, `nombre`, `email`, `celular`, `zona`, `patologia`, `ambitoTrabajo`) VALUES
(0, 'Pereyra', 'Luciana', 'luciana@gmail.com', 2147483647, 'NORTE', NULL, 'Profesor'),
(10101010, 'Molina', 'Francisco', 'francisco@gmail.com', 1122334455, 'SUR', NULL, 'Médico'),
(10101011, 'Soto', 'Paula', 'paula@gmail.com', 1122334455, 'ESTE', NULL, 'Ingeniero'),
(11111111, 'González', 'Juan', 'juan@gmail.com', 1122334455, 'OESTE', NULL, 'Médico'),
(11111112, 'Cabrera', 'Martina', 'martina@gmail.com', 1122334455, 'NORTE', NULL, 'Médico'),
(11111114, 'Hernández', 'Lautaro', 'lautaro@gmail.com', 1122334455, 'SUR', 'Hipertensión', 'Profesor'),
(12121212, 'Gómez', 'Lucía', 'lucia@gmail.com', 1122334455, 'ESTE', 'Hipertensión', 'Abogado'),
(12121213, 'Vega', 'Alejandra', 'alejandra@gmail.com', 1122334455, 'OESTE', 'Asma', 'Médico'),
(12121214, 'Cardozo', 'Marta', 'marta@gmail.com', 1122334455, 'NORTE', 'Asma', 'Médico'),
(20202020, 'Herrera', 'Isabella', 'isabella@gmail.com', 2147483647, 'SUR', 'Asma', 'Enfermera'),
(20202021, 'Rosales', 'Leandro', 'leandro@gmail.com', 2147483647, 'ESTE', 'Diabetes', 'Médico'),
(22222222, 'Pérez', 'María', 'maria@gmail.com', 2147483647, 'OESTE', NULL, 'Enfermera'),
(22222223, 'Acosta', 'Maximiliano', 'maximiliano@gmail.com', 2147483647, 'NORTE', 'Asma', 'Enfermera'),
(22222225, 'Fernández', 'Clara', 'clara@gmail.com', 2147483647, 'SUR', 'Alergias', 'Médico'),
(23232323, 'Vega', 'Javier', 'javier@gmail.com', 2147483647, 'ESTE', NULL, 'Ingeniero'),
(23232325, 'Arias', 'Agustín', 'agustin@gmail.com', 2147483647, 'OESTE', NULL, 'Enfermera'),
(30303030, 'Silva', 'Lucas', 'lucas@gmail.com', 2147483647, 'NORTE', 'Diabetes', 'Médico'),
(30303031, 'Paredes', 'Abril', 'abril@gmail.com', 2147483647, 'SUR', '', 'Enfermera'),
(31884949, 'Ibañez', 'Mario', 'hola@hola.com', 1127336498, 'SUR', NULL, 'Guardia'),
(33333333, 'López', 'Carlos', 'carlos@gmail.com', 2147483647, 'ESTE', 'Alergias', 'Profesor'),
(33333334, 'Gutiérrez', 'Isabel', 'isabel@gmail.com', 2147483647, 'OESTE', 'Hipertensión', 'Médico'),
(33333335, 'Moreno', 'Renzo', 'renzo@gmail.com', 2147483647, 'NORTE', NULL, 'Enfermera'),
(34343434, 'Suárez', 'Marta', 'marta@gmail.com', 2147483647, 'SUR', 'Alergias', 'Contador'),
(34343435, 'Castillo', 'Gabriela', 'gabriela@gmail.com', 2147483647, '', '', 'Profesor'),
(40404040, 'Ramos', 'Valeria', 'valeria@gmail.com', 2147483647, '', '', 'Profesor'),
(40404041, 'Ferreira', 'Facundo', 'facundo@gmail.com', 2147483647, '', 'Alergias', 'Profesor'),
(44444444, 'Rodríguez', 'Ana', 'ana@gmail.com', 2147483647, '', 'Hipertensión', 'Abogado'),
(44444446, 'Ríos', 'Catalina', 'catalina@gmail.com', 2147483647, '', 'Ninguna', 'Médico'),
(45454545, 'Flores', 'Andrés', 'andres@gmail.com', 2147483647, '', 'Asma', 'Médico'),
(45454546, 'Hernández', 'Joaquín', 'joaquin@gmail.com', 2147483647, '', 'Diabetes', 'Ingeniero'),
(50505050, 'Castro', 'Emilio', 'emilio@gmail.com', 2147483647, '', 'Hipertensión', 'Abogado'),
(50505051, 'Cardozo', 'Antonella', 'antonella@gmail.com', 2147483647, '', 'Ninguna', 'Médico'),
(55555555, 'Martínez', 'Luis', 'luis@gmail.com', 2147483647, '', NULL, 'Ingeniero'),
(55555556, 'Román', 'Nicolás', 'nicolas@gmail.com', 2147483647, '', 'Alergias', 'Médico'),
(55555557, 'Morales', 'Julián', 'julian@gmail.com', 2147483647, '', 'Asma', 'Profesor'),
(56565656, 'Rojas', 'Valentina', 'valentina@gmail.com', 2147483647, '', 'Diabetes', 'Enfermera'),
(56565657, 'Fernández', 'Camila', 'camila@gmail.com', 2147483647, '', 'Alergias', 'Médico'),
(60606060, 'Vargas', 'Renata', 'renata@gmail.com', 2147483647, '', 'Alergias', 'Ingeniero'),
(60606061, 'Arias', 'Federico', 'federico@gmail.com', 2147483647, '', 'Hipertensión', 'Abogado'),
(66666666, 'Sánchez', 'Sofía', 'sofia@gmail.com', 2147483647, '', 'Asma', 'Contador'),
(66666667, 'Villalba', 'Joaquín', 'joaquin@gmail.com', 2147483647, '', 'Diabetes', 'Enfermera'),
(66666668, 'Soto', 'Sofía', 'sofia@gmail.com', 2147483647, '', 'Diabetes', 'Médico'),
(67676767, 'Ortega', 'Eduardo', 'eduardo@gmail.com', 2147483647, '', 'Ninguna', 'Profesor'),
(67676779, 'Fernández', 'Daniela', 'daniela@gmail.com', 2147483647, '', 'Hipertensión', 'Médico'),
(70707070, 'Santos', 'Tomás', 'tomas@gmail.com', 2147483647, '', 'Ninguna', 'Médico'),
(70707071, 'Leguizamón', 'Candela', 'candela@gmail.com', 2147483647, '', 'Alergias', 'Ingeniero'),
(77777777, 'Romero', 'Pedro', 'pedro@gmail.com', 2147483647, '', 'Diabetes', 'Médico'),
(77777778, 'Aguilar', 'Valentín', 'valentin@gmail.com', 2147483647, '', 'Ninguna', 'Profesor'),
(77777779, 'Rosales', 'Alejandro', 'alejandro@gmail.com', 2147483647, '', 'Ninguna', 'Enfermera'),
(78787878, 'Núñez', 'Cecilia', 'cecilia@gmail.com', 2147483647, '', 'Hipertensión', 'Médico'),
(78787880, 'Moreno', 'Santiago', 'santiago@gmail.com', 2147483647, '', 'Ninguna', 'Enfermera'),
(80808080, 'Giménez', 'Olivia', 'olivia@gmail.com', 2147483647, '', 'Diabetes', 'Enfermera'),
(80808081, 'Mendoza', 'Matilda', 'matilda@gmail.com', 2147483647, '', 'Diabetes', 'Médico'),
(88888880, 'Paredes', 'Luciana', 'luciana@gmail.com', 2147483647, '', 'Alergias', 'Profesor'),
(88888888, 'Torres', 'Laura', 'laura@gmail.com', 2147483647, '', NULL, 'Enfermera'),
(88888889, 'Correa', 'Agustina', 'agustina@gmail.com', 2147483647, '', 'Hipertensión', 'Médico'),
(89898989, 'Reyes', 'Diego', 'diego@gmail.com', 2147483647, '', NULL, 'Enfermera'),
(89898991, 'Ríos', 'Bianca', 'bianca@gmail.com', 2147483647, '', 'Alergias', 'Profesor'),
(90909090, 'Jiménez', 'Camila', 'camila@gmail.com', 2147483647, '', 'Alergias', 'Profesor'),
(90909091, 'Lima', 'Matías', 'matias@gmail.com', 2147483647, '', 'Alergias', 'Profesor'),
(90909092, 'Morales', 'Gonzalo', 'gonzalo@gmail.com', 2147483647, '', 'Hipertensión', 'Abogado'),
(90909093, 'Castillo', 'Simón', 'simon@gmail.com', 2147483647, '', 'Alergias', 'Enfermera'),
(99999990, 'Cáceres', 'Juan Pablo', 'juanpablo@gmail.com', 2147483647, '', 'Ninguna', 'Enfermera'),
(99999991, 'Ferreira', 'Matías', 'matias@gmail.com', 2147483647, '', 'Hipertensión', 'Abogado'),
(99999999, 'Díaz', 'Roberto', 'roberto@gmail.com', 2147483647, '', 'Ninguna', 'Profesor');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `laboratorio`
--

CREATE TABLE `laboratorio` (
  `cuit` bigint(20) NOT NULL,
  `nombreLaboratorio` varchar(25) NOT NULL,
  `pais` varchar(30) NOT NULL,
  `domComercial` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `laboratorio`
--

INSERT INTO `laboratorio` (`cuit`, `nombreLaboratorio`, `pais`, `domComercial`) VALUES
(30500772324, 'Astra Zéneca S.A.', 'Inglaterra', 'Calle Puerto De Somport 21 23. 28050, Madrid'),
(30501152826, 'Laboratorios Richmond S.A', 'Rusia', 'Av. Elcano 4938'),
(30503518518, 'PFIZER S.R.L', 'Estados Unidos', 'Calle Carlos Berg 3669'),
(30598129246, 'Janssen Cilag Farmacéutic', 'Estados Unidos', 'Mendoza 1259');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacuna`
--

CREATE TABLE `vacuna` (
  `nroSerieDosis` int(50) NOT NULL,
  `cuit` bigint(20) NOT NULL,
  `marca` varchar(30) NOT NULL,
  `medida` double NOT NULL,
  `fechaCaduca` date NOT NULL,
  `stock` int(11) NOT NULL,
  `colocada` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `centro`
--
ALTER TABLE `centro`
  ADD PRIMARY KEY (`id_centro`);

--
-- Indices de la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  ADD PRIMARY KEY (`codCita`),
  ADD KEY `dni` (`dni`),
  ADD KEY `nroSerieDosis` (`nroSerieDosis`),
  ADD KEY `id_centro` (`id_centro`);

--
-- Indices de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  ADD PRIMARY KEY (`cuit`);

--
-- Indices de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD PRIMARY KEY (`nroSerieDosis`),
  ADD KEY `cuit` (`cuit`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `centro`
--
ALTER TABLE `centro`
  MODIFY `id_centro` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  MODIFY `codCita` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  MODIFY `nroSerieDosis` int(50) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  ADD CONSTRAINT `citavacunacion_ibfk_1` FOREIGN KEY (`dni`) REFERENCES `ciudadano` (`dni`),
  ADD CONSTRAINT `citavacunacion_ibfk_2` FOREIGN KEY (`nroSerieDosis`) REFERENCES `vacuna` (`nroSerieDosis`),
  ADD CONSTRAINT `citavacunacion_ibfk_3` FOREIGN KEY (`id_centro`) REFERENCES `centro` (`id_centro`);

--
-- Filtros para la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD CONSTRAINT `vacuna_ibfk_1` FOREIGN KEY (`cuit`) REFERENCES `laboratorio` (`cuit`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
