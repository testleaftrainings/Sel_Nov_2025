# Parameterization:
  - No hardcoding of data inside the java classes
  - Preferred to automate them by passing from an external resource
     testng.xml, excel...

# 2 types:
  Static:
    - If it is common across multiple testcases
     Example:
        - url, username, password
  Dynamic

# Steps to implement Static Parameterization:
1. Identify the data that are common across all the testcases
2. Add parameter tag for each datas in the XML file
    ex: <parameter name="url" value="http://leaftaps.com/opentaps/control/main"></parameter>
3. Map the parameters in the class using @Parameters
    ex: @Parameters({"url","username","password"})    
   Note: The name should exactly match the names in the xml
4. Use that parameters inside the method using arguments
   Note: Sequence matters but the name of the arguments does not matter
5. Finally, replace the arguments with the hardcoded values

Note: You should always run from the xml file when you use parameters

# Dynamic Parameterization:
1. Identify the data that are need to be dynamic for the particular testcase
   ex: CreateLead : companyName, firstName, lastName, phoneNumber
       EditLead   : phoneNumber,companyName
2. Create a method sendData and annotate with @Dataprovider annotation and give a name for the DataProvider
3. Create an Input array with rowCount and columnCount
       - add datas into the array with index starting from 0
4. Return data back to the calling method
5. Receive the data in the testcase uding dataProvider attribute
6. Pass input arguments to the test method and replace all the hardcoded data       



@BS
  
    @BT

       @BC
        
         @DataProvider

           @BM
              
              @Test

           @AM

       @AC

    @AT          
         
@AS
# Steps to create excel sheet in data folder:
   - Right click -> Project -> Click New -> Click folder -> Folder name -> Finish
   - Right click on the data folder -> Show in system Explorer -> Open the data folder ->
     Create new Workbook-> Fill the datas in the excel sheet -> Select the data and Save and close
   - In eclipse -> refresh the data folder -> view the excel sheet

# How to do read data from Excel?
  - Microsoft Excel
  - Apache POI (access MS office software) using Java
  - Data from Excel
  - Excel extensions: .xls , .xlsx 
  .xlsx -> XSSFWorkBook 

  Workbook (CreateLead.xlsx)
    - WorkSheet (Sheet1, Sheet2)
       - Rows
         - Column(Cell)

# Steps:
   - Open the workbook using file name and the path of your file
   - Go to the Specific sheet (Sheet name / Sheet index)
   - Go to the Specific Row (by index)
   - Go to the specific Columns(Cell) -> By index


