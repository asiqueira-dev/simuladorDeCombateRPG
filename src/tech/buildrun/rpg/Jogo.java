package tech.buildrun.rpg;

import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // 1. Mostrar menu de herois disponiveis
            Heroi guerreiro = criarGuerreiro();
            Heroi mago = criarMago();
            Heroi arqueiro = criarArqueiro();

            Heroi heroiSelecionado = null;

            while (heroiSelecionado == null) {
                mostrarApresentacoes(guerreiro, mago, arqueiro);

                if (sc.hasNextInt()) {
                    int menuOpcaoHeroi = sc.nextInt();
                    heroiSelecionado = selecionarHeroi(menuOpcaoHeroi, guerreiro, mago, arqueiro);

                    if (heroiSelecionado == null) {
                        System.out.println("\n[ERRO] Opção inválida! Digite 1, 2 ou 3 para escolher seu herói.\n");
                    }
                } else {
                    System.out.println("\n[ERRO] Entrada inválida! Por favor, digite um número inteiro (1, 2 ou 3).\n");
                    sc.next(); // Limpa a entrada incorreta do scanner
                }
            }

            System.out.println("\nVocê selecionou o herói: " + heroiSelecionado.getNome());

            // 3. Mostrar o monstro
            Monstro dragao = criarMonstro();
            dragao.mostrarApresentacao();

            // 4. Começar turnos de combate (loop)
            boolean jogoAcabou = false;

            do {
                // 4.1. Solicitar acao do turno do heroi
                realizarJogadaDoUsuario(sc, heroiSelecionado, dragao);

                jogoAcabou = verificarFimDeJogo(dragao, heroiSelecionado);
                if (jogoAcabou) break;

                // 4.2. Executar o turno do monstro
                realizarTurnoDragao(dragao, heroiSelecionado);

                // 4.3. Verificar as vidas após turno do monstro
                jogoAcabou = verificarFimDeJogo(dragao, heroiSelecionado);

                if (!jogoAcabou) {
                    mostrarVida(heroiSelecionado, dragao);
                }

            } while (!jogoAcabou);
        }
    }

    private static Monstro criarMonstro() {
        return new Monstro("Dragão", 100, 15, 5, 2, "Cuspir Fogo!", 0.2);
    }

    private static Heroi criarArqueiro() {
        return new Heroi("Arqueiro", 90, 18, 8, "Flechas Congelantes!", 3, 1, "Arqueiro");
    }

    private static Heroi criarMago() {
        return new Heroi("Mago", 80, 25, 10, "Bola de Fogo!", 1, 2, "Mago");
    }

    private static Heroi criarGuerreiro() {
        return new Heroi("Guerreiro", 100, 20, 5, "Espadada Flamejante!", 1, 1, "Guerreiro");
    }

    private static boolean verificarFimDeJogo(Monstro dragao, Heroi heroiSelecionado) {
        if (dragao.estaMorto()) {
            System.out.println("\n★ Você eliminou o Dragão! Parabénsss!! ★");
            return true;
        }
        if (heroiSelecionado.estaMorto()) {
            System.out.println("\n💀 Você morreu! Fim de jogo.");
            return true;
        }
        return false;
    }

    private static void realizarTurnoDragao(Monstro dragao, Heroi heroiSelecionado) {
        System.out.println("\n## TURNO DO DRAGÃO ##");
        dragao.regenerarVida();
        dragao.atacar(heroiSelecionado);
    }

    private static void mostrarVida(Heroi heroiSelecionado, Monstro dragao) {
        System.out.println("\n====== STATUS ATUAL ======");
        heroiSelecionado.mostrarVida();
        dragao.mostrarVida();
        System.out.println("==========================");
    }

    private static void realizarJogadaDoUsuario(Scanner sc, Heroi heroiSelecionado, Monstro dragao) {
        System.out.println("\n## SEU TURNO ##");
        boolean jogadaValida = false;

        while (!jogadaValida) {
            System.out.println("1. Atacar / 2. Usar habilidade especial / 3. Beber poção de vida");

            if (sc.hasNextInt()) {
                int opcaoJogada = sc.nextInt();

                switch (opcaoJogada) {
                    case 1:
                        heroiSelecionado.atacar(dragao);
                        jogadaValida = true;
                        break;
                    case 2:
                        heroiSelecionado.usarAtaqueEspecial(dragao);
                        jogadaValida = true;
                        break;
                    case 3:
                        heroiSelecionado.usarPocaoVida();
                        jogadaValida = true;
                        break;
                    default:
                        System.out.println("\n[ERRO] Ação inválida! Escolha uma opção de 1 a 3.\n");
                        break;
                }
            } else {
                System.out.println("\n[ERRO] Entrada inválida! Digite um número correspondente à ação.\n");
                sc.next(); 
            }
        }
    }

    private static Heroi selecionarHeroi(int menuOpcaoHeroi, Heroi guerreiro, Heroi mago, Heroi arqueiro) {
        return switch (menuOpcaoHeroi) {
            case 1 -> guerreiro;
            case 2 -> mago;
            case 3 -> arqueiro;
            default -> null;
        };
    }

    private static void mostrarApresentacoes(Heroi guerreiro, Heroi mago, Heroi arqueiro) {
        System.out.println("--- Heróis disponíveis ---");
        System.out.print("1 - ");
        guerreiro.mostrarApresentacao();
        System.out.print("2 - ");
        mago.mostrarApresentacao();
        System.out.print("3 - ");
        arqueiro.mostrarApresentacao();
        System.out.println("--------------------------");
        System.out.print("Escolha seu Herói: ");
    }
}