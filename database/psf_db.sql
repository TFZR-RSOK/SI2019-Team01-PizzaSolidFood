-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: psf_db
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
-- Table structure for table `additions`
--

DROP TABLE IF EXISTS `additions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `additions` (
  `ID_ADD` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `ADD_NAME` varchar(100) NOT NULL,
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
 SET character_set_client = utf8mb4 ;
CREATE TABLE `orders` (
  `ID_ORDERS` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `ID_USERS` bigint(20) unsigned NOT NULL,
  `ID_PRODUCTS` bigint(20) unsigned NOT NULL,
  `QUANTITY` tinyint(3) unsigned NOT NULL,
  `ORDER_PRICE` double(8,2) NOT NULL,
  `DATE_TIME` datetime NOT NULL,
  `DELIVERY_TYPE` varchar(250) NOT NULL,
  `PAYMENT` varchar(250) NOT NULL,
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
 SET character_set_client = utf8mb4 ;
CREATE TABLE `products` (
  `ID_PROD` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `PROD_NAME` varchar(100) NOT NULL,
  `PROD_PRICE` double(7,2) NOT NULL,
  `PROD_SIZE` tinyint(3) unsigned NOT NULL,
  `PROD_DESCRIPTION` text NOT NULL,
  `IMAGE` varchar(420) NOT NULL,
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
 SET character_set_client = utf8mb4 ;
CREATE TABLE `users` (
  `USER_NAME` varchar(100) NOT NULL,
  `USER_LASTNAME` varchar(200) NOT NULL,
  `ID_USER` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `TOKEN` varchar(256) NOT NULL,
  `EMAIL` varchar(254) DEFAULT NULL,
  `USER_TYPE` tinyint(3) unsigned NOT NULL,
  `ADDRESS` varchar(500) NOT NULL,
  `POINTS` smallint unsigned NOT NULL,
  PRIMARY KEY (`ID_USER`),
  UNIQUE KEY `ID_USER` (`ID_USER`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
CREATE INDEX user_index ON `users` (`POINTS`,`EMAIL`);
--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
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

-- Dump completed on 2019-03-21 16:30:41


INSERT INTO products (PROD_NAME, PROD_PRICE, PROD_SIZE, PROD_DESCRIPTION, IMAGE)
VALUES ('Napoletana','12.35','100','mozzarella cheese, baked ham, mushroom, artichoke and tomato and pizza pugliese, prepared with tomato, mozzarella and onions','image01');

INSERT INTO products (PROD_NAME, PROD_PRICE, PROD_SIZE, PROD_DESCRIPTION, IMAGE)
VALUES ('Margherita','15.99','100','San Marzano tomatoes, mozzarella fior di latte, fresh basil, salt and extra-virgin olive oil','image02');

INSERT INTO products (PROD_NAME, PROD_PRICE, PROD_SIZE, PROD_DESCRIPTION, IMAGE)
VALUES ('Quattro stagioni','20.99','100','artichokes, tomatoes or basil, mushrooms and ham or prosciutto, or olives','image03');

INSERT INTO users (USER_NAME, USER_LASTNAME, TOKEN, EMAIL, USER_TYPE, ADDRESS, POINTS)
VALUES ('Elijah','Agbabah','token','ilijah.agbabah@tfzr.rs','2','Jovana Popovica 29','69');

INSERT INTO users (USER_NAME, USER_LASTNAME, TOKEN, EMAIL, USER_TYPE, ADDRESS, POINTS)
VALUES ('Nikolah','Turudijah','token','nikolah.turudijah@tfzr.rs','1','dorm','911');

INSERT INTO users (USER_NAME, USER_LASTNAME, TOKEN, EMAIL, USER_TYPE, ADDRESS, POINTS)
VALUES ('Mihalh','Kristianh','token','mihalah.kristianh@tfzr.rs','0','across the street of faculty','0');

INSERT INTO additions (ADD_NAME, ADD_PRICE)
VALUES ('Bacon','0.50');

INSERT INTO additions (ADD_NAME, ADD_PRICE)
VALUES ('Cheese','0.25');

INSERT INTO additions (ADD_NAME, ADD_PRICE)
VALUES ('Mushroom','0.75');

INSERT INTO orders (ID_USERS, ID_PRODUCTS, QUANTITY, ORDER_PRICE, DATE_TIME, DELIVERY_TYPE, PAYMENT, ID_ADDITIONS)
VALUES ('1','1','2','100.00','2019-08-12 12:00:00','Bex','paypal','1');

INSERT INTO orders (ID_USERS, ID_PRODUCTS, QUANTITY, ORDER_PRICE, DATE_TIME, DELIVERY_TYPE, PAYMENT, ID_ADDITIONS)
VALUES ('2','2','3','120.00','2019-06-15 14:30:00','Bex','cash on delivery','3');

INSERT INTO orders (ID_USERS, ID_PRODUCTS, QUANTITY, ORDER_PRICE, DATE_TIME, DELIVERY_TYPE, PAYMENT, ID_ADDITIONS)
VALUES ('3','3','1','50.00','2020-01-01 1:00:00','on foot','cash','2');