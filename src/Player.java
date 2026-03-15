public abstract class Player {
    private String name;
    private int hp;
    private int strength;
    private int intelligence;

    public Player (String name, int hp, int strength, int intelligence) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
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


    public abstract void attack (Player target);

    public void takeDamage (int damage) {
        this.hp -= damage;
        if (this.hp < 0) this.hp = 0;
        System.out.println (name + "recebe" + damage + "de dano, vida restante: " + hp);
    }


}
