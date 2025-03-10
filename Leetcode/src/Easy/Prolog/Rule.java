package Easy.Prolog;

import java.util.List;

class Rule {
    List<String> conditions;
    String conclusion;

    public Rule(List<String> conditions, String conclusion) {
        this.conditions = conditions;
        this.conclusion = conclusion;
    }

    @Override
    public String toString() {
        return conditions + " -> " + conclusion;
    }
}