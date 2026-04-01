public class Warrior extends Player  {
    
    //atributos definidos com base em D&D, personagem Nivel 5
    public Warrior (String name) {
        super(name, 49, 18, 10);
    }

    public void specialAttack (Player target){

        int danoEspecial = this.getStrength() * 2;
        target.takeDamage(danoEspecial);
        this.takeDamage(5); //custo pra usar o ataque
    }

    @Override
    public void attack (Player target) {
        target.takeDamage(this.getStrength());
    }
}
