create table mobile
(
    productId int,
    brandName varchar(30),
    modelName varchar(30),
    memory    varchar(10),
    price     int,
    colour    varchar(30)
);

desc mobile;

insert into mobile
    values (104, "Redmi", "Note7Pro", "128GB", 11999, "Nebula Red/Black/Neptune Blue"),
           (146, "Lenovo", "K9", "32GB", 5999, "Black/Blue"),
           (951, "Samsung", "A50", "64GB", 20999, "Black/White/Blue"),
           (964, "Samsung", "S9", "128GB", 61900, "Black/Coral Blue/Lilac Purple");

select *
from mobile;

select productId, price
from mobile
where price between 5000 and 20000
order by productId;

truncate mobile;