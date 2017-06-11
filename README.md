# spring-boot-rest-api-template
Spring boot REST API project template.

Setup
-----
- Clone and open in Intellij Idea IDE
- Change database connection config in `src/main/resources/application.properties`
- Install maven dependencies using IDE auto import or using the command ``mvn install``
- Run the app using ``mvn spring-boot:run``
- Browse ``http//localhost:8080/api/v1/users``
- Create package for deployment using ``mvn package`` (change properties if required)

Table Structure
---------------
``CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;``

``ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);``
  
``ALTER TABLE `users`
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;``