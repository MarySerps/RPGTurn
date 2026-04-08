public class Enemy extends Player {
    
    public Enemy (String name, int hp, int strength){
        super(name, hp, strength, 0, 0, 0, 0);
    }

    public Enemy (String name) {
        this ( name, (int)(Math.random() * 20) + 20, (int)(Math.random() * 9) + 8);
             // HP entre 20 e 40
             // Força entre 8 e 16
    }

    public void Attack (Player target) {
        int danoNormal = this.getStrength();
        target.takeDamage(danoNormal);
    }

    @Override
    public int specialAttack() {
        int danoEspecial = this.getStrengthModifier();
        return danoEspecial;
    }

    @Override
    public int attack() {
        // Simulando a rolagem de um d6 (valores de 1 a 6) para somar ao dano
        int rolagemDado = (int)(Math.random() * 6) + 5;
        int danoTotal = this.getStrengthModifier() + rolagemDado;
        
        System.out.println(">> O " + this.getName() + " atacou ferozmente e causou " + danoTotal + " de dano!");
        return danoTotal;
    }
}
