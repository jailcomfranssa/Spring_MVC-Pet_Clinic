# Pet Clinic

## Descrição

Este é um projeto de exemplo desenvolvido utilizando o Spring Framework 5, incluindo Spring Boot 2, Spring MVC, Spring Data JPA, Spring Data MongoDB, e Hibernate. O objetivo é criar um sistema de gerenciamento de clínicas veterinárias, que abrange tanto a camada de persistência de dados quanto a camada de interface do usuário.

## Estrutura do Projeto

O projeto é dividido em dois módulos principais:
- `pet-clinic-data`: Responsável pela camada de persistência de dados.
- `pet-clinic-web`: Responsável pela camada de interface do usuário.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.3.0**
- **Spring Framework 5**
- **Spring Data JPA**
- **Spring Data MongoDB**
- **Spring MVC**
- **Hibernate**
- **Thymeleaf**
- **H2 Database** (para testes)
- **MySQL Database** (para produção)
- **Lombok**

## Pré-requisitos

Antes de começar, você precisará ter o seguinte instalado no seu ambiente de desenvolvimento:

- **Java 17**
- **Maven 3.6+**
- **Git**

## Instalação

1. Clone o repositório do projeto:
    ```sh
    git clone https://github.com/jailcomfranssa/pet-clinic.git
    ```

2. Navegue até o diretório do projeto:
    ```sh
    cd pet-clinic
    ```

3. Compile e instale os módulos do projeto:
    ```sh
    mvn clean install
    ```

4. Execute a aplicação:
    ```sh
    cd pet-clinic-web
    mvn spring-boot:run
    ```

## Estrutura de Pastas

- `pet-clinic`: Projeto pai (root).
- `pet-clinic-data`: Módulo de persistência de dados.
- `pet-clinic-web`: Módulo de interface do usuário.

## Endpoints Principais

A aplicação expõe os seguintes endpoints principais:

- `/owners`: Gerenciamento de donos de pets.
- `/pets`: Gerenciamento de pets.
- `/vets`: Gerenciamento de veterinários.
- `/visits`: Gerenciamento de visitas.

## Configuração do Banco de Dados

### H2 Database (Para Desenvolvimento)

A configuração do H2 Database é automaticamente carregada durante o desenvolvimento. Você pode acessar o console H2 através do URL:




