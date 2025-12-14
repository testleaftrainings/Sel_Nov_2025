

# Gherkin keyword:
    Feature:  Login functionality  of Leaftaps Application
              (Describes the functionality of an appliction)

           

    Scenario:  Login with Valid credentials
               (Represents a testcase)
      Given    Launch the browser     -> to represent the precondition of a scenario
      And      Load the url
      And      Enter the username as Demosalesmanager
      And      Enter the password as crmsfa
      When     Click on the Login button -> to represent the test condition  
      Then     Homepage should be displayed -> To represent the positive expected result  

    Scenario:  Login with InValid credentials
               (Represents a testcase)
      Given    Launch the browser     -> to represent the precondition of a scenario
      And      Load the url
      And      Enter the username   as Demo
      And      Enter the password   as crms
      When     Click on the Login button -> to represent the test condition  
      But      ErrorMessage should be displayed -> To represent the negative expected result    

# Dependencies:
    <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-java</artifactId>
			<version>7.10.0</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-testng -->
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-testng</artifactId>
			<version>7.10.0</version>
		</dependency>

# Steps to Create the layers of Cucumber
   1. Create 3 packages under src/test/java
        features
        steps
        runner
   2. Create feature file inside features package
        - Right click on features package ->  Click Other -> Double Click General
        -> Double click File -> Give Filename with .feature as extension -> Click Finish 
   3. Create StepDefinition class inside steps package
        - Inside StepDefinition create methods for each step defined in the feature file        
        - And put the real codes inside each methods
        - To integrate StepDefinition and the feature file on the top of each method
          use @Given/And/When/Then("")    
   4. Create CucumberRunner class inside runner package
         - The runner class should extend AbstractTestNGCucumberTests
         - Add @CucumberOptions on the top of the Runner Class
         - Within @CucumberOptions() use some of the attributes
             features   -> to mention the path of the feature file
             glue       -> to mention the package name of StepDefintion
             monochrome -> to remove the unreadable/junk characters from the console
             publish    -> to get the cucumber report in the console
          @CucumberOptions(features = "src/test/java/features/Login.feature",
                 glue = "steps"            ,
                 monochrome = true,
                 publish = true)
          public class CucumberRunner extends AbstractTestNGCucumberTests{

          } 
