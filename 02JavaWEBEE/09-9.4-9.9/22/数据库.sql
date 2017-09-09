/*
SQLyog Ultimate v8.32 
MySQL - 5.5.5-m3 : Database - taobao
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`taobao` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `taobao`;

/*Table structure for table `items` */

DROP TABLE IF EXISTS `items`;

CREATE TABLE `items` (
  `items_id` int(11) NOT NULL AUTO_INCREMENT,
  `items_name` varchar(50) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `add_time` datetime DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`items_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

/*Data for the table `items` */

insert  into `items`(`items_id`,`items_name`,`price`,`add_time`,`url`) values (10,'iphone4',100,'2017-09-08 00:00:00',NULL),(11,'iphone5',2000,NULL,NULL),(12,'iphone5s',2000,NULL,NULL),(13,'iphone6',3000,NULL,NULL),(14,'oppo',3000000,NULL,NULL),(15,'vivo',3000,NULL,'/pic/0aba80b3-53ed-4690-a55b-dc079389142c.jpg'),(16,'fdsfsdf',333,NULL,'/pic/cc88fc59-eb68-4b9b-9d3c-04ae20ffcc60.jpg'),(17,'23',123,NULL,'/pic/b6c73662-cd91-4214-9d53-6a049f67a6be.jpg');

/*Table structure for table `orders` */

DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
  `orders_id` int(11) NOT NULL AUTO_INCREMENT,
  `count` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `post_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`orders_id`),
  KEY `FK_orders` (`user_id`),
  KEY `FK_orders111` (`post_id`),
  CONSTRAINT `FK_orders111` FOREIGN KEY (`post_id`) REFERENCES `post` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `orders` */

insert  into `orders`(`orders_id`,`count`,`status`,`user_id`,`post_id`) values (1,2,1,1,1),(2,2,0,2,NULL),(3,3,0,3,NULL),(4,2,1,3,1),(6,3,1,1,1),(7,2,1,1,NULL),(8,2,1,1,1),(9,2,1,3,2);

/*Table structure for table `orders_items_relation` */

DROP TABLE IF EXISTS `orders_items_relation`;

CREATE TABLE `orders_items_relation` (
  `orders_id` int(11) DEFAULT NULL,
  `items_id` int(11) DEFAULT NULL,
  KEY `FK_orders_items_relation1` (`orders_id`),
  KEY `FK_orders_items_relation2` (`items_id`),
  CONSTRAINT `FK_orders_items_relation1` FOREIGN KEY (`orders_id`) REFERENCES `orders` (`orders_id`),
  CONSTRAINT `FK_orders_items_relation2` FOREIGN KEY (`items_id`) REFERENCES `items` (`items_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `orders_items_relation` */

insert  into `orders_items_relation`(`orders_id`,`items_id`) values (1,11),(1,12),(2,13),(3,13),(6,10),(6,11),(6,12),(7,12),(7,13),(8,10),(8,11),(9,10),(9,11);

/*Table structure for table `post` */

DROP TABLE IF EXISTS `post`;

CREATE TABLE `post` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `post_name` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_post` (`user_id`),
  CONSTRAINT `FK_post` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `post` */

insert  into `post`(`id`,`post_name`,`address`,`phone`,`user_id`) values (1,'李四','sad撒多','243242',1),(2,'sadsad',NULL,NULL,3),(4,'ada',NULL,NULL,4);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`user_id`,`username`,`age`,`password`) values (1,'admin',40,'111111'),(3,'张翠山',50,'111111'),(4,'张三',60,'11111'),(5,'李四',23,''),(7,'张三',20,'111'),(8,'张三',20,'111'),(9,'王二麻',10,'');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
