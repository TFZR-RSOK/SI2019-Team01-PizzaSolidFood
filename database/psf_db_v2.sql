-- MySQL dump 10.13  Distrib 5.7.25, for Win64 (x86_64)
--
-- Host: localhost    Database: psf_db
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `additions`
--

DROP TABLE IF EXISTS `additions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `additions` (
  `ID_ADD` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `ADD_NAME` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ADD_PRICE` double(5,2) NOT NULL,
  PRIMARY KEY (`ID_ADD`),
  UNIQUE KEY `ID_ADD` (`ID_ADD`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `additions`
--

LOCK TABLES `additions` WRITE;
/*!40000 ALTER TABLE `additions` DISABLE KEYS */;
/*!40000 ALTER TABLE `additions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `ID_ORDERS` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `ID_USERS` bigint(20) unsigned NOT NULL,
  `ID_PRODUCTS` bigint(20) unsigned NOT NULL,
  `QUANTITY` tinyint(3) unsigned NOT NULL,
  `ORDER_PRICE` double(8,2) NOT NULL,
  `DATE_TIME` datetime NOT NULL,
  `DELIVERY_TYPE` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
  `PAYMENT` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ID_ADDITIONS` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`ID_ORDERS`),
  UNIQUE KEY `ID_ORDERS` (`ID_ORDERS`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `products` (
  `ID_PROD` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `PROD_NAME` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `PROD_PRICE` double(7,2) NOT NULL,
  `PROD_SIZE` tinyint(3) unsigned NOT NULL,
  `PROD_DESCRIPTION` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `IMAGE` varchar(420) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`ID_PROD`),
  UNIQUE KEY `ID_PROD` (`ID_PROD`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `USER_NAME` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `USER_LASTNAME` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ID_USER` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `EMAIL` varchar(254) COLLATE utf8mb4_unicode_ci NOT NULL,
  `USER_TYPE` tinyint(3) unsigned NOT NULL,
  `ADDRESS` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `POINTS` smallint(5) unsigned NOT NULL,
  `MONTLY_ORDERS` smallint(5) unsigned DEFAULT NULL,
  PRIMARY KEY (`ID_USER`),
  UNIQUE KEY `ID_USER` (`ID_USER`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'psf_db'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-30 17:38:10
