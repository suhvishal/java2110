CREATE TABLE BOOK (ID BIGINT AUTO_INCREMENT NOT NULL, DESCRIPTION VARCHAR(3000), ISBN VARCHAR(15), nb_of_pages INTEGER, publication_date DATE, TITLE VARCHAR(100), unit_cost FLOAT, PRIMARY KEY (ID))
CREATE TABLE CD (ID BIGINT AUTO_INCREMENT NOT NULL, DESCRIPTION VARCHAR(3000), GENRE VARCHAR(255), TITLE VARCHAR(100), total_duration FLOAT, unit_cost FLOAT, PRIMARY KEY (ID))
