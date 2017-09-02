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
  `price` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`items_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

/*Data for the table `items` */

insert  into `items`(`items_id`,`items_name`,`price`) values (10,'iphone4','1000'),(11,'iphone5','2000'),(12,'iphone5s','1500'),(13,'iphone6','3000'),(14,'vivoX7','3000'),(15,'华为荣耀9','3000');

/*Table structure for table `orders` */

DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
  `orders_id` int(11) NOT NULL AUTO_INCREMENT,
  `count` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`orders_id`),
  KEY `FK_orders` (`user_id`),
  CONSTRAINT `FK_orders` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `orders` */

insert  into `orders`(`orders_id`,`count`,`status`,`user_id`) values (1,2,1,1),(2,2,0,2),(3,3,0,3);

/*Table structure for table `orders_items_relation` */

DROP TABLE IF EXISTS `orders_items_relation`;

CREATE TABLE `orders_items_relation` (
  `orders_id` int(11) DEFAULT NULL,
  `items_id` int(11) DEFAULT NULL,
  KEY `FK_orders_items_relation1` (`orders_id`),
  KEY `FK_orders_items_relation2` (`items_id`),
  CONSTRAINT `FK_orders_items_relation2` FOREIGN KEY (`items_id`) REFERENCES `items` (`items_id`),
  CONSTRAINT `FK_orders_items_relation1` FOREIGN KEY (`orders_id`) REFERENCES `orders` (`orders_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `orders_items_relation` */

insert  into `orders_items_relation`(`orders_id`,`items_id`) values (1,11),(1,12),(2,13),(2,14),(3,15),(3,13),(3,14);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`user_id`,`username`,`age`,`password`) values (1,'张三丰',90,'111111'),(2,'张无忌',30,'222222'),(3,'张翠山',50,'111111');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
