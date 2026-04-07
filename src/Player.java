public abstract class Player {

    private String name;
    private int hp;
    private int maxHp;
    private int strength;
    private int intelligence;
    private int charisma;
    private int dexterity;
    private int constitution;
    private int xp;

    public Player (String name, int hp, int strength, int intelligence, int charisma, int dexterity, int constitution) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
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

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void addXp (int amount) {
        this.xp += amount;
    }

    public abstract void attack (Player target);

    public abstract void specialAttack (Player target);

    public void takeDamage (int damage) {
        this.hp -= damage;

        if (this.hp < 0){
            this.hp = 0;
        }
    }

    
}

