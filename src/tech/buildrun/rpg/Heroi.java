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
        this.qtdPocaoVida--;
    }

    @Override
    public void mostrarApresentacao() {
        System.out.println(this.nome + " " +
                "(Vida: " +  this.vida + "," +
                " Ataque: " + this.ataque + "," +
                " Defensa: " + this.defensa + "," +
                " Especial: " + this.qtdAtaqueEspecial + "," +
                " Poção: " +  this.qtdPocaoVida + ")"
        );

    }

    @Override
    public void usarAtaqueEspecial(Personagem alvo) {
        boolean executarJogadaEspecial = this.executarJogadaEspecial();

        if(executarJogadaEspecial && qtdAtaqueEspecial > 0){
            int danoEspecial = (int) (this.ataque * 0.1);
            alvo.receberDano(danoEspecial);
            this.qtdAtaqueEspecial--;
            System.out.println(this.nome + ": Ataque Especial [" + this.nomeAtaque + "] realizado!");
        } else{
            System.out.println("Arrgg!! Ataque especial não realizado");
        }
    }
}
