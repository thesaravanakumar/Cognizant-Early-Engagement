# Participant List Manipulation

An event organizing agency approaches you to develop an application to manipulate the participant’s list for their next inter college competition event. As a Java developer, create a Java application using Stream API to get the participant details like participant name, department name and college name of each participant as input and display the participants based on the required department and college names.


- Participant class which includes the attributes participantName, departmentName and collegeName with all getters and setters.
- ParticipantUtility class which includes the attribute participantList with getter and setter, public void addParticipant(Participant pObj) method declaration, public Stream<Participant> viewAllParticipants(String departmentName, String collegeName) method declaration.
- Main class with the main method declaration.

## Functional Requirements:

1. Enclose your code in the addParticipant method to add the Participant object to the participantList.
2. Enclose your code in the viewAllParticipants method to create a Stream of Participant object which has the given departmentName and collegeName. Also, sort them in ascending order based on the participantName and return the Stream.
3. Enclose your code in the Main class to create a user interface for getting the required inputs and pass them as an object to the addParticipant method. Also, enclose your code to store and display the Stream of Participant based on departmentName and collegeName.

## User Interface Requirements:

- Display the options to choose as “1.Add 2.View 3.Exit” for all iterations.
- Any valid option can be chosen as 1 or 2 or 3. Otherwise, display a message as “Please choose a correct option” and continue to display the options.
- For option 1: get the participantName, departmentName and collegeName as inputs to process the functional requirements and continue to display the options.
- For option 2: get the departmentName and collegeName as inputs to process the functional requirements and continue to display the options.
- For option 3: display a message as “Thank you for using the application” and terminate.
- The output to display the generated Stream of Participant should be in “<participantName> <departmentName> <collegeName>” format for each Participant in the Stream.

### Note:

- All inputs given for processing the functional requirements should be case sensitive.
- Adhere to the Sample Inputs/ Outputs
- In the Sample Inputs/ Outputs provided, the highlighted text in bold corresponds to the input given by the user and the rest of the text represents the output.
- Adhere to the code template.
- Enclose all your required code in respective blocks. Do not edit or delete the codes provided in the code template.

> Sample Inputs/ Outputs:

    1.Add
    2.View
    3.Exit
    1
    grace
    cse
    NIT
    1.Add
    2.View
    3.Exit
    1
    david
    cse
    NIT
    1.Add
    2.View
    3.Exit
    1
    bindhu
    cse
    IITM
    1.Add
    2.View
    3.Exit
    1
    sahara
    ece
    NIT
    1.Add
    2.View
    3.Exit
    1
    charles
    cse
    NIT
    1.Add
    2.View
    3.Exit
    2
    Enter department name
    cse
    Enter college name
    NIT
    charles cse NIT
    david cse NIT
    grace cse NIT
    1.Add
    2.View
    3.Exit
    2
    Enter department name
    cse
    Enter college name
    IITM
    bindhu cse IITM
    1.Add
    2.View
    3.Exit
    2
    Enter department name
    ece
    Enter college name
    NIT
    sahara ece NIT
    1.Add
    2.View
    3.Exit
    6
    Please choose a correct option
    1.Add
    2.View
    3.Exit
    3
    Thank you for using the application