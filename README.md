# Countries API

A Web API for data about countries of the World.

## Description

This web API provides access to information about countries of the World which was scraped with a [Go](https://github.com/jacques-navarro/go-country-scraper "Go Country Scraper") script from https://www.scrapethissite.com/pages/simple/. This project was built with Spring/Spring Boot and Spring Data JPA and accesses data from a PostgresQL database. 

## Getting Started

### Dependencies

This application was compiled with Eclipse Temurin 17.0.8, Spring Framework 6.1.3 and Spring Boot 3.2.2. The data is accessed with Spring Data JPA on a PostgresQL database running version 42.6.0. The data was scraped using a Go script that was compiled with Go 1.21.6.

### Execute Application

Follow these steps to compile and run the application:
1. Clone the project.

```agsl
git clone git@github.com:jacques-navarro/countries-api.git
```
2. `cd` into the project directory.

```agsl
cd countries-api
```
3. Run the Maven clean and package commands to create the `JAR` file.

```agsl
mvn clean package
```

4. Run the application.

```agsl
java -jar countries-api-0.1.0.jar
```
Alternatively, you can download the **countries-api-0.1.0.jar** file from the root directory of this repo and run `java -jar countries-api-0.1.0.jar` in the location where it was saved.

## API Endpoints

### GET
`/api/countries`    
`/api/countries/{id}`    
`/api/countries/name/{countryName}`    
`/api/countries/name/firstletter?firstletter={letter}`

`/api/countries/population`    
`/api/countries/population/{numberOfCountries}`

`/api/countries/capital`    
`/api/countries/capital/{capital}`    
`/api/countries/capital/firstletter?firstletter={letter}`

## Authors

![](Mastodon_logo.png) [@bunnythief@hachyderm.io](https://hachyderm.io/@bunnythief)

## Version History

* 0.1
    * Initial Release

## License

This project is licensed under the MIT License - see the LICENSE file for details.