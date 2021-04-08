import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var game = new Game();

        System.out.println("=== Welcome to Rock-Paper-Scissors game ===");
        System.out.println("Enter Player 1 choice (rock, paper, or scissors):");
        String player_1 = sc.next();
        game.check(player_1);

        System.out.println("Enter Player 2 choice (rock, paper, or scissors):");
        String player_2 = sc.next();
        game.check(player_2);

        System.out.println(game.game_result(player_1,player_2));
    }
}
