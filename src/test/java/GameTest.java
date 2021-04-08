import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
class GameTest {
    private Game game = new Game();
    @org.junit.jupiter.api.Test
    void getnumber() {
        assertEquals(game.getnumber("paper"),0);
        assertEquals(game.getnumber("rock"), 1);
        assertEquals(game.getnumber("scissors"), 2);
        //        error input
        assertEquals(game.getnumber("Paper"), -1);
        assertEquals(game.getnumber("666"), -1);
    }

    @org.junit.jupiter.api.Test
    void check() {
        assertDoesNotThrow (() -> game.check("paper"));
        //     valid/invalid input cases
        assertThrows(IllegalArgumentException.class, () -> game.check("Paper"));
        assertThrows(IllegalArgumentException.class, () -> game.check("666"));
    };

    @org.junit.jupiter.api.Test
    void game_result() {
        //      all player_1 win
        assertEquals(game.game_result("paper", "rock"),"Player 1 win!");
        assertEquals(game.game_result("rock", "scissors"), "Player 1 win!");
        assertEquals(game.game_result("scissors", "paper"), "Player 1 win!");
        //      all player_2 win
        assertEquals(game.game_result("paper", "scissors"),"Player 2 win!");
        assertEquals(game.game_result("rock", "paper"), "Player 2 win!");
        assertEquals(game.game_result("scissors", "rock"), "Player 2 win!");

        //      all Draw
        assertEquals(game.game_result("paper", "paper"),"Draw");
        assertEquals(game.game_result("rock", "rock"), "Draw");
        assertEquals(game.game_result("scissors", "scissors"), "Draw");

    }
}