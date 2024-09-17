
---
# First Tutorial
<!-- toc -->

- [First Tutorial](#first-tutorial)
* [Educational Licence](#educational-licence)
* [Jetbrains Toolbox](#jetbrains-toolbox)
* [Download Intellij IDEA Ultimate](#download--intellij-idea-ultimate)
* [Create a project](#create-a-project)
    + [Setup SDK/JDK](#setup-sdkjdk)
* [Setup SDK/JDK for the PC](#setup-sdkjdk-for-the-pc)
* [Your First Run](#your-first-run)
* [Compile and Intrepreter](#compile-and-intrepreter)
* [Examples](#examples)
* [Task:](#task)
* [Further Study:](#further-study)
* [Your first shortcuts in Intellij IDEA Ultimate](#your-first-shortcuts-in-intellij-idea-ultimate)

<!-- tocstop -->
---
## Educational Licence 
* Open the link and fill out the form using your UCY email address
  * https://www.jetbrains.com/shop/eform/students

## Jetbrains Toolbox 
  * Download the application : 
    * https://www.jetbrains.com/toolbox-app/

## Download  Intellij IDEA Ultimate
  * Open JetBrains  Toolbox  
  * Find Intellij IDEA Ultimate and click Install
  * Activate educational licence 


---

## Create a project
  * Open  Intellij IDEA Ultimate
  * Log in with UCY email
  * In the window  `Welcome to Intelij IDEA` window select `New Project`
![New Project window](New_project_1.png)
---

### Setup SDK/JDK  
* The window below will appear:
    * ![SDK](New_project.png)
 * Name your project , e.g. "First Tutorial"
 * Select a location for ECE318 projects and the specific project.
 *  Click on the JDK option and select Download JDK	
 * **Note : JDK acts as an SDK within IntelliJ.
---
## Setup SDK/JDK for the PC  
* Open the Environment Variables:
  * Press Windows key + S and type Environment Variables.
  * Click Edit the System Environment vVriables.


* Edit the PATH Variable:
  * In the System Properties window, click Environment Variables.
  * Under System variables, locate and select Path, then click Edit.
  * Click New and add this path:
    `C:\Users\<user_name>\.jdks\openjdk-22.0.2\bin`
  * Click OK to save and close all windows.
 

* Verify the Setup:
  * Open a new PowerShell or Command Prompt and run:
      `javac -version`


---


## Your First Run
* This is the structure of a project
  *  ![project](project%20structure.png)
---
* Click the green button to run the code:
  * ![first_run](first_run.png)
---
## Compile and Intrepreter
* ![compile](compilation.png)
---
* ![src](src.png)
---
* ![class](class.png)
---
## Examples 
* ![](./carbonn/main.png)
---
* ![](./carbonn/second.png)
---
* ![](./carbonn/variables.png)
---
* ![](./carbonn/ar0.png)
---
* ![](./carbonn/ar1.png)
---
* ![](./carbonn/ar2.png)
---
* ![](./carbonn/ar3.png)
---



## Task:

1. **Run** the above and interact with the outputs.

2. **Create a program** with the name `MyRecord.java` that will print your information.

3. The program should **print out** the following information using `System.out.println();`:
  - **Name and Surname** (e.g., Angelos Marnerides)
  - **Date of birth** (e.g., 01/05/1980)
  - **Town** (e.g., Larnaca)
  - **Sex** (e.g., M or F)
  - **Course codes taken** for this semester (e.g., ECE318, ECE311)
  - You should store the corresponding information in arrays and then printing the array(s).
---

## Further Study:
* variables : https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
* Arrays :
  * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
  * https://www.geeksforgeeks.org/array-class-in-java/?ref=lbp
* java.util: https://docs.oracle.com/javase/8/docs/api/java/util/package-summary.html



## Your first shortcuts in Intellij IDEA Ultimate
*  Set up mouse wheel for zoom in/out:
   1. File -> project structure
      * Go to File > Settings -> Editor > General.
          - Find the section : `Mouse Control`.
          - Check the box  `Change font size (Zoom) with Ctrl+Mouse Wheel`.
          - Click Apply and then OK.
* Comments
  * `//` 
  * Ctrl + `/` -> comment a line  or multiple 
  * Ctrl + Shift + `/` -> comment with `*/`


* Add ';' in the end of a line: 
  *  Ctrl+ Shift + Enter  
 

* Close and open `Project Window `
   * Open : Alt + 1 
   * Close: Shift + Esc


* Run code 
   * Ctrl+Shift+ f10 -> run current code 
   * Fn+ Shift + f10 -> Run the last run code 

---
