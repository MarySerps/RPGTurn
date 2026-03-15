public class Warrior extends Player  {
    
    public Warrior (String name, int hp, int strength) {
        super(name, hp, strength, 0);
    }

    public void specialAttack (Player target){
        System.out.println (this.getName() + "usa o golpe especial");

        int danoEspecial = this.getStrength() * 2;
        target.takeDamage(danoEspecial);

        System.out.println (this.getName() + "Gasta 5 de Hp ");
        this.takeDamage(5);
    }

    @Override
    public void attack(Player target) {
        System.out.println(this.getName() + " ataca dando um dano de " + this.getStrength());
        target.takeDamage(this.getStrength());
    }
}
