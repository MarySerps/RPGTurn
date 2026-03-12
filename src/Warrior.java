public class Warrior extends Player  {
    
    public Warrior (String name, int hp, int strength) {
        super(name, hp, strength);
    }

    @Override
    public void attack(Player target) {
        System.out.println(this.getName() + " ataca dando um dano de " + this.getStrength());
        target.takeDamage(this.getStrength());
    }
}
