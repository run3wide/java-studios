package Studio_3_2;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {

    public static void main(String[] args) {
        String message = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";

        char[] characters = message.toCharArray();

        Map<Character, Integer> characterMap = new HashMap();


        for (int i = 0; i < characters.length; i++) {
            char current = characters[i];
            if (!characterMap.containsKey(current)) {
                characterMap.put(current, 1);
            } else {
                int newValue = characterMap.get(current) + 1;
                characterMap.put(current, newValue);
            }
        }
        for (Character character : characterMap.keySet()) {
            String count = characterMap.get(character).toString();
            System.out.println(character + ": " + count);
        }

    }
}
