public class Bard extends Player {
    public Bard (String nome) {
        super(nome, 40, 12, 14, 14, 14, 12);
    }

    @Override
    public int attack () {
        int rolagemDado = (int)(Math.random() * 6) + this.getCharismaModifier();

        System.out.println ("Tira sua viola e toca uma melodia, dando um dano de " + rolagemDado );
        return rolagemDado;
    }

    @Override
    public int specialAttack () {
        int rolagemDado = (int)(Math.random() * 6 ) + this.getCharismaModifier() + 5;

        System.out.println("Com um sorriso encantador, " + this.getName() + " toca uma canção hipnotizante, causando " + rolagemDado + " de dano e deixando o inimigo encantado por 1 turno!");
        return rolagemDado;
    }
}
