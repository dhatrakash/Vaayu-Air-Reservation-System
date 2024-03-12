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
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `card_number` varchar(255) DEFAULT NULL,
  `expiry_date` date DEFAULT NULL,
  `name_on_card` varchar(255) DEFAULT NULL,
  `email` varchar(30) NOT NULL,
  `first_name` varchar(30) DEFAULT NULL,
  `last_name` varchar(30) DEFAULT NULL,
  `mobile_no` varchar(15) DEFAULT NULL,
  `password` varchar(300) DEFAULT NULL,
  `status` int NOT NULL,
  `user_role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_6dotkott2kjsp8vw4d0m25fb7` (`email`),
  UNIQUE KEY `UK_ex6i1auqb7k945xilduqambu0` (`card_number`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,NULL,NULL,NULL,'hts@gmail.com',NULL,NULL,NULL,'$2a$10$hKOUjt9Qsgb7XDlOweqnvO./YZnXoJm2ntdNMTU5i4nLOR5S4Oyk.',1,'ADMIN'),(2,NULL,NULL,NULL,'sigh@gmail.com','Ritika','Singh','9011307465','rit123',1,'ADMIN'),(4,'1234567812345678','2030-09-08','ash','a@gmail.com','Rutika','Deshpande','9087654323','ru123',1,'CUSTOMER'),(5,NULL,NULL,NULL,'ag@gmail.com','Aaradhya','Gudhade','9578412635','$2a$12$rvRSfM84J4RFZUS19tI6yO9eK5p/5Keo9.J8U7h4Z34JMeB7VD4oS',1,'CUSTOMER'),(6,NULL,NULL,NULL,'gc@gmail.com','Ganesh','Chavale','9678412635','ganesh',1,'CUSTOMER'),(7,NULL,NULL,NULL,'ad@gmail.com','Aish','Dhatrak','8924239854','$2a$10$MyC5JtWzI206toWZfdR8PeZEZ2Rgbe1jRRtEDwELOvXkQttASU4Zm',1,'ADMIN'),(8,NULL,NULL,NULL,'ad1@gmail.com','Aisha','Dhatrak1','8924238854','$2a$10$dog79fNUUJH/tNAQp2b1TuHsvPk1V3zlQ.Nzk5e6s9RXezJUbm5Xa',1,'ADMIN'),(9,NULL,NULL,NULL,'nita@gmail.com','Nita','Joshi','9405158586','$2a$10$WTW0B1Og67mMb5dLzZ3fv.82Ka1Yf.9TPeLtmNmAVCnbSWZ.rF2Zq',1,'SUPERADMIN'),(10,NULL,NULL,NULL,'ad13@gmail.com','Ankit','Singh','8924238856','$2a$10$xis1uSbdKQUhuxlR0fem8uwACNct5ZQ6PCSKwcWuPbfoGoDZ5IBXe',1,'ADMIN'),(11,NULL,NULL,NULL,'poo@gmail.com','Pooja','Kumar','8924238878','$2a$10$CKrWpxmRxVebY0xQjmKKZ.vgf1QQoiP9RkDMaWBcDYO.uLjoeAnQS',1,'ADMIN'),(12,NULL,NULL,NULL,'neha@gmail.com','Neha','Singh','9558412665','neha',0,'CUSTOMER'),(13,NULL,NULL,NULL,'abhi@gmail.com','abhi','Singh','95584122665','$2a$10$TeLRFHdHhYz.QSPNpBWIQeKG7AvnBaRMpgNeQRFFfuYi/.n/P7D3u',0,'CUSTOMER'),(14,'4565432345678989','2024-06-07','raj','jenny@gmail.com','Jenny','Alexa','95584122655','$2a$10$NwUp3cW0PEIRkpHKNXIrquo0fpX8WT1GOlvPzbMLPATtvnDOY1vg.',0,'CUSTOMER'),(15,NULL,NULL,NULL,'asdfghj@gmail.com','Aman','Kurmi','9043567892','$2a$10$hLlbBEJ56bLe4Gw/Voqlx.TtVLaGKL5j303PsKgqNvZ9pkG5yNxZK',0,'CUSTOMER'),(16,'1234567812345679','2030-10-08','Abhishek','ab@gmail.com','Abhishek','Kumar','9087654324','$2a$12$/QwLqwmSRfg4CL8HhnIjiOgZg/hxv4FbwWscEOGOpIxcZQpZHH3tq',1,'SUPERADMIN'),(17,'1234567887654321','2025-03-08','aman','an@gmail.com','Anant','Deshmukjh','9876542312','$2a$10$2WXTBJh3aZu0rzUgKgHj0.xhs4pi3pAffjmseniLE.NaMYOJvjvbi',0,'CUSTOMER'),(18,'4356786543256789','2025-06-08','avanii','avani@gmail.com','Avani','Advani','9078564312','$2a$10$Gk6opYGNu3TSiy4mScq5zec9gnkatDz091A9b9kA7cxqUIYRaA1xG',0,'CUSTOMER'),(19,'6543456787654323','2025-05-06','radha','ankit@gmail.com','Ankit','Singh','9865342565','$2a$10$oShyRySZe.f5NBGFUHcaIOn8.hKnHDlkaEYHsDFfEcVBL8PhEQqxC',0,'CUSTOMER'),(20,NULL,NULL,NULL,'pratik@gmail.com','Pratik','Banarase','9876452334','$2a$10$LA5TT1B1eY5NpFnJl6r8jOiH4XeZhqVw5JhsX/3/cI6kt3KAtq3qO',0,'CUSTOMER'),(40,NULL,NULL,NULL,'pooja@gmail.com','Pooja','Jaiswal','9077654324','pooja123',1,'SUPERADMIN'),(41,'6545678976543456','2025-09-06','rani','rani@gmail','Rani','Jaiswal','7865432345','$2a$10$nT4OPy5BqEgIwQmFn/KDr.smANmDUfbFi7Js9vsHnTSTX0qZQpwjq',0,'CUSTOMER');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-10 15:11:11
