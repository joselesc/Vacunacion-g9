-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-10-2023 a las 01:19:30
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
  `telefono` int(20) NOT NULL,
  `zona` varchar(50) NOT NULL,
  `activo` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `centro`
--

INSERT INTO `centro` (`id_centro`, `nombre`, `dirrecion`, `telefono`, `zona`, `activo`) VALUES
(19, 'Hospital San Juan', 'Calle Principal 123', 1234567890, 'Norte', NULL),
(20, 'Hospital Santa María', 'Avenida Central 456', 2147483647, 'Norte', NULL),
(21, 'Hospital Santo Tomás', 'Calle Norte 789', 2147483647, 'Norte', NULL),
(22, 'Hospital San Pedro', 'Avenida Sur 123', 2147483647, 'Sur', NULL),
(23, 'Hospital Santa Clara', 'Calle Sur 456a', 2147483647, 'Sur', NULL),
(24, 'Hospital Santo Domingo', 'Avenida Este 123', 2147483647, 'Este', NULL),
(25, 'Hospital San Antonio', 'Calle Este 456', 2147483647, 'Este', NULL),
(26, 'Hospital San Francisco', 'Avenida Oeste 123', 123456789, 'Oeste', NULL),
(27, 'Hospital Santa Rosa', 'Calle Oeste 456', 1112223333, 'Oeste', NULL),
(28, 'Hospital San Martín', 'Avenida Principal 789', 2147483647, 'Norte', NULL),
(29, 'Hospital Santa Isabel', 'Calle Principal 567', 2147483647, 'Este', NULL),
(30, 'Hospital Santo Domingo', 'Avenida Central 789', 2147483647, 'Oeste', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citavacunacion`
--

CREATE TABLE `citavacunacion` (
  `codCita` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `lote` int(50) NOT NULL,
  `fechaHoraCita` datetime NOT NULL,
  `id_centro` int(11) NOT NULL,
  `fechaHoraColocada` datetime NOT NULL,
  `dosis` varchar(100) NOT NULL,
  `cancelado` tinyint(1) NOT NULL
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
  `ambitoTrabajo` tinyint(1) DEFAULT NULL,
  `deRiesgo` tinyint(1) DEFAULT NULL,
  `FechaInscripcion` date NOT NULL DEFAULT '2023-01-01'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ciudadano`
--

INSERT INTO `ciudadano` (`dni`, `apellido`, `nombre`, `email`, `celular`, `zona`, `patologia`, `ambitoTrabajo`, `deRiesgo`, `FechaInscripcion`) VALUES
(0, 'Pereyra', 'Luciana', 'luciana@gmail.com', 2147483647, 'NORTE', NULL, 0, NULL, '2023-01-01'),
(10101010, 'Molina', 'Francisco', 'francisco@gmail.com', 1122334455, 'SUR', NULL, 0, NULL, '2023-01-01'),
(10101011, 'Soto', 'Paula', 'paula@gmail.com', 1122334455, 'ESTE', NULL, 0, NULL, '2023-01-01'),
(11111111, 'González', 'Juan', 'juan@gmail.com', 1122334455, 'OESTE', NULL, 0, NULL, '2023-01-01'),
(11111112, 'Cabrera', 'Martina', 'martina@gmail.com', 1122334455, 'NORTE', NULL, 0, NULL, '2023-01-01'),
(11111114, 'Hernández', 'Lautaro', 'lautaro@gmail.com', 1122334455, 'SUR', 'Hipertensión', 0, NULL, '2023-01-01'),
(12121212, 'Gómez', 'Lucía', 'lucia@gmail.com', 1122334455, 'ESTE', 'Hipertensión', 0, NULL, '2023-01-01'),
(12121213, 'Vega', 'Alejandra', 'alejandra@gmail.com', 1122334455, 'OESTE', 'Asma', 0, NULL, '2023-01-01'),
(12121214, 'Cardozo', 'Marta', 'marta@gmail.com', 1122334455, 'NORTE', 'Asma', 0, NULL, '2023-01-01'),
(20202020, 'Herrera', 'Isabella', 'isabella@gmail.com', 2147483647, 'SUR', 'Asma', 0, NULL, '2023-01-01'),
(20202021, 'Rosales', 'Leandro', 'leandro@gmail.com', 2147483647, 'ESTE', 'Diabetes', 0, NULL, '2023-01-01'),
(22222222, 'Pérez', 'María', 'maria@gmail.com', 2147483647, 'OESTE', NULL, 0, NULL, '2023-01-01'),
(22222223, 'Acosta', 'Maximiliano', 'maximiliano@gmail.com', 2147483647, 'NORTE', 'Asma', 0, NULL, '2023-01-01'),
(22222225, 'Fernández', 'Clara', 'clara@gmail.com', 2147483647, 'SUR', 'Alergias', 0, NULL, '2023-01-01'),
(23232323, 'Vega', 'Javier', 'javier@gmail.com', 2147483647, 'ESTE', NULL, 0, NULL, '2023-01-01'),
(23232325, 'Arias', 'Agustín', 'agustin@gmail.com', 2147483647, 'OESTE', NULL, 0, NULL, '2023-01-01'),
(30303030, 'Silva', 'Lucas', 'lucas@gmail.com', 2147483647, 'NORTE', 'Diabetes', 0, NULL, '2023-01-01'),
(30303031, 'Paredes', 'Abril', 'abril@gmail.com', 2147483647, 'SUR', NULL, 0, NULL, '2023-01-01'),
(31884949, 'Ibañez', 'Mario', 'hola@hola.com', 1127336498, 'SUR', NULL, 0, NULL, '2023-01-01'),
(33333333, 'López', 'Carlos', 'carlos@gmail.com', 2147483647, 'ESTE', 'Alergias', 0, NULL, '2023-01-01'),
(33333334, 'Gutiérrez', 'Isabel', 'isabel@gmail.com', 2147483647, 'OESTE', 'Hipertensión', 0, NULL, '2023-01-01'),
(33333335, 'Moreno', 'Renzo', 'renzo@gmail.com', 2147483647, 'NORTE', NULL, 0, NULL, '2023-01-01'),
(34343434, 'Suárez', 'Marta', '', 2147483647, 'SUR', 'Alergias', 0, NULL, '2023-01-01'),
(34343435, 'Castillo', 'Gabriela', 'gabriela@gmail.com', 2147483647, '', NULL, 0, NULL, '2023-01-01'),
(40404040, 'Ramos', 'Valeria', 'valeria@gmail.com', 2147483647, '', NULL, 0, NULL, '2023-01-01'),
(40404041, 'Ferreira', 'Facundo', 'facundo@gmail.com', 2147483647, '', 'Alergias', 0, NULL, '2023-01-01'),
(44444444, 'Rodríguez', 'Ana', 'ana@gmail.com', 2147483647, '', 'Hipertensión', 0, NULL, '2023-01-01'),
(44444446, 'Ríos', 'Catalina', 'catalina@gmail.com', 2147483647, '', NULL, 0, NULL, '2023-01-01'),
(45454545, 'Flores', 'Andrés', 'andres@gmail.com', 2147483647, '', 'Asma', 0, NULL, '2023-01-01'),
(45454546, 'Hernández', 'Joaquín', 'joaquin@gmail.com', 2147483647, '', 'Diabetes', 0, NULL, '2023-01-01'),
(50505050, 'Castro', 'Emilio', 'emilio@gmail.com', 2147483647, '', 'Hipertensión', 0, NULL, '2023-01-01'),
(50505051, 'Cardozo', 'Antonella', 'antonella@gmail.com', 2147483647, '', NULL, 0, NULL, '2023-01-01'),
(55555555, 'Martínez', 'Luis', 'luis@gmail.com', 2147483647, '', NULL, 0, NULL, '2023-01-01'),
(55555556, 'Román', 'Nicolás', 'nicolas@gmail.com', 2147483647, '', 'Alergias', 0, NULL, '2023-01-01'),
(55555557, 'Morales', 'Julián', 'julian@gmail.com', 2147483647, '', 'Asma', 0, NULL, '2023-01-01'),
(56565656, 'Rojas', 'Valentina', 'valentina@gmail.com', 2147483647, '', 'Diabetes', 0, NULL, '2023-01-01'),
(56565657, 'Fernández', 'Camila', 'camila@gmail.com', 2147483647, '', 'Alergias', 0, NULL, '2023-01-01'),
(60606060, 'Vargas', 'Renata', 'renata@gmail.com', 2147483647, '', 'Alergias', 0, NULL, '2023-01-01'),
(60606061, 'Arias', 'Federico', 'federico@gmail.com', 2147483647, '', 'Hipertensión', 0, NULL, '2023-01-01'),
(66666666, 'Sánchez', 'Sofía', 'sofia@gmail.com', 2147483647, '', 'Asma', 0, NULL, '2023-01-01'),
(66666667, 'Villalba', 'Joaquín', 'joaquin@gmail.com', 2147483647, '', 'Diabetes', 0, NULL, '2023-01-01'),
(66666668, 'Soto', 'Sofía', 'sofia@gmail.com', 2147483647, '', 'Diabetes', 0, NULL, '2023-01-01'),
(67676767, 'Ortega', 'Eduardo', 'eduardo@gmail.com', 2147483647, '', NULL, 0, NULL, '2023-01-01'),
(67676779, 'Fernández', 'Daniela', 'daniela@gmail.com', 2147483647, '', 'Hipertensión', 0, NULL, '2023-01-01'),
(70707070, 'Santos', 'Tomás', 'tomas@gmail.com', 2147483647, '', NULL, 0, NULL, '2023-01-01'),
(70707071, 'Leguizamón', 'Candela', 'candela@gmail.com', 2147483647, '', 'Alergias', 0, NULL, '2023-01-01'),
(77777777, 'Romero', 'Pedro', 'pedro@gmail.com', 2147483647, '', 'Diabetes', 0, NULL, '2023-01-01'),
(77777778, 'Aguilar', 'Valentín', 'valentin@gmail.com', 2147483647, '', NULL, 0, NULL, '2023-01-01'),
(77777779, 'Rosales', 'Alejandro', 'alejandro@gmail.com', 2147483647, '', NULL, 0, NULL, '2023-01-01'),
(78787878, 'Núñez', 'Cecilia', 'cecilia@gmail.com', 2147483647, '', 'Hipertensión', 0, NULL, '2023-01-01'),
(78787880, 'Moreno', 'Santiago', 'santiago@gmail.com', 2147483647, '', NULL, 0, NULL, '2023-01-01'),
(80808080, 'Giménez', 'Olivia', 'olivia@gmail.com', 2147483647, '', 'Diabetes', 0, NULL, '2023-01-01'),
(80808081, 'Mendoza', 'Matilda', 'matilda@gmail.com', 2147483647, '', 'Diabetes', 0, NULL, '2023-01-01'),
(88888880, 'Paredes', 'Luciana', 'luciana@gmail.com', 2147483647, '', 'Alergias', 0, NULL, '2023-01-01'),
(88888888, 'Torres', 'Laura', 'laura@gmail.com', 2147483647, '', NULL, 0, NULL, '2023-01-01'),
(88888889, 'Correa', 'Agustina', 'agustina@gmail.com', 2147483647, '', 'Hipertensión', 0, NULL, '2023-01-01'),
(89898989, 'Reyes', 'Diego', 'diego@gmail.com', 2147483647, '', NULL, 0, NULL, '2023-01-01'),
(89898991, 'Ríos', 'Bianca', 'bianca@gmail.com', 2147483647, '', 'Alergias', 0, NULL, '2023-01-01'),
(90909090, 'Jiménez', 'Camila', 'camila@gmail.com', 2147483647, '', 'Alergias', 0, NULL, '2023-01-01'),
(90909091, 'Lima', 'Matías', 'matias@gmail.com', 2147483647, '', 'Alergias', 0, NULL, '2023-01-01'),
(90909092, 'Morales', 'Gonzalo', 'gonzalo@gmail.com', 2147483647, '', 'Hipertensión', 0, NULL, '2023-01-01'),
(90909093, 'Castillo', 'Simón', 'simon@gmail.com', 2147483647, '', 'Alergias', 0, NULL, '2023-01-01'),
(99999990, 'Cáceres', 'Juan Pablo', 'juanpablo@gmail.com', 2147483647, '', NULL, 0, NULL, '2023-01-01'),
(99999991, 'Ferreira', 'Matías', 'matias@gmail.com', 2147483647, '', 'Hipertensión', 0, NULL, '2023-01-01'),
(99999999, 'Díaz', 'Roberto', 'roberto@gmail.com', 2147483647, '', NULL, 0, NULL, '2023-01-01');

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
-- Estructura de tabla para la tabla `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `pass` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacuna`
--

CREATE TABLE `vacuna` (
  `lote` int(50) NOT NULL,
  `cuit` bigint(20) NOT NULL,
  `marca` varchar(30) NOT NULL,
  `medida` double NOT NULL,
  `fechaCaduca` date NOT NULL,
  `stock` int(11) NOT NULL,
  `colocada` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vacuna`
--

INSERT INTO `vacuna` (`lote`, `cuit`, `marca`, `medida`, `fechaCaduca`, `stock`, `colocada`) VALUES
(1, 30500772324, 'Comirnaty', 3, '2023-12-31', 1000, 0),
(2, 30501152826, 'Spikevax', 3, '2023-12-31', 800, 0),
(3, 30503518518, 'Vaxzevria', 3, '2023-12-31', 1200, 0),
(4, 30598129246, 'Janssen COVID-19 Vaccine', 3, '2023-12-31', 600, 0),
(5, 30500772324, 'Comirnaty', 5, '2023-12-31', 1000, 0),
(6, 30501152826, 'Spikevax', 5, '2023-12-31', 800, 0),
(7, 30503518518, 'Vaxzevria', 5, '2023-12-31', 1200, 0),
(8, 30598129246, 'Janssen COVID-19 Vaccine', 5, '2023-12-31', 600, 0),
(9, 30500772324, 'Comirnaty', 9, '2023-12-31', 1000, 0),
(10, 30501152826, 'Spikevax', 9, '2023-12-31', 800, 0),
(11, 30503518518, 'Vaxzevria', 9, '2023-12-31', 1200, 0),
(12, 30598129246, 'Janssen COVID-19 Vaccine', 9, '2023-12-31', 600, 0);

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
  ADD KEY `id_centro` (`id_centro`),
  ADD KEY `citavacunacion_ibfk_2` (`lote`);

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
-- Indices de la tabla `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`),
  ADD KEY `dni` (`dni`);

--
-- Indices de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD PRIMARY KEY (`lote`),
  ADD KEY `cuit` (`cuit`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `centro`
--
ALTER TABLE `centro`
  MODIFY `id_centro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT de la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  MODIFY `codCita` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  ADD CONSTRAINT `citavacunacion_ibfk_1` FOREIGN KEY (`dni`) REFERENCES `ciudadano` (`dni`),
  ADD CONSTRAINT `citavacunacion_ibfk_2` FOREIGN KEY (`lote`) REFERENCES `vacuna` (`Lote`),
  ADD CONSTRAINT `citavacunacion_ibfk_3` FOREIGN KEY (`id_centro`) REFERENCES `centro` (`id_centro`);

--
-- Filtros para la tabla `login`
--
ALTER TABLE `login`
  ADD CONSTRAINT `login_ibfk_1` FOREIGN KEY (`dni`) REFERENCES `ciudadano` (`dni`);

--
-- Filtros para la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD CONSTRAINT `vacuna_ibfk_1` FOREIGN KEY (`cuit`) REFERENCES `laboratorio` (`cuit`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
