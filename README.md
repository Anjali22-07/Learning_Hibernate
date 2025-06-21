# Learning_Hibernate
This is  Repo contains basics of Hinernate and this guide covers the fundamental concepts, setup, and usage of Hibernate to help you get started with building database-driven Java applications.

# Hibernate Learning Guide

Welcome to the Hibernate Learning Guide — your step-by-step resource to master Hibernate ORM for Java!

---

## 🚀 About Hibernate

Hibernate is a powerful, high-performance Object-Relational Mapping (ORM) framework for Java. It simplifies database operations by mapping Java objects to database tables, handling SQL generation, and managing data persistence seamlessly.

---

## 📚 What You Will Learn

- Setting up Hibernate in your Java project
- Understanding Hibernate architecture and core components
- Configuring Hibernate via annotations
- Mapping Java classes to database tables
- Performing CRUD (Create, Read, Update, Delete) operations
- Writing queries with Hibernate Query Language (HQL)
- Managing transactions and sessions
- cascading in hibernate
- caching- First and Second level cache
- Best practices and optimization techniques

---

## 🛠 Prerequisites

- Java Development Kit (JDK 8 or higher)
- Basic knowledge of Java programming
- Familiarity with relational databases and SQL
- IDE such as IntelliJ IDEA, Eclipse, or VS Code
- Maven or Gradle (recommended for dependency management)
- MySQL/PostgreSQL or any relational database installed

---

## ⚙️ Project Setup

1. **Add Dependencies**

   Add Hibernate core and your database driver dependencies in your `pom.xml` (Maven) or `build.gradle` (Gradle).

   Example (Maven):

   ```xml
  <!-- installed hibernate dependencies from google after searching for hibernate maven-->
		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-core</artifactId>
			<version>6.6.13.Final</version>
		</dependency>
		<!-- attached sql dependencies from google by searching mysql connector -->
		<!--https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>8.0.29</version>
		</dependency>

##  Configure Hibernate

Create a hibernate.cfg.xml file in src/main/resources with database and Hibernate settings:
use this dtd in your  hibernate.cfg.xml
<!DOCTYPE hibernate-configuration SYSTEM
    "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">

## Resources
Official Hibernate Documentation

Hibernate Tutorial by Code with Duresh

Java Persistence with Hibernate (Book)

## Feel free to explore the code and experiment with the examples.
## Happy Learning! 🎉


