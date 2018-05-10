/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 100130
 Source Host           : localhost:3306
 Source Schema         : ebebek

 Target Server Type    : MySQL
 Target Server Version : 100130
 File Encoding         : 65001

 Date: 10/05/2018 10:36:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `umail` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  `upassword` varchar(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 86 CHARACTER SET = utf8 COLLATE = utf8_turkish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'ali', 'ali@ali.com', '123');
INSERT INTO `users` VALUES (2, 'ahmet', 'ahmet@ahmet.com', '123');
INSERT INTO `users` VALUES (3, 'mehmet', 'mehmet@mehmet.com', '123');
INSERT INTO `users` VALUES (9, 'fatih', 'fatih@fatih.com', '123');
INSERT INTO `users` VALUES (10, 'isahin', 'i.sahin@hotmail.com', '123');
INSERT INTO `users` VALUES (76, 'ali@ali.com', 'aaaaa@asdasd', '12345');
INSERT INTO `users` VALUES (77, 'ali@ali.asdas', 'asdasd@asd', '12345');
INSERT INTO `users` VALUES (78, 'aasda', 'asdas@asdas', 'aaaa');
INSERT INTO `users` VALUES (79, 'ali@ali.com', 'asdasd@asd', '12345');
INSERT INTO `users` VALUES (80, 'asd', 'asdasd@asdsadaa', '12345');
INSERT INTO `users` VALUES (81, 'sdasdsa', 'asdasd@asdas', 'asd');
INSERT INTO `users` VALUES (82, 'ali@ali.com', 'asdasd@asda', 'asd');
INSERT INTO `users` VALUES (83, 'ali@ali.com', 'aaaaa@asdasd', '12345');
INSERT INTO `users` VALUES (85, 'isahin', 'i.sahin@hotmail.com', '12345678');

SET FOREIGN_KEY_CHECKS = 1;
