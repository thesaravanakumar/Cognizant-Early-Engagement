# TestCallBack

Given you an interface TrainerCohortMapDAO with an abstract void method “`mapTrainerCohort(String, String)`” which assign trainer to cohort. You are required to write Junit test case using Mockito callback method and check the correctness of the application developed.

### Functional Requirements:

Following model component provided as part of the skeleton

> **Component Specification** : Cohort (Model class)

| Class | Attribute(s) | Template Method(s) | 
| ----- | ------------ | ------------------ |
| Cohort | String trainerId<br>String cohortCode | //getters and setters |

 

The application has the below interface and method.

> **Component Specification** : TrainerCohortMapDAO (DAO interface)

| Interface | Attribute(s) | Template Method(s) |
| --------- | ------------ | ------------------ |
| rainerCohortMapDAO |  | mapTrainerCohort(String, String) |  


 

### Business Rule:

The below is the requirement implemented in the interface for which JUnit test cases are to be written and tested.

| Interface | Method(s) | Responsibilities | Exception |
| --------- | --------- | ---------------- | --------- |
| TrainerCohortMapDAO | `void mapTrainerCohort (String trainerId, String cohortCode)` | invokes  cohort.setTrainerId(trainerId) on success case. | Throws run time exception if trainer id not starts with “t-“<br>Throws run time exception if cohort code not in given pattern |

### Testing Scenarios:

You are provided with a class “TrainerCohortMapDAOTest” to do this testing. You are required to mock dao interface, cohort object, and implement functional requirements using `doAnswer()` and `Answer<Void> callback`.

The below are the test methods to be implemented in TrainerCohortMapDAOTest class.

| Test Cases / Methods | Scenarios / Responsibilities |
| -------------------- | ---------------------------- |
| setup | implement doAnswer() for dao’s mapTrainerCohort (anyString, anyString) as,<br>1. throws RuntimeException with message “Invalid Trainer ID” if trainer id not starts with “t-“.<br>2. throws RuntimeException with message “Invalid Cohort Code” if cohort code not in “ABC##DE###” pattern (valid code e.g: CHN19AJ021)<br>3. Invoke cohort.setTrainerId(trainerId) if no exceptions thrown. |
| testSuccess | This method will invoke mapTrainerCohort() with valid trainerId and cohort code, verify cohort.setTrainerId() method which should pass the test case |
| testTrainerId | This method should expect & handle the RuntimeException & message “Invalid Trainer ID” when mapTrainerCohort() method called invalid trainerId and valid/invalid cohort code |
| testCohortCode | This method should expect & handle the RuntimeException & message “Invalid Cohort Code” when mapTrainerCohort() method called valid trainerId and invalid cohort code |

Implement the test methods and add the needed annotations to all the methods in TrainerCohortMapDAOTest class.

