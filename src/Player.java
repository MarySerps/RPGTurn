public abstract class Player {
    private String name;
    private int hp;
    private int strength;

    public Player (String name, int hp, int strength) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void attack (Player target);

    public void takeDamage (int damage) {
        this.hp -= damage;
        if (this.hp < 0) this.hp = 0;
        System.out.println (name + "recebe" + damage + "de dano, vida restante: " + hp);
    }


}
