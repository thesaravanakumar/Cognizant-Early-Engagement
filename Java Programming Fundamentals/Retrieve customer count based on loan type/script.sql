create table loan
(
    loanId         int,
    accHolderName  varchar(30),
    loanType       varchar(30),
    contactNumber  varchar(30),
    rateOfInterest double(6, 2),
    tenureOfLoan   double(6, 2)
);

desc loan;

insert into loan
values (25, "Jordan", "Education", 9865007313, 10.45, 4),
       (88, "Kaushik", "Vehicle", 9965655073, 8.70, 7),
       (142, "Rohith", "Education", 9758462310, 10.45, 2.5),
       (845, "Adam Haynes", "Home", 7373848565, 7.90, 15),
       (1021, "Tamil Iniya", "Education", 9876543210, 10.45, 5),
       (1654, "Imam Azad", "Personal", 8451203694, 11.25, 5),
       (2578, "James", "Gold", 9154762358, 9.15, 1);

select * from loan;

select count(loanId)
from loan
where loanType = "Home";