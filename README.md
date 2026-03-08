# 📚 Sistema de Biblioteca em Java

Este projeto é um sistema simples de gerenciamento de biblioteca desenvolvido em **Java**, com o objetivo de praticar conceitos fundamentais de **Programação Orientada a Objetos (POO)**.

O sistema permite cadastrar livros, listar os livros disponíveis e realizar operações de empréstimo e devolução.


## 🎯 Objetivo

O principal objetivo deste projeto é exercitar conceitos importantes de desenvolvimento em Java, como:

- Classes e Objetos
- Construtores
- Métodos
- Encapsulamento
- Relacionamento entre classes
- Uso de coleções (`ArrayList`)

Este projeto também serve como base para evoluções futuras, adicionando novas funcionalidades ao sistema.


## ⚙️ Funcionalidades

O sistema possui as seguintes funcionalidades:

- 📖 Cadastrar novos livros
- 📋 Listar todos os livros da biblioteca
- 📦 Realizar empréstimo de um livro
- 🔄 Registrar devolução de um livro
- ✔️ Verificar disponibilidade do livro


## 🧩 Estrutura do Projeto

O projeto é dividido nas seguintes classes:

### Livro

Representa um livro da biblioteca.

**Atributos:**

- `titulo`
- `autor`
- `ano`
- `disponivel`

**Métodos principais:**

- `emprestarLivro()`
- `devolverLivro()`
- `exibirInformacoes()`


### Biblioteca

Responsável por gerenciar os livros cadastrados.

**Funções principais:**

- adicionar livros
- listar livros
- realizar empréstimos
- registrar devoluções

A biblioteca armazena os livros utilizando uma **ArrayList**.


### Main

Classe responsável por executar o sistema e simular o funcionamento da biblioteca.


## 🚀 Possíveis Melhorias Futuras

Algumas evoluções planejadas para o projeto:

- Implementar **encapsulamento completo (getters e setters)**
- Criar **busca de livros por título**
- Adicionar **classe Usuário**
- Implementar **controle de empréstimos**
- Criar **menu interativo no terminal**
- Persistência de dados


## 🛠️ Tecnologias Utilizadas

- **Java**
- **Programação Orientada a Objetos**
- **ArrayList**

## 👨‍💻 Autor

Desenvolvido por **Aryanny Galvão**  
Estudante de **Sistemas de Informação**

Projeto desenvolvido para fins de estudo e prática de Java.
