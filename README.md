#  API de Gerenciamento de Tarefas (To-Do List)
Uma API RESTful desenvolvida em Java com Spring Boot para gerenciar uma lista de tarefas. Esta aplicação deverar criar, ler, atualizar e excluir tarefas, categorias e usuários.


## Diagrama de Classes (Domínio da API)
```mermaid
classDiagram
    class Task {
        +Long id
        +String title
        +String description
        +String status
        +User assignedTo
        +Category category
    }
    
    class User {
        +Long id
        +String name
        +Integer age
    }
    
    class Category {
        +Long id
        +String name
    }
    
    Task "1" -- "0..1" User
    Task "1" -- "0..1" Category

```
