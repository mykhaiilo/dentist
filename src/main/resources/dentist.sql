CREATE TABLE `dentist` (
  `idDentist`         INT(11)      NOT NULL AUTO_INCREMENT,
  `nameDentist`       VARCHAR(45)  NOT NULL,
  `nicknameDentist`   VARCHAR(45)  NOT NULL,
  `emailDentist`      VARCHAR(64)  NOT NULL,
  `experienceDentist` INT(3)       DEFAULT NULL,
  `adressDentist`     VARCHAR(100) NOT NULL,
  `phoneDentist`      VARCHAR(45)  DEFAULT NULL,
  `serviceDentist`    VARCHAR(110) DEFAULT NULL,
  PRIMARY KEY (`idDentist`),
  UNIQUE KEY `idDentist_UNIQUE` (`idDentist`),
  UNIQUE KEY `nicknameDentist_UNIQUE` (`nicknameDentist`),
  UNIQUE KEY `emailDentist_UNIQUE` (`emailDentist`),
  UNIQUE KEY `adressDentist_UNIQUE` (`adressDentist`),
  UNIQUE KEY `experienceDentist_UNIQUE` (`experienceDentist`),
  UNIQUE KEY `phoneDentist_UNIQUE` (`phoneDentist`))
  ENGINE =InnoDB
  AUTO_INCREMENT =8
  DEFAULT CHARSET =utf8;

INSERT INTO `dentist` VALUES
  (1, 'Andriy', 'Andy', 'asdsgs@gmail.com', 2, 'Ivanova St. 42/53', '09098989032',
   'oral exams,emergency visits, X-rays, extractions fillings'),
  (2, 'Ivan', 'Jon', 'dsfdgsa@gmail.com', 3, 'Petrove St. 23/54', '08980908708',
   'oral exams,emergency visits, X-rays, 5'),
  (3, 'Pavlo', 'Paul', 'adsfgfghg@yahoo.com', 10, 'Midnight St. 123/6', '06532265151', 'emergency visits, X-rays, 4'),
  (4, 'Tom', 'Tom3', 'tom@gmail.com', 15, 'Dash St. 12', '0990909900', 'oral exams,emergency visits, X-rays, 3'),
  (6, 'Joe', 'Joe', 'joe@gmail.com', 25, 'Queens St. 23/812', '0887862767', 'oral exams, 2'),
  (7, 'Oliver', 'Oliver', 'oliver@gmail.com', 5, 'King St. 263', '0998465488', 'oral exams,emergency visits, 1');

