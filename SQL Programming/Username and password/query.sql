Select concat(cust_name,cust_id) 
as USERNAME, 
concat(substring(cust_name,1,3),
substring(cust_phone,-4,4)) as PASSWORD
 from customer 
order by USER NAME;
