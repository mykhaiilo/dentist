CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `nickname` varchar(45) NOT NULL,
  `email` varchar(64) NOT NULL,
  `phone` varchar(12) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_id` (`id`),
  UNIQUE KEY `unique_nickname` (`nickname`),
  UNIQUE KEY `unique_email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
INSERT INTO `users` VALUES
  (1,'Ivan','John','john@gmail.com','0950643654'),
  (2,'Petro','Peter','peter@gmail.com','0955134646'),
  (3,'Pavlo','Paul','paul@gmail.com','0665946843'),
  (4,'Andriy','Andrew','andrew@gmail.com','0964643526'),
  (5,'Tom','Tom3','tom@gmail.com','0990909900'),
  (6,'Joe','Joe','joe@gmail.com','0887862767'),
  (7,'Oliver','Oliver','oliver@gmail.com','0998465488'),
  (8,'Jonatan','Jonn','jonatan@gmail.com','09566633322');