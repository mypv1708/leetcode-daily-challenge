package Easy.GameTheory._3222_Find_the_Winning_Player_in_Coin_Game;

public class _3222_Find_the_Winning_Player_in_Coin_Game {
    static String losingPlayer(int x, int y) {
        int turns = Math.min(x, y / 4);
        return (turns % 2 == 1) ? "Alice" : "Bob";
    }
    public static void main(String[] args) {
        System.out.println(losingPlayer(4,11));
    }
}
