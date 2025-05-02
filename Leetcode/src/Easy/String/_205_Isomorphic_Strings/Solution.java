package Easy.String._205_Isomorphic_Strings;

public class Solution {
    public static boolean isIsomorphic(String s, String t) {
        char sc[] = s.toCharArray();
        char tc[] = t.toCharArray();

        int smap[] = new int[256];
        int tmap[] = new int[256];

        for (int i = sc.length - 1; i >= 0; i--) {
            if (smap[sc[i]] != tmap[tc[i]]) {
                return false;
            }
            smap[sc[i]] = tmap[tc[i]] = i + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));    // true
        System.out.println(isIsomorphic("foo", "bar"));    // false
        System.out.println(isIsomorphic("paper", "title")); // true
        System.out.println(isIsomorphic("bbbaaaba", "aaabbbba"));      // false
    }
}
