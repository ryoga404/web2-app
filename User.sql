CREATE DATABASE IF NOT EXISTS Madagascar;
USE Madagascar;

-- Userテーブル
CREATE TABLE User (
    UserId INT(100) AUTO_INCREMENT PRIMARY KEY,
    UserName VARCHAR(25) NOT NULL,
    DisplayName VARCHAR(25),
    Address TEXT,
    Hash TEXT,
    Flag INT(1) CHECK (Flag IN (0, 1, 2, 3))
);

-- Saltテーブル
CREATE TABLE Salt (
    UserId INT(100) PRIMARY KEY,
    Salt TEXT NOT NULL,
    FOREIGN KEY (UserId) REFERENCES User(UserId)
);
