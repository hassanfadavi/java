package Activities.hassan.JAVA.One_JAVA;

import java.util.HashMap;
import java.util.Map;

public class ACTIVITY_53_1_HashMap_countCharacter {
    public static void main(String[] args) {



        //GIVE ME THE COUNT OF ALL CHARACHTER



        String message = "Welcome to java class!";
        Map<Character, Integer> countOfCharacters = new HashMap<>();
        /*
         * W - 1
         * e - 2
         * */

        System.out.println(message.replaceAll("[^A-Za-z]",""));
        System.out.println(message.replaceAll("[^A-Z]",""));
        System.out.println(message.replaceAll("[^a-z]",""));
        System.out.println(message.replaceAll("[^0-9]",""));
        System.out.println(message.replaceAll("[^A-Za-z0-9]",""));

        for ( char character : message.replaceAll("[^a-z]", "").toCharArray() ) {
            // if the character exists in my map, get the current count, and add 1 to it
            if ( countOfCharacters.containsKey(character) ) {
                countOfCharacters.put(character, countOfCharacters.get(character) + 1);
            } else {
                // if not, add the character and give it the count of 1
                countOfCharacters.put(character, 1);
            }
        }
        System.out.println(countOfCharacters);

        for ( Map.Entry<Character, Integer> entry : countOfCharacters.entrySet() ) {
            System.out.println( entry.getKey() + " - " + entry.getValue() );
        }

//        countOfCharacters.forEach( ( k, v ) -> System.out.println( k + " - " + v ));





    }
}
