A simple Spring Boot application to demonstrate how Embedded DB isn't closed in between `@DirtiesContext` tests.

To make it working just uncomment `tomcat-jdbc` `<exclusion>` in the POM.