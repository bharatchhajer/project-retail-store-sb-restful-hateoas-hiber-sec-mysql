use store;
SELECT 'ADDING STORE AND STORE_DETAILS' AS ' ';
Insert into Store (store_name) values ('Davangere Retail Store');
Insert into StoreDetail (store_id, city, contact_number) values (10,'Davangere','9444130041');
Insert into Store (store_name) values ('Hublli Retail Store');
Insert into StoreDetail (store_id, city, contact_number) values (11,'Hublli','9444130041');
SELECT 'ADDING CUSTOMER' AS ' ';
Insert into Customer (customer_name, email) values ('Puneeth Rajkumar','puneeth@gmail.com');
Insert into Customer (customer_name, email) values ('Ganesh Goldstar','ganesh@gmail.com');
SELECT 'ADDING CATEGORY AND PRODUCTS' AS ' ';
Insert into Category (category_name) values ('Electronics');
Insert into Category (category_name) values ('Electrical');
Insert into Category (category_name) values ('Home Accessories');
Insert into Product (product_name, price) values ('Television',50000);
Insert into Product (product_name, price) values ('Mobile',10000);
Insert into Product (product_name, price) values ('Fan',2000);
Insert into Product (product_name, price) values ('Tubelight',100);
Insert into ProductCategory (product_id, category_id) values ('1',1);
Insert into ProductCategory (product_id, category_id) values ('2',1);
Insert into ProductCategory (product_id, category_id) values ('3',2);
Insert into ProductCategory (product_id, category_id) values ('4',2);
Insert into ProductCategory (product_id, category_id) values ('3',3);
Insert into ProductCategory (product_id, category_id) values ('4',3);



