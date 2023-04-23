smunir2001@gmail.com | April 23rd, 2023 | Java JDBC Tutorial
# Java JDBC Tutorial
## JDBC (Java Database Connect)
### What is JDBC?
JDBC is a tool or an application programming interface that establises a connection between a standard Database and
Java application that intends to use that database.
### Need of JDBC
1. Establishing database connectivity.
2. To execute MySQL queries and DDL/DML commands.
3. View and modify data records.
### Dataypes in JDBC
| SQL | Java |
|-----|------|
| VARCHAR | java.lang.String |
| BIT | boolean |
| INTEGER | int |
| REAL | float |
| FLOAT | float |
| DOUBLE | double |
| BINARY | byte[] |
| DATE | java.sql.Date |

| SQL | Java |
|-----|------|
| TIMESTAMP | java.sql.Timestamp |
| ARRAY | java.sql.Array |
| REF | java.sql.Ref |
| STRUCT | java.sql.Struct |
| CHAR | java.lang.String |
| BIGINT | long |
| VARBINARY | byte[] |
| CLOB | java.sql.Clob |
| BLOB | java.sql.Blob |
### JDBC Architecture
    Application
    -> JDBC API
        -> JDBC Manager
            -> JDBC Drivers
                -> SQL Server
                -> Oracle DB
                -> Source
### JDBC Environment Setup
Setting up Java environment:
1. Download the latest JDK.
2. Set Java_Home.
3. Set Java path.

Setting up MySQL environment:
1. Download the latest MySQL Workbench.
2. Extract the file.
3. Run the Setup file.
### Steps to Connect JDBC
This procedure is followed to make sure the relevant packages are readily available for the API.
1. Import packages.
2. Load and register drivers (the imported drivers need to be loaded and registered for establishing a connection between application and database).
3. Connecting database (after the first two steps, the next stage is to connect the database. This can be done by __*getConnection()*__).
4. Writing a query (we write in the SQL command or query that we need to execute).
5. Executing query (the query from the API is executed using __executeQuery()*__)
6. Processing result (after step five, the system basically does two things: 1. Process output. 2. Retrieve values.).
7. Closing statement (the *resultSet* and statement needs to be closed explicitly).
8. Closing connection (the last stage is to disconnect ourselves or the API from the database).
### JDBC Example