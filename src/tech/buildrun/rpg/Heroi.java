package tech.buildrun.rpg;

public class Heroi extends Personagem {

    private String classe;
    private int qtdAtaqueEspecial;
    private int qtdPocaoVida;
    private String nomeAtaque;

    public Heroi(String nome, int vida, int ataque, int defensa, String nomeAtaque, int qtdPocaoVida, int qtdAtaqueEspecial, String classe) {
        super(nome, vida, ataque, defensa);
        this.nomeAtaque = nomeAtaque;
        this.qtdPocaoVida = qtdPocaoVida;
        this.qtdAtaqueEspecial = qtdAtaqueEspecial;
        this.classe = classe;
    }

    public void usarPocaoVida(){
        if (this.qtdPocaoVida > 0) {
            this.vida += 50;
            this.qtdPocaoVida--;
            System.out.println(this.nome + " usou uma poção de vida e recuperou 50 de vida!");
        } else {
            System.out.println(this.nome + " tentou usar uma poção, mas não possui nenhuma restante!");
        }
    }

    @Override
    public void mostrarApresentacao() {
        System.out.println(this.nome + " [" + this.classe + "] " +
                "(Vida: " +  this.vida + "," +
                " Ataque: " + this.ataque + "," +
                " Defensa: " + this.defensa + "," +
                " Especial: " + this.qtdAtaqueEspecial + "," +
                " Poção: " +  this.qtdPocaoVida + ")"
        );
    }

    @Override
    public void usarAtaqueEspecial(Personagem alvo) {
        if (this.qtdAtaqueEspecial > 0) {
            boolean executarJogadaEspecial = this.executarJogadaEspecial();

            if (executarJogadaEspecial) {
                int danoEspecial = this.ataque + ((int) (this.ataque * 0.1));
                System.out.println(this.nome + ": Ataque Especial [" + this.nomeAtaque + "] realizado com sucesso!");
                alvo.receberDano(danoEspecial);
            } else {
                System.out.println(this.nome + ": Arrgg!! O ataque especial falhou na execução!");
            }
            this.qtdAtaqueEspecial--;
        } else {
            System.out.println(this.nome + " não possui mais cargas de Ataque Especial!");
        }
    }
}