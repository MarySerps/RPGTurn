public class Mage extends Player {
    
    //atributos definidos com base em D&D, personagem Nivel 5
    public Mage (String name) {
        super(name, 32, 8, 18);
    }

    public void Attack (Player target) {
        int danoNormal = this.getIntelligence();
        target.takeDamage(danoNormal);
    }

    public void specialAttack(Player target) {
        int danoMagico = this.getIntelligence() + 10;
        target.takeDamage(danoMagico);
    }

    @Override
    public void attack(Player target) {
        target.takeDamage(this.getIntelligence());
    }
}
