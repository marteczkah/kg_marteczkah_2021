// Marta Hasny Kargo Software Engineering Internship Assesment

import java.util.*;

public class main {

    //method that returns the length of the inputed strings without the duplicates
    public static int checkDuplicate(String s1){
        List<Character> duplicates = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++){
            if (!duplicates.contains(s1.charAt(i))){
                duplicates.add(s1.charAt(i));
            }
        }
        return duplicates.size();
    }

    // method that checks whether the strings can be mapped to each other 
    // based on the length of strings without duplicates 
    public static void map(String s1, String s2) {
        int countS1 = checkDuplicate(s1);
        int countS2 = checkDuplicate(s2);
        if (countS1 >= countS2){ //when the length of s1 without duplicates is bigger or equal to length of s2, strings can be mapped 
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

    public static void main(String[] args){
        if (args.length != 2){
            System.out.println("Invalid input");
            return;
        }
        map(args[0], args[1]);
    }

}