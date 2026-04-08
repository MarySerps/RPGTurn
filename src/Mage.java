public class Mage extends Player {
    
    //atributos definidos com base em D&D, personagem Nivel 5
    public Mage (String name) {
        super(name, 32, 8, 18, 12, 10, 8);
    }

    @Override
    public void attack(Player target) {
        // Simulando uma rolagem de um d6 para somar ao dano base do ataque
        int rolagemDado = (int)(Math.random() * 6) + this.getIntelligence();
        
        System.out.println( this.getName() + " molda energia pura nas mãos e dispara um dardo arcano, acertando " + target.getName() + " para " + rolagemDado + " de dano!");
        target.takeDamage(rolagemDado);
    }

    @Override
    public void specialAttack(Player target) {
        int rolagemDado = (int)(Math.random() * 6) + this.getIntelligence() + 10;
        
        System.out.println(" Sussurrando palavras antigas do abismo, " + this.getName() + " conjura uma explosão mágica violenta, infligindo " + rolagemDado + " de dano no inimigo!");
        target.takeDamage(rolagemDado);
    }
}
