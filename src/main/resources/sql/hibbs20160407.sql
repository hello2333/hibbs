-- MySQL dump 10.13  Distrib 5.7.9, for osx10.9 (x86_64)
--
-- Host: 127.0.0.1    Database: hibbs
-- ------------------------------------------------------
-- Server version	5.7.11

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
-- Table structure for table `addr_city`
--

DROP TABLE IF EXISTS `addr_city`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `addr_city` (
  `city_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `city_name` varchar(20) NOT NULL,
  `pro_id` int(20) unsigned DEFAULT NULL,
  PRIMARY KEY (`city_id`),
  KEY `pro_id` (`pro_id`),
  CONSTRAINT `addr_city_ibfk_1` FOREIGN KEY (`pro_id`) REFERENCES `addr_province` (`province_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `addr_city`
--

LOCK TABLES `addr_city` WRITE;
/*!40000 ALTER TABLE `addr_city` DISABLE KEYS */;
/*!40000 ALTER TABLE `addr_city` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `addr_district`
--

DROP TABLE IF EXISTS `addr_district`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `addr_district` (
  `district_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `dis_name` varchar(20) NOT NULL,
  `city_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`district_id`),
  KEY `city_id` (`city_id`),
  CONSTRAINT `addr_district_ibfk_2` FOREIGN KEY (`city_id`) REFERENCES `addr_city` (`city_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `addr_district`
--

LOCK TABLES `addr_district` WRITE;
/*!40000 ALTER TABLE `addr_district` DISABLE KEYS */;
/*!40000 ALTER TABLE `addr_district` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `addr_province`
--

DROP TABLE IF EXISTS `addr_province`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `addr_province` (
  `province_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `pro_name` varchar(20) NOT NULL,
  PRIMARY KEY (`province_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `addr_province`
--

LOCK TABLES `addr_province` WRITE;
/*!40000 ALTER TABLE `addr_province` DISABLE KEYS */;
/*!40000 ALTER TABLE `addr_province` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `post`
--

DROP TABLE IF EXISTS `post`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `post` (
  `post_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `post_user_id` int(10) unsigned DEFAULT NULL COMMENT '发帖人ID（外键）',
  `post_catg_id` int(10) unsigned DEFAULT NULL COMMENT '帖子ID（外键）',
  `post_title` varchar(50) DEFAULT NULL COMMENT '帖子标题',
  `post_text` text NOT NULL COMMENT '帖子内容（文字部分）',
  `post_time` bigint(10) NOT NULL COMMENT '发帖时间',
  `post_support_count` int(10) DEFAULT '0' COMMENT '点赞人数',
  `post_follow_count` int(10) DEFAULT '0' COMMENT '跟帖人数',
  `post_if_excell` tinyint(1) DEFAULT '0' COMMENT '是否是优质帖子',
  `post_collect_count` int(10) DEFAULT '0' COMMENT '收藏帖子的人数',
  PRIMARY KEY (`post_id`),
  KEY `post_categ_id` (`post_catg_id`),
  KEY `post_ibfk_2` (`post_user_id`),
  CONSTRAINT `post_ibfk_2` FOREIGN KEY (`post_user_id`) REFERENCES `user` (`id`) ON DELETE SET NULL ON UPDATE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `post`
--

LOCK TABLES `post` WRITE;
/*!40000 ALTER TABLE `post` DISABLE KEYS */;
INSERT INTO `post` VALUES (1,1,1,'First Title','First Text',1458877708003,0,0,0,0),(2,1,1,'First Title','First Text',1458884526750,0,0,0,0),(3,1,1,'First Title','First Text',1458998305736,0,0,0,0);
/*!40000 ALTER TABLE `post` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `post_catg`
--

DROP TABLE IF EXISTS `post_catg`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `post_catg` (
  `post_catg_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `post_catg_name` varchar(50) NOT NULL COMMENT '帖子类别名字',
  PRIMARY KEY (`post_catg_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `post_catg`
--

LOCK TABLES `post_catg` WRITE;
/*!40000 ALTER TABLE `post_catg` DISABLE KEYS */;
INSERT INTO `post_catg` VALUES (1,'testCatg');
/*!40000 ALTER TABLE `post_catg` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `post_comment`
--

DROP TABLE IF EXISTS `post_comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `post_comment` (
  `post_comm_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `post_follw_id` int(10) unsigned DEFAULT NULL COMMENT '评论所属跟帖ID（外键）',
  `comm_user_id` int(10) unsigned DEFAULT NULL COMMENT '评论人ID（外键）',
  `comm_user2_id` varchar(45) DEFAULT NULL,
  `comm_text` text NOT NULL COMMENT '评论内容',
  `comm_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '评论时间',
  `comm_reply_count` int(10) DEFAULT '0' COMMENT '回复评论的人数',
  `comm_state` tinyint(1) DEFAULT '0' COMMENT '评论已读未读的状态',
  `comm_floor` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`post_comm_id`),
  KEY `post_follw_id` (`post_follw_id`),
  KEY `post_eval_user_id` (`comm_user_id`),
  CONSTRAINT `post_comment_ibfk_1` FOREIGN KEY (`post_follw_id`) REFERENCES `post_follow` (`post_follow_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `post_comment_ibfk_2` FOREIGN KEY (`comm_user_id`) REFERENCES `user` (`id`) ON DELETE SET NULL ON UPDATE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `post_comment`
--

LOCK TABLES `post_comment` WRITE;
/*!40000 ALTER TABLE `post_comment` DISABLE KEYS */;
/*!40000 ALTER TABLE `post_comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `post_follow`
--

DROP TABLE IF EXISTS `post_follow`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `post_follow` (
  `post_follow_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `post_id` int(10) unsigned DEFAULT NULL COMMENT '跟帖所属帖子ID（外键）',
  `follw_text` text NOT NULL COMMENT '跟帖内容',
  `follw_user_id` int(10) unsigned DEFAULT NULL COMMENT '跟帖人ID（外键）',
  `follw_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '跟帖时间',
  `follw_suppr_count` int(10) DEFAULT '0' COMMENT '点赞数',
  `follw_comm_count` int(10) DEFAULT '0' COMMENT '评论数',
  `follw_state` tinyint(1) DEFAULT '0' COMMENT '跟帖状态：是否被读',
  PRIMARY KEY (`post_follow_id`),
  KEY `post_id` (`post_id`),
  KEY `follw_user_id` (`follw_user_id`),
  CONSTRAINT `post_follow_ibfk_1` FOREIGN KEY (`post_id`) REFERENCES `post` (`post_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `post_follow_ibfk_2` FOREIGN KEY (`follw_user_id`) REFERENCES `user` (`id`) ON DELETE SET NULL ON UPDATE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `post_follow`
--

LOCK TABLES `post_follow` WRITE;
/*!40000 ALTER TABLE `post_follow` DISABLE KEYS */;
/*!40000 ALTER TABLE `post_follow` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `post_follow_pic`
--

DROP TABLE IF EXISTS `post_follow_pic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `post_follow_pic` (
  `post_follow_pic_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `follw_id` int(10) unsigned DEFAULT NULL COMMENT '图片所属跟帖ID（外键）',
  `follw_url` text NOT NULL COMMENT '跟帖图片',
  PRIMARY KEY (`post_follow_pic_id`),
  KEY `follw_id` (`follw_id`),
  CONSTRAINT `post_follow_pic_ibfk_1` FOREIGN KEY (`follw_id`) REFERENCES `post_follow` (`post_follow_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `post_follow_pic`
--

LOCK TABLES `post_follow_pic` WRITE;
/*!40000 ALTER TABLE `post_follow_pic` DISABLE KEYS */;
/*!40000 ALTER TABLE `post_follow_pic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `post_pic`
--

DROP TABLE IF EXISTS `post_pic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `post_pic` (
  `post_pic_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `post_id` int(10) unsigned DEFAULT NULL COMMENT '图片所属帖子（外键）',
  `post_url` text NOT NULL COMMENT '图片URL即在服务器中的路径',
  PRIMARY KEY (`post_pic_id`),
  KEY `post_id` (`post_id`),
  CONSTRAINT `post_pic_ibfk_1` FOREIGN KEY (`post_id`) REFERENCES `post` (`post_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `post_pic`
--

LOCK TABLES `post_pic` WRITE;
/*!40000 ALTER TABLE `post_pic` DISABLE KEYS */;
/*!40000 ALTER TABLE `post_pic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_like_post`
--

DROP TABLE IF EXISTS `user_like_post`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_like_post` (
  `user_id` int(10) unsigned DEFAULT NULL,
  `post_id` int(10) unsigned DEFAULT NULL,
  KEY `user_id` (`user_id`),
  KEY `post_id` (`post_id`),
  CONSTRAINT `user_like_post_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `user_like_post_ibfk_2` FOREIGN KEY (`post_id`) REFERENCES `post` (`post_id`) ON DELETE SET NULL ON UPDATE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_like_post`
--

LOCK TABLES `user_like_post` WRITE;
/*!40000 ALTER TABLE `user_like_post` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_like_post` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_user`
--

DROP TABLE IF EXISTS `user_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_user` (
  `user_id_1` int(10) unsigned DEFAULT NULL,
  `user_id_2` int(10) unsigned DEFAULT NULL,
  KEY `user_id_1` (`user_id_1`),
  KEY `user_id_2` (`user_id_2`),
  CONSTRAINT `user_user_ibfk_1` FOREIGN KEY (`user_id_1`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `user_user_ibfk_2` FOREIGN KEY (`user_id_2`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_user`
--

LOCK TABLES `user_user` WRITE;
/*!40000 ALTER TABLE `user_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-04-07 18:36:28
