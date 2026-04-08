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
        System.out.println ("3. Bardo - equilíbrio entre Hp, Força e Carisma");
        int escolhaClasse = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha após o próximoInt()

        switch (escolhaClasse) {

            case 1:
                player = new Warrior(name);
                System.out.println ("Guerreiro:" + player.getName() + " pronto(a) para a aventura com " + player.getHp() + " de HP ");
                break;
            case 2: 
                player = new Mage(name);
                System.out.println("Mago:" + player.getName() + " pronto(a) para a aventura com " + player.getHp() + "de HP");
                break;
            case 3: 
                player = new Bard(name);
                System.out.println("Bardo:" + player.getName() + " pronto(a) para a aventura com " + player.getHp() + "de HP");
                break;
            default:
                System.out.println("Escolha Inválida! O destino te fez um Guerreiro(a)");
                player = new Warrior(name);
                break;
        }

        Dungeon masmorra = new Dungeon(player, scanner);
        masmorra.iniciar();
    }
}
