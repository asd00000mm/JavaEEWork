/*
 Navicat Premium Data Transfer

 Source Server         : lyz
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : javaee

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 04/06/2021 22:58:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `g_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `g_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `g_price` double(10, 2) NULL DEFAULT NULL,
  `g_number` int(11) NULL DEFAULT NULL,
  `g_state` varchar(5) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `g_date` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`g_id`) USING BTREE,
  INDEX `g_id`(`g_id`, `g_name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('001', 'iPhone12', 111.00, 10000, '有货', '2021-06-02 00:34:09');
INSERT INTO `goods` VALUES ('002', 'ipad2020', 3000.00, 5000, '有货', '2021-06-02 00:34:53');
INSERT INTO `goods` VALUES ('004', '戴尔G3', 66.00, 111111, '有货', '2021-06-04 12:34:17');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('001', 'admin', '123456');

SET FOREIGN_KEY_CHECKS = 1;
