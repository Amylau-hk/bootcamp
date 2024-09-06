## Maven

### Lombok
- 1. Project -> maven (pom.xml) -> add a new dependency -> lambok
- 2. mvn compile -> download classes (Getter, Setter, ToString, etc...)
- 3. Inject all those classes into your maven project
- 4. Annotate "@Getter" in your class -> import those classes into your class

- Java Compile-time vs Lombok
  - Java doesnt understand the meaning of "@Getter"
  - Lombok Library "tech" Java Compiler how to convert to Java code before compile

  mvn dependency:tree
  -check if the dependency exist