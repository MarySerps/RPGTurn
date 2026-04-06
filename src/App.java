import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Player player = null;

        System.out.println ("------  Bem-vindo ao RPGTurn  ------");

        //Definir nome do personagem
        System.out.print ("Digite o nome do seu personagem: ");
        String name = scanner.nextLine();

        //Definir classe do personagem
        System.out.println ("Escolha a sua classe");
        System.out.println ("1. Guerreiro - mais Hp e focado em Força");
        System.out.println ("2. Mago - menos Hp e focado em inteligência");
        int escolhaClasse = scanner.nextInt();

        switch (escolhaClasse) {

            case 1:
                player = new Warrior(name);
                System.out.println ("Guerreiro:" + player.getName() + " pronto(a) para a batalha com " + player.getHp() + "de HP");
                break;
            case 2: 
                player = new Mage(name);
                System.out.println("Mago:" + player.getName() + " pronto(a) para a batalha com " + player.getHp() + "de HP");
                break;

            default:
                System.out.println("Escolha Inválida! O destino te fez um Guerreiro(a)");
                player = new Warrior(name);
                break;
        }

        Enemy boss = new Enemy("Líder orc", 45, 16);
        System.out.println ("Um " + boss.getName() + " apareceu! Prepare-se para a batalha!");

        while (player.getHp() > 0 && boss.getHp() > 0) {
            System.out.println ("Seu turno! " + player.getName() + " HP: " + player.getHp());
            System.out.println ("1. Ataque Normal");
            System.out.println ("2. Ataque Especial");

            int acao = scanner.nextInt();

            switch (acao) {
                case 1: 
                    player.attack(boss);
                    System.out.println (">> Você atacou o " + boss.getName() + " e causou dano! HP do inimigo: " + boss.getHp());
                    break;
                case 2:
                    player.specialAttack(boss);
                    System.out.println (">> Você usou um ataque especial no " + boss.getName() + " e causou dano! HP do inimigo: " + boss.getHp());
                    break;
            }

            if (boss.getHp() > 0) {
                System.out.println ("Turno do inimigo! " + boss.getName() + " HP: " + boss.getHp());
                boss.attack(player);
            }
        }

        if (player.getHp() > 0) {
            System.out.println ("Parabéns! Você derrotou o " + boss.getName() + " e venceu a batalha!");
        } else {
            System.out.println ("Você foi derrotado pelo " + boss.getName() + ". Melhor sorte na próxima vez!");
        }
    }
}
