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
### JDBC Example