# Project Title

hydra-user-service for a user.

	-The Controller package is used for receiving requests and sending responses and consists of 4 classes.
		-These clases are UsersByIdController.java, UsersByBatches.java, UsersByRole.java, and UsersController.java.
	
	-The service is used for connecting the controller with the repository methods.
		-This service is then used for creating and implementing business logic.
		
	-The repository is for connecting to the repository through JPA methods.
	
		-These methods include finding users, adding new users, and updating previous users.
		-Using Oracle SQL as backend Database
		-Changing over to H2DB

### Prerequisites
* [OJDBC8](http://www.oracle.com/technetwork/database/features/jdbc/jdbc-ucp-122-3110062.html) - OJDBC version 8
	- With Maven installed run the command below. Replace {Path} with the file path to your OJDBC Jar (Ex: -Dfile="Z:\Program Files\OJDBC\ojdbc8.jar") and {Version} with your .jar's version (Ex: -Dversion=12.2.0.1)
	- mvn install:install-file -Dfile="{Path}" -DgroupId=com.oracle -DartifactId=ojdbc8 -Dversion={Version} -Dpackaging=jar
* Java JDK 1.8
## Built With

* [Spring](http://spring.io/) - The framework used
* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

1.0.0 

## Authors

* **John Brand - batch 1802 Feb 12 USF** - *Basic formatting* 
