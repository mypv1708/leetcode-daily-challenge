package Adding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count_Character_In_String {
    static void parseText(String data) {
        // Input your solution here
        if (data.isEmpty()) {
            System.out.println("empty");
        } else {
            HashMap<String, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < data.length(); i++) {
                hashMap.put(String.valueOf(data.charAt(i)), hashMap.getOrDefault(String.valueOf(data.charAt(i)), 0) + 1);
            }
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                if (String.valueOf(entry.getKey()).equals(" ")) {
                    System.out.print("space" + " " + entry.getValue() + " ");
                } else {
                    System.out.print(entry.getKey() + " " + entry.getValue() + " ,");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String input;
        int count = 0;

        while (myObj.hasNextLine()) {
            count++;
            input = myObj.nextLine();
            parseText(input);
        }
    }
}
