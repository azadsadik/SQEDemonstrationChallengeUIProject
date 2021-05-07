## Demo Challenge

#### Instructions
1. Complete the project setup as listed below
2. Complete the Excerise
3. Email a synopsis of your work and the link to your git repo containing the completed exercise to: sqedemonstrationchallenge@nbcuni.com


#### Expectations
We will be evaluating
1. Naming conventions
2. Code readability
3. Code encapsulation
4. Code structure and organization
5. Quality of test cases
6. Variety  of testing types (examples: boundary, happy path, negative, etc) 


#### Technologies
1. Java
2. Selenium
3. TestNG
4. Any other technologies you see fit.
5. Please do not use a BDD framework.

#### Project Setup
1. Clone this project to your git account in a public repo
2. Setup the project in your IDE
3. Open the index.html file from src/test/resource/files in a browser
4. Copy the url from the browser and update the url value in src/test/resource/config.properties to be the copied url.
5. In src/test/resources update the config.properties file platform for your OS.
6. From command line run mvn clean install -U -DskipTests
7. Make sure you can run the DemoTest and chrome launches.  You may need to update the chromedriver in /src/test/resources/chromedriver/ to the version that works with your browser
   https://chromedriver.chromium.org/


#### Exercise
1. Use the site at the index.html
2. There are helper locators provided for you in the src/test/resource/files/locators.txt file.
3. In the Test Cases section below:
  - List all of the test cases you think are necessary to test the sample page
  - Note any defects or issues observed
4. Code up a few examples of:
  - At least one happy path case placing an order
  - At least one error case
5. When complete please check your code into your public git repo


#### Test Cases
 Happy path:
 1.  As a user I should be able to order pizza without toppings 
 2.  As a user I should be able to order pizza only with toppings 1 
 3.  As a user I should be able to order pizza only with toppings 2 
 4.  As a user I should be able to order pizza with toppings 1 & Toppings 2 
 5.  As a user I should be able to order pizza using Credit Card 
 6.  As a user I should be able to order pizza using Cash on Pickup 
 7.  As a user I should be able to reset the order form 

     ####  Defect found:
     Expected result: all info should be reset to default values.
     
     Actual result: toppings 1 and toppings 2 info remained selected.
   

Negative test case:
 1.  As a user I should not be able to select toppings 1 & 2 without selecting pizza option:
     - toppings dropdown 1 & 2 should not be clickable;

     ####  Defect found:
     Expected result: User shouldn't be able to select the toppings.
     
     Actual result: toppings 1 and toppings 2 info remained selected.
     
     
 2.  As a user I should not be able to add letters and special characters and negative numbers quantity

     ####  Defect found:
     Expected result: User can't add letters, special characters and negative numbers into quantity box.
                      Error message should be displayed.
     
     Actual result: letters, special characters and negative numbers are accepted.
     
 3.  As a user I should not be able to add digits to name inputBox
     - place an order without providing name
     - error message should be displayed
      
     ####  Defect found:
     Expected result: User can't add digits into name inputBox. Error message should be displayed.
     
     Actual result: digits and negative numbers are accepted.
     
 4.  As a user I should not be able to add letters to the phone inputBox.

     ####  Defect found:
     Expected result: User can't add letters into phone inputBox. Error message should be displayed.
     
     Actual result: letters are accepted.
     

 5.  As a user I should not be able to place an order without providing phone
    - error message should be displayed.
     

 6.  As a user I should only be able to add more or less than 10 digits.
     

 7.  As a user I should not be able to place the order without selecting the payment information. 

     ####  Defect found:
     Expected result: User must select payment option (radio buttons).
     
     Actual result: User successfully placed the order without selecting payment information.
     
 8.  As a user I should not be able to complete order with selecting both payment information (two radio buttons)

     ####  Defect found:
     Expected result: User should select only one payment option (radio buttons).
     
     Actual result: User selected both payment options.
     
 9.  As a user I should not be able to add invalid email format.
     
     ####  Defect found:
     Expected result: User should add valid email format address.
     
     Actual result:   invalid email address format accepted.
     
10.  ####  Issue
     Toppings 2 text has error.
     
     Expected: Toppings 2 ( there should be space between text and digit).
     
     Actual: Toppings2

BVA:
 1. As a user I should be able to submit quanity between 1 and max number (based on requirements)

Equivalence Partitioning:
1.  As a user I should be able to submit quantity between -100 and 500 (based on req)
    My approach on quantity would be:
    Quantity: -34,45,169,227,398,442;
    

####  Notes: 
 As a tester:
 1. Performed manual testing as well as Ad-hoc testing without having documentation 
 2. Listed positive, negative, EP and BVA strategy to my test cases
 3. Listed observed defects and issues found and marked them as notes above. 
 4. Implemented Page Object Model pattern in the framework
 5. Created 2 test cases happy path and negative tc in DemoTest  
 6. Added utility class for reusability 
 7. Implemented inheritance and encapsulation in the framework.
 