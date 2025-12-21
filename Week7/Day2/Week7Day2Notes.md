


# Pages
   - LoginPage
       enterUsername
         - return this
       enterPassword
       clickLoginButton
         - return new WelcomePage()
   - WelcomePage
        clickCRMSFALink
   - MyHomePage
       clickLeadsLink
   - MyLeadsPage
       clickCreateLeadLink
       clickFindLeadsLink
       clickMergeLeadsLink
   - CreateLeadPage
       enterCompanyName
       enterFirstName
       enterLastName
       clickSubmitButton
    - ViewLeadPage
       verifyLeads
       clickEditButton
       clickDeleteButton
       clickDuplicateButton                         
  
# Steps to Implement POM:
  1. Create a new Project and have all the dependencies inside the pom.xml
  2. Create 3 packages inside src/main/java
      - base
         Create a ProjectSpecificMethods and create 2 methods preCondition() and postCondition()
         and annotate with @BeforeMethod and @AfterMethod
         Create static driver as a global variable 
      - pages
         Create 6 classes for each page
         Each Classes inside pages package should extends ProjectSpecificMethods
         Create methods for each action inside each page
         Inside each method add return statement according to the page navigation
            if an action stays in the sama page -> return this
            if an action takes you to another page -> return new Page();
      - testcases  
          All classes inside the testcase package should extend ProjectSpecificMethods
          Create a class called RunLogin
          Create a method called runLogin and annotate with @Test
          Create object for LoginPage and call the method and execute 

# For Sequential Execution:
    - Driver declaration should be static
    - Create 2 testcases inside testcases package
         runLogin
         runCreateLead
    - Select the required testcases and convert into testng.xml file
    - Finally, run the testcases together sequentially from testng.xml file

# For Parallel Execution:
        - Remove static keyword in PSM
        - Create parameterized constructor in each pages
           public LoginPage(ChromeDriver driver) {
		        this.driver=driver;
	         }
        - Pass driver value in each Constructor initialization in each pages and testcases

# POM with Excel Integration:
   - Create data folder and have the excelsheets inside 
        Login
        CreateLead
   - Create a package called utils and have the ReadExcel java class inside
   - Create sendData() and annotate with DataProvider and call the readExcel() and return 
   - Replace all the hardcoded data with input arguments in the required pages
   - In the testClasses, use dataProvider attribute to receive the data 
     and pass input arguments in the test method.
   - Create setValues() in each testclass to mention the fileName and annotate with @BeforeTest 

       
       