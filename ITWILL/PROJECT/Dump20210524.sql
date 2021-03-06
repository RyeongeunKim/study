-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: jspdb
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
-- Table structure for table `itwill_board`
--

DROP TABLE IF EXISTS `itwill_board`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `itwill_board` (
  `num` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `pass` varchar(100) NOT NULL,
  `subject` varchar(500) NOT NULL,
  `content` varchar(2000) NOT NULL,
  `readcount` int(11) DEFAULT NULL,
  `re_ref` int(11) DEFAULT NULL,
  `re_lev` int(11) DEFAULT NULL,
  `re_seq` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `ip` varchar(45) DEFAULT NULL,
  `file` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itwill_board`
--

LOCK TABLES `itwill_board` WRITE;
/*!40000 ALTER TABLE `itwill_board` DISABLE KEYS */;
INSERT INTO `itwill_board` VALUES (1,'요요사랑','11','테스트','1',0,1,0,0,'2021-04-20','0:0:0:0:0:0:0:1',NULL),(2,'요요사랑','11','테스트','2',1,2,0,0,'2021-04-20','0:0:0:0:0:0:0:1',NULL),(3,'요요사랑','11','테스트','11',0,3,0,0,'2021-04-20','0:0:0:0:0:0:0:1',NULL),(4,'요요','1111','테스트','11',6,4,0,0,'2021-04-22','0:0:0:0:0:0:0:1',NULL),(5,'요요사랑','1234','하이','1234',0,5,0,0,'2021-04-22','0:0:0:0:0:0:0:1',NULL),(6,'요요사랑','1111','요요는','졸귀당',0,6,0,0,'2021-04-22','0:0:0:0:0:0:0:1',NULL),(7,'테스트','1111','테스트','테스트',0,7,0,0,'2021-04-22','0:0:0:0:0:0:0:1',NULL),(8,'하이','1234','헬로우','hello',3,8,0,0,'2021-04-22','0:0:0:0:0:0:0:1',NULL),(9,'9번','1234','뭐지','이게뭐지',6,9,0,0,'2021-04-22','0:0:0:0:0:0:0:1',NULL),(10,'요요','1234','10번','완성',6,10,0,0,'2021-04-22','0:0:0:0:0:0:0:1',NULL),(11,'요요','1234','보고싶다','ㅠㅠ',14,11,0,0,'2021-04-22','0:0:0:0:0:0:0:1',NULL),(12,'요요사랑','1111','[답글]답글1','11',3,11,1,6,'2021-04-29','0:0:0:0:0:0:0:1',NULL),(13,'요요사랑','1111','[답글]답글2','2',0,11,2,7,'2021-04-29','0:0:0:0:0:0:0:1',NULL),(14,'관리자','1111','[답글]답글3','333',0,8,1,1,'2021-04-29','0:0:0:0:0:0:0:1',NULL),(15,'요요','1111','[답글]답글4','dydy',3,11,1,1,'2021-04-29','0:0:0:0:0:0:0:1',NULL),(16,'요요','1111','[답글]답글4-1','11',0,11,2,3,'2021-04-29','0:0:0:0:0:0:0:1',NULL),(17,'요요','1111','[답글]답글4-2','123',1,11,2,2,'2021-04-29','0:0:0:0:0:0:0:1',NULL),(18,'요요','1234','테스트','테스트',3,18,0,0,'2021-05-04','0:0:0:0:0:0:0:1',NULL),(19,'요요사랑','1234','요요야','건강하게 오래 살아라',1,19,0,0,'2021-05-04','0:0:0:0:0:0:0:1','SW공학.hwp'),(20,'asda','sdasd','asd','asd',0,20,0,0,'2021-05-24','0:0:0:0:0:0:0:1',NULL);
/*!40000 ALTER TABLE `itwill_board` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `itwill_member`
--

DROP TABLE IF EXISTS `itwill_member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `itwill_member` (
  `id` varchar(50) NOT NULL,
  `pw` varchar(45) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` varchar(5) DEFAULT NULL,
  `email` varchar(200) NOT NULL,
  `regdate` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itwill_member`
--

LOCK TABLES `itwill_member` WRITE;
/*!40000 ALTER TABLE `itwill_member` DISABLE KEYS */;
INSERT INTO `itwill_member` VALUES ('admin','admin','admin',22,'여','admin@naver.com','2021-04-16 06:09:30'),('sda','asd','safasf',22,'여','lovelykrn@naver.com','2021-04-13 07:21:43'),('user01','1234','홍길동',NULL,'남','hong@naver.com',NULL);
/*!40000 ALTER TABLE `itwill_member` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-24 10:58:10
