
For Best Practice How can I Solution the design Vending Machine Implementation and standard Coding.
I have  implementation and design of Java Vending Machine has below classes and interfaces :

 #VENDING

1. VendingMachine
   In this Interface. It is Indicates the public API of vending machine, Generally all high-level functionality should go in this class

2. VendingMachineFactory
   This Factory class to create several kinds of Vending Machine
  
3. VendingMachineImpl
   This class has  Simple implementation of Vending Machine
  
4. Inventory
   Inventory Java class to analysing an Inventory, used for making case and item inventory for internal Vending Machine
  
5. Bucket
   Bucket is parameterized class to hold two objects. we can say kind  of Pair class.
   
 #ENUM

1. Item
   This Java Enum has represent Item default served by Vending Machine
  
2. Coin
   Coin Java Enum to represent Coins accepted by Vending Machine
   


 #EXCEPTIONS

1. DoNotFullPaidException
   This Exception thrown by Vending Machine when a consumer tries to collect an item, without paying the full amount.

2. DoNotSufficientChangeException
   Vending Machine is throws this exception to indicate that it does not have available sufficient change to complete this request.

3. SoldOutException
   Vending Machine is throws this exception if the consumer request for a product (Coke, Pepsi and Soda) which is sold out
  
 
 
 
 
 #TESTING
 This Tests are working with Junit and Command line belows are briefly Instructions:
 
   
 ####JUnit Test of Vending Machine Solution
 
 
 
 I downloaded Plugins & Dependencies junit:junit:4.13.1 with org.hamcrest:hamcrest-core:1.3
 more information click on External Libraries left hand side.
 
 With the help of unit test class for the Vending Machine problem, 
 Which tests some behaviors of Vending machine e.g buying products with correct change, with more change, less change, 
 Canceling an product, resetting the vending machine, etc. 
  
  
  #Note  Belows set up are as per my machine. It might you have diff set up please make sure check it.
  
1. In Junit VendingMachineTest I created in Configurations to run below Junit test

   This test includes
   # testrest,testNotSufficientChangesException,testBuyItemWithMorePrice
   #testBuyItemWithExactPrice,testRefund,testSoldOut
   
   Name : VendingMachineTest
   Class :vending.VendingMachineTest
   VM options : -ea
   Use class path of modules : vending machine
   JRE : 1.8.0_241
   Shorten command line : use-local default
   
2. This test includes
   #testBuyItemWithMorePrice
   Name: VendingMachineTest.testBuyItemWithMorePrice
   Class: vending.VendingMachineTest
   Method: testBuyItemWithMorePrice
   VM options : -ea
   Use class path of modules : vending machine
   JRE : 1.8.0_241
   Shorten command line : use-local default
   
   
   
   
   ####How to run in Command line
  
   For command line how to run and what is requirement so I created Step By step instructions as below.
   
   #Note This steps are might be different for your set up please make sure including all versions
   
   
   
   
   #FIRST STEP
   
   How  to check Install JDK in window 10 machine. I need to do it for my machine.
   Make sure JDK install in your machine and JAVA_HOME environment Variable configured too. 
   So how do we check whether we have or not.
   In your machine left hand side bottom search bar just type in advance and screen appear with In settings.
   
   #View advanced system settings
   click on it. It will take you to Environment variables page.
   
   In my machine I have User variables for Sanjay
   Make sure variable Name as JAVA_HOME and Variable value which is JDK path.
   I have set up like this  Variable Name   JAVA_HOME
                            Variable Value    C:\Program Files\Java\jdk1.8.0_241
                            
   This is Optional ( Variable Name M2_HOME 
                     Variable Value    G:\software\apache-maven-3.6.3 or C:\Users\Sanjay\.m2)
                                                          
   #SECOND STEP
   #How to download apache maven                         
   
   How to Install apache maven in window 10.
   We need to download apache maven zip from official website and Unzipped to the folder.
   It configured to apache maven in window machine.
   
   In Browser just type apache maven click on welcome to apache maven and click on Download tab. 
   It will be navigate to download page. It will take few minute to download. 
   
   Then one more thing to do scroll down same page you can see below details.
   #Binary Zip archive   CLICK  THIS LINK apache-maven-3.6.3-bin.zip
    
   
   Which is download apache maven zip file. It will take few minutes to download. 
   Please go to download folder and you can see 
   #apache-maven-3.6.3 bin  zip file there.
   Click on it and just Extract in 7-zip and click on Extract to apache-maven-3.6.3-bin\” same folder.
   You will get Unzipped file with same Name you can apache-maven folder. Where ever you like it.
   In my machine I have this folder path from download.
    
   #C:\Users\Sanjay\Downloads\apache-maven-3.6.3-bin\apache-maven-3.6.3
   Copy above path for variable value.
   
   # THIRD STEP
   
   Now I have to set up maven environment variable.
   Please go to In left hand side  bottom search bar type again advance and it will appear 
   #View advances system settings 
   Click on it and screen appear with ###System Properties## in bottom Environment  variable bar click on it.
   In System variables section just click new.
   
   Variable Name:  MAVEN_HOME
   Variable Value: C:\Users\Sanjay\Downloads\apache-maven-3.6.3-bin\apache-maven-3.6.3
   
   And click on ok same section click on path then Edit and Edit Environment variable screen appear click on new.set as a Path 
   #%MAVEN_HOME%\bin 
   Why we are doing this because of no need to give full path again in bin folder for keep place holder.
   this will give apache maven path then click on ok and ok came out from screen. This is the full step by step how to configured in apache-maven in window 10.
   
   Now Let’s us Verify whether the apache maven property configuration in window 10 machine.
   
   #FORTH STEP
   #How to log in Command Prompt
   In click on left hand side bottom search bar and type it cmd or command. It will appear dark screen.
   which is mentioned your path. I have below path
    
   Check for full version use below command and execute 
    C:\User\Sanjay>
    C:\User\Sanjay>mvn –version and Enter.
   
   You will get response message with apache maven configured or not with full details are below.
   
   #Apache maven Version, JAVA_HOME, JAVA Version and OS Name etc.
   
   
   #How to Run  Junit in command line
   
   You can run the following command to run all your test cases:
   mvn clean test
   
   You can run a for particular test as below
   
   mvn clean test -Dtest=vending.VendingMachineTest
   
   mvn clean test -Dtest=vending.VendingMachineTest#testBuyItemWithMorePrice 
   
   ########
   
  
   
   
   
