package Easy.Prolog;

import java.util.*;

public class ForwardChaining {
    private final List<Rule> rules; // Danh sách các luật
    private final Set<String> factBase; // Tập sự kiện ban đầu

    public ForwardChaining(List<Rule> rules, Set<String> factBase) {
        this.rules = rules;
        this.factBase = new HashSet<>(factBase);
    }

    public boolean forwardChaining(String goal) {
        boolean added;
        int step = 1;
        System.out.println("Bước 0: Tập sự kiện ban đầu " + factBase);

        do {
            added = false;
            List<Rule> applicableRules = new ArrayList<>();

            // Tìm các luật có thể áp dụng
            for (Rule rule : rules) {
                if (factBase.containsAll(rule.conditions) && !factBase.contains(rule.conclusion)) {
                    applicableRules.add(rule);
                }
            }

            // Sắp xếp luật theo số lượng điều kiện giảm dần
            applicableRules.sort(Comparator.comparingInt(r -> -r.conditions.size()));

            // Áp dụng luật để suy diễn
            for (Rule rule : applicableRules) {
                factBase.add(rule.conclusion);
                added = true;
                System.out.println("Bước " + step + ": Áp dụng luật " + rule + " → Suy ra " + rule.conclusion);
                step++;
                if (rule.conclusion.equals(goal)) {
                    return true; // Dừng nếu đạt mục tiêu
                }
            }
        } while (added);

        return factBase.contains(goal);
    }
}
