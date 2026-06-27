# 🐉 RPG em Java - Herança e Polimorfismo

> Projeto desenvolvido durante os estudos de **Programação Orientada a Objetos (POO)**, com foco em **Herança**, **Polimorfismo**, **Classes Abstratas** e **Encapsulamento**, utilizando Java.

---

## 📖 Sobre o Projeto

Este projeto consiste em um jogo de RPG em modo texto, onde o jogador escolhe um herói para enfrentar um poderoso dragão.

Durante a batalha, o jogador pode realizar ataques normais, utilizar habilidades especiais ou recuperar vida através de poções. O combate acontece em turnos até que um dos personagens seja derrotado.

O objetivo principal do projeto é aplicar conceitos fundamentais da Programação Orientada a Objetos de forma prática.

---

# 🎯 Objetivo

Eliminar o dragão e escapar da caverna.

---

# 🚀 Funcionalidades

- Escolha entre diferentes heróis.
- Sistema de combate por turnos.
- Ataque normal.
- Ataque especial.
- Defesa com chance de sucesso.
- Sistema de regeneração do monstro.
- Utilização de poções de vida.
- Encerramento automático da partida quando um personagem morre.
- Exibição da vida dos personagens após cada rodada.

---

# 🛡️ Heróis Disponíveis

| Herói | Vida | Ataque | Defesa | Especial | Poções |
|--------|------|---------|---------|-----------|---------|
| ⚔️ Guerreiro | 100 | 20 | 5 | 1 | 1 |
| 🔥 Mago | 80 | 25 | 10 | 1 | 2 |
| 🏹 Arqueiro | 90 | 18 | 8 | 3 | 1 |

---

# 🐲 Inimigo

## Dragão

| Atributo | Valor |
|----------|-------|
| Vida | 100 |
| Ataque | 15 |
| Defesa | 5 |

Além do ataque comum, o dragão possui regeneração de vida e pode transformar um ataque normal em ataque especial.

---

# ⚔️ Regras do Jogo

- O combate acontece em turnos.
- O herói sempre inicia a batalha.
- Após cada jogada é exibida a vida do herói e do dragão.
- Caso a vida de qualquer personagem chegue a zero, o jogo termina imediatamente.
- Toda a lógica da partida é centralizada na classe `Jogo`.

---

# 🎲 Regras de Combate

### Ataque Especial

Sempre que um personagem utilizar uma habilidade especial:

- 50% de chance de executar o ataque.
- 50% de chance da habilidade falhar.

---

### Defesa

Sempre que um personagem receber dano:

- 50% de chance de defender completamente o ataque.

---

### Ataque Especial do Monstro

Quando o dragão realiza um ataque comum:

- Existe 50% de chance desse ataque evoluir para um ataque especial.

---

### Regeneração

Ao final de cada turno:

- O dragão recupera parte da própria vida.

---

### Poções

Quando o herói utiliza uma poção:

- Recupera vida.
- A quantidade disponível é reduzida do inventário.

---

# 🏗️ Conceitos de POO Aplicados

✔ Herança

✔ Polimorfismo

✔ Classes Abstratas

✔ Encapsulamento

✔ Sobrescrita de Métodos

✔ Abstração

✔ Associação entre Objetos

✔ Reutilização de Código

---

# 📂 Estrutura do Projeto

```text
src
│
├── personagem
│   ├── Personagem.java
│   ├── Heroi.java
│   └── Monstro.java
│
├── jogo
│   └── Jogo.java
│
└── Main.java
```

---

# 📊 Diagrama de Classes

O projeto foi desenvolvido utilizando a seguinte estrutura de herança:

- **Personagem (Classe Abstrata)**
    - Heroi
    - Monstro

A classe `Personagem` concentra todos os atributos e comportamentos comuns, enquanto `Heroi` e `Monstro` implementam seus comportamentos específicos através de sobrescrita de métodos.

---

# 💻 Exemplo de Execução

```text
Heróis disponíveis:

1 - Guerreiro
2 - Mago
3 - Arqueiro

Escolha seu herói:
> 2

Um Dragão aparece!

Seu turno

1 - Atacar
2 - Habilidade Especial
3 - Beber Poção

> 2

Mago lança uma Bola de Fogo!

Dragão sofreu dano!

Turno do Dragão...

O Dragão ataca!

Vida do Mago: 75

Vida do Dragão: 80
```

---

# 🛠️ Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos
- IntelliJ IDEA (ou Eclipse)
- Git
- GitHub

---

# 📚 Aprendizados

Durante este projeto foram praticados conceitos importantes como:

- Organização do código em classes.
- Criação de hierarquias utilizando herança.
- Utilização de polimorfismo.
- Sobrescrita de métodos.
- Encapsulamento de atributos.
- Reutilização de código.
- Separação de responsabilidades.
- Modelagem de objetos.

---

# 🎓 Projeto Acadêmico

Projeto desenvolvido como exercício prático durante os estudos de **Programação Orientada a Objetos (POO)** na **Build & Run**, com foco em Herança e Polimorfismo.

---

# 👨‍💻 Autor

**Anderson Lopes de Siqueira**

- Java Developer
- PHP Developer
- Oracle SQL / PL-SQL
- Laravel

---

⭐ Caso tenha gostado do projeto, deixe uma estrela no repositório!

