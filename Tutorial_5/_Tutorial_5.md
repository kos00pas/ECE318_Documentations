

- add dependencies in pom.xml
```bash 
<dependencies>
        <!-- Add OpenCSV dependency for reading CSV files -->
        <dependency>
            <groupId>com.opencsv</groupId>
            <artifactId>opencsv</artifactId>
            <version>5.5.2</version>
        </dependency>
</dependencies>
```

- Database
-   View > Tool Windows > Database 
- create database  e.g. jod_database
- refresh 
  - jump to console and run : 
            `CREATE DATABASE job_database;`
- create a table with defining all columns
```bash
 USE job_database;
CREATE TABLE job_data (
                          job_id VARCHAR(255),                         -- Store the Job Id as a string
                          experience VARCHAR(255),                     -- Experience as a string
                          qualifications VARCHAR(255),                 -- Qualifications as a string
                          salary_range VARCHAR(255),                   -- Salary Range as a string
                          location VARCHAR(255),                       -- Location as a string
                          country VARCHAR(255),                        -- Country as a string
                          latitude VARCHAR(255),                       -- Latitude as a string
                          longitude VARCHAR(255),                      -- Longitude as a string
                          work_type VARCHAR(255),                      -- Work Type as a string
                          company_size VARCHAR(255),                   -- Company Size as a string
                          job_posting_date VARCHAR(255),               -- Date as a string
                          preference VARCHAR(255),                     -- Preference as a string
                          contact_person VARCHAR(255),                 -- Contact Person as a string
                          contact VARCHAR(255),                        -- Contact as a string
                          job_title VARCHAR(255),                      -- Job Title as a string
                          role VARCHAR(255),                           -- Role as a string
                          job_portal VARCHAR(255),                     -- Job Portal as a string
                          job_description TEXT,                        -- Full job description as text
                          benefits TEXT,                               -- Benefits as text
                          skills TEXT,                                 -- Skills as text
                          responsibilities TEXT,                       -- Responsibilities as text
                          company VARCHAR(255),                        -- Company Name as a string
                          company_profile TEXT                        -- Company Profile as text
);

```
- run CSVToDatabase
- run sql 
```bash 
DESCRIBE job_data;
SELECT * FROM job_data;
```