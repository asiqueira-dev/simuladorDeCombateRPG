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
        System.out.println(this.nome + ": Ataque realizado!");
        alvo.receberDano(this.ataque);
    }

    public void receberDano(int dano){
        boolean podeDefender = this.executarJogadaEspecial();
        int danoReal = dano;

        if (podeDefender) {
            danoReal = Math.max(0, dano - this.defensa);
            System.out.println(this.nome + " realizou uma defesa! Reduziu o dano para " + danoReal);
        } else {
            System.out.println(this.nome + " recebeu o dano total de " + danoReal);
        }

        this.vida -= danoReal;
    }

    public boolean estaMorto(){
        return this.vida <= 0;
    }

    public String getNome(){
        return this.nome;
    }

    public void mostrarVida(){
        int vidaExibicao = Math.max(0, this.vida);
        System.out.println(this.nome + " (Vida: " + vidaExibicao + ")");
    }

    public abstract void mostrarApresentacao();

    public abstract void usarAtaqueEspecial(Personagem alvo);

    protected boolean executarJogadaEspecial(){
        return Math.random() >= 0.5;
    }
}