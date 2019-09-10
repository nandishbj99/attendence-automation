CREATE DATABASE  IF NOT EXISTS `attendence` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `attendence`;
-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: attendence
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `3a_daa`
--

DROP TABLE IF EXISTS `3a_daa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `3a_daa` (
  `date` varchar(10) DEFAULT NULL,
  `1RV18CS001` int(2) DEFAULT NULL,
  `1RV18CS002` int(2) DEFAULT NULL,
  `1RV18CS003` int(2) DEFAULT NULL,
  `1RV18CS004` int(2) DEFAULT NULL,
  `1RV18CS005` int(2) DEFAULT NULL,
  `1RV18CS006` int(2) DEFAULT NULL,
  `1RV18CS007` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `3a_daa`
--

LOCK TABLES `3a_daa` WRITE;
/*!40000 ALTER TABLE `3a_daa` DISABLE KEYS */;
/*!40000 ALTER TABLE `3a_daa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `3a_gt`
--

DROP TABLE IF EXISTS `3a_gt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `3a_gt` (
  `date` varchar(10) DEFAULT NULL,
  `1RV18CS001` int(2) DEFAULT NULL,
  `1RV18CS002` int(2) DEFAULT NULL,
  `1RV18CS003` int(2) DEFAULT NULL,
  `1RV18CS004` int(2) DEFAULT NULL,
  `1RV18CS005` int(2) DEFAULT NULL,
  `1RV18CS006` int(2) DEFAULT NULL,
  `1RV18CS007` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `3a_gt`
--

LOCK TABLES `3a_gt` WRITE;
/*!40000 ALTER TABLE `3a_gt` DISABLE KEYS */;
/*!40000 ALTER TABLE `3a_gt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `3a_java`
--

