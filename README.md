# ArangoDB Spring Boot Demo

> Simple demo using [ArangoDB Spring Data](https://github.com/arangodb/spring-data) with [ArangoDB Spring Boot Starter](https://github.com/arangodb/spring-boot-starter)

## Prerequisites

- Installed IDE [Lombok](https://projectlombok.org/) plugin
- Installed and running [ArangoDB](https://arangodb.com)
- Installed JDK 8+

## Setup

- Configure database connection in `src/main/resources/application.properties`
- Execute the class `DemoApplication`

## Usage

Executing the class `DemoApplication` starts an Spring Boot embedded Tomcat under default port 8080.

### Create an entity

`POST localhost:8080/entity` with json body `{ "name" : "John" }`

_response includes the stored entity enriched with an `id`_

### Read an entity

`GET localhost:8080/entity/{id}`

### Delete an entity

`DELETE localhost:8080/entity/{id}`

### Read all entities

`GET localhost:8080/entity`

### Read all entities with a specific `name`

`GET localhost:8080/entity?name=John`
