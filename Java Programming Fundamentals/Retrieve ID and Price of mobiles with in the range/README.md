# Retrieve ID and Price of mobiles with in the range_JDBC

Hy Fy mobiles is a famous mobile showroom in the city. The detail of every mobile in their showroom is available in their database. The showroom wants to give the customers the facility to view the product id and the price of mobiles that falls within a particular price range.

You being their software consultant have been approached to develop an application which can be used for managing their business. You need to implement a Java program to view the product id and the price of all the mobiles based on the range.

## Component Specification: Mobile(Model Class)

| Type(Class) | Attributes | Methods |
| ----------- | ---------- | ------- |
| Mobile | int productId<br><br>String brandName<br><br>String modelName<br><br>String memory<br><br>int price<br><br>String colour |  | 

### Note: 

Appropriate public getters,setters and a six argument constructor in the given order – productId, brandName, modelName, memory,price,colour are provided as a part of the code template.

### Requirement 1: 

Retrieve the product id and the price of mobiles within the given price range

The customer should have the facility to view the product id and price of mobiles which falls within a particular price range. Hence the system should fetch the product id and price of all the mobiles for the given range from the database. The product id and the price of those mobiles should be added to a Map<Integer, Integer>. Product id as a key along with price as a value. Sort the Map based on the price and return the same.

## Component Specification:MobileManagementSystem

| Component Name | Type(Class) | Attributes | Methods | Responsibilities | 
| -------------- | ----------- | ---------- | ------- | ---------------- |
| Retrieve the product id and price of mobiles which fall within a particular price range. | MobileManagementSystem |  | `public Map<Integer, Integer> viewMobileWithInTheRange(int minRange,int maxRange)` | This method should accept a minimumRange and maximumRange as parameter and retrieve the product id and price of the mobiles with the given range in the database. Add these details in `Map<Integer, Integer>`. Product id as a key along with price as a value and sort the Map based on the price. Return the sorted Map. |

### Note: 

The class and methods should be declared as public and all the attributes should be declared as private.

The **mobile** table is already created at the backend. The structure of the mobile table is as follows:

| Column Name | Datatype | 
| ----------- | -------- |
| productId | int | 
| brandName | varchar(30) | 
| modelName | varchar(30) | 
| memory | varchar(10) |
| price | int |
| colour | varchar(30) |

Sample records available in the mobile table are as shown below:

| productId | brandName | modelName | memory | price | colour |
| --------- | --------- | --------- | ------ | ----- | ------ |
| 104 | "Redmi" | "Note7Pro" | "128GB" | 11999 | "Nebula Red/Black/Neptune Blue" |
| 146 | "Lenovo" | "K9" | "32GB" | 5999 | "Black/Blue" |
| 951 | "Samsung" | "A50" | "64GB" | 20999 | "Black/White/Blue" |
| 964 | "Samsung" | "S9" | "128GB" | 61900 | "Black/Coral Blue/Lilac Purple" |


To connect to the database you are provided with the database.properties file and the DB.java file.

Create a class called Main with the main method and get the inputs like minimumvalue and maximumvalue from the user.

Display the productId and price for all the mobiles returned as `Map<Integer, Integer>` from the method viewMobileWithInTheRange in the MobileManagementSystem class.

If no mobile is available in the list, the output should be “No mobiles found for the given range”.

### Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user and the rest of the text represents the output.

> Sample Input 1:

    Enter the minimum range
    5000
    Enter the maximum range
    20000

> Sample Output 1:

    146:5999
    104:11999

---

> Sample Input 2:

    Enter the minimum range
    65000
    Enter the maximum range
    75000

> Sample Output 3:

    No mobiles found for the given range

