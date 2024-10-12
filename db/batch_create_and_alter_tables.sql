USE store;
CREATE TABLE Store (
    store_id INT PRIMARY KEY AUTO_INCREMENT,
    store_name VARCHAR(255)
);
ALTER TABLE Store AUTO_INCREMENT=10;

CREATE TABLE StoreDetail (
    detail_id INT PRIMARY KEY AUTO_INCREMENT,
    store_id INT,
    city VARCHAR(255),
    contact_number VARCHAR(15),
    FOREIGN KEY (store_id) REFERENCES Store(store_id)
);

CREATE TABLE FranchiseOwner (
    owner_id INT PRIMARY KEY AUTO_INCREMENT,
    store_id INT,
    owner_name VARCHAR(255),
    FOREIGN KEY (store_id) REFERENCES Store(store_id)
);


CREATE TABLE Customer (
    customer_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_name VARCHAR(255),
    email VARCHAR(255)
);
ALTER TABLE Customer AUTO_INCREMENT=100;

CREATE TABLE Product (
    product_id INT PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(255),
    price DECIMAL(10, 2)
);

CREATE TABLE Category (
    category_id INT PRIMARY KEY AUTO_INCREMENT,
    category_name VARCHAR(255)
);

CREATE TABLE ProductCategory (
    product_id INT,
    category_id INT,
    PRIMARY KEY (product_id, category_id),
    FOREIGN KEY (product_id) REFERENCES Product(product_id),
    FOREIGN KEY (category_id) REFERENCES Category(category_id)
);


CREATE TABLE `Orders` (
    order_id INT PRIMARY KEY AUTO_INCREMENT,
    order_date DATE,
    customer_id INT,
    product_id INT,
    FOREIGN KEY (customer_id) REFERENCES Customer(customer_id),
    FOREIGN KEY (product_id) REFERENCES Product(product_id)
);