package tech.buildrun.rpg;

public class Heroi extends  Personagem {

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
        this.vida += 50;
    }

    @Override
    public void mostrarApresentacao() {

    }

    @Override
    public void usarAtaqueEspecial(Personagem alvo) {

    }
}
