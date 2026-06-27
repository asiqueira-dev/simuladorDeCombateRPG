# 🐉 RPG em Java - Herança e Polimorfismo

> Projeto desenvolvido durante os estudos de **Programação Orientada a Objetos (POO)**, com foco em **Herança**, **Polimorfismo**, **Abstração** e **Encapsulamento**, utilizando **Java**.

---

# 📖 Sobre o Projeto

Este projeto consiste em um jogo de RPG desenvolvido em Java, onde o jogador escolhe um herói para enfrentar um poderoso dragão em uma batalha por turnos.

Cada herói possui atributos e habilidades próprias, exigindo estratégias diferentes durante o combate. O objetivo é derrotar o dragão utilizando ataques, habilidades especiais e poções de vida, enquanto o inimigo pode se defender, regenerar vida e utilizar ataques especiais.

O projeto foi desenvolvido para colocar em prática os principais conceitos da **Programação Orientada a Objetos**, especialmente **Herança** e **Polimorfismo**, além de reforçar boas práticas de organização e reutilização de código.

---

# 🎯 Objetivo

Eliminar o dragão e fugir da caverna.

---

# 🚀 Funcionalidades

- Escolha entre diferentes heróis.
- Sistema de combate por turnos.
- Ataque normal.
- Ataque especial.
- Sistema de defesa.
- Regeneração de vida do monstro.
- Utilização de poções de vida.
- Encerramento automático da partida.
- Exibição da vida dos personagens ao final de cada turno.
- Organização do código utilizando Programação Orientada a Objetos.

---

# 🛡️ Heróis Disponíveis

| Herói | Vida | Ataque | Defesa | Ataques Especiais | Poções |
|--------|------|---------|---------|-------------------|---------|
| ⚔️ Guerreiro | 100 | 20 | 5 | 1 | 1 |
| 🔥 Mago | 80 | 25 | 10 | 1 | 2 |
| 🏹 Arqueiro | 90 | 18 | 8 | 3 | 1 |

---

# 🐲 Monstro

## Dragão

| Atributo | Valor |
|----------|-------|
| ❤️ Vida | 100 |
| ⚔️ Ataque | 15 |
| 🛡️ Defesa | 5 |

Além do ataque comum, o dragão possui regeneração automática de vida e pode transformar ataques normais em ataques especiais.

---

# ⚔️ Regras do Jogo

- O combate acontece em turnos.
- O herói sempre inicia a batalha.
- Após cada jogada é exibida a vida do herói e do dragão.
- Caso qualquer personagem tenha sua vida zerada, o jogo é encerrado imediatamente.
- Toda a lógica do combate está centralizada na classe `Jogo`.

---

# 🎲 Regras de Combate

### 💥 Ataque Especial

Sempre que um personagem utilizar uma habilidade especial:

- Existe **50% de chance** do ataque especial acontecer.
- Existe **50% de chance** da habilidade falhar.

---

### 🛡️ Defesa

Sempre que um personagem receber dano:

- Existe **50% de chance** de defender completamente o ataque.

---

### 🔥 Ataque Especial do Dragão

Quando o dragão realizar um ataque normal:

- Existe **50% de chance** desse ataque evoluir para um ataque especial.

---

### ❤️ Regeneração

Ao final de cada turno:

- O dragão recupera parte da própria vida automaticamente.

---

### 🧪 Poções de Vida

Quando o herói utilizar uma poção:

- Recupera pontos de vida.
- Uma poção é removida do inventário.

---

# 🏗️ Conceitos de Programação Orientada a Objetos

Durante o desenvolvimento foram aplicados diversos conceitos fundamentais da POO:

- ✅ Abstração
- ✅ Encapsulamento
- ✅ Herança
- ✅ Polimorfismo
- ✅ Classes Abstratas
- ✅ Sobrescrita de Métodos (Override)
- ✅ Associação entre Objetos
- ✅ Reutilização de Código
- ✅ Separação de Responsabilidades

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

O projeto foi estruturado utilizando uma hierarquia de classes baseada em herança.

```
               Personagem (Classe Abstrata)
                      ▲
          ┌───────────┴───────────┐
          │                       │
       Heroi                  Monstro
```

A classe **Personagem** concentra os atributos e comportamentos comuns.

As classes **Heroi** e **Monstro** herdam esses comportamentos e implementam suas regras específicas através do polimorfismo.

---

# 💻 Exemplo de Execução

```text
Heróis disponíveis

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

- ☕ Java
- 💻 IntelliJ IDEA
- 🌱 Git
- 🐙 GitHub
- 🧠 Programação Orientada a Objetos (POO)

---

# 📚 Aprendizados

Durante o desenvolvimento deste projeto foram reforçados conhecimentos importantes como:

- Modelagem de classes.
- Herança.
- Polimorfismo.
- Encapsulamento.
- Abstração.
- Classes abstratas.
- Sobrescrita de métodos.
- Organização do código.
- Separação de responsabilidades.
- Reutilização de código.

---

# 🎓 Formação

Este projeto foi desenvolvido durante meus estudos de **Programação Orientada a Objetos (POO)** na **Build & Run**, escola especializada na formação de desenvolvedores Java e Backend por meio de projetos práticos e desafios voltados às necessidades do mercado.

## 📚 Build & Run

🌐 Site: https://buildrun.com.br

💼 LinkedIn: https://www.linkedin.com/company/build-run

## 👨‍🏫 Professor

### Bruno Garcia (Bruno Rana)

**Staff Software Engineer**, fundador da **Build & Run** e especialista em desenvolvimento de software com foco em **Java**, **Spring Boot**, **Arquitetura de Software**, **Microsserviços**, **AWS**, **Docker**, **Kubernetes**, **DevOps** e boas práticas de programação.

Ao longo da formação, compartilha conhecimentos por meio de aulas práticas e projetos reais, preparando desenvolvedores para os desafios do mercado de tecnologia.

### 🔗 Contatos

💼 **LinkedIn**  
https://www.linkedin.com/in/dev-brunogarcia/

📺 **Canal no YouTube**  
https://www.youtube.com/@buildrun-tech

---

# 🚀 Como Executar

Clone o repositório

```bash
git clone https://github.com/asiqueira-dev/simuladorDeCombateRPG

Entre na pasta

```bash
cd simuladorDeCombateRPG
```

Compile o projeto

```bash
javac Main.java
```

Execute

```bash
java Main
```

---

# 👨‍💻 Autor

**Anderson Lopes de Siqueira**

Desenvolvedor apaixonado por tecnologia, desenvolvimento de software e aprendizado contínuo. Atualmente estudando Java e Programação Orientada a Objetos, desenvolvendo projetos práticos para consolidar conhecimentos e construir um portfólio sólido.

### 🌐 Contatos

[![Website](https://img.shields.io/badge/Website-000?style=for-the-badge&logo=google-chrome&logoColor=white)](https://andersonsiqueira.com)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/andersonlsiqueira/)
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/asiqueira-dev)

---

# ⭐ Se este projeto foi útil ou interessante para você, considere deixar uma estrela no repositório!

Ela ajuda a valorizar o projeto e incentiva a continuidade dos estudos e do compartilhamento de conhecimento.