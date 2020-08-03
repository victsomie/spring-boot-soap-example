# spring-boot-soap-example

Implenting SOAP with spring boot.

Tutorial on https://www.youtube.com/watch?v=mr_2-AWYCoc

Referencing the official Guide: https://spring.io/guides/gs/producing-web-service/#scratch
## Steps
- Add wsdl4j dependency
   	
  ```
  <dependency>
        <groupId>wsdl4j</groupId>
        <artifactId>wsdl4j</artifactId>
        <version>1.6.3</version>
  </dependency>
  ```
  
 - Creating wsdl. Use XSD file to create schema.
 - Convert the schema definition into a java POJO
 - Create the Endpoint
 - Configure the web service
 
 
 - Add the request XML (Under Resources)
 
 
