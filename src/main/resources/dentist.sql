INSERT INTO dentist(id, name, nickname, email, experience,adress, phone)
VALUES (4, 'Tom', 'Tom3', 'tom@gmail.com', '15 years', 'Dash St. 12', '0990909900');
INSERT INTO dentist(id, name, nickname, email, experience, adress, phone)
VALUES (5, 'Tom2', 'Tomas', 'tom2@gmail.com', '15 years', 'Dash St. 312', '099090932');
INSERT INTO dentist(id, name, nickname, email, experience,adress, phone)
VALUES (6, 'Joe', 'Joe', 'joe@gmail.com', '25 years', 'Queens St. 23/812', '0887862767');
INSERT INTO dentist(id, name, nickname, email, experience, adress, phone)
VALUES (7, 'Oliver', 'Oliver', 'oliver@gmail.com', '5 years', 'King St. 263', '0998465488');
SELECT * FROM dentist;
SELECT * FROM dentist WHERE id=2;
UPDATE dentist SET name="Pavlo", nickname="Paul" WHERE id=3;
DELETE FROM dentist WHERE id=5;
