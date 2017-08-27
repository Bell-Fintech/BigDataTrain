/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50539
Source Host           : localhost:3306
Source Database       : eems

Target Server Type    : MYSQL
Target Server Version : 50539
File Encoding         : 65001

Date: 2017-08-26 18:41:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `equipment`
-- ----------------------------
DROP TABLE IF EXISTS `equipment`;
CREATE TABLE `equipment` (
  `equipmentNo` int(11) NOT NULL,
  `equipmentName` varchar(50) DEFAULT NULL,
  `person` varchar(50) DEFAULT NULL,
  `equipmentTypeId` int(11) DEFAULT NULL,
  `equipmentStatusId` int(11) DEFAULT NULL,
  `isScrapId` int(11) DEFAULT NULL,
  PRIMARY KEY (`equipmentNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of equipment
-- ----------------------------
INSERT INTO `equipment` VALUES ('4', 'D', '李珂', '1', '1', '1');
INSERT INTO `equipment` VALUES ('5', 'E', '孙云栋', '2', '2', '1');
INSERT INTO `equipment` VALUES ('6', 'F', '张晨', '1', '1', '1');
INSERT INTO `equipment` VALUES ('7', 'G', '李珂', '5', '2', '1');

-- ----------------------------
-- Table structure for `equipmentstatus`
-- ----------------------------
DROP TABLE IF EXISTS `equipmentstatus`;
CREATE TABLE `equipmentstatus` (
  `id` int(11) NOT NULL,
  `value` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of equipmentstatus
-- ----------------------------
INSERT INTO `equipmentstatus` VALUES ('1', '未借出');
INSERT INTO `equipmentstatus` VALUES ('2', '借出');

-- ----------------------------
-- Table structure for `equipmenttype`
-- ----------------------------
DROP TABLE IF EXISTS `equipmenttype`;
CREATE TABLE `equipmenttype` (
  `id` int(11) NOT NULL,
  `type` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of equipmenttype
-- ----------------------------
INSERT INTO `equipmenttype` VALUES ('1', '数学');
INSERT INTO `equipmenttype` VALUES ('2', '物理');
INSERT INTO `equipmenttype` VALUES ('3', '地理');
INSERT INTO `equipmenttype` VALUES ('4', '计算机');
INSERT INTO `equipmenttype` VALUES ('5', '其他');

-- ----------------------------
-- Table structure for `isscrap`
-- ----------------------------
DROP TABLE IF EXISTS `isscrap`;
CREATE TABLE `isscrap` (
  `id` int(11) NOT NULL,
  `value` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of isscrap
-- ----------------------------
INSERT INTO `isscrap` VALUES ('1', '未报废');
INSERT INTO `isscrap` VALUES ('2', '报废');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `name` varchar(30) NOT NULL,
  `pwd` varchar(30) NOT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1514010439', '1111');
INSERT INTO `user` VALUES ('1514011245', '1111');
INSERT INTO `user` VALUES ('1514011307', '1111');
INSERT INTO `user` VALUES ('1514011308', '1111');
