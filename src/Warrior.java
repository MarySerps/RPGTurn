public class Warrior extends Player  {
    
    public Warrior (String name, int hp, int strength) {
        super(name, 200, strength, 0);
    }

    public void specialAttack (Player target){

        int danoEspecial = this.getStrength() * 2;
        target.takeDamage(danoEspecial);
        this.takeDamage(5);
    }

    @Override
    public void attack (Player target) {
        target.takeDamage(this.getStrength());
    }
}
