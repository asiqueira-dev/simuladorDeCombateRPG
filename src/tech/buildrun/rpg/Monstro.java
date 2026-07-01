package tech.buildrun.rpg;

public class Monstro extends Personagem {

    private int qtdRegeneracaoVida;
    private String nomePoderEspecial;
    private double multiplicadorDanoEspecial;

    public Monstro(String nome, int vida, int ataque, int defensa, int qtdRegeneracaoVida, String nomePoderEspecial, double multiplicadorDanoEspecial) {
        super(nome, vida, ataque, defensa);
        this.qtdRegeneracaoVida = qtdRegeneracaoVida;
        this.nomePoderEspecial = nomePoderEspecial;
        this.multiplicadorDanoEspecial = multiplicadorDanoEspecial;
    }

    public void regenerarVida(){
        if (this.vida > 0) {
            this.vida += this.qtdRegeneracaoVida;
            System.out.println(this.nome + " se regenerou em " + this.qtdRegeneracaoVida + " de vida.");
        }
    }

    @Override
    public void atacar(Personagem alvo) {
        boolean viraAtaqueEspecial = this.executarJogadaEspecial();
        if (viraAtaqueEspecial) {
            this.usarAtaqueEspecial(alvo);
        } else {
            super.atacar(alvo);
        }
    }

    @Override
    public void mostrarApresentacao() {
        System.out.println(this.nome + " " +
                "(Vida: " +  this.vida + "," +
                " Ataque: " + this.ataque + "," +
                " Defensa: " + this.defensa + "," +
                " Regeneração de Vida: " + this.qtdRegeneracaoVida + "," +
                " Nome Poder Especial: " +  this.nomePoderEspecial + ")"
        );
    }

    @Override
    public void usarAtaqueEspecial(Personagem alvo) {
        int danoEspecial = this.ataque + ((int) (this.ataque * this.multiplicadorDanoEspecial));
        System.out.println(this.nome + ": Realizou o Ataque Especial [" + this.nomePoderEspecial + "]!");
        alvo.receberDano(danoEspecial);
    }
}