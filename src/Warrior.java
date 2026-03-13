public class Warrior extends Player  {
    
    public Warrior (String name, int hp, int strength) {
        super(name, hp, strength);
    }

    public specialAttack (Player target){
        System.out.println (this.getName() + "usa o golpe especial");

        int danoEspecial = this.strength() * 2;
        target.Damage(danoEspecial);

        System.out.println (this.getName() + "Gasta 5 de Hp ");
        this.Damage(5);
    }

    @Override
    public void attack(Player target) {
        System.out.println(this.getName() + " ataca dando um dano de " + this.getStrength());
        target.takeDamage(this.getStrength());
    }
}
