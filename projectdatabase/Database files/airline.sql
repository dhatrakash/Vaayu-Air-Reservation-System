CREATE DATABASE  IF NOT EXISTS `final` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `final`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: final
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `airline`
--

DROP TABLE IF EXISTS `airline`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `airline` (
  `id` int NOT NULL AUTO_INCREMENT,
  `airline_name` varchar(30) DEFAULT NULL,
  `airline_no` varchar(30) DEFAULT NULL,
  `arrival_date` date DEFAULT NULL,
  `arrival_time` time DEFAULT NULL,
  `available_seats` int NOT NULL,
  `business_fare` double NOT NULL,
  `capacity` int NOT NULL,
  `departure_date` date DEFAULT NULL,
  `departure_time` time DEFAULT NULL,
  `economy_fare` double NOT NULL,
  `from_city` varchar(30) DEFAULT NULL,
  `to_city` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_hwjt1jgtciehh05rs3nv9y0bw` (`airline_no`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `airline`
--

LOCK TABLES `airline` WRITE;
/*!40000 ALTER TABLE `airline` DISABLE KEYS */;
INSERT INTO `airline` VALUES (3,'kingfisher','k123','2023-04-09','09:12:12',16,5000,30,'2023-04-08','10:23:09',4000,'Mumbai','pune'),(4,'Indigo','4','2023-05-09','11:12:13',28,4000,28,'2023-05-08','10:12:13',2000,'Banglore','Pune'),(5,'Spicejet','Sp123','2023-03-11','14:14:14',30,5000,30,'2023-03-11','12:12:12',3000,'Mumbai','Goa'),(17,'Spicejet','Sp124','2023-11-03','13:13:13',30,7000,30,'2023-11-03','12:12:12',5998,'Mumbai','Goa'),(18,'kingfisher','k12','2023-03-12','10:10:10',30,9000,30,'2023-03-12','07:07:07',7000,'Pune','Goa'),(19,'Spicejet','sp56','2023-03-12','12:12:12',30,10000,30,'2023-03-12','10:10:10',9000,'Pune','Goa'),(20,'Indigo','i12','2023-03-13','10:10:10',29,12000,30,'2023-03-13','08:08:08',10000,'Delhi','Nanded'),(21,'Spicejet','sp78','2023-03-13','10:10:10',30,7000,30,'2023-03-13','07:07:07',3000,'Delhi','Nanded'),(22,'india','in12','2023-03-14','09:09:38',60,5000,60,'2023-03-14','07:06:09',3000,'Pune','Delhi');
/*!40000 ALTER TABLE `airline` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-10 15:09:40
