# Retrieve customer count based on loan type_JDBC

EasZee is one of the leading money lenders in the town. They want to automate a process in their system where the admin can have an access to view the number of customers who availed loan based on requested loan type.

You being their software consultant have been approached to develop an application which can be used for managing their service. You need to implement a Java program to view the count of customers.

# Component Specification: Loan (Model Class)

| Type(Class) | Attributes | Methods | 
| ----------- | ---------- | ------- |
| Loan | int loanId<br><br>String accHolderName<br><br>String loanType<br><br>String contactNumber<br><b>float rateOfInterest<br><br>float tenureOfLoan | 

### Note: 

Appropriate public getters,setters and a six argument constructor in the given order – **loanId, Name, loanType,contactNumber, rateOfInterest, tenureOfLoan** are provided as a part of the code template.

### Requirement: 

Retrieve the count of customers based on the requested loan type

The admin should have an access to search and view the count of customers who have availed the loan under the requested loan type. Hence the system should fetch the count of customers who are in a particular loan type from the database and return the same.

## Component Specification: LoanManagementSystem

| Component Name | Type (Class) | Methods | Responsibilities |
| -------------- | ------------ | ------- | ---------------- |
| Retrieve the count of customers based on the requested loan type | LoanManagementSystem |**`public int viewLoanCountBasedOnType (String loanType)`** | This method should accept a loanType as a parameter and retrieve the count of customers who come under the requested loanType from the database. Return these count as int. |

The loan table is already created at the backend. The structure of a loan table is as shown:

| Column Name | Data Type | 
| ----------- | --------- |
| loanId | int |
| accHolderName | varchar(30) |
| loanType | varchar(30) |
| contactNumber | varchar(30) |
| rateOfInterest | double(6,2) |
| tenureOfLoan | double(6,2) |

Sample records available in the loan table are as shown below:

| loanId | accHolderName | loanType | contactNumber | RateOfInterest(%) |tenureOfLoan |
| ------ | ------------- | -------- | ------------- | ----------------- | ----------- |
| 25 | "Jordan" | "Education" | 9865007313 | 10.45 | 4 |
| 88 | "Kaushik" | "Vehicle" | 9965655073 | 8.70 | 7 |
| 142 | "Rohith" | "Education" | 9758462310 | 10.45 | 2.5 |
| 845 | "Adam Haynes" | "Home" | 7373848565 | 7.90 | 15 |
| 1021 | "Tamil Iniya" | "Education" | 9876543210 | 10.45 | 5 |
| 1654 | "Imam Azad" | "Personal" | 8451203694 | 11.25 | 5 |
| 2578 | "James" | "Gold" | 9154762358 | 9.15 | 1 | 

To connect to the database you are provided with the database.properties file and the DB.java file.

In the main class create a main method with the menu as described in the sample Input and Output.

When the admin selects the search again option ‘yes’ then he/she will be able to search the count of the customers who availed loan on a requested loan type till the program encounters ‘no’.

When the admin selects the search again option as ‘no’, display the message "Thank you for using the Application" and terminate the program.

Display the count of a loan as “Number of customers who have taken <LoanType> loan : <Count>” from the method viewLoansBasedOnType in the LoanManagementSystem class.

If no loan is available for the searched loan type, then the program should display “No customer has acquired <loanType> loan”.


> Sample Input / Output 1:

    Enter the type of loan to be searched
    Education
    Number of customers who have taken Eduaction loan : 3
    Do you want to searched again the loan type (yes/no)
    yes
    Enter the type of loan to be searched
    Home
    Number of customers who have taken Home loan : 1
    Do you want to searched again the loan type (yes/no)
    no
    Thank you for using the Application

---

> Sample Input / Output 2:

    Enter the type of loan to be searched
    Agricultural
    No customer has acquired Agricultural loan
    Do you want to searched again the loan type (yes/no)
    no
    Thank you for using the Application