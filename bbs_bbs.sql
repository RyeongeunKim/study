-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: bbs
-- ------------------------------------------------------
-- Server version	5.7.34-log

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
-- Table structure for table `bbs`
--

DROP TABLE IF EXISTS `bbs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bbs` (
  `bbsID` int(11) NOT NULL,
  `bbsTitle` varchar(50) DEFAULT NULL,
  `userID` varchar(20) DEFAULT NULL,
  `bbsDate` datetime DEFAULT NULL,
  `bbsContent` varchar(2048) DEFAULT NULL,
  `bbsAvailable` int(11) DEFAULT NULL,
  `filename` varchar(200) DEFAULT NULL,
  `oFileName` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`bbsID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bbs`
--

LOCK TABLES `bbs` WRITE;
/*!40000 ALTER TABLE `bbs` DISABLE KEYS */;
INSERT INTO `bbs` VALUES (1,'안녕하세요',NULL,'2021-05-18 12:02:48','반갑습니다',1,NULL,NULL),(2,'시간',NULL,'2021-05-18 12:04:51','뭐지',1,NULL,NULL),(3,' 하이',NULL,'2021-05-18 12:05:32','헬로우',1,NULL,NULL),(4,'흠',NULL,'2021-05-18 12:06:17','뭐지',1,NULL,NULL),(5,'안녕하세요','yoyo','2021-05-18 12:43:42','하이요',0,NULL,NULL),(6,'asda','yoyo','2021-05-18 13:00:44','asf',0,NULL,NULL),(7,'sadad','yoyo','2021-05-18 13:00:55','awrawr',0,NULL,NULL),(8,'ADDㅇㅁㅇ','yoyo','2021-05-18 13:01:03','ASFASF',0,NULL,NULL),(9,'DSAF','yoyo','2021-05-18 13:01:11','SDAF',0,NULL,NULL),(10,'SFAF','yoyo','2021-05-18 13:01:19','ASFAF',0,NULL,NULL),(11,'SDAFA','yoyo','2021-05-18 13:01:27','AFAFA',0,NULL,NULL),(12,'수정','yoyo','2021-05-18 13:58:30','safagaf',0,NULL,NULL),(13,'dfSD','gogo','2021-05-18 17:35:46','##ADAF',1,NULL,NULL),(14,'asdnalsdnl','gogo','2021-05-18 17:36:19','ㅁㄴ룸뢔ㅜㅁㄴㅊ미//$$ㅁㄹㄴ<.\r\nㄷㄹ제ㅐㄷ서    마대ㅓㅈ데ㅐ',1,NULL,NULL),(15,'<script>alert(\'Hellow World\');</script>','gogo','2021-05-18 17:45:24','h',1,NULL,NULL),(16,'ㅇㅇㅇㄴㅁㅇㅁㅇㄴㅁㄴㅇㅁㅇㄴㅁㄴㅇㅁㄴㅇㅁㄴㅇ','yoyo','2021-05-18 19:01:04','ㅁㅇㅁㄻㄴㄻㅎㅈㄷㅅㄷㅈㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱ',0,NULL,NULL),(17,'dadad','yoyo','2021-05-19 13:45:05','dsadad',1,NULL,NULL),(18,'뭐지','yoyo','2021-05-21 18:32:54','??',0,NULL,NULL),(19,'테스트','yoyo','2021-05-21 20:51:38','123',1,NULL,NULL),(20,'ㅠㅠ','yoyo','2021-05-21 20:56:08','ㅠㅠ',1,NULL,NULL),(21,'슬프다','yoyo','2021-05-21 20:56:18','ㅜㅜ',1,NULL,NULL),(22,'ㅁㄻ','yoyo','2021-05-21 22:04:24','ㄻㄻ',1,NULL,NULL),(23,'adada','aoao','2021-05-22 13:46:16','dadasd',1,NULL,NULL),(24,'assad','yoyo','2021-05-22 22:19:59','asdasd',0,NULL,NULL),(25,'qwdqdw','yoyo','2021-05-23 12:34:07','qdqdqw',1,NULL,NULL),(26,'fsfd','sss','2021-05-23 21:37:53','sfs',0,NULL,NULL),(27,'asdasd','yoyo','2021-05-23 22:03:33','asdasd',1,NULL,NULL),(28,'제목','yoyo','2021-05-23 22:05:39','dasdad',1,NULL,NULL),(29,'제목','yoyo','2021-05-24 20:02:46','da',1,NULL,NULL),(30,'제목','yoyo','2021-05-24 20:17:43','ASD',1,NULL,NULL),(31,'제목','yoyo','2021-05-24 20:49:54','ASD',1,NULL,NULL),(32,'제목','yoyo','2021-05-24 20:50:58','테스트',1,NULL,NULL),(33,'제목','yoyo','2021-05-24 20:53:04','ㄴㄴㄴ',1,NULL,NULL),(34,'제목','yoyo','2021-05-24 20:55:56','ㅇㅇ',1,NULL,NULL),(35,'제목','yoyo','2021-05-24 20:56:36','ㄴㄴ',1,NULL,NULL),(36,'제목','yoyo','2021-05-24 22:07:35','asdad',1,NULL,NULL),(37,'제목','yoyo','2021-05-24 22:20:51','zxz',1,NULL,NULL),(38,'ads','yoyo','2021-05-25 11:49:53','asd',1,'board.png','board.png'),(39,'asdads','yoyo','2021-05-25 12:06:54','asdasd',1,'board43.png','board4.png'),(40,'파일','yoyo','2021-05-25 12:14:26','asdasd',1,NULL,NULL),(41,'파일','yoyo','2021-05-25 12:14:34','ㅁㄴㅇ',1,'board44.png','board4.png'),(42,'ㅁㄴㅇ','yoyo','2021-05-25 12:20:17','',1,NULL,NULL),(43,'테스트','yoyo','2021-05-25 12:21:41','ㅁㄴㅇ',1,'board46.png','board4.png'),(45,'asd','yoyo','2021-05-25 12:29:57','asd',1,NULL,NULL),(46,NULL,'yoyo','2021-05-25 12:30:03',NULL,1,NULL,NULL);
/*!40000 ALTER TABLE `bbs` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-25 18:28:58
