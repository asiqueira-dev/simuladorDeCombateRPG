package tech.buildrun.rpg;

import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

        mostrarApresentacoes(guerreiro, mago, arqueiro);

        // 2. Usuario seleciona o heroi
        int menuOpcaoHeroi = sc.nextInt();
        Heroi heroiSelecionado = selecionarHeroi(menuOpcaoHeroi, guerreiro, mago, arqueiro);

        // 3. Mostrar o monstro
        Mostro dragao = new Mostro(
                "Dragão",
                100,
                15,
                5,
                2,
                "Cuspir Fogo!",
                0.2
        );

        dragao.mostrarApresentacao();

        // 4. Começar turnos de combate (loop)
        boolean jogoAcabou =  false;

        do {

            // 4.1. Solicitar acao do turno do heroi
            realizarJogadaDoUsuario(sc, heroiSelecionado, dragao);

            if(dragao.estaMorto()){
                jogoAcabou = true;
                System.out.println("Você eliminou o Dragão, Parabénsss!!");
            }

            // 4.2. Mostrar as vidas
            mostrarVida(heroiSelecionado, dragao);

            // 4.3. Executar o turno do monstro
            System.out.println(" ");
            dragao.regenerarVida();
            dragao.atacar(heroiSelecionado);
            System.out.println(" ");

            // 4.4. Mostrar as vidas
            mostrarVida(heroiSelecionado, dragao);

            // 4.5 - Verificar as vidas e finalizar o jogo se for o caso
            // Caso os personagens tenham vida, voltar pro 4.1

            if(heroiSelecionado.estaMorto()){
                jogoAcabou = true;
                System.out.println("Você morreu!");
            }

            if(dragao.estaMorto()){
                jogoAcabou = true;
                System.out.println("Você eliminou o Dragão, Parabénsss!!");
            }

        } while (!jogoAcabou);
    }

    private static void mostrarVida(Heroi heroiSelecionado, Mostro dragao) {
        System.out.println(" ");
        heroiSelecionado.mostrarVida();
        dragao.mostrarVida();
        System.out.println(" ");
    }

    private static void realizarJogadaDoUsuario(Scanner sc, Heroi heroiSelecionado, Mostro dragao) {
        System.out.println("\n ## SEU TURNO ##");
        System.out.println("1. Atacar / 2. Usar habilidade especial / 3. beber poção de vida");
        int opcaoJogada = sc.nextInt();

        switch (opcaoJogada) {
            case 1:
                heroiSelecionado.atacar(dragao);
                break;
            case 2:
                heroiSelecionado.usarAtaqueEspecial(dragao);
                break;
            case 3:
                heroiSelecionado.usarPocaoVida();
                break;
        }
    }

    private static Heroi selecionarHeroi(int menuOpcaoHeroi,
                                         Heroi guerreiro,
                                         Heroi mago,
                                         Heroi arqueiro) {
        return switch (menuOpcaoHeroi) {
            case 1 -> guerreiro;
            case 2 -> mago;
            case 3 -> arqueiro;
            default -> null;
        };
    }

    private static void mostrarApresentacoes(Heroi guerreiro, Heroi mago, Heroi arqueiro) {
        System.out.println("Heróis disponíveis");
        System.out.print("1 - ");
        guerreiro.mostrarApresentacao();

        System.out.print("2 - ");
        mago.mostrarApresentacao();

        System.out.print("3 - ");
        arqueiro.mostrarApresentacao();

        System.out.println(" ");

        System.out.println("Escolha seu Herói");
    }
}
