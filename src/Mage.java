public class Mage extends Player {
    
    public Mage (String name, int hp, int intelligence) {
        super(name, 120, 0, intelligence);
    }

    public void spellAttack(Player target) {
        target.takeDamage(this.getIntelligence());
    }

    @Override
    public void attack(Player target) {
        target.takeDamage(this.getIntelligence());
    }
}
