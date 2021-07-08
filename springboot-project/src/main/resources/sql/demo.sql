-- ----------------------------
-- CREATE DATABASE
-- ----------------------------
CREATE DATABASE demo;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_users
-- ----------------------------
DROP TABLE IF EXISTS `t_users`;
CREATE TABLE `t_users`  (
  `id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'id',
  `loging_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '帐号',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `des_password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'des密码',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '全名',
  `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `user_state` int(1) NOT NULL DEFAULT 0 COMMENT '0为正常，1为停用，2为删除',
  `icon` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '头像',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `create_user_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人id',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `update_user_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人id',
  `department_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属部门id',
  `department_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属部门名称',
  `surname` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓',
  `common_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名',
  `phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话号码',
  `birthday` datetime(0) NULL DEFAULT NULL COMMENT '生日',
  `sex` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别（0-男，1-女）',
  `address` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `identification_number` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '证件号',
  `remarks` varchar(600) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `user_type` int(1) NULL DEFAULT 0 COMMENT '用户类型：0普通用户；1租户管理员；2超级管理员',
  `tenant_id` bigint(100) NULL DEFAULT NULL COMMENT '所属租户id',
  `fo_id` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所属机构',
  `validity_time` timestamp(0) NULL DEFAULT NULL COMMENT '有效期',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_users
-- ----------------------------
INSERT INTO `t_users` VALUES ('1', 'admin', 'e10adc3949ba59abbe56e057f20f883e', 'OKE3S/CRTik=', '管理员', 'admin@baifendian.com', 0, 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACcAAAAnCAYAAACMo1E1AAAFSklEQVRYR7VYWU8bVxQ+157FNniHhqVvgaQKEIUojRohhBqpitSXSP2blVI1iiJFqvJQRWqTh8RNnprGoYBZVGwz3me8TfWdYYjBM5fBmIMQPMw997vf2Y+wbdumgNLv98k0Tf7tdDoU9Gg4HCZN0ygajfLfoCKCgOt2u9RoNKjVap3S2+v3ye73qW/b5DzReafAjxAkQoJCoRCFhDg5B6ATExMMFN/IRAoOTNXrdWo2myc6er0edbs96vZ6QQlgcGElTAAWDoX4HP6Px+MUiUR89fiCsyyLKpUKASAE7LU73cCm9LtRCYdJURQKhx2Quq5TMplkhs+KJ7harcZmhICpdqdD/X5g1wzEqKoopKoKmxYsplIpUlX11NkhcGDL9S2wZbU7gS7DR2C53W4zy67gYkVVCWCGmBGCdE1lcAAJgGDSlVPgXGDgyDItgsPLpNFsUrlcpiPDYKbhCn4Si8VocWGB0qnU0Ce6ppGiOADT6fRJRJ+Ac02JqDMt09eMSB//HR5SoVCgWr0emFV8iMBYXV2l+OSkFGA2m2W/ZHB48dHRER8wJYxVazX6++PHE3+8ELLjj7OZDK0sL3sedRkEMAAUvV7PLhaL7C8yH9vb26N/8vlLRyucfu3BA993RSI6pxu4gTAMw0YAICpNq+15aHd3l4GNQ+BXcPpEPM4+eDZCkVKiEScoxP7+PueIVsvkTH9WKtUq5XK549w/DnhfdGTSabq9suLhf6rjcwAnM+fbd+8IvnZV8t39+55VIhqJOOCaLdPTl1Dg/3zz5qpwsd7lpSWaymaH7tBUlcTOTsG22t6+Vq1W6W0ud6Xgvrl5k2auXRu6gxuHzX+3bASDl4yLOTh5BJlfCG633HqNO5du3aLpqSnP+8Wn/Gffogklv796xQcRYT88fHiqzUFCrjcanPdwKSoK/BdgkLPQdaSSSW6R3PYIOv/68IHzJeTu6ipHrpdIweHAH69fc1m6sbhId+/cGYuJi6US/fbyJetaX1vj2joSOLwS1WNjfZ1mZ2bGAg6+/PzFC5qIxejbe/d8dZ7L3Kd8nnb39uinx4+HEuaoSJH0f332jL6en6eF69dHB3dYLNJOoUA/Pno0KpahcwjAn588kfobDp3LHBx8a3tbWg9HQf3L06f0/cYGB5KfnAsO7U1+c5Nu+3QSowDDmdz793RjYUFafaTgUELQ38O0frloVHAYnCYnJ7lR9WtSpeDQe6FrQD47b4wbFSTa+vJxL3lWhxTcV9PTnlPRqEC8ziE4YJkL5zm0NBeZ0EcBzV24YXiDy3/e9B36AQwDyVWZFO4Ck2K14cnc1ta23RkY5c5+hKYPmRzrg3EKtgiY3vyaDs5zhcKubUpGOhcQei4AHYeAqVK5LFWFOYKbTdnE5WpA1CJ6LyswJYANDt5eOnVdc8DJhpvBg1i6oAW6jMjymqvXHXLEwcEBB4RltQNtjgAwmUhcOEhwh1GpSLcCLriIrjkrinq9bmPaRxPYMv3XCYNswffQIAZNM0gXGJJkzu/qh27sT8AeT/ylUonDGXs3v3nCy5QYQhKJhG+gQCdA+aWKoYogBPHUJYjLJoPDizD1g/qLAoSJ/dIM0kXQsRK5FOZkf4tGv4DDC0C9YRjHAIOvvsBcLBp1dngYlLBvC4W4JmO2CLLs4S2ABj9zzmUyGWdtO1ge0KFiDQaRMYgtAB6CdhvswBUGJyqc5yFH1zmBY9BBKcRfL1O6jMHfAMzdcg4tD9H8ASBMDHNjeej+j3YdC50gSdvLR2Gu+bk5mpudZQDYyWmqxj4GxrCbG1y//g882xLEfhMNzQAAAABJRU5ErkJggg==', '2018-02-07 13:57:53', NULL, '2018-02-07 14:03:26', '590090579767215429', ' ', ' ', '管', '理员', NULL, '1970-01-02 08:00:00', ' ', NULL, NULL, NULL, 2, NULL, 'LA01', NULL);
INSERT INTO `t_users` VALUES ('856486071981047666', 'fouser1', '{MD5}4QrcOUm6Wau+VuBX8g+IPg==', 'OKE3S/CRTik=', 'fo user 1', NULL, 0, NULL, '2021-06-21 10:49:52', '855441895109689344', '2021-06-21 10:50:53', '855441895109689344', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, 'LA01', NULL);
INSERT INTO `t_users` VALUES ('856486071981047808', 'fouser3', '{MD5}4QrcOUm6Wau+VuBX8g+IPg==', 'OKE3S/CRTik=', 'fo user 3', NULL, 0, NULL, '2021-06-21 10:49:52', '855441895109689344', '2021-07-08 10:00:55', '856486287236923392', NULL, NULL, NULL, NULL, '15804081435', NULL, NULL, NULL, NULL, '1', 0, NULL, 'LA10', '2021-07-09 00:00:00');
INSERT INTO `t_users` VALUES ('856486114024751104', 'fouser4', '{MD5}4QrcOUm6Wau+VuBX8g+IPg==', 'OKE3S/CRTik=', 'fouser4', NULL, 0, NULL, '2021-06-21 10:50:02', '855441895109689344', '2021-07-08 10:23:13', '856486287236923392', NULL, NULL, NULL, NULL, '15804081435', NULL, NULL, NULL, NULL, '1', 0, NULL, 'LA10', '2021-07-09 00:00:00');
INSERT INTO `t_users` VALUES ('856486287236923392', 'fomanager3', '{MD5}4QrcOUm6Wau+VuBX8g+IPg==', 'OKE3S/CRTik=', 'fo manager3 viana', NULL, 0, NULL, '2021-06-21 10:50:43', '855441895109689344', '2021-06-21 10:50:43', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, 'LA10', NULL);
INSERT INTO `t_users` VALUES ('856486287236923777', 'fomanager1', '{MD5}4QrcOUm6Wau+VuBX8g+IPg==', 'OKE3S/CRTik=', 'fo manager1 viana', NULL, 0, NULL, '2021-06-21 10:50:43', '855441895109689344', '2021-06-21 10:50:43', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, 'LA01', NULL);
INSERT INTO `t_users` VALUES ('856486453541076992', 'fomanager4', '{MD5}4QrcOUm6Wau+VuBX8g+IPg==', 'OKE3S/CRTik=', 'fo manager4 viana', NULL, 0, NULL, '2021-06-21 10:51:23', '855441895109689344', '2021-06-21 10:51:23', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, 'LA10', NULL);
INSERT INTO `t_users` VALUES ('862410286265532416', '1111', '{MD5}4QrcOUm6Wau+VuBX8g+IPg==', 'OKE3S/CRTik=', '老二次元', NULL, 0, NULL, '2021-07-07 19:10:35', '1', '2021-07-08 10:21:00', '1', NULL, NULL, NULL, NULL, '1', NULL, NULL, NULL, NULL, '1', 0, NULL, 'LA01', '2021-06-16 20:07:38');
INSERT INTO `t_users` VALUES ('862642269675585536', 'Gigi', '{MD5}4QrcOUm6Wau+VuBX8g+IPg==', 'OKE3S/CRTik=', '乃旗', NULL, 0, NULL, '2021-07-08 10:32:24', '856486287236923392', '2021-07-08 10:32:24', NULL, NULL, NULL, NULL, NULL, '15804081453', NULL, NULL, NULL, NULL, '1', 0, NULL, 'LA01', '2021-07-09 00:00:00');

SET FOREIGN_KEY_CHECKS = 1;
