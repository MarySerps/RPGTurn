public class Enemy extends Player {
    
    public Enemy (String name, int hp, int strength){
        super(name, hp, strength, 0);
    }

    @Override
    public void attack (Player target) {
        target.takeDamage(this.getStrength());
    }

}
