# dac-jpa-web

Este projeto exemplifica o uso da especificação JPA em um ambiente JavaEE.
Há duas possibilidades de configuração: a anotação `DataSourceDefinition` e o arquivo `glassfish-resources.xml`.

Observem que no `persistence.xml` a configuração do `<jta-data-source>` muda conforme a opção selecionada.

* `DataSourceDefinition`: `<jta-data-source>java:app/jdbc/repositorio</jta-data-source>`
* `glassfish-resources.xml`: `<jta-data-source>java:app/jdbc/jpa</jta-data-source>`