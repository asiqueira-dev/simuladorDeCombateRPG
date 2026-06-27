package tech.buildrun.rpg;

public class Mostro extends Personagem{

    private int qtdRegeneracaoVida;
    private String nomePoderEspecial;
    private double multiplicadorDanoEspecial;

    public Mostro(String nome, int vida, int ataque, int defensa, int qtdRegeneracaoVida, String nomePoderEspecial, double multiplicadorDanoEspecial) {
        super(nome, vida, ataque, defensa);
        this.qtdRegeneracaoVida = qtdRegeneracaoVida;
        this.nomePoderEspecial = nomePoderEspecial;
        this.multiplicadorDanoEspecial = multiplicadorDanoEspecial;
    }

    public void regenerarVida(){
      this.vida += qtdRegeneracaoVida;
    }

    public void usarAtaqueEspecial(){

    }

    @Override
    public void mostrarApresentacao() {

    }

    @Override
    public void usarAtaqueEspecial(Personagem alvo) {

    }
}
