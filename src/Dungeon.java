import java.util.Scanner;

public class Dungeon {
    private Player player;
    private Scanner scanner;

    public Dungeon (Player player, Scanner scanner) {
        this.player = player;
        this.scanner = scanner;
    }

    //Memoria
    private boolean AjudouMago = false;

    public void iniciar () {
        salaInicial();
    }

    private void salaInicial() {
        System.out.println ("Você acorda em uma sala escura, sem memória de como chegou lá");
        System.out.println ("Há duas portas: uma à esquerda e outra à direita, qual você escolhe? (esquerda/direita)");
        String escolha = scanner.nextLine();    

        if (escolha.equalsIgnoreCase("esquerda")){
            salaEsquerda();
        } else if (escolha.equalsIgnoreCase("direita")){
                salaDireita();
        }
    }

    private void salaEsquerda() {
        System.out.println ("Quando você entra na sala no meio dela vê um baú");
        System.out.println ("Você abre esse baú? (sim/não)");
        String escolha = scanner.nextLine();

        if (escolha.equalsIgnoreCase("sim")){
            System.out.println ("Ao chegar perto do baú, você é atacado!!");
            player.takeDamage(10);
        } else if (escolha.equalsIgnoreCase("não")){
            System.out.println ("Você decidiu não abrir o baú e seguiu para a próxima sala");
        }

        primeiraBatalha();
    }

    private void salaDireita() {
        System.out.println ("Ao entrar na sala, você vê um mago com as mão amarradas, ele implora por sua ajuda");
        System.out.println ("Você ajuda o mago? (sim/não)");
        String escolha = scanner.nextLine();

        if (escolha.equalsIgnoreCase("sim")){
            System.out.println ("O mago agredece");
            System.out.println ("Jovem aventureiro, obrigado por me libertar, em frente a um monstro o qual o ajudarei a derrotar");
            AjudouMago = true;
        } else if (escolha.equalsIgnoreCase("não")){
            System.out.println ("Você decide não ajudar o mago e segue em frente para a próxima sala");
        }

        primeiraBatalha();
    }

    private void primeiraBatalha() {
        System.out.println ("Ao entrar na sala, um monstro aparece!!");
        Enemy monstroSobrio = new Enemy("Monstro Sombrio", 30, 5);

        if (AjudouMago){
            System.out.println ("Em uma nuvem de fumaça, o mago aparece atrás de ti e cria um escudo mágico a sua volta, te protegendo do ataque do monstro");
                player.takeDamage(0);
        } else{
            System.out.println ("O monstro ataca você, causando dano!!");
                player.takeDamage(5);
        }

        System.out.println ("-- Sua Primeira Batalha Começou --");

        while (player.getHp() > 0 && monstroSobrio.getHp() > 0){
            System.out.println ("Escolha sua ação");
            System.out.println ("1. Ataque Normal");
            System.out.println ("2. Tentar Fugir");
            String acao = scanner.nextLine();

            if (acao.equals("1")){
                System.out.println ("Como você quer atacar?");
                System.out.println ("1. Ataque Normal");
                System.out.println ("2. Ataque Especial");
                String tipoAtaque = scanner.nextLine();

                if (tipoAtaque.equals("1")){
                    int danoCausado = player.attack();
                    System.out.println ("Você causou " + danoCausado + " de dano ao monstro!");
                    monstroSobrio.takeDamage(danoCausado);
                } else if (tipoAtaque.equals("2")){
                    int danoCausado = player.specialAttack();
                    System.out.println ("Você causou " + danoCausado + " de dano ao monstro com seu ataque especial!");
                    monstroSobrio.takeDamage(danoCausado);
                }

                if (monstroSobrio.getHp() > 0){
                    System.out.println ("O monstro contra-ataca, causando dano!!");
                    player.takeDamage(5);
                }

            } else if (acao.equals("2")){
                System.out.println ("Você tenta fugir, mas o monstro é mais rápido e te ataca, causando dano!!");
                player.takeDamage(5);
                System.out.println ("Mesmo ferido, você consegue fugir para a próxima sala");
                break;
            }
        }

        if (player.getHp() <= 0){
            System.out.println ("Você foi derrotado, a masmora consome sua alma...");
            System.out.println ("!!GAME OVER!!");
        } else if (monstroSobrio.getHp() <= 0){
            System.out.println ("Parabéns, você derrotou o monstro e segue para a próxima sala!");
            player.addXp (20);
            
            salaDoTesouro();
        }
    }

    private void salaDoTesouro() {
        System.out.println ("Após derrotar o monstro, quando você entra na sala, um baú aparece no centro, ele brilha intensamente, você abre esse baú? (sim/não)");
        String escolha = scanner.nextLine();

        if (escolha.equalsIgnoreCase("sim")){
            System.out.println ("Você abre o baú e encontra um artefato mágico que aumenta sua força, inteligência e saúde!");
            player.addXp(20);
        } else if (escolha.equalsIgnoreCase("não")){
            System.out.println ("Você decide não abrir o baú e segue em frente para a próxima sala");
        }

        salaDoGnomo();
    }

    private void salaDoGnomo() {
        System.out.println ("Ao entrar na sala, um gnomo aparece, ele parece amigável e oferece ajuda para você sair da masmora, ele te dá uma poção de cura e um mapa do local");
        System.out.println ("Você aceita a ajuda do gnomo? (sim/não)");
        String escolha = scanner.nextLine();

        if (escolha.equalsIgnoreCase("sim")){
            System.out.println ("O gnomo te dá a poção de cura e o mapa, ele te deseja boa sorte em sua jornada");
            player.addXp(20);
        } else if (escolha.equalsIgnoreCase("não")){
            System.out.println ("Você decide não aceitar a ajuda do gnomo e segue em frente para a próxima sala");
        }

        
    }
}
