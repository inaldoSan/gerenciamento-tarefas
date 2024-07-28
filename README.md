#  API de Gerenciamento de Tarefas (To-Do List)
Uma API RESTful desenvolvida em Java com Spring Boot para gerenciar uma lista de tarefas. Esta aplicação deverar criar, ler, atualizar e excluir tarefas, categorias e usuários.


## Diagrama de Classes (Domínio da API)
```mermaid
classDiagram
  class User {
    -Long id
    -String name
    -int age
    -Task[] tasks
  }

  class Task {
    -Long id
    -String title
    -String description
    -User user
  }

  User "1" *-- "N" Task
  Task "N" *-- "1" User

```

## LINK API

[https://gerenciamento.up.railway.app/swagger-ui/index.html](https://gerenciamento.up.railway.app/swagger-ui/index.html)
