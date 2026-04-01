public class Enemy extends Player {
    
    public Enemy (String name, int hp, int strength){
        super(name, hp, strength, 0);
    }

    @Override
    public void attack(Player target) {
        // Simulando a rolagem de um d6 (valores de 1 a 6) para somar ao dano
        int rolagemDado = (int)(Math.random() * 6) + 1;
        int danoTotal = this.getStrength() + rolagemDado;
        
        System.out.println(">> O " + this.getName() + " atacou ferozmente e causou " + danoTotal + " de dano!");
        target.takeDamage(danoTotal);
    }
}
