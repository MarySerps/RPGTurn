public class Mage extends Player {
    
    public Mage (String name, int hp, int intelligence) {
        super(name, hp, 0, intelligence);
    }


    public void spellAttack(Player target) {
        System.out.println(this.getName() + " lança um feitiço!");
        target.takeDamage(this.getIntelligence());
    }

    @Override
    public void attack(Player target) {
        System.out.println(this.getName() + " ataca com magia causando " + this.getIntelligence() + " de dano.");
        target.takeDamage(this.getIntelligence());
    }
}
