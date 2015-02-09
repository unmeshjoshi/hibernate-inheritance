# hibernate-inheritance
This project has some samples to demonstrate inheritance mappings using hibernate. It has samples for two techniques for mapping inheritance hierarchies to relational database talbes
- Union Subclass - Table per concrete class. Here a single table is created for each concrete subclass, which consists of all the attributes from all the classes in the inheritance hierarchy.
- Joined Subclass - Table per subclass. The table is created per subclass. But base class also has table. The results are fetched by joining two tables.  

To run the samples. 
- Download Gradle.https://gradle.org/
- Pull hibernate-inheritance repo.
- run 'gradle test' to make sure it runs correctly.
- run 'gradle idea' to generate idea workspace files.
