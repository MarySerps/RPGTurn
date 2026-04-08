public class Warrior extends Player  {
    
    //atributos definidos com base em D&D, personagem Nivel 5
    public Warrior (String name) {
        super(name, 49, 18, 10, 8, 12, 14);
    }

    @Override
    public void attack (Player target) {
        int rolagemDado = (int)(Math.random() * 6) + this.getStrength();

        System.out.println("Com um grito de guerra: " + this.getName() + " ataca " + target.getName() + " causando " + rolagemDado + " de dano!");
        target.takeDamage(rolagemDado);
    }

    @Override
    public void specialAttack (Player target) {
        int rolagemDado = (int)(Math.random() * 6) + this.getStrength() * 2;

        System.out.println(this.getName() + " usa um ataque especial contra " + target.getName() + " causando " + rolagemDado + " de dano, mas sofre 5 de dano em retaliação!");
        target.takeDamage(rolagemDado);
        this.takeDamage(5); //custo pra usar o ataque
    }

}
