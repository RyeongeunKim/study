-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: bbs
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
  `name` varchar(20) NOT NULL,
  `subject` varchar(500) NOT NULL,
  `content` varchar(2000) NOT NULL,
  `filename` varchar(100) DEFAULT NULL,
  `oFileName` varchar(100) DEFAULT NULL,
  `re_ref` int(11) DEFAULT NULL,
  `re_lev` int(11) DEFAULT NULL,
  `re_seq` int(11) DEFAULT NULL,
  PRIMARY KEY (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itwill_board`
--

LOCK TABLES `itwill_board` WRITE;
/*!40000 ALTER TABLE `itwill_board` DISABLE KEYS */;
INSERT INTO `itwill_board` VALUES (1,'요요사랑','테스트','1',NULL,NULL,NULL,NULL,NULL),(2,'요요사랑','테스트','2',NULL,NULL,NULL,NULL,NULL),(3,'요요사랑','테스트','11',NULL,NULL,NULL,NULL,NULL),(4,'요요','테스트','11',NULL,NULL,NULL,NULL,NULL),(5,'요요사랑','하이','1234',NULL,NULL,NULL,NULL,NULL),(6,'요요사랑','요요는','졸귀당',NULL,NULL,NULL,NULL,NULL),(7,'테스트','테스트','테스트',NULL,NULL,NULL,NULL,NULL),(8,'하이','헬로우','hello',NULL,NULL,NULL,NULL,NULL),(9,'9번','뭐지','이게뭐지',NULL,NULL,NULL,NULL,NULL),(10,'요요','10번','완성',NULL,NULL,NULL,NULL,NULL),(11,'요요','보고싶다','ㅠㅠ',NULL,NULL,NULL,NULL,NULL),(12,'요요사랑','[답글]답글1','11',NULL,NULL,NULL,NULL,NULL),(13,'요요사랑','[답글]답글2','2',NULL,NULL,NULL,NULL,NULL),(14,'관리자','[답글]답글3','333',NULL,NULL,NULL,NULL,NULL),(15,'요요','[답글]답글4','dydy',NULL,NULL,NULL,NULL,NULL),(16,'요요','[답글]답글4-1','11',NULL,NULL,NULL,NULL,NULL),(17,'요요','[답글]답글4-2','123',NULL,NULL,NULL,NULL,NULL),(18,'요요','테스트','테스트',NULL,NULL,NULL,NULL,NULL),(19,'요요사랑','요요야','건강하게 오래 살아라','SW공학.hwp',NULL,NULL,NULL,NULL),(20,'asda','asd','aasfafsasfafs',NULL,NULL,NULL,NULL,NULL),(21,'asd','ads','asd','BbsDAO26.java',NULL,NULL,NULL,NULL),(22,'요요','asd','asd',NULL,NULL,NULL,NULL,NULL),(23,'name','subject','oFileName',NULL,NULL,NULL,NULL,NULL),(24,'name','subject','oFileName',NULL,NULL,NULL,NULL,NULL),(25,'name','subject','content','filename','oFileName',NULL,NULL,NULL),(26,'요요','테스트','ㅇㅇ','view3.png','view.png',NULL,NULL,NULL),(27,'ㄴㄴㄴ','ㄴㄴㄴ','ㄴㄴㄴ',NULL,NULL,NULL,NULL,NULL),(28,'ㅇㅇㅇㅇ','ㅇㅇㅇㅇ','ㅇㅇ',NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `itwill_board` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-26 17:48:40
