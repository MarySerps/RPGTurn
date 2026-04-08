public abstract class Player {

    private String name;
    private int hp;
    private int strength;
    private int intelligence;
    private int charisma;
    private int dexterity;
    private int constitution;
    private int xp;

    public Player (String name, int hp, int strength, int intelligence, int charisma, int dexterity, int constitution) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.intelligence = intelligence;
        this.charisma = charisma;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.xp = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStrength() {
        return strength;
    }

    public int getStrengthModifier() {
        return (strength - 10) / 2;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getIntelligenceModifier() {
        return (intelligence - 10) / 2;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getCharismaModifier() {
        return (charisma - 10) / 2;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getDexterityModifier() {
        return (dexterity - 10) / 2;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getConstitutionModifier() {
        return (constitution - 10) / 2;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }


    public abstract int attack ();

    public abstract int specialAttack ();


    public void takeDamage (int damage) {
        this.hp -= damage;

        if (this.hp < 0){
            this.hp = 0;
        }
    }

    public void addXp (int amount) {
        this.xp += amount;

        if (this.xp >= 100) {
            System.out.println ("Parabéns, você subiu de nível! Seus atributos aumentaram!");
            this.setHp(this.getHp() + 20);
            this.setStrength(this.getStrength() + 5);
            this.setIntelligence(this.getIntelligence() + 5);
            this.setCharisma(this.getCharisma() + 5);
            this.setDexterity(this.getDexterity() + 5);
            this.setConstitution(this.getConstitution() + 5);

            this.xp -= 100; //reseta o xp para o próximo nível
        }
    }

}

