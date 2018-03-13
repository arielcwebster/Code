-- lecture_fruit.sql
-- CSC 106 - Spring 2016
--
--
-- B. Bird - 03/02/2016

-- If the tables already exist, delete them --
drop table products;
drop table order_contents;
drop table orders;

-----------------------
-- Create the tables --
-----------------------
create table products( product_id int, name text, price_kg real);
create table order_contents( order_num int, product_id int, kg_bought real);
create table orders(order_num int, order_date date, customer_lastname text, customer_firstname text);
---------------------------------
-- Insert data into each table --
---------------------------------
insert into products values(1 ,'Apple', 3.50);
insert into products values(2 ,'Pear', 4.00);
insert into products values(3 ,'Lime', 5.00);
insert into products values(4 ,'Raspberry', 10.00);
insert into products values(5 ,'Peach', 6.10);
insert into order_contents values(1000	, 3 , 0.6);
insert into order_contents values(1001	, 3 , 10);
insert into order_contents values(1001	, 1 , 2.5);
insert into order_contents values(1002	, 2	, 5);
insert into order_contents values(1002	, 4 , 20);

insert into orders values(1000 ,'2015-06-16','Bloom','Leopold');
insert into orders values(1001 ,'2015-07-05','Samsa','Gregor');
insert into orders values(1002 ,'2016-01-06','Bird','Bill');

.mode column
.header on


-- Select all customer names --
.print ''
.print 'Query 1: Customer names'
select customer_firstname, customer_lastname from orders;


-- Select all customer names (alphabetically by last name) --
.print ''
.print 'Query 2: Customer names (sorted by last name)'
select customer_firstname, customer_lastname from orders order by customer_lastname;


-- Select date, product name and customer name for all order contents --
select order_date, name, customer_firstname, customer_lastname 
	from order_contents natural join orders natural join products;
	
-- Print the price of each product in each order (the cost of a product is equal to its weight multiplied by the cost per kilogram) --
 select order_num, name, kg_bought, price_kg, kg_bought*price_kg as item_price
	from order_contents natural join products;
	
-- Print the total price of each entire order --
select order_num, name, kg_bought, price_kg, sum(kg_bought*price_kg) as total_price
	from order_contents natural join products 
	group by order_num;
	
-- Print all orders with a total price of more than 50 dollars (method 1) --
select order_num, name, kg_bought, price_kg, sum(kg_bought*price_kg) as total_price
	from order_contents natural join products 
	group by order_num 
	having total_price > 50;
	
-- Print all orders with a total price of more than 50 dollars (method 2) --
select * from 
	(select order_num, name,kg_bought,price_kg, sum(kg_bought*price_kg) as total_price
		from order_contents natural join products 
		group by order_num) 
	where total_price > 50;

-- Select the names of all customers who placed an order of more than two items (method 1) --
select customer_firstname, customer_lastname 
	from (select order_num, count(product_id) as item_count 
			from order_contents 
			group by order_num) 
		  natural join orders
	where item_count >= 2
	order by customer_lastname;

-- Select the names of all customers who placed an order of more than two items (method 2) --
select customer_firstname, customer_lastname 
	from orders natural join order_contents 
	group by order_num 
	having count(product_id) > 1 
	order by customer_lastname;
	
	
	
