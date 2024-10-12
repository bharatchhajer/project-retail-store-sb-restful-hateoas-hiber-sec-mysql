CREATE DATABASE IF NOT EXISTS store;
CREATE USER 'storeuser'@'localhost' IDENTIFIED  BY 'storepw';
GRANT ALL PRIVILEGES ON store.* TO 'storeuser'@'localhost';
