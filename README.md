## Configuration service for configuring microservices property files

### Deploy:

to deploy configuration server, developer needs to configure environment variables:

1. PORT - spring application port, by default - 8888
2. ZIPKIN_PORT - URL to Zipkin distributed tracing system, by default - http://localhost
3. CONFIG_ENCRYPT_KEY - encryption key for password and sensitive info, by default - foMilky86GHmxB7C9

### Administration:

After making critical changes (changes to API or adding new functionality),  <br>
developer need to upgrade:

1. up server version: X.X.X in build gradle file
2. up version in Procfile file, run updateProcfile task
   <br>
   '<b>updateProcfile</b>' task designed to update Procfile file that HEROKU service uses for deployment

### Testing:

Postman collection is used for testing

* location: /info/Server_Config_API.postman_collection.json

### Documentation:

* [Spring Cloud Documentation](https://cloud.spring.io/spring-cloud-config/reference/html/)
* [Simple example](https://betacode.net/11723/understanding-spring-cloud-config-server-with-example)

Note: Once you copy the JCE libraries you will need to kill the running Java process and start it again. If that does
not help, restart your computer.
If you have java version > 8, then the JCE library is supported by default.