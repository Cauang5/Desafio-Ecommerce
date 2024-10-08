# Desafio - Ecommerce

Desafio 03 do programa de bolsas da Uol Compass, onde foi solicitado o desenvolvimento de um e-commerce. 
Este projeto foi desenvolvido utilizando a arquitetura layered e implementa uma API RESTful para gerenciar produtos e vendas. O sistema oferece funcionalidades como criação, leitura, atualização e exclusão de produtos e vendas, controle de estoque, inativação de produtos, geração de relatórios de vendas, e cache otimizado para operações de leitura. A aplicação inclui autenticação via JWT e autorização baseada em permissões, com regras específicas para usuários com privilégios de ADMIN.


## Índice
1. [Funcionalidades](#funcionalidades-principais)
2. [Tecnologias Utilizadas](#tecnologias-utilizadas)
3. [Requisitos](#requisitos)
4. [Instalação](#instalacao)
5. [Uso](#uso)
6. [Diagrama de Classes](#diagrama-de-classes)


## Funcionalidades principais:

1. **CRUD de Produtos**: Permite que os usuários criem, leiam, atualizem e excluam produtos, com validações como preço positivo. Produtos associados a vendas não podem ser deletados, mas podem ser inativados.
2. **Controle de Estoque**: O sistema garante que produtos não possam ser vendidos quando o estoque estiver insuficiente.
3. **CRUD de Vendas**: Uma venda deve conter no mínimo 1 produto para ser concluída. Inclui controle de quantidade de produtos vendidos e atualização de estoque.
4. **Relatórios de Vendas**: Métodos para gerar relatórios de vendas por data, por mês e pela semana atual.
5. **Gerenciamento de Cache**: As operações de leitura de todos os produtos e vendas são otimizadas por meio de cache. O cache é invalidado automaticamente após operações de inserção para garantir a consistência dos dados.
6. **Tratamento de Exceções**: Todas as exceções são tratadas de maneira padronizada, com respostas uniformes.
7. **Autenticação e Autorização**: Implementação de autenticação via JWT, com autorização para garantir que apenas usuários autenticados acessem determinadas funcionalidades. Apenas usuários com permissão de ADMIN podem deletar ou cadastrar produtos e outros usuários com a mesma permissão.
8. **Reset de Senha**: Método para permitir que usuários redefinam suas senhas.


## Tecnologias Utilizadas

A aplicação foi desenvolvida utilizando as seguintes tecnologias:

- **Java 21**: Linguagem principal utilizada no desenvolvimento.
- **Spring Boot 3.3.3**: Framework para facilitar o desenvolvimento da API REST.
  - Spring Boot Starter Data JPA: Para persistência de dados e integração com o banco de dados.
  - Spring Boot Starter Web: Para construção da API REST.
  - Spring Boot Starter Security: Para implementação de autenticação e autorização.
  - Spring Boot Starter Cache: Para otimização e cacheamento de consultas.
  - Spring Boot Starter Validation: Para validação dos dados da aplicação.
  - Spring Boot DevTools: Para facilitar o desenvolvimento com atualizações automáticas durante a execução da aplicação.
- **PostgreSQL 42.7.4**: Banco de dados relacional utilizado em produção.
- **H2 Database**: Banco de dados em memória utilizado para testes e desenvolvimento.
- **Lombok**: Para reduzir a verbosidade do código, gerando automaticamente getters, setters e outros métodos utilitários.
- **JWT (JSON Web Token)**: Utilizado para autenticação e autorização segura.

## Requisitos

Para rodar o projeto localmente, você precisará ter instalado:

- **Java 21**: Linguagem utilizada para o desenvolvimento da aplicação.
- **Maven 3.6+**: Ferramenta de build utilizada para gerenciar as dependências e o ciclo de vida do projeto.
- **PostgreSQL**: Banco de dados utilizado em produção. Caso prefira, o H2 pode ser usado para desenvolvimento e testes, mas será necessário configurá-lo
- **Git**: Sistema de controle de versão utilizado para versionamento do código.


## Instalação

Siga os passos abaixo para rodar o projeto localmente:

### 1. Pré-requisitos

Antes de começar, certifique-se de ter os seguintes programas instalados em sua máquina:

- **Java 21**: [Instale o Java](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html)
- **Maven 3.6+**: [Instale o Maven](https://maven.apache.org/install.html)
- **PostgreSQL**: [Instale o PostgreSQL](https://www.postgresql.org/download/)
- **Git**: [Instale o Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)

### 2. Clonar o repositório

Clone o repositório do projeto usando o Git:
( O mesmo está ao fim do código) 

### 3. Configuração do banco de dados
spring.datasource.url=jdbc:postgresql://localhost:5432/ecommerce
spring.datasource.username=seu-usuario
spring.datasource.password=sua-senha

## Diagrama de classes

![image](https://github.com/user-attachments/assets/7d7b8759-8aab-4343-b87e-4084030e583d)


```bash
git clone https://github.com/usuario/nome-do-repositorio.git


