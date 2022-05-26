# jdbc-sql-sample
Spring Boot RESTful app with simple JDBC and MySql

### Setup MySQL on your local machine(Mac)
brew install mysql \
brew services start mysql \
mysql_secure_installation \
brew services stop mysql \ 
mysql.server start (To start mysql server) \
mysql -h localhost -u root -p (To connect to the mysql server) --> Enter password given in the 'mysql_secure_installation' step
[mysql> create database studentdb
mysql.server stop (To stop mysql server)

### Table Creation Query
CREATE TABLE movies(id INT NOT NULL AUTO_INCREMENT,name VARCHAR(30) NOT NULL,dept VARCHAR(60) NOT NULL,roll VARCHAR(50) NOT NULL,PRIMARY KEY(id));

Reference : 
[https://flaviocopes.com/mysql-how-to-install/](https://flaviocopes.com/mysql-how-to-install/) \
[https://phoenixnap.com/kb/how-to-create-a-table-in-mysql](https://phoenixnap.com/kb/how-to-create-a-table-in-mysql) \

### Configuration in application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb -- jdbd:mysql://[mysql host]:[port]/[database created in mysql] \
spring.datasource.username=root -- [mysql username] \
spring.datasource.password=root -- [mysql password] \

References:
[https://springframework.guru/spring-jdbctemplate-crud-operations/](https://springframework.guru/spring-jdbctemplate-crud-operations/) \
[https://www.baeldung.com/spring-jdbc-jdbctemplate](https://www.baeldung.com/spring-jdbc-jdbctemplate) \
[https://www.codeproject.com/Articles/1269020/Using-JdbcTemplate-in-a-Spring-Boot-Web-Applicatio](https://www.codeproject.com/Articles/1269020/Using-JdbcTemplate-in-a-Spring-Boot-Web-Applicatio) \
[https://www.javatpoint.com/spring-boot-jdbc-example](https://www.javatpoint.com/spring-boot-jdbc-example) \
