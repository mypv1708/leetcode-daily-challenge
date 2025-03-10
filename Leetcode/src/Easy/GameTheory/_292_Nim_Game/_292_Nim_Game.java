package Easy.GameTheory._292_Nim_Game;

public class _292_Nim_Game {
    static boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        System.out.println(canWinNim(4));
    }
}
