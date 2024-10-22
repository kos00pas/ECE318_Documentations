# Goals 
Scope: Create and interact with databases in IntelliJ
- MySQL
- Maven Module
- Database Tool 
- JDBC 

# Download MySQL 
- link: [https://dev.mysql.com/downloads/mysql/] :
  - get: Windows (x86, 64-bit), MSI Installer
    - At `Choosing a Setup Type` select  `Developer Default` 
    - At `Accounts and roles` set MySQL root password and add a User in `MySQL User Account` with user's new password 
    - ** We will need these usernames and passwords in the future.


# Maven 
- Create a new Project
- in the project create a new Module with:
  - Name: `Project_Database`
  - Module build system :`MAVEN `   
- upload the attached pom.xml
- GO TO :View ->Tool Windows -> Maven
- make reload to take the changes of new pom.xml
- Now you will be able to see `Project_Database` with subfolders 
  - `Lifecycle`, `Plugins`, `Dependencies`, `Repositories`

# Database tool 
- GO TO :View ->Tool Windows -> Database 
- Select on the left side teh `(+) button` , then `Data source` and then `MySQL`
- At the new Window:
  1. Tab `Data Sources` (upper left-side)  
  - Give the name `The_Job_Database`
  - Add the user and password that you add in MySQL tab `Accounts and roles`
  2. Tab `Drivers` (upper left-side)
  -  At `Driver Files` click the `(+) button`
  - Select : `Provided Driver` -> `MySQL Connector/J` -> `Latest stable`
  - Click `Apply` 
 3. Tab `Data Sources` (upper left-side)  
    - click `Test Connection` (bottom lef )
      - if everything is okay  click `Apply`
 4. At Database tool will now appear the `The_Job_Database` select it 
    - From menu select the  `Jump to Quere concole` and then -> `Default Query console`
      - Write and run separately each command :
    ```bash 
      create database The_Job_Database;
      use The_Job_Database;
      CREATE TABLE job_data (
                          job_id TEXT,
                          experience TEXT,
                          qualifications TEXT,
                          salary_range TEXT,
                          location TEXT,
                          country TEXT,
                          latitude TEXT,
                          longitude TEXT,
                          work_type TEXT,
                          company_size TEXT,
                          job_posting_date TEXT,
                          preference TEXT,
                          contact_person TEXT,
                          contact TEXT,
                          job_title TEXT,
                          role TEXT,
                          job_portal TEXT,
                          job_description TEXT,
                          benefits TEXT,
                          skills TEXT,
                          responsibilities TEXT,
                          company TEXT,
                          company_profile TEXT
    );
    DESCRIBE job_data;
    SELECT COUNT(*) FROM job_data;
    ```
