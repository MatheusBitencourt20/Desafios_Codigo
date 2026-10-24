# 🟢 Básico — Princípios Básicos

Este repositório reúne desafios introdutórios de programação para praticar estruturas condicionais, laços de repetição e validação de valores.

---

## 📌 Desafio 01 — Sequência Equilibrada

### 📖 Descrição

Em uma maratona de estudos de Java, a Academia Loop and If criou um painel que avalia sequências digitadas pelos novatos. Cada participante envia vários números inteiros, e o painel precisa decidir rapidamente se a sequência foi equilibrada.

Uma sequência será considerada **equilibrada** quando contiver pelo menos um número par, pelo menos um número ímpar e nenhum valor negativo.

Sua tarefa é ler uma quantidade informada de valores e analisar a lista completa, seguindo as regras:

- **`equilibrada`**: todos os números são maiores ou iguais a zero e existe pelo menos um número par e um número ímpar.
- **`invalida`**: existe pelo menos um número negativo na sequência.
- **`incompleta`**: não existem números negativos, mas todos os números são apenas pares ou apenas ímpares.

O problema deve ser resolvido em um único programa, utilizando condicionais e laços, sem depender de arquivos extras ou bibliotecas externas.

### 📥 Entrada

A primeira linha contém um inteiro `N`, indicando quantos números serão analisados.

A segunda linha contém `N` números inteiros separados por espaços.

**Restrição:** `1 ≤ N ≤ 100`

### 📤 Saída

Imprima exatamente uma das três palavras, de acordo com a análise da sequência:

- `equilibrada`
- `invalida`
- `incompleta`

### 💡 Exemplos

| Entrada | Saída |
|---|---|
| `5`<br>`2 7 8 11 14` | `equilibrada` |
| `4`<br>`2 4 6 8` | `incompleta` |
| `3`<br>`1 3 5` | `incompleta` |
| `4`<br>`2 -1 6 9` | `invalida` |

### 🎯 Conceitos praticados

- Estruturas condicionais (`if`, `else`).
- Estruturas de repetição (`for` ou `while`).
- Operador módulo (`%`).
- Identificação de números pares e ímpares.
- Validação de números negativos.
- Controle de condições por meio de variáveis.

---

## 📌 Desafio 02 — Portais Numerados

### 📖 Descrição

Na Academia dos Desafios de Código, cada aprendiz precisa atravessar um corredor de portais numerados. Um portal só se abre quando o número informado segue uma regra simples de treinamento: ele deve ser positivo e divisível por 3.

O mestre quer um verificador automático para analisar vários portais em sequência e registrar o resultado de cada tentativa.

Implemente um programa que leia uma quantidade de testes e, para cada número recebido, decida qual mensagem deve ser exibida.

As regras são:

- **`INVALID`**: o número é menor ou igual a zero.
- **`OPEN`**: o número é positivo e divisível por 3.
- **`CLOSED`**: o número é positivo, mas não é divisível por 3.

O programa deve processar todos os casos usando estruturas de repetição e condicionais simples. Cada resultado deve ser produzido de forma independente, respeitando a ordem em que os números forem lidos.

### 📥 Entrada

A primeira linha contém um inteiro `N`, indicando quantas tentativas serão analisadas.

Nas `N` linhas seguintes, há um inteiro `X` por linha, representando o número digitado em um portal.

### 📤 Saída

Para cada tentativa, imprima uma linha com o resultado correspondente:

- `INVALID`, se `X ≤ 0`.
- `OPEN`, se `X > 0` e `X` for divisível por 3.
- `CLOSED`, nos demais casos.

### 💡 Exemplos

**Exemplo 1**

Entrada:
```text
1
9
```

Saída:
```text
OPEN
```

**Exemplo 2**

Entrada:
```text
1
10
```

Saída:
```text
CLOSED
```

**Exemplo 3**

Entrada:
```text
1
0
```

Saída:
```text
INVALID
```

**Exemplo 4**

Entrada:
```text
3
3
4
-2
```

Saída:
```text
OPEN
CLOSED
INVALID
```

### 🎯 Conceitos praticados

- Estruturas condicionais (`if`, `else if`, `else`).
- Estruturas de repetição (`for` ou `while`).
- Operadores relacionais (`>`, `≤`).
- Operador módulo (`%`) para verificar divisibilidade.
- Validação de entradas.
- Processamento de múltiplos casos de teste.

---

## 🚀 Objetivo geral

Praticar os fundamentos da programação por meio de problemas que exigem análise de dados, tomada de decisão e repetição de instruções.

Os dois desafios ajudam a desenvolver o raciocínio lógico e a compreender como combinar estruturas condicionais e laços para resolver problemas de forma organizada.
