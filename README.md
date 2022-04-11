# Esquemas JSON e XML para a WebSTAMP

A WebSTAMP é uma ferramenta em *software* para auxiliar analistas de *safety* na confecção de análises de *hazards* (condições de perigo) usando a técnica STPA (*Systems-Theoretic Process Analysis*). A WebSTAMP não possui um esquema formalizado que permita importar e exportar análises de *hazards* compatíveis com esta técnica. Isto impede que analistas de *safety* utilizem análises feitas na WebSTAMP em outras ferramentas e usem análises exportadas de outras ferramentas na WebSTAMP.

Este trabalho final do curso de ciência da computação tem como objetivos (i) definir um esquema XML (*Extensible Markup Language*) e; (ii) definir um esquema JSON (*JavaScript Object Notation*) para a WebSTAMP permitindo portabilidade de análises de *hazards* entre ferramentas de *software* que suportem os esquemas.

Definimos os esquemas para XML e JSON usando XSD (*XML Schema Definition*) e JSON *Schema*,  respectivamente. Os esquemas foram utilizados na WebSTAMP e em uma segunda ferramenta para validar as funcionalidades de importação e exportação de análises de *hazards* em XML e JSON a partir de exemplos presentes na literatura. Salientamos que os esquemas e o código fonte da ferramenta independente estão presentes no repositório.



# Requisitos

- HTML
- CSS
- Javascript
- PHP
- Laravel
- Java



# Caso de uso: WebSTAMP

Utilizando dos esquemas JSON e XML produzidos neste trabalho, implementamos as funcionalidades de importação e exportação de análises de *hazard* (projetos) na WebSTAMP. 

### importação de análises:

Para o processo de importação o usuário realiza o upload da análise em formato JSON ou XML.

[imagem1.png]

Utilizando o esquema correspondente, XSD para documentos XML ou JSON Schema para documentos JSON, a análise a ser importada é validada. Uma vez compatível com nosso esquema, os dados presentes na análise são persistidos no banco de dados da WebSTAMP, criando-se um novo projeto na ferramenta.

[imagem2.png]

### Exportação de análises:

O processo de exportação apresenta duas opções ao usuário, exportar a análise em formato JSON ou XML.

[imagem3.png]

Após o usuário indicar sua escolha é realizado o download da análise no formato escolhido.

[imegem4.png]



# Ferramentas independentes 

Para o teste de portabilidade entra análises de *hazards* no formato de documentos XML utilizamos a API JAXB para a linguagem Java. A API pode ser atribuído em um projeto maven com as seguintes dependências:

```xml
<dependency>
  <groupId>javax.xml.bind</groupId>
  <artifactId>jaxb-api</artifactId>
  <version>2.2.11</version>
</dependency>

<dependency>
  <groupId>com.sun.xml.bind</groupId>
  <artifactId>jaxb-core</artifactId>
  <version>2.2.11</version>
</dependency>

<dependency>
  <groupId>com.sun.xml.bind</groupId>
  <artifactId>jaxb-impl</artifactId>
  <version>2.2.11</version>
</dependency>

<dependency>
  <groupId>javax.activation</groupId>
  <artifactId>activation</artifactId>
  <version>1.1.1</version>
</dependency>
```

Já para os testes de portabilidade das análises de *hazards* em formato JSON utilizamos a API GSON para a linguagem java. A API pode ser atribuído a um projeto maven com a seguinte dependência:

```xml
<!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.2</version>
</dependency>

```

 