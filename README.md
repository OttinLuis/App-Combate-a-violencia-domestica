# App Combate à Violência Doméstica

Sistema web desenvolvido para auxiliar no combate à violência doméstica, oferecendo recursos que facilitam denúncias, acesso à rede de apoio e informações para vítimas. O projeto tem como objetivo utilizar a tecnologia como ferramenta de conscientização, proteção e suporte.

## Funcionalidades

* Cadastro e autenticação de usuários
* Registro de denúncias
* Opção de denúncia anônima
* Compartilhamento de localização
* Cadastro automático de endereço por CEP
* Rede de apoio com instituições e contatos úteis
* Suporte psicológico
* Painel administrativo
* Validação de formulários
* Controle de acesso por usuários

## Tecnologias Utilizadas

* Java
* Spring Boot
* Spring MVC
* Spring Security
* Spring Data JPA
* Thymeleaf
* HTML5
* CSS3
* JavaScript
* PostgreSQL
* Maven

## Estrutura do Projeto

```text
src
├── main
│   ├── java
│   │   ├── config
│   │   ├── controller
│   │   ├── dto
│   │   ├── middleware
│   │   ├── model
│   │   ├── repository
│   │   ├── service
│   │   └── validation
│   └── resources
│       ├── static
│       ├── templates
│       └── application.properties
```

## Como executar

### Clone o repositório

```bash
git clone https://github.com/OttinLuis/App-Combate-a-violencia-domestica.git
```

### Entre na pasta do projeto

```bash
cd App-Combate-a-violencia-domestica
```

### Configure o banco de dados

Edite o arquivo `application.properties` com as configurações do PostgreSQL.

Exemplo:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/app
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Execute a aplicação

Pela IntelliJ IDEA ou utilizando o Maven:

```bash
./mvnw spring-boot:run
```

ou

```bash
mvn spring-boot:run
```

## Principais Módulos

* Login e autenticação
* Cadastro de usuários
* Denúncias
* Rede de apoio
* Suporte psicológico
* Administração do sistema
* Gerenciamento de usuários

## Objetivo

O sistema foi desenvolvido como projeto acadêmico com o propósito de aplicar conceitos de desenvolvimento web utilizando Spring Boot e arquitetura MVC, além de contribuir para a conscientização e o enfrentamento da violência doméstica por meio de recursos tecnológicos.

## Melhorias Futuras

* Aplicativo para dispositivos móveis
* Botão de emergência
* Notificações em tempo real
* Chat com profissionais especializados
* Integração com serviços de geolocalização
* Upload de imagens e documentos
* Dashboard com estatísticas
* API REST
* Testes automatizados
* Integração com serviços públicos de atendimento

## Autor

**Otto Luis**

GitHub: https://github.com/OttinLuis/App-Combate-a-violencia-domestica
