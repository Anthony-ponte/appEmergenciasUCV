CREATE DATABASE  IF NOT EXISTS `emergencias_ucv` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `emergencias_ucv`;
-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: localhost    Database: emergencias_ucv
-- ------------------------------------------------------
-- Server version	9.1.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `atencion`
--

DROP TABLE IF EXISTS `atencion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `atencion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `emergencia_id` int NOT NULL,
  `doctor_id` int NOT NULL,
  `fecha_atencion` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `observaciones` text,
  `traslado` tinyint(1) DEFAULT '0',
  `destino_traslado` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `emergencia_id` (`emergencia_id`),
  KEY `doctor_id` (`doctor_id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atencion`
--

LOCK TABLES `atencion` WRITE;
/*!40000 ALTER TABLE `atencion` DISABLE KEYS */;
INSERT INTO `atencion` VALUES (1,3,3,'2025-06-04 03:16:36','',1,'se traslado al ospital loayssa'),(2,3,2,'2025-06-21 02:28:55','sdsdsssdssdsd',0,''),(3,3,1,'2025-07-01 03:39:49','sdsdsdsds',1,'prueba del destino'),(4,3,2,'2025-07-01 03:40:39','Se asigno a la doctora maria quen se encarga de validar el pulso',1,'prueba del destino'),(5,4,1,'2025-07-01 04:54:38','sdsdsds',1,'prueba del destino'),(6,5,1,'2025-07-01 16:27:04','se asigno un medico por turno',1,'prueba del destino'),(7,5,1,'2025-07-01 16:27:42','se asigno un medico por turno',1,'prueba del destino');
/*!40000 ALTER TABLE `atencion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `especialidad` varchar(100) DEFAULT NULL,
  `codigo_doctor` varchar(50) DEFAULT NULL,
  `correo` varchar(100) DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `fecha_registro` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `activo` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor`
--

LOCK TABLES `doctor` WRITE;
/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
INSERT INTO `doctor` VALUES (1,'Juan','Pérez','Cardiología','DOC123','juan.perez@hospital.com','987654321','2025-05-27 17:55:38',1),(2,'María','González','Pediatría','DOC456','maria.gonzalez@hospital.com','987654322','2025-05-27 17:55:38',1),(3,'Carlos','Ramírez','Neurología','DOC789','carlos.ramirez@hospital.com','987654323','2025-05-27 17:55:38',1);
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emergencias`
--

DROP TABLE IF EXISTS `emergencias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `emergencias` (
  `id_emergencia` int NOT NULL AUTO_INCREMENT,
  `nombres_apellidos` varchar(150) DEFAULT NULL,
  `tipo_emergencia` int DEFAULT NULL,
  `ubicacion` varchar(45) DEFAULT NULL,
  `descripcion` text,
  `fecha_registro` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `Estado` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id_emergencia`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emergencias`
--

LOCK TABLES `emergencias` WRITE;
/*!40000 ALTER TABLE `emergencias` DISABLE KEYS */;
INSERT INTO `emergencias` VALUES (5,'dfdfd',4,'dfdfd','dfdfd','2025-07-01 04:57:22',2),(6,'sdssds',6,'sdsds','sdsdsds','2025-07-01 04:58:15',3),(4,'Andres antony ponte trujillo',4,'pabellon 12, piso 3','tubo una crisiis luego de observar una pelea','2025-06-21 02:23:52',1);
/*!40000 ALTER TABLE `emergencias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historial_medico`
--

DROP TABLE IF EXISTS `historial_medico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `historial_medico` (
  `id` int NOT NULL AUTO_INCREMENT,
  `paciente_id` int NOT NULL,
  `diagnostico` text NOT NULL,
  `tratamiento` text,
  `fecha_registro` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `paciente_id` (`paciente_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historial_medico`
--

LOCK TABLES `historial_medico` WRITE;
/*!40000 ALTER TABLE `historial_medico` DISABLE KEYS */;
/*!40000 ALTER TABLE `historial_medico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paciente`
--

DROP TABLE IF EXISTS `paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paciente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `cedula` varchar(20) NOT NULL,
  `tipo_usuario` enum('Estudiante','Docente','Obrero','Otro') NOT NULL,
  `sexo` enum('M','F','O') NOT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cedula` (`cedula`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente`
--

LOCK TABLES `paciente` WRITE;
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perfiles_usuarios`
--

DROP TABLE IF EXISTS `perfiles_usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `perfiles_usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `nacimiento` date DEFAULT NULL,
  `email` varchar(100) NOT NULL,
  `contraseña` varchar(100) NOT NULL,
  `tipo_usuario` varchar(50) NOT NULL,
  `fecha_registro` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfiles_usuarios`
--

LOCK TABLES `perfiles_usuarios` WRITE;
/*!40000 ALTER TABLE `perfiles_usuarios` DISABLE KEYS */;
INSERT INTO `perfiles_usuarios` VALUES (1,'Andres Anthony','2025-12-03','andres@gmail.com','123456','ESTUDIANTE','2025-07-01 15:01:35');
/*!40000 ALTER TABLE `perfiles_usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_emergencia`
--

DROP TABLE IF EXISTS `tipo_emergencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_emergencia` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `descripcion` text,
  `activo` tinyint(1) NOT NULL DEFAULT '1',
  `fecha_creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fecha_actualizacion` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_emergencia`
--

LOCK TABLES `tipo_emergencia` WRITE;
/*!40000 ALTER TABLE `tipo_emergencia` DISABLE KEYS */;
INSERT INTO `tipo_emergencia` VALUES (1,'Paro cardiorrespiratorio','Interrupción repentina de la función cardíaca y respiratoria.',1,'2025-05-27 16:31:01','2025-05-27 16:31:01'),(2,'Accidente cerebrovascular','Alteración súbita del flujo sanguíneo en el cerebro.',1,'2025-05-27 16:31:01','2025-05-27 16:31:01'),(3,'Infarto agudo de miocardio','Obstrucción del flujo sanguíneo al corazón.',1,'2025-05-27 16:31:01','2025-05-27 16:31:01'),(4,'Crisis hipertensiva','Elevación extrema de la presión arterial que requiere atención urgente.',1,'2025-05-27 16:31:01','2025-05-27 16:31:01'),(5,'Convulsiones','Episodios de actividad eléctrica anormal en el cerebro.',1,'2025-05-27 16:31:01','2025-05-27 16:31:01'),(6,'Dificultad respiratoria aguda','Problemas graves para respirar que comprometen la vida.',1,'2025-05-27 16:31:01','2025-05-27 16:31:01'),(7,'Hemorragia severa','Pérdida excesiva de sangre que puede causar shock.',1,'2025-05-27 16:31:01','2025-05-27 16:31:01'),(8,'Reacción alérgica severa (anafilaxia)','Reacción inmunológica grave ante una sustancia.',1,'2025-05-27 16:31:01','2025-05-27 16:31:01'),(9,'Trauma grave','Lesión física severa, como fracturas múltiples o trauma craneal.',1,'2025-05-27 16:31:01','2025-05-27 16:31:01'),(10,'Intoxicación','Exposición a sustancias tóxicas por ingestión, inhalación o contacto.',1,'2025-05-27 16:31:01','2025-05-27 16:31:01'),(11,'Deshidratación severa','Pérdida crítica de líquidos y electrolitos.',1,'2025-05-27 16:31:01','2025-05-27 16:31:01'),(12,'Estado de inconsciencia','Pérdida total de la conciencia que requiere evaluación médica inmediata.',1,'2025-05-27 16:31:01','2025-05-27 16:31:01');
/*!40000 ALTER TABLE `tipo_emergencia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ubicacion`
--

DROP TABLE IF EXISTS `ubicacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ubicacion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ubicacion`
--

LOCK TABLES `ubicacion` WRITE;
/*!40000 ALTER TABLE `ubicacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `ubicacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'emergencias_ucv'
--

--
-- Dumping routines for database 'emergencias_ucv'
--
/*!50003 DROP PROCEDURE IF EXISTS `insertar_emergencia` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertar_emergencia`(
    IN p_nombres_apellidos VARCHAR(150),
    IN p_tipo_emergencia INT,
    IN p_ubicacion VARCHAR(45),
    IN p_descripcion TEXT
)
BEGIN
    INSERT INTO emergencias (
        nombres_apellidos,
        tipo_emergencia,
        ubicacion,
        descripcion,
        fecha_registro,
        estado
    ) VALUES (
        p_nombres_apellidos,
        p_tipo_emergencia,
        p_ubicacion,
        p_descripcion,
        NOW(),  
        1   
    );
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `reporte_emergencias_por_fecha` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `reporte_emergencias_por_fecha`(
    IN p_fecha_inicio DATE,
    IN p_fecha_fin DATE
)
BEGIN
    SELECT 
        e.id_emergencia,
        e.nombres_apellidos,
        e.ubicacion,
        e.descripcion,
        te.nombre AS tipo_emergencia,
        e.fecha_registro,
        CASE e.estado
            WHEN 1 THEN 'Pendiente'
            WHEN 2 THEN 'Atendida'
            WHEN 3 THEN 'Cancelada'
            ELSE 'Desconocido'
        END AS estado
    FROM emergencias e
    LEFT JOIN tipo_emergencia te ON e.tipo_emergencia = te.id
    WHERE DATE(e.fecha_registro) BETWEEN p_fecha_inicio AND p_fecha_fin
    ORDER BY e.fecha_registro ASC;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_detalle_emergencia_por_id` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_detalle_emergencia_por_id`(IN p_id_emergencia INT)
BEGIN
    SELECT 
        e.id_emergencia,
        e.nombres_apellidos,
        e.ubicacion,
        e.descripcion,
        te.nombre AS tipo_emergencia,
        e.fecha_registro
    FROM emergencias e
    LEFT JOIN tipo_emergencia te ON e.tipo_emergencia = te.id
    WHERE e.id_emergencia = p_id_emergencia;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_guardar_atencion` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_guardar_atencion`(
    IN p_emergencia_id INT,
    IN p_doctor_id INT,
    IN p_observaciones TEXT,
    IN p_traslado BOOLEAN,
    IN p_destino_traslado VARCHAR(255)
)
BEGIN
    -- Insertar nueva atención
    INSERT INTO atencion (emergencia_id, doctor_id, observaciones, traslado, destino_traslado)
    VALUES (p_emergencia_id, p_doctor_id, p_observaciones, p_traslado, p_destino_traslado);

    -- Actualizar estado de la emergencia a 2 (Atendida)
    UPDATE emergencias
    SET estado = 2
    WHERE id_emergencia = p_emergencia_id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_guardar_perfil_usuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_guardar_perfil_usuario`(
    IN p_nombre VARCHAR(100),
    IN p_nacimiento DATE,
    IN p_email VARCHAR(100),
    IN p_contraseña VARCHAR(100),
    IN p_tipo_usuario VARCHAR(50)
)
BEGIN
    -- Validar si el email ya existe
    IF EXISTS (SELECT 1 FROM perfiles_usuarios WHERE email = p_email) THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'El correo ya está registrado';
    ELSE
        -- Insertar nuevo usuario
        INSERT INTO perfiles_usuarios(nombre, nacimiento, email, contraseña, tipo_usuario)
        VALUES (p_nombre, p_nacimiento, p_email, p_contraseña, p_tipo_usuario);
    END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_historial_atencion_por_emergencia` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_historial_atencion_por_emergencia`(IN p_id_emergencia INT)
BEGIN
    SELECT 
        a.id AS id_atencion,
        d.nombre AS nombre_doctor,
        d.apellido AS apellido_doctor,
        d.especialidad,
        a.fecha_atencion,
        a.observaciones,
        a.traslado,
        a.destino_traslado
    FROM atencion a
    INNER JOIN doctor d ON a.doctor_id = d.id
    WHERE a.emergencia_id = p_id_emergencia
    ORDER BY a.fecha_atencion DESC;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-07-01 14:07:12
