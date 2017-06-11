# spring-boot-rest-api-template
Spring boot REST API project template using jpa (Springboot REST API whch connects MySQL database).

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
    
API Doc & Sample
----------------
- List all users 
    ```
    GET /api/v1/users
    ```
- Create new user 
    ```
    POST /api/v1/users
    ```

    Body:
    ```
    {
        "name": "Mark Price",
        "email": "mark@devslopes.com",
        "mobile": "0123456789"
    }
    ```
    Content-Type:
    ```
    application/json
    ```
- Get specific user 
    ```
    GET /api/v1/users/1
    ```
- Update user
    ```
    PUT /api/v1/users
    ```
    Body:
    ```
    {
        "id":1,
        "name": "Jeffrey Way",
        "email": "jeffrey@laracasts.com",
        "mobile": "0123456789"
    }
    ```
    
    Content-Type:
    ```
    application/json
    ```
- Delete user
    ```
    DELETE /api/v1/users/1
    ```
Note
-----
For getting XML response use ``Accept`` header ``application/xml`` and ``application/json`` for JSON response.