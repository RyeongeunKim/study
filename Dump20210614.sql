-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: model2
-- ------------------------------------------------------
-- Server version	5.7.33-log

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
-- Table structure for table `itwill_basket`
--

DROP TABLE IF EXISTS `itwill_basket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `itwill_basket` (
  `b_num` int(11) NOT NULL,
  `b_m_id` varchar(50) DEFAULT NULL,
  `b_g_num` int(11) DEFAULT NULL,
  `b_g_amount` int(11) DEFAULT NULL,
  `b_g_size` varchar(45) DEFAULT NULL,
  `b_g_color` varchar(45) DEFAULT NULL,
  `b_date` date DEFAULT NULL,
  PRIMARY KEY (`b_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itwill_basket`
--

LOCK TABLES `itwill_basket` WRITE;
/*!40000 ALTER TABLE `itwill_basket` DISABLE KEYS */;
/*!40000 ALTER TABLE `itwill_basket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `itwill_goods`
--

DROP TABLE IF EXISTS `itwill_goods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `itwill_goods` (
  `num` int(11) NOT NULL,
  `category` varchar(100) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `content` varchar(1000) DEFAULT NULL,
  `size` varchar(45) DEFAULT NULL,
  `color` varchar(45) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `image` varchar(1000) DEFAULT NULL,
  `best` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itwill_goods`
--

LOCK TABLES `itwill_goods` WRITE;
/*!40000 ALTER TABLE `itwill_goods` DISABLE KEYS */;
INSERT INTO `itwill_goods` VALUES (1,'outwear','트렌치코드','상품정보','S','brown',18,30000,'cafeteria1.jpg,null,null,null',1,'2021-06-03'),(4,'outwear','가디건','상품정보','S','blue',18,20000,'cafeteria1.jpg,null,null,null',0,'2021-06-03'),(5,'fulldress','정장','상품정보','M','black',20,50000,'cafeteria2.jpg,null,null,null',0,'2021-06-03'),(6,'Tshirts','맨투맨','상품정보','L','gray',18,30000,'office2.jpg,null,null,null',1,'2021-06-03'),(7,'pants','청바지','상품정보','S','sky',19,30000,'office1.jpg,null,null,null',0,'2021-06-03'),(8,'shirts','셔츠','상품정보','S','stripe',19,20000,'main2.jpg,null,null,null',1,'2021-06-03'),(9,'fulldress','정장','상품정보','S','blue',20,100000,'main3.jpg,null,null,null',0,'2021-06-03'),(10,'Tshirts','기본티','상품정보','S','white',20,15000,'office21.jpg,null,null,null',0,'2021-06-03'),(11,'shoes','운동화','상품정보','235','yellow',10,70000,'office11.jpg,null,null,null',0,'2021-06-03'),(12,'outwear','요요','상품정보','S','white',20,20000,'null,null,null,null',0,'2021-06-14');
/*!40000 ALTER TABLE `itwill_goods` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `itwill_member`
--

DROP TABLE IF EXISTS `itwill_member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `itwill_member` (
  `id` varchar(50) NOT NULL,
  `pass` varchar(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `email` varchar(200) NOT NULL,
  `reg_date` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itwill_member`
--

LOCK TABLES `itwill_member` WRITE;
/*!40000 ALTER TABLE `itwill_member` DISABLE KEYS */;
INSERT INTO `itwill_member` VALUES ('aaaa','1234','먀먀',20,'여','aaaa@awda','2021-05-21 05:34:37'),('aaaq','1234','asd',11,'남','ASD@Sasd','2021-05-21 05:34:37'),('admin','1234','요요',22,'여','itwl@naver.com','2021-05-21 02:05:13'),('asasdf','1234','sa',44,'남','2sda@sdad','2021-05-21 05:34:37'),('asd','1234','sa',22,'남','asdas@sadfasd','2021-05-21 05:34:37'),('asdasd','1234','요요',22,'남','loveyoyo@naver.com','2021-05-21 02:06:19'),('ddd','1234','디디',30,'남','ddd@asda','2021-05-21 05:34:37'),('gfff','1234','키키',30,'여','sadf@sadas','2021-05-21 05:34:37'),('gogo','1234','고고',20,'여','gogo@naver.com','2021-06-11 03:54:20'),('loooo','1234','로로',49,'여','looo@adad','2021-05-21 05:34:37'),('qoqo','1234','배배',11,'남','qoqo@adads','2021-05-21 05:34:37'),('sssss','1234','as',1,'여','asd@sdasd','2021-05-21 05:34:37'),('yoyo','1234','요요',10,'여','uouo@dad','2021-05-21 05:34:37');
/*!40000 ALTER TABLE `itwill_member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `itwill_order`
--

DROP TABLE IF EXISTS `itwill_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `itwill_order` (
  `o_num` int(11) NOT NULL,
  `o_trade_num` varchar(45) DEFAULT NULL,
  `o_g_num` int(11) DEFAULT NULL,
  `o_g_name` varchar(45) DEFAULT NULL,
  `o_g_amount` int(11) DEFAULT NULL,
  `o_g_size` varchar(45) DEFAULT NULL,
  `o_g_color` varchar(45) DEFAULT NULL,
  `o_m_id` varchar(45) DEFAULT NULL,
  `o_receive_name` varchar(45) DEFAULT NULL,
  `o_receive_addr1` varchar(100) DEFAULT NULL,
  `o_receive_addr2` varchar(100) DEFAULT NULL,
  `o_receive_phone` varchar(45) DEFAULT NULL,
  `o_receive_msg` varchar(100) DEFAULT NULL,
  `o_sum_money` int(11) DEFAULT NULL,
  `o_trade_type` varchar(45) DEFAULT NULL,
  `o_trade_payer` varchar(45) DEFAULT NULL,
  `o_trade_date` date DEFAULT NULL,
  `o_trans_num` varchar(100) DEFAULT NULL,
  `o_date` date DEFAULT NULL,
  `o_status` int(11) DEFAULT NULL,
  PRIMARY KEY (`o_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itwill_order`
--

LOCK TABLES `itwill_order` WRITE;
/*!40000 ALTER TABLE `itwill_order` DISABLE KEYS */;
INSERT INTO `itwill_order` VALUES (1,'20210611-1',6,'맨투맨',1,'L','gray','yoyo','요요','부산','아이티윌','01011111111','-',30000,'카카오페이','요요','2021-06-11','운송장번호 예정','2021-06-11',0),(2,'20210611-1',7,'청바지',1,'S','sky','yoyo','요요','부산','아이티윌','01011111111','-',30000,'카카오페이','요요','2021-06-11','운송장번호 예정','2021-06-11',0),(3,'20210614-3',8,'셔츠',1,'S','stripe','yoyo','요요','무직','','0100000000','X',20000,'네이버 페이','요요','2021-06-14','운송장번호 예정','2021-06-14',0),(4,'20210614-4',1,'트렌치코드',1,'S','brown','yoyo','요요','무직','','01023454710','X',30000,'신용카드','요요','2021-06-14','운송장번호 예정','2021-06-14',0);
/*!40000 ALTER TABLE `itwill_order` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-14 19:28:44
