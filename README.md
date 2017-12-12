# Spring_Simple_Spring
# Spring Framework
It was developed by Rod Johnson in 2003. Spring framework makes the easy development of JavaEE application.

It is helpful for beginners and experienced persons.

# Spring Framework

Spring is a lightweight framework. It can be thought of as a framework of frameworks because it provides support to various frameworks such as Struts, Hibernate, Tapestry, EJB, JSF etc. The framework, in broader sense, can be defined as a structure where we find solution of the various technical problems.

The Spring framework comprises several modules such as IOC, AOP, DAO, Context, ORM, WEB MVC etc.
Let's understand the IOC and Dependency Injection first.

# Dependency Injection by setter method

Dependency Injection by constructor
Injecting primitive and string-based values

We can inject the dependency by setter method also. The <property> subelement of <bean> is used for setter injection.
  Here we are going to inject

primitive and String-based values
Dependent object (contained object)
Collection values etc.
Injecting primitive and string-based values by setter method
Let's see the simple example to inject primitive and string-based values by setter method. We have created three files here:

Student.java
applicationContext.xml
Test.java
