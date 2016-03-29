CREATE TABLE `dentist` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `fullNameUser` varchar(45) NOT NULL,
  `nicknameUser` varchar(45) NOT NULL,
  `emailUser` varchar(64) NOT NULL,
  `experience` varchar(100) DEFAULT NULL,
  `adress` varchar(100) NOT NULL,
  `phoneUser` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idUser`),
  UNIQUE KEY `id_UNIQUE` (`idUser`),
  UNIQUE KEY `nickname_UNIQUE` (`nicknameUser`),
  UNIQUE KEY `email_UNIQUE` (`emailUser`),
  UNIQUE KEY `phone_UNIQUE` (`phoneUser`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='	';
INSERT INTO `dentist` VALUES
  (1,'Andriy','Andy','asdsgs@gmail.com','2 years','Ivanova St. 42/53','09098989032'),
  (2,'Ivan','Jon','dsfdgsa@gmail.com','3 years','Petrove St. 23/54','08980908708'),
  (3,'Pavlo','Paul','adsfgfghg@yahoo.com','10 years','Midnight St. 123/6','06532265151'),
  (4,'Tom','Tom3','tom@gmail.com','15 years','Dash St. 12','0990909900'),
  (6,'Joe','Joe','joe@gmail.com','25 years','Queens St. 23/812','0887862767'),
  (7,'Oliver','Oliver','oliver@gmail.com','5 years','King St. 263','0998465488');