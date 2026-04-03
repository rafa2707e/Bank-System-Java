# 🏦 Sistema Bancário em Java

Sistema de conta bancária desenvolvido em Java com foco em **Orientação a Objetos**, aplicando conceitos reais como encapsulamento, exceções customizadas e persistência de dados em arquivo.

---

## 📌 Sobre o Projeto

Este projeto simula as operações básicas de uma conta bancária via terminal. O objetivo foi praticar e consolidar os fundamentos de POO em Java, indo além do básico ao implementar tratamento de exceções personalizado e persistência automática das transações em arquivo `.txt`.

---

## ✅ Funcionalidades

- 💰 **Depositar** — adiciona valor ao saldo e registra a operação
- 💸 **Sacar** — valida saldo antes de executar, lança exceção se insuficiente
- 📋 **Extrato** — exibe o histórico completo de transações da sessão
- 💾 **Persistência automática** — cada operação é salva em um arquivo `.txt` gerado automaticamente por conta

---

## 🧠 Conceitos de POO Aplicados

| Conceito | Como foi aplicado |
|---|---|
| **Encapsulamento** | Atributos `private` com acesso via getters |
| **Exception customizada** | `SaldoInsuficienteException` estende `Exception` |
| **Tratamento de exceções** | `try/catch` no Main captura erros de saque |
| **ArrayList** | Histórico de transações armazenado em lista |
| **FileWriter / PrintWriter** | Persistência das operações em arquivo `.txt` |
| **Scanner** | Menu interativo via terminal |

---

## 🗂 Estrutura do Projeto

```
sistema-bancario-java/
│
├── Main.java                      # Ponto de entrada — menu interativo
├── ContaBancaria.java             # Classe principal com regras de negócio
├── SaldoInsuficienteException.java # Exception customizada
└── conta_1234.txt                 # Gerado automaticamente ao rodar
```

---

## 🚀 Como Rodar

**Pré-requisitos:** Java instalado (JDK 8+)

```bash
# 1. Clone o repositório
git clone https://github.com/seu-usuario/sistema-bancario-java.git

# 2. Entre na pasta
cd sistema-bancario-java

# 3. Compile os arquivos
javac Main.java ContaBancaria.java SaldoInsuficienteException.java

# 4. Execute
java Main
```

---

## 💻 Exemplo de uso

```
--- MENU BANCÁRIO ---
1 - Depositar
2 - Sacar
3 - Ver histórico de transação
4 - Sair
Escolha uma opção: 1

Digite o valor a depositar: 200
Depósito de R$ 200.0 realizado com sucesso!
Saldo atual: R$ 300.5

--- MENU BANCÁRIO ---
Escolha uma opção: 2

Qual o valor que deseja sacar? 500
ALERTA: Saldo insuficiente! Seu saldo é R$ 300.5
Saldo disponível: R$ 300.5
```

---

## 📁 Persistência — arquivo gerado

A cada operação, o sistema salva automaticamente no arquivo `conta_{numeroConta}.txt`:

```
Deposito realizado $200.0
Foi sacado $50.0
Deposito realizado $100.0
```

---

## 🛠 Tecnologias

- **Java** — linguagem principal
- **POO** — paradigma aplicado
- **Java I/O** — FileWriter e PrintWriter para persistência
- **Java Collections** — ArrayList para histórico

---

## 📈 Próximos passos

- [ ] Adicionar classe `User` com múltiplas contas por usuário
- [ ] Implementar transferência entre contas
- [ ] Migrar persistência de `.txt` para banco de dados
- [ ] Criar API REST com Spring Boot em cima desse sistema

---

## 👨‍💻 Autor

**Rafael Oliveira**
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Rafael_Oliveira-blue?style=flat&logo=linkedin)](https://linkedin.com/in/rafael-oliveira)
[![GitHub](https://img.shields.io/badge/GitHub-seu--usuario-black?style=flat&logo=github)](https://github.com/seu-usuario)
