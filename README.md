# Projeto DevMagro 🚀

## Descrição do Projeto
Sistema de cadastro de usuários via CLI (Interface de Linha de Comando) desenvolvido em Java, com foco em práticas de Orientação a Objetos, manipulação de arquivos e tratamento de exceções.

## 🎯 Objetivos
- Criar um sistema de cadastro flexível e robusto
- Manipular arquivos de texto
- Implementar validações de dados
- Demonstrar conhecimentos em Java IO e Orientação a Objetos

## 🛠 Tecnologias Utilizadas
- Linguagem: Java 17
- Paradigma: Programação Orientada a Objetos
- Bibliotecas: java.io, java.util

## 📋 Funcionalidades

### Cadastro de Usuário
- Leitura de perguntas a partir de um arquivo externo
- Coleta de informações pessoais
- Validações de dados:
  * Nome com mínimo de 10 caracteres
  * Email com "@" obrigatório
  * Idade superior a 18 anos
  * Altura no formato de número com vírgula
- Prevenção de cadastros com emails duplicados

### Gerenciamento de Formulário
- Adicionar novas perguntas automaticamente
- Deletar perguntas (exceto as 4 iniciais)
- Listar usuários cadastrados
- Busca de usuários por nome ou email

## 🗂 Estrutura do Projeto

```
desafioDevMagro/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── devmagro/
│   │   │           ├── model/
│   │   │           ├── service/
│   │   │           ├── repository/
│   │   │           └── Main.java
│   │   │
│   │   └── resources/
│   │       ├── formulario.txt
│   │       └── usuarios/
│
└── README.md
```

## 📦 Passos do Desenvolvimento

### Passo 1: Leitura do Formulário
- Criar `formulario.txt`
- Implementar leitura de perguntas usando Java IO
- Armazenar perguntas em estrutura de dados

### Passo 2: Cadastro de Usuário
- Criar classe `Usuario`
- Capturar respostas do usuário
- Validar informações

### Passo 3: Persistência de Dados
- Salvar usuário em arquivo txt
- Nomear arquivo no padrão: `1-NOMEUSUARIO.TXT`

### Passo 4: Menu Principal
Opções:
1. Cadastrar usuário
2. Listar usuários
3. Cadastrar nova pergunta
4. Deletar pergunta
5. Pesquisar usuário

### Passo 5: Gerenciamento de Perguntas
- Adicionar perguntas automaticamente
- Impedir exclusão das 4 primeiras perguntas

### Passo 6: Busca de Usuários
- Implementar busca por nome ou email
- Suportar busca por termos parciais

### Passo 7: Validações
- Implementar tratamento de exceções
- Validar dados de cadastro
- Prevenir cadastros duplicados

## 🚨 Tratamento de Exceções
- `NomeInvalidoException`
- `EmailInvalidoException`
- `IdadeInvalidaException`
- `AlturaInvalidaException`
- `EmailDuplicadoException`

## 🔍 Como Executar
1. Clone o repositório
2. Compile o projeto com Java 17
3. Execute a classe `Main`

## 🤝 Contribuições
Contribuições são bem-vindas! Por favor, leia as diretrizes de contribuição antes de submeter um PR.

## 📄 Licença
[Inserir informações da licença]

## 🏆 Desafios e Aprendizados
- Manipulação de arquivos
- Validação de dados
- Tratamento de exceções
- Orientação a Objetos
