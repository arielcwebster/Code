-- first select gives us certian information from the specified table
-- It can give us all the information 
select * from characters;

-- comments are double slash 
-- and we end each command with a ; this is different than ending each line with a ;

--or only the information from one column
select name from characters;

--or only selected columns
select name, title from characters;

-- notice that the title is being cut off sometimes
-- to prevent this type 
.width 15, 30
select name, title from characters;

-- order doesn't matter
select title, name from characters;

--generally databases shouldn't have duplicate data but sometimes if you get down
-- to only one or two columns the data is the same over many many rows. 
-- to figure out which the unique entries are use the key word distinct
select distinct title from characters;

-- If we want to only look at certain rows we need the where key word
select title, name from characters 
where title = 'The Lorax';

-- the where does not have to specify a column that is shown expecially since 
-- you will know what all of the entries are in that column
select title, name from characters 
where human = 0;

-- there can also be more than one condition
select name from characters 
where human = 1 and year < 1960;

-- there can also be more than one condition
select name from characters 
where title = 'Horton Hears a Who' or title = 'Horton Hatches an Egg';

-- if you want to order your results
select name from characters  
order by name;

-- you can order by more than one thing
-- Expirement a bit and see how this might work
select title, year from characters  
order by year, title;
-- which has presicence?

-- you can also put all of these commands together to make more complicated commands
-- take a minute and try 
select distinct name, human from characters   
where year < 1960
order by name;


-- you can also count how many characters there are though if you want to know how many 
-- per book you need to also group by some catagory
select title, count(name) from characters
group by title;

-- now what if there is more than one set of data
-- why might we want this?
	-- space
-- to search for information that crosses between datasets we need to JOIN our search
select * from characters  
natural join books;

-- try print out the total number of pages for each book with a specific character
select name, pages, title from characters
natural join books
order by title;

-- try print out the total number of pages for each book with a specific character

-- What do you see this do?
-- If you replace the word inner with left, right, or full what happens differently?
-- does the number or order of columns change? the rows?

-- Inner join  = returns all rows that match up
-- right join = returns all rows from the right table then tacks on information from the left
-- left join = returns all rows from the left table then tacks on information from the right
-- full join = returns all rows where either the left or the right has info
