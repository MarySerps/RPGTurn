public class Warrior extends Player  {
    
    //atributos definidos com base em D&D, personagem Nivel 5
    public Warrior (String name) {
        super(name, 49, 18, 10, 8, 12, 14);
    }

    @Override
    public int attack() {
        int rolagemDado = (int)(Math.random() * 6) + this.getStrengthModifier();
        System.out.println("Com um grito de guerra: " + this.getName() + " ataca " + " causando " + rolagemDado + " de dano!");
        
        return rolagemDado;
    }

    @Override
    public int specialAttack() {
        int rolagemDado = (int)(Math.random() * 6) + (this.getStrengthModifier() * 2);

        System.out.println(this.getName() + " usa um ataque especial contra " + " causando " + rolagemDado + " de dano, mas sofre 5 de dano em retaliação!");
        
        this.takeDamage(5); //custo pra usar o ataque
        return rolagemDado;
    }

}
