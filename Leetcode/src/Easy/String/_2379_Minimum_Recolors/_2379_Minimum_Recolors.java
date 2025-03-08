package Easy.String._2379_Minimum_Recolors;

public class _2379_Minimum_Recolors {
    static int minimumRecolors(String blocks, int k) {
        int counter = 0, minStep;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') counter++;
        }

        minStep = counter;

        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i) == 'W') counter++;
            if (blocks.charAt(i - k) == 'W') counter--;

            minStep = Math.min(minStep, counter);
            if (minStep == 0) return minStep;

        }
        return minStep;
    }

    public static void main(String[] args) {
        String blocks = "WBWBBBW";
        System.out.println(minimumRecolors(blocks, 2));
    }
}
