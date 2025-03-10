package Easy.Prolog;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Khai báo danh sách luật
        List<Rule> rules = Arrays.asList(
                new Rule(Arrays.asList("B", "D", "E"), "F"),
                new Rule(Arrays.asList("C", "F"), "A"),
                new Rule(Arrays.asList("C", "B"), "A"),
                new Rule(List.of("B"), "X"),
                new Rule(List.of("D"), "E"),
                new Rule(Arrays.asList("X", "A"), "H"),
                new Rule(Arrays.asList("X", "C"), "A"),
                new Rule(Arrays.asList("X", "B", "C"), "D")
        );

        // Khai báo tập sự kiện ban đầu
        Set<String> factBase = new HashSet<>(Arrays.asList("B", "C"));

        // In danh sách luật
        System.out.println("=== Tập luật ===");
        for (Rule rule : rules) {
            System.out.println(rule);
        }

        // In tập sự kiện ban đầu
        System.out.println("\n=== Tập sự kiện ban đầu ===");
        System.out.println(factBase);

        // Tiến hành suy diễn tiến
        System.out.println("\n=== Suy diễn tiến ===");
        ForwardChaining expertSystem = new ForwardChaining(rules, factBase);
        String goal = "H";
        boolean result = expertSystem.forwardChaining(goal);

        // In kết luận
        System.out.println("\nKết luận: " + goal + " " + (result ? "có thể" : "không thể") + " suy diễn được.");
    }
}