DROP TABLE IF EXISTS users;
CREATE TABLE users (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `username` varchar(64) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '账号',
  `password` varchar(32) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '密码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

INSERT INTO users (USERNAME, PASSWORD)VALUES ('A001','111');
INSERT INTO users (USERNAME, PASSWORD)VALUES ('B002','222');
INSERT INTO users (USERNAME, PASSWORD)VALUES ('C001','333');