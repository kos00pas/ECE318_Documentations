# Goals

  Scope: Set up MySQL, configure IntelliJ's Database Tool, and connect through JDBC using a Maven module.
  - Tools involved:
    - MySQL Database
    - Maven for dependency management
    - IntelliJ IDEA Database Tool
    - JDBC (Java Database Connectivity)


# Download MySQL
  
  1. Download MySQL from the official site: [https://dev.mysql.com/downloads/mysql/]
  2. Choose the **Windows (x86, 64-bit), MSI Installer**.
  3. During setup:
     - At **Setup Type**, select `Developer Default` to ensure all relevant components are installed.
     - At **Accounts and Roles**, set a **root password** and create a new **MySQL User**.
     - **Note:** Save your usernames and passwords, as they will be used in IntelliJ later.
  


# Maven Setup

   1. **Create a New Project**:
     - Open IntelliJ and create a new project using **Maven** as the build system.
   2. **Create a Module**:
   - In the project, create a new module and name it `Project_Database`.
   - Choose **Maven** as the module's build system.
   3. **Update `pom.xml`**:
   - Upload or copy the provided `pom.xml` file.
   4. **Reload Maven**:
   - Go to **View -> Tool Windows -> Maven** and reload the Maven project to reflect changes in `pom.xml`.
   5. You should now see `Project_Database` with subfolders like `Lifecycle`, `Plugins`, `Dependencies`, and `Repositories`.


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
                         -- fill it based on dataset entries  
                         company_profile TEXT
   );
   DESCRIBE job_data;
   SELECT COUNT(*) FROM job_data;
   ```
    
