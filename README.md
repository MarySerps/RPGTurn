# ⚔️ RPGTurn - Batalha de Turnos em Java

Um sistema de combate RPG por turnos via console desenvolvido em Java. Este projeto foi criado para aplicar e demonstrar conceitos sólidos de **Programação Orientada a Objetos (POO)** e Clean Code.

*Uma pequena aventura de código, perfeita para testar lógicas de combate, raças e classes inspiradas em campanhas de mesa (como Ecos do Abismo).*

## 🧠 Conceitos Técnicos Aplicados
* **Classes Abstratas:** Criação de um modelo base seguro (`Player`) que não pode ser instanciado diretamente.
* **Herança e Polimorfismo:** Classes específicas (`Warrior`) que herdam características e sobrescrevem métodos (como o `attack`).
* **Encapsulamento:** Proteção dos atributos de status (HP, Força) usando modificadores de acesso (`private`/`protected`) e métodos Getters/Setters.

## 🚀 Funcionalidades (Status do Projeto)
- [x] Estrutura base de Entidades (Player).
- [x] Criação da classe Guerreiro (Warrior).
- [x] Sistema seguro de alteração de nomes.
- [ ] Criar a classe Inimigo/Monstro.
- [ ] Implementar o Game Loop (A batalha rodando em turnos).
- [ ] Adicionar novas classes (ex: Mago) e raças (ex: Tiefling, Meio-Orc).

## 💻 Como rodar o projeto localmente

1. Clone este repositório:
   ```bash
   git clone [https://github.com/MarySerps/RPGTurn.git](https://github.com/MarySerps/RPGTurn.git)