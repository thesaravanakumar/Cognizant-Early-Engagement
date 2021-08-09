# Online Help Services

Create a Spring MVC Spring Boot Application for developing the Online Help Services. Design a Helpdesk Page to choose an appropriate Service(ACService,RefrigeratorService or WashingMachineService) and total Number of Hours the service is required. On clicking TotalCost, the application should calculate the total Cost depending on cost per hour for the service(based on the serviceType chosed) and the total hours required for the service. The user has to be then redirected to helpdesk.jsp page that displays the message “Thank you for choosing our Service.You need to pay Rs.`<totalCost>`"

## Application Work Flow.

HelpController is the Controller class.

HelperBean is the model class with three attributes serviceCost, serviceCostPerHour, noOfHours,  getters and setters .

HelperService which is a Service class has a method called calculateTotalCost that takes HelperBean as its argument and returns double.

This method needs to set the serviceCostPerHour instance variable based on the cost/hr(in Rs) value given in the below mentioned table. 
Calculate the totalCost depending on the serviceCostPerHour for the service type chosen and the total hours required to complete the service.
totalCost should be returned as double

| Service Type | cost/hr(in Rs) |
| ------------ | -------------- | 
| ACService | 400 |
| WashingMachineService | 500 |
| RefrigeratorService | 300 |

Initially, the user should be routed via the HelpController's **showPage** method to **showpage.jsp** that allows user to choose the service and enter the total hours.

*Note*: 

showPage method has to be written inside the HelpController]

A method in the HelpController known as **buildState** should be annotated with the ModelAttribute **“serviceList”** . This method should populate the services(ACService,RefrigeratorService or WashingMachineService) in the Map as key-value pair(Both key and value be the same ServiceName.Eg: Key- ACService, Value- ACService, Key-RefrigeratorService,Value-RefrigeratorService) and then return the Map. This should be then used to autopopulate the services in the showPage.jsp       

*Note*:
buildState method should be written inside the HelpController]

On clicking the TotalCost button, the HelpController's calculateTotalCost  method should be called . This method takes two arguments -  model attribute named **“helper”** which holds the form populated HelperBean Object and the  ModelMap.

This method should calculate the totalCost by invoking  the calculateTotalCost method of the HelperService.


Redirect the user to **helpdesk.jsp** page with a message "Thank you for choosing our Service.You need to pay Rs.`<totalCost>`" .

## UI Design Constraints:

> showpage.jsp

| Component | ID (id attribute of the component) | Constraints | 
| --------- | ---------------------------------- | ----------- | 
| Select | serviceType | Should be auto populated using the model attribute written above the buildState method, inside the HelpController. Do not hard code the values. |
| Textbox | noOfHours | - |
| submit | submit (Name) | - |

> helpdesk.jsp

*The Result has to be rendered in the `<h2>` tag

## Component Specification 

### Controller

> HelpController                  

| AttributeName | AttributeType | Access Specifier | Constraints | 
| ------------- | ------------- | ---------------- | ----------- |
| helpService | HelperService | private | Use annotation to autowire |

| Method Name | Method Argument name:type | Return type | RequestMapping URL & Request Method |
| ----------- | ------------------------- | ----------- | ----------------------------------- |
| showPage | modelAttribute “helper”: HelperBean | String | /showPage & GET | 
| calculateTotalCost | modelAttribute “helper”: HelperBean,model:ModelMap | String | /helpDesk & POST |
| buildState | Map<String,String> | Should be annotated with ModelAttribute with name “serviceList” |  | 

### Service

> HelperService 

| Method Name | Method Argument name:type | Return type | 
| calculateTotalCost | helperBean:HelperBean | double | 

### Model

> HelperBean

| AttributeName | AttributeType | 
| ------------- | ------------- |
| serviceType | String | 
| serviceCostPerHour | float | 
| noOfHours | int | 

### Overall Design Constriants:

- HelpController should be inside the package com.controller 
- HelperService should be inside the package com.service 
- HelperBean should be in the package com.model
- Use appropriate annotation to configure  HelperService as a Service
- Use appropriate annotation to configure HelpController as  a Controller     
- HelperService should be autowired inside the HelpController. 
- Do not change the property name given in the application.properties files, you can change the value and you can include additional property if needed.
- In the pom.xml you are provided with all the dependencies needed for developing the application. 
- You will not be evaluated based on the UI design (layout, color, formatting, etc.). You are free to have a basic UI with all the required UI components (input fields, buttons, labels, etc.). Expected components with the id alone should be designed as per the requirement.
 