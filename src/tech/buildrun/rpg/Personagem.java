package tech.buildrun.rpg;

public abstract class Personagem {

    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defensa;

    public Personagem(String nome, int vida, int ataque, int defensa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public void atacar(Personagem alvo){
        alvo.receberDano(ataque);
    }

    public void receberDano(int dano){
        // todo - realizar logica de defesa com 50% de chance
        vida -= dano;
    }

    public boolean estaMorto(){
        return vida < 0;
    }

    public String getNome(){
        return this.nome;
    }

    public void mostrarVida(){
        System.out.println(this.nome + "(Vida: " + this.vida + ")");
    }

    public abstract void mostrarApresentacao();

    public abstract void usarAtaqueEspecial(Personagem alvo);

}
