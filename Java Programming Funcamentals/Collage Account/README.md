# College Account

American college is an educational institution.  They decide to implement new courses in the self financed and regular streams from the current academic year. Since the fee structure is different for regular and self financed students, many students have approached the college help desk to enquire about the fee structure.

In order to avoid confusion, American college plans to automate the calculation of fee structure based on the course type.

Help them by using Lambda expressions that caters to their requirement.

## Requirement 1: To Calculate Tuition fee

The College wants to calculate the tuition fee based on the course type, basic fee and the no of semesters by using the method calculateTuitionFees

### Component Specification: TuitionFee Interface – 

This is a Functional Interface.

 
| Type(Interface) | Methods | Responsibilities |
| --------------- | ------- | ---------------- |
| TuitionFee | `public int calculateTuitionFees(String courseType,int basicFee,int noOfSemesters)` | This method is used to calculate the tuition fee based on the course type, basic fee and the no of semesters and return the tuition fees. |

### Component Specification: UserInterface Class

| Component Name | Type(Class) | Methods | Responsibilities |
| generateFeeReceipt | UserInterface | `public static TuitionFee generateFeeReceipt()` | This method should return a TuitionFee object. To do this, implement the lambda expression to get the tuition fees. | 

In the Student class write the main method and perform the given steps:

- Invoke the static method generateFeeReceipt(). It returns a TuitionFee object.
- Capture the TuitionFee object in a reference variable.
- Invoke the calculateTuitionFees method by passing the courseType, basicFee and noOfSemesters as parameters within the generateFeeReceipt() method.
- The output should be as shown in the sample data mentioned below.

#### Note:

If the courseType is Regular, then the basicFee*NoOfSemesters will be the tuitionFee. If the courseType is SelfFinance, then (basicFee*NoOfSemester)+50000 will be the tuitionFee.

> Sample Input 1:

    Enter registration number
    1234
    Enter student name
    Roshan
    Enter no of semesters
    2
    Enter basic fee
    2000
    Course type
    regular

> Sample Output 1:

    Fees Receipt
    Registration number: 1234
    Student name: roshan
    Tuition fee for regular student: 4000

--- 

Sample Input 2:

    Enter registration number
    98487
    Enter student name
    Richard
    Enter no of semesters
    3
    Enter basic fee
    4000
    Course type
    selfFinance

> Sample Output 2:

    Fees Receipt
    Registration number: 98487
    Student name: Richard
    Tuition fee for selfFinance student: 62000