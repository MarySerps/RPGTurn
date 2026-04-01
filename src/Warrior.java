public class Warrior extends Player  {
    
    //atributos definidos com base em D&D, personagem Nivel 5
    public Warrior (String name) {
        super(name, 49, 18, 10);
    }

    @Override
    public void attack (Player target) {
        int dano = this.getStrength();

        System.out.println("Com um grito de guerra: " + this.getName() + " ataca " + target.getName() + " causando " + dano + " de dano!");
        target.takeDamage(dano);
    }

    @Override
    public void specialAttack (Player target) {
        int danoEspecial = this.getStrength() * 2;

        System.out.println(this.getName() + " usa um ataque especial contra " + target.getName() + " causando " + danoEspecial + " de dano, mas sofre 5 de dano em retaliação!");
        target.takeDamage(danoEspecial);
        this.takeDamage(5); //custo pra usar o ataque
    }

}