DROP TABLE IF EXISTS `3a_java`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `3a_java` (
  `date` varchar(10) DEFAULT NULL,
  `1RV18CS001` int(2) DEFAULT NULL,
  `1RV18CS002` int(2) DEFAULT NULL,
  `1RV18CS003` int(2) DEFAULT NULL,
  `1RV18CS004` int(2) DEFAULT NULL,
  `1RV18CS005` int(2) DEFAULT NULL,
  `1RV18CS006` int(2) DEFAULT NULL,
  `1RV18CS007` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `3a_java`
--

LOCK TABLES `3a_java` WRITE;
/*!40000 ALTER TABLE `3a_java` DISABLE KEYS */;
INSERT INTO `3a_java` VALUES ('2019-04-04',1,1,1,1,0,0,0),('2019-04-11',1,1,1,1,0,0,1);
/*!40000 ALTER TABLE `3a_java` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `3a_os`
--

DROP TABLE IF EXISTS `3a_os`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `3a_os` (
  `date` varchar(10) DEFAULT NULL,
  `1RV18CS001` int(2) DEFAULT NULL,
  `1RV18CS002` int(2) DEFAULT NULL,
  `1RV18CS003` int(2) DEFAULT NULL,
  `1RV18CS004` int(2) DEFAULT NULL,
  `1RV18CS005` int(2) DEFAULT NULL,
  `1RV18CS006` int(2) DEFAULT NULL,
  `1RV18CS007` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `3a_os`
--

LOCK TABLES `3a_os` WRITE;
/*!40000 ALTER TABLE `3a_os` DISABLE KEYS */;
INSERT INTO `3a_os` VALUES ('2019-03-31',1,1,1,1,1,1,1),('2019-04-01',1,1,0,0,0,0,1);
/*!40000 ALTER TABLE `3a_os` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `4a_ai`
--

DROP TABLE IF EXISTS `4a_ai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `4a_ai` (
  `date` varchar(10) DEFAULT NULL,
  `1RV18CS008` int(2) DEFAULT NULL,
  `1RV18CS009` int(2) DEFAULT NULL,
  `1RV18CS010` int(2) DEFAULT NULL,
  `1RV18CS011` int(2) DEFAULT NULL,
  `1RV18CS012` int(2) DEFAULT NULL,
  `1RV18CS013` int(2) DEFAULT NULL,
  `1RV18CS014` int(2) DEFAULT NULL,
  `1RV18CS015` int(2) DEFAULT NULL,
  `1RV18CS016` int(2) DEFAULT NULL,
  `1RV18CS017` int(2) DEFAULT NULL,
  `1RV18CS018` int(2) DEFAULT NULL,
  `1RV18CS019` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `4a_ai`
--

LOCK TABLES `4a_ai` WRITE;
/*!40000 ALTER TABLE `4a_ai` DISABLE KEYS */;
INSERT INTO `4a_ai` VALUES ('2019-04-04',1,0,0,0,0,0,0,1,1,1,1,1);
/*!40000 ALTER TABLE `4a_ai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `4a_dbms`
--

DROP TABLE IF EXISTS `4a_dbms`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `4a_dbms` (
  `date` varchar(10) DEFAULT NULL,
  `1RV18CS008` int(2) DEFAULT NULL,
  `1RV18CS009` int(2) DEFAULT NULL,
  `1RV18CS010` int(2) DEFAULT NULL,
  `1RV18CS011` int(2) DEFAULT NULL,
  `1RV18CS012` int(2) DEFAULT NULL,
  `1RV18CS013` int(2) DEFAULT NULL,
  `1RV18CS014` int(2) DEFAULT NULL,
  `1RV18CS015` int(2) DEFAULT NULL,
  `1RV18CS016` int(2) DEFAULT NULL,
  `1RV18CS017` int(2) DEFAULT NULL,
  `1RV18CS018` int(2) DEFAULT NULL,
  `1RV18CS019` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `4a_dbms`
--

LOCK TABLES `4a_dbms` WRITE;
/*!40000 ALTER TABLE `4a_dbms` DISABLE KEYS */;
INSERT INTO `4a_dbms` VALUES ('2019-04-04',1,1,1,1,1,1,1,1,1,1,1,1);
/*!40000 ALTER TABLE `4a_dbms` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `4a_ns`
--

DROP TABLE IF EXISTS `4a_ns`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `4a_ns` (
  `date` varchar(10) DEFAULT NULL,
  `1RV18CS008` int(2) DEFAULT NULL,
  `1RV18CS009` int(2) DEFAULT NULL,
  `1RV18CS010` int(2) DEFAULT NULL,
  `1RV18CS011` int(2) DEFAULT NULL,
  `1RV18CS012` int(2) DEFAULT NULL,
  `1RV18CS013` int(2) DEFAULT NULL,
  `1RV18CS014` int(2) DEFAULT NULL,
  `1RV18CS015` int(2) DEFAULT NULL,
  `1RV18CS016` int(2) DEFAULT NULL,
  `1RV18CS017` int(2) DEFAULT NULL,
  `1RV18CS018` int(2) DEFAULT NULL,
  `1RV18CS019` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `4a_ns`
--

LOCK TABLES `4a_ns` WRITE;
/*!40000 ALTER TABLE `4a_ns` DISABLE KEYS */;
/*!40000 ALTER TABLE `4a_ns` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `4a_se`
--

DROP TABLE IF EXISTS `4a_se`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `4a_se` (
  `date` varchar(10) DEFAULT NULL,
  `1RV18CS008` int(2) DEFAULT NULL,
  `1RV18CS009` int(2) DEFAULT NULL,
  `1RV18CS010` int(2) DEFAULT NULL,
  `1RV18CS011` int(2) DEFAULT NULL,
  `1RV18CS012` int(2) DEFAULT NULL,
  `1RV18CS013` int(2) DEFAULT NULL,
  `1RV18CS014` int(2) DEFAULT NULL,
  `1RV18CS015` int(2) DEFAULT NULL,
  `1RV18CS016` int(2) DEFAULT NULL,
  `1RV18CS017` int(2) DEFAULT NULL,
  `1RV18CS018` int(2) DEFAULT NULL,
  `1RV18CS019` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `4a_se`
--

LOCK TABLES `4a_se` WRITE;
/*!40000 ALTER TABLE `4a_se` DISABLE KEYS */;
INSERT INTO `4a_se` VALUES ('2019-03-30',1,1,1,1,0,0,0,1,0,1,0,1),('2019-04-01',1,1,1,0,0,0,0,0,0,0,0,0),('2019-04-04',1,1,0,0,0,0,0,0,1,1,1,1),('2019-04-11',1,1,0,0,0,0,0,0,0,0,1,1);
/*!40000 ALTER TABLE `4a_se` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `faculty`
--

DROP TABLE IF EXISTS `faculty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `faculty` (
  `id` int(10) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `sub1` varchar(20) DEFAULT NULL,
  `sub2` varchar(20) DEFAULT NULL,
  `sub3` varchar(20) DEFAULT NULL,
  `class1` varchar(2) DEFAULT NULL,
  `class2` varchar(2) DEFAULT NULL,
  `class3` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `faculty`
--

LOCK TABLES `faculty` WRITE;
/*!40000 ALTER TABLE `faculty` DISABLE KEYS */;
INSERT INTO `faculty` VALUES (1,'Prasad','123','os','se','java','3a','4a','3a'),(2,'Yusuf','123','gt','ns','daa','3a','4a','3a'),(3,'satish','123','se','os','gt','4a','3a','3a'),(4,'Ponnuswamy','123','se','java','os','4a','3a','3a'),(9,'Dummy','123','os','se','java','3a','4a','3a'),(99,'ui','123','java','ns','daa','3a','4a','3a'),(121,'john','123','os','se','java','3a','4a','3a'),(123456,'nandish','123','java','se','dbms','3a','4a','4a'),(12345678,'dennis','1234','java','os','se','3a','3a','4a');
/*!40000 ALTER TABLE `faculty` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `student` (
  `usn` varchar(20) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `phone_no` int(10) DEFAULT NULL,
  `class` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`usn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES ('1RV18CS001','John',87253672,'3a'),('1RV18CS002','Joseph',84893847,'3a'),('1RV18CS003','Alan',73847828,'3a'),('1RV18CS004','Chandler',836455367,'3a'),('1RV18CS005','Ross',984756738,'3a'),('1RV18CS006','Dave',847489384,'3a'),('1RV18CS007','Rachel',874838749,'3a'),('1RV18CS008','Buckey',948475839,'4a'),('1RV18CS009','David',837498739,'4a'),('1RV18CS010','Shawn',784657837,'4a'),('1RV18CS011','Ron',874875837,'4a'),('1RV18CS012','Lois',784658938,'4a'),('1RV18CS013','Peter',834729387,'4a'),('1RV18CS014','Felix',838498938,'4a'),('1RV18CS015','Joey',784728784,'4a'),('1RV18CS016','Matt',765898394,'4a'),('1RV18CS017','Pheobe',849584759,'4a'),('1RV18CS018','Regina',893948758,'4a'),('1RV18CS019','Perry',872348923,'4a');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-13 10:07:35
