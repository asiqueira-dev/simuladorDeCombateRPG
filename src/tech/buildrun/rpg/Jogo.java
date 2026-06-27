package tech.buildrun.rpg;

public class Jogo {

    public static void main(String[] args) {

        // 1. Mostrar menu de herois disponiveis
        Heroi guerreiro = new Heroi(
                "Guerreiro",
                100,
                20,
                5,
                "Ataque",
                1,
                1,
                "Espadada Flamejante!"
        );

        Heroi mago = new Heroi(
                "Mago",
                80,
                25,
                10,
                "Feiticeiro",
                1,
                2,
                "Bola de fogo!"
        );

        Heroi arqueiro = new Heroi(
                "Arqueiro",
                90,
                18,
                8,
                "Estrategista",
                3,
                1,
                "Flechar congelantes!"
        );

        // 2. Usuario seleciona o heroi

        // 3. Mostrar o monstro

        // 4. Começar turnos de combate (loop)

        // 4.1. Solicitar acao do turno do heroi

        // 4.2. Mostrar as vidas

        // 4.3. Executar o turno do monstro

        // 4.4. Mostrar as vidas

        // 4.5 - Verificar as vidas e finalizar o jogo se for o caso
        // Caso os personagens tenham vida, voltar pro 4.1
    }
}
