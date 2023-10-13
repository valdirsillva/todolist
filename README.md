# Todolist 

Aplicação de gerenciamento de tarefas construída com spring boot.

## Tecnologias
- Java
- Sprint Boot
- Lombok
- H2 Database
- Bcrypt

## Cadastrar usuário

Envie solicitação POST para o endpoint [https://todolist-app-java.onrender.com/users/]. 
Você deve fornecer os seguintes dados em formato JSON no corpo da solicitação:

```json
{
   "name": "nome do usuário",
   "username": "username",
   "password": "senha"
}

```

## Cadastrar uma tarefa

Adicione a autenticação Basic Auth. 
Em seguida, preencha o username e senha.

Envie solicitação POST para o endpoint [https://todolist-app-java.onrender.com/tasks/]. 
Você deve fornecer os seguintes dados em formato JSON no corpo da solicitação:

```json
{
   "title": "Título da Tarefa",
   "description": "Descrição da Tarefa",
   "startAt": "Data e Hora de Início (no formato ISO 8601)",
   "endAt": "Data e Hora de Término (no formato ISO 8601)",
   "priority": "Prioridade da Tarefa"
}

```

## Atualizar uma tarefa

Adicione a autenticação Basic Auth. 
Em seguida, preencha o username e senha.

Envie solicitação PUT para o endpoint [https://todolist-app-java.onrender.com/tasks0d98bccc-e181-4eb0-bbe6-2c5bffe2d2bb] com o id da tarefa. 

Você deve fornecer os seguintes dados em formato JSON no corpo da solicitação:

```json
{
   "title": "Título da Tarefa",
   "description": "Descrição da Tarefa",
}

```

## Listar tarefas cadastradas por usuários

Adicione a autenticação Basic Auth. 
Em seguida, preencha o username e senha.

Envie solicitação GET para o endpoint [https://todolist-app-java.onrender.com/]. 


