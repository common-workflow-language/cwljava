[![Coverage Status](https://coveralls.io/repos/github/common-workflow-language/cwljava/badge.svg?branch=cwl-1.2.0)](https://coveralls.io/github/common-workflow-language/cwljava?branch=cwl-1.2.0)

# org.w3id.cwl.cwl1_2

This project contains Java objects and utilities  auto-generated by <a href="https://github.com/common-workflow-language/schema_salad">Schema Salad</a> for parsing documents corresponding to the https://w3id.org/cwl/cwl# schema.

## License

This project is licensed under the [Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0.txt).

## Contributing

This project is auto-generated by [Schema Salad](https://github.com/common-workflow-language/schema_salad)
and likely should not be modified directly. Instead consider filing an issue or opening
a pull request against the Schema Salad repository.

## Requirements

This Java library requires Java 8+. Building and testing this project requires
[Apache Maven](https://maven.apache.org/) (``mvn``).

## Usage

Compile the project, test it, and build a jar

    $ mvn install
    $ ls target/  # jar file in here

Building a standalone jar with all dependencies included and use it to validate a document

    $ mvn install
    $ mvn assembly:single
    $ java -jar target/<project_name>-0.0.1-SNAPSHOT-jar-with-dependencies.jar ../path/to/document.yml

Building and viewing JavaDocs

    $ mvn javadoc:javadoc
    $ open target/site/apidocs/index.html
