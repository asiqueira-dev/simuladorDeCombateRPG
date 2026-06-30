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

    @Override
    public void atacar(Personagem alvo) {
        boolean viraAtaqueEspecial = this.executarJogadaEspecial();
        if(viraAtaqueEspecial){
            this.usarAtaqueEspecial(alvo);
        } else {
            super.atacar(alvo);
        }
    }

    public void usarAtaqueEspecial(){

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
        boolean executarJogadaEspecial = this.executarJogadaEspecial();

        if(executarJogadaEspecial){
            int danoEspecial = this.ataque + ((int) (this.ataque * this.multiplicadorDanoEspecial));
            alvo.receberDano(danoEspecial);
            System.out.println(this.nome + ": Ataque Especial [" + this.nomePoderEspecial + "] realizado!");
        } else{
            System.out.println(this.nome + ": AAAAHHHHH!! Você deu sorte!!");
        }

    }
}
