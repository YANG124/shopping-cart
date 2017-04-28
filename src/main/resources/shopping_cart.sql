/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : shopping_cart

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2017-04-28 11:16:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `discount`
-- ----------------------------
DROP TABLE IF EXISTS `discount`;
CREATE TABLE `discount` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `barcode` varchar(255) NOT NULL COMMENT '条形码',
  `code` varchar(11) NOT NULL DEFAULT '0' COMMENT '优惠代码',
  `description` varchar(255) DEFAULT NULL COMMENT '优惠项目描述',
  `updatetime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of discount
-- ----------------------------
INSERT INTO `discount` VALUES ('1', 'ITEM000001', '0', '买二赠一', '2017-04-28 10:38:03');
INSERT INTO `discount` VALUES ('2', 'ITEM000002', '1', '九五折', '2017-04-28 10:38:06');

-- ----------------------------
-- Table structure for `goods`
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `barcode` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` double(18,2) unsigned DEFAULT NULL,
  `updatetime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', 'ITEM000001', '可口可乐', '3.00', '2017-04-28 10:49:32');
INSERT INTO `goods` VALUES ('2', 'ITEM000002', '萨姆奶茶', '4.00', '2017-04-28 10:50:26');
INSERT INTO `goods` VALUES ('3', 'ITEM000003', '羽毛球', '1.00', '2017-04-28 10:51:14');
INSERT INTO `goods` VALUES ('4', 'ITEM000004', '保温杯', '20.00', '2017-04-28 10:51:54');
INSERT INTO `goods` VALUES ('5', 'ITEM000005', '苹果', '5.00', '2017-04-28 10:53:09');
