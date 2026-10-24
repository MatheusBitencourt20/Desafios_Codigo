# 🟢 Básico — Princípios Básicos

## 📝 Desafio: Sequência Equilibrada

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

**Restrição:**
- `1 ≤ N ≤ 100`

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

### 🎯 Objetivo do exercício

Praticar os seguintes conceitos de programação:

- Estruturas condicionais (`if`, `else`).
- Estruturas de repetição (`for` ou `while`).
- Operadores aritméticos, como o módulo (`%`).
- Identificação de números pares e ímpares.
- Validação de valores negativos.
- Uso de variáveis para controlar condições durante a execução do programa.
