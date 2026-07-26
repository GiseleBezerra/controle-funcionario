# Controle de Funcionários

## 📖 Sobre o projeto

Este projeto foi desenvolvido com o objetivo de aprofundar os estudos em **Java**, **Programação Orientada a Objetos (POO)** e **Spring Boot**.

---

## 🚀 Tecnologias utilizadas

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* Banco de Dados Relacional
* Maven
* Lombok

---

## 📚 Conceitos praticados

Durante o desenvolvimento deste projeto foram aplicados os conceitos:

* Programação Orientada a Objetos

  * Herança
  * Encapsulamento
  * Polimorfismo
  * Abstração
* API REST
* Arquitetura em Camadas

  * Controller
  * Service
  * Repository
  * Entity
* Persistência de dados com JPA/Hibernate
* Mapeamento de entidades
* Herança com `@Inheritance(strategy = InheritanceType.JOINED)`
* Enumeração (`Enum`)
* CRUD completo
* Atualização parcial de registros (PUT)
* Injeção de Dependências
* Utilização de ResponseEntity
* Organização de projeto utilizando boas práticas

---

## 📂 Estrutura do projeto

```text
src
 ├── controller
 ├── entity
 │    └── enums
 ├── repository
 ├── service
 └── ControleFuncionarioApplication
```

---

## ⚙️ Funcionalidades

A API permite realizar operações de CRUD para diferentes tipos de funcionários:

* ✅ Cadastrar Gerente
* ✅ Cadastrar Desenvolvedor
* ✅ Cadastrar Estagiário
* ✅ Listar todos os registros
* ✅ Buscar por ID
* ✅ Atualizar informações
* ✅ Remover registros

Cada tipo de funcionário possui sua própria entidade, controller, service e repository, permitindo praticar os conceitos de herança juntamente com o Spring Data JPA.

---

## 📌 Endpoints

### Desenvolvedor

| Método | Endpoint                        |
| ------ | ------------------------------- |
| POST   | `/desenvolvedor/criar`          |
| GET    | `/desenvolvedor/listar`         |
| GET    | `/desenvolvedor/listar/{id}`    |
| PUT    | `/desenvolvedor/atualizar/{id}` |
| DELETE | `/desenvolvedor/deletar/{id}`   |

### Gerente

| Método | Endpoint                  |
| ------ | ------------------------- |
| POST   | `/gerente/criar`          |
| GET    | `/gerente/listar`         |
| GET    | `/gerente/listar/{id}`    |
| PUT    | `/gerente/atualizar/{id}` |
| DELETE | `/gerente/deletar/{id}`   |

### Estagiário

| Método | Endpoint                     |
| ------ | ---------------------------- |
| POST   | `/estagiario/criar`          |
| GET    | `/estagiario/listar`         |
| GET    | `/estagiario/listar/{id}`    |
| PUT    | `/estagiario/atualizar/{id}` |
| DELETE | `/estagiario/deletar/{id}`   |

---

## 💡 Próximas melhorias

Este projeto continuará recebendo melhorias conforme avanço nos estudos. Algumas funcionalidades planejadas são:

* DTOs
* Bean Validation
* Tratamento global de exceções (`@RestControllerAdvice`)
* Swagger/OpenAPI
* Paginação
* Filtros de pesquisa
* Front-end em React consumindo a API
* Docker
* Testes unitários
* Autenticação com Spring Security
* Refatoração para reduzir duplicação de código

---
