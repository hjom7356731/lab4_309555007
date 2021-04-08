public class Game {
    public int getnumber(String str){
//      5 0 2
        switch(str){
            case "paper":
                return 0;
            case "rock":
                return 1;
            case "scissors":
                return 2;
        }
        return -1;
    }
    public void check(String str) throws IllegalArgumentException{
        if( getnumber(str) < 0 ){
            //    "Exception in thread "main" java.lang.IllegalArgumentException: Bad Choice
            throw new IllegalArgumentException("Bad Player!");
        }
    }
    public String game_result (String player1,String player2) {
        if( player1.equals(player2) ){
            return "Draw";
        }else{
            int play_1 = getnumber(player1),play_2 = getnumber(player2);
            int dis = play_1 - play_2;
            if( dis == 1 || dis == -2){
                return "Player 2 win!";
            }else if(dis == -1 || dis == 2){
                return "Player 1 win!";
            }else{
                return "testing error";
            }
        }
    }
}
