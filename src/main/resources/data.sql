INSERT INTO Doctors (last_name, first_name, email, gsm_number, photo, speciality) VALUES ( 'Pitt', 'Brad','brad.pitt@gmail.com', '+32495654585', 'https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/Brad_Pitt_June_2014_%28cropped%29.jpg/332px-Brad_Pitt_June_2014_%28cropped%29.jpg','Psychiatrist' );
INSERT INTO Doctors (last_name, first_name, email, gsm_number, photo, speciality) VALUES ( 'Clooney', 'Georges','georges.clooney@gmail.com', '+32495656485', 'https://upload.wikimedia.org/wikipedia/commons/9/97/George_Clooney_18_10_2011.jpg','Dentist' );
INSERT INTO Doctors (last_name, first_name, email, gsm_number, photo, speciality) VALUES ( 'Roberts', 'Julia','julia.roberts@gmail.com', '+32496156485', 'https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/Julia_Roberts_Cannes_2016_3.jpg/329px-Julia_Roberts_Cannes_2016_3.jpg','General Practitioner' );
INSERT INTO Doctors (last_name, first_name, email, gsm_number, photo, speciality) VALUES ( 'Streep', 'Meryl','meryl.streep@gmail.com', '+32496155685', 'https://upload.wikimedia.org/wikipedia/commons/4/4b/Meryl_Streep_February_2016.jpg','Dermatologist' );

-- INSERT INTO Persons (dtype,last_name, first_name, email, gsm_number) VALUES ('doctor', 'Pitt', 'Brad','brad.pitt@gmail.com', '+32495654585');
-- INSERT INTO Persons (dtype,last_name, first_name, email, gsm_number) VALUES ('doctor', 'Clooney', 'Georges','georges.clooney@gmail.com', '+32495656485');

INSERT INTO USER (ID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL, ENABLED, LASTPASSWORDRESETDATE) VALUES (1, 'admin', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi', 'admin', 'admin', 'admin@admin.com', 1, PARSEDATETIME('01-01-2016', 'dd-MM-yyyy'));
INSERT INTO USER (ID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL, ENABLED, LASTPASSWORDRESETDATE) VALUES (2, 'user', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 'user', 'enabled@user.com', 1, PARSEDATETIME('01-01-2016','dd-MM-yyyy'));
INSERT INTO USER (ID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL, ENABLED, LASTPASSWORDRESETDATE) VALUES (3, 'disabled', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 'user', 'disabled@user.com', 0, PARSEDATETIME('01-01-2016','dd-MM-yyyy'));

INSERT INTO AUTHORITY (ID, NAME) VALUES (1, 'ROLE_USER');
INSERT INTO AUTHORITY (ID, NAME) VALUES (2, 'ROLE_ADMIN');

INSERT INTO USER_AUTHORITY (USER_ID, AUTHORITY_ID) VALUES (1, 1);
INSERT INTO USER_AUTHORITY (USER_ID, AUTHORITY_ID) VALUES (1, 2);
INSERT INTO USER_AUTHORITY (USER_ID, AUTHORITY_ID) VALUES (2, 1);
INSERT INTO USER_AUTHORITY (USER_ID, AUTHORITY_ID) VALUES (3, 1);
