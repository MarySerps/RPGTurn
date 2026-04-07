public class Mage extends Player {
    
    //atributos definidos com base em D&D, personagem Nivel 5
    public Mage (String name) {
        super(name, 32, 8, 18, 12, 10, 8);
    }

    @Override
    public void attack(Player target) {
        int dano = this.getIntelligence();
        
        System.out.println( this.getName() + " molda energia pura nas mãos e dispara um dardo arcano, acertando " + target.getName() + " para " + dano + " de dano!");
        
        target.takeDamage(dano);
    }

    @Override
    public void specialAttack(Player target) {
        int danoMagico = this.getIntelligence() + 10;
        
        System.out.println(" Sussurrando palavras antigas do abismo, " + this.getName() + " conjura uma explosão mágica violenta, infligindo " + danoMagico + " de dano no inimigo!");
        
        target.takeDamage(danoMagico);
    }
}
