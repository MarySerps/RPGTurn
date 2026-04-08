public class Mage extends Player {
    
    //atributos definidos com base em D&D, personagem Nivel 5
    public Mage (String name) {
        super(name, 32, 8, 18, 12, 10, 8);
    }

    @Override
    public int attack() {
        // Simulando uma rolagem de um d6 para somar ao dano base do ataque
        int rolagemDado = (int)(Math.random() * 6) + this.getIntelligenceModifier();
        
        System.out.println( this.getName() + " molda energia pura nas mãos e dispara um dardo arcano, acertando " + " para " + rolagemDado + " de dano!");
        return rolagemDado;
    }

    @Override
    public int specialAttack() {
        int rolagemDado = (int)(Math.random() * 6) + this.getIntelligenceModifier() + 10;
        
        System.out.println(" Sussurrando palavras antigas do abismo, " + this.getName() + " conjura uma explosão mágica violenta, infligindo " + rolagemDado + " de dano no inimigo!");
        return rolagemDado;
    }
}
