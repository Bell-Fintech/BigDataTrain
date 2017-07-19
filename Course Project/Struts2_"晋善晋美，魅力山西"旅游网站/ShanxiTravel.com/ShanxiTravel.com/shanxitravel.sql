/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50537
Source Host           : localhost:3306
Source Database       : shanxitravel

Target Server Type    : MYSQL
Target Server Version : 50537
File Encoding         : 65001

Date: 2016-12-22 12:38:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `counthit`
-- ----------------------------
DROP TABLE IF EXISTS `counthit`;
CREATE TABLE `counthit` (
  `spotName` varchar(100) COLLATE utf8_bin NOT NULL,
  `aHitCount` int(11) DEFAULT '0',
  `mainspotId` varchar(32) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of counthit
-- ----------------------------
INSERT INTO `counthit` VALUES ('云冈石窟--中国四大石窟之一', '6', '');
INSERT INTO `counthit` VALUES ('五台山--中国最早，时间最大佛教道场', '4', '');
INSERT INTO `counthit` VALUES ('平遥古城--国家5A级景区', '2', '');

-- ----------------------------
-- Table structure for `images`
-- ----------------------------
DROP TABLE IF EXISTS `images`;
CREATE TABLE `images` (
  `id` varchar(32) NOT NULL,
  `name` varchar(32) NOT NULL,
  `path` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of images
-- ----------------------------
INSERT INTO `images` VALUES ('10', '壶口瀑布.jpeg', '/Users/Zd/Downloads/uploadRealFile/');
INSERT INTO `images` VALUES ('12', '2.jpg', '/Users/Zd/Downloads/uploadRealFile/');
INSERT INTO `images` VALUES ('3', '3.jpg', '/Users/Zd/Downloads/uploadRealFile/');
INSERT INTO `images` VALUES ('4', '3.jpg', '/Users/Zd/Downloads/uploadRealFile/');
INSERT INTO `images` VALUES ('5', 'java.jpg', '/Users/Zd/Downloads/uploadRealFile/');
INSERT INTO `images` VALUES ('6', '1.jpg', '/Users/Zd/Downloads/uploadRealFile/');
INSERT INTO `images` VALUES ('7', '1.jpg', '/Users/Zd/Downloads/uploadRealFile/');
INSERT INTO `images` VALUES ('8', '1.jpg', '/Users/Zd/Downloads/uploadRealFile/');
INSERT INTO `images` VALUES ('9', '1.jpg', '/Users/Zd/Downloads/uploadRealFile/');

-- ----------------------------
-- Table structure for `mainspot`
-- ----------------------------
DROP TABLE IF EXISTS `mainspot`;
CREATE TABLE `mainspot` (
  `id` varchar(32) NOT NULL,
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `price` int(10) DEFAULT NULL,
  `city` varchar(32) DEFAULT NULL,
  `type` varchar(5) DEFAULT NULL,
  `editorial` varchar(1000) DEFAULT NULL,
  `route` varchar(200) DEFAULT NULL,
  `image` varchar(32) DEFAULT NULL,
  `comment` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mainspot
-- ----------------------------
INSERT INTO `mainspot` VALUES ('1', '云冈石窟', '150', '大同', '山', '最大石窟之一', '公交专线', '3', '好');
INSERT INTO `mainspot` VALUES ('10', 'HukouWaterfall', '91', '临汾', '山', '4A', '公交', '10', null);
INSERT INTO `mainspot` VALUES ('2', '五台山', '70', '忻州', '山', '三位帝王亲临', '公交 火车', '4', null);
INSERT INTO `mainspot` VALUES ('3', '胜溪湖', '0', '吕梁', '山, 水', '植物堤企为主', '公交专线', '3', '野生鸟多');
INSERT INTO `mainspot` VALUES ('4', '绵山', '70', '晋中', '山, 水', '雄奇峻美', '公交直达', '4', null);
INSERT INTO `mainspot` VALUES ('5', '中北', '0', '太原', '山, 水', '二龙山', '835', '5', null);
INSERT INTO `mainspot` VALUES ('6', '悬空寺', '25', '大同', '山, 水', '太原市 危险', '公交', '6', null);
INSERT INTO `mainspot` VALUES ('7', '万年冰洞', '75', '忻州', '冰', '厚衣服', '公交', '7', '太冷 刺激');
INSERT INTO `mainspot` VALUES ('8', '太行山', '65', '长治', '山，水', '不错', '公交', '8', '下次光临');
INSERT INTO `mainspot` VALUES ('9', '晋祠', '150', '太原', '山', '寺庙', '公交27', '9', '保佑');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `surepass` varchar(32) NOT NULL,
  `type` varchar(5) DEFAULT NULL,
  `phone` varchar(32) NOT NULL,
  `email` varchar(32) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('卫梦', '123', '123', '普通用户', '', '');
INSERT INTO `user` VALUES ('和泽', '123', '123', '管理员', '15735655098', '1295460647@qq.com');
INSERT INTO `user` VALUES ('崔丽容', '123', '123', '普通用户', '17803478313', '');
INSERT INTO `user` VALUES ('崔佩佩', '123', '123', '普通用户', '', '');
INSERT INTO `user` VALUES ('张丹', '123', '123', '管理员', '15035391262', '1071102546@qq.com');
INSERT INTO `user` VALUES ('张佳丽', '123', '123', '普通用户', '', '');
INSERT INTO `user` VALUES ('郑敏', '123', '123', '普通用户', '', '');
