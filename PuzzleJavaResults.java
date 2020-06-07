import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
public class PuzzleJavaResults {
    public static void main(String[] args) {
        // PuzzleJava questions = new PuzzleJava();
        // ArrayList<Integer> array1 = new ArrayList<Integer>();
        // array1.add(3);
        // array1.add(5);
        // array1.add(1);
        // array1.add(2);
        // array1.add(7);
        // array1.add(9);
        // array1.add(8);
        // array1.add(13);
        // array1.add(25);
        // array1.add(32);
        // for (int i = 0; i < array1.size(); i++) {

        // }
        System.out.println("Commencing Question #1......");
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        ArrayList<Integer> z = new ArrayList<Integer>();
        z.add(3);
        z.add(5);
        z.add(1);
        z.add(2);
        z.add(7);
        z.add(9);
        z.add(8);
        z.add(13);
        z.add(25);
        z.add(32);
        for (int i = 0; i < z.size(); i++) {
            System.out.println(z.get(i));
            if (z.get(i) > 10) {
                newArr.add(z.get(i));
            }
        }
        System.out.println(newArr);
        System.out.println("Finished Question #1.......");
        System.out.println("Commencing Question #2......");
        ArrayList<String> question2 = new ArrayList<String>();
        ArrayList<String> question2NewArray = new ArrayList<String>();
        question2.add("Nancy");
        question2.add("Jinichi");
        question2.add("Fujibayashi");
        question2.add("Momochi");
        question2.add("Ishikawa");
        Collections.shuffle(question2);
        for (int i = 0; i < question2.size(); i++) {
            if ( question2.get(i).length() > 5 ) {
                question2NewArray.add(question2.get(i));
            }
            System.out.println(question2.get(i));
        }
        System.out.println("......      " + question2NewArray);
        System.out.println("Finished Question #2.......");
        System.out.println("Commencing Question #3......");
        ArrayList<Character> alphabet = new ArrayList<Character>();
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.add('d');
        alphabet.add('e');
        alphabet.add('f');
        alphabet.add('g');
        alphabet.add('h');
        alphabet.add('i');
        alphabet.add('j');
        alphabet.add('k');
        alphabet.add('l');
        alphabet.add('m');
        alphabet.add('n');
        alphabet.add('o');
        alphabet.add('p');
        alphabet.add('q');
        alphabet.add('r');
        alphabet.add('s');
        alphabet.add('t');
        alphabet.add('u');
        alphabet.add('v');
        alphabet.add('w');
        alphabet.add('x');
        alphabet.add('y');
        alphabet.add('z');
        Collections.shuffle(alphabet);
        for (int i = alphabet.size() - 1; i >= 0; i--) {
            if (i == alphabet.size() - 1) {
                System.out.println(alphabet.get(i));
            }
            if (i == 0) {
                if (alphabet.get(i) == 'a' || alphabet.get(i) == 'e' || alphabet.get(i) == 'i' || alphabet.get(i) == 'o' || alphabet.get(i) == 'u') {
                    System.out.println("first value in array is a vowel");
                }
            }
        }
        System.out.println("Finished Question #3.......");
        System.out.println("Commencing Question #4......");
        ArrayList<Integer> v = new ArrayList<Integer>();
        int upperBound = 100;
        int lowerBound = 55;
        for (int i = 0; i < 10; i++) {
            int num = lowerBound + (int)(Math.random() * ((upperBound - lowerBound) + 1));
            v.add(num);
        }
        System.out.println(v);
        System.out.println("Finished Question #4.......");
        System.out.println("Commencing Question #5......");
        ArrayList<Integer> t = new ArrayList<Integer>();
        int upperBound2 = 100;
        int lowerBound2 = 55;
        for (int i = 0; i < 10; i++) {
            int num2 = lowerBound2 + (int)(Math.random() * ((upperBound2 - lowerBound2) + 1));
            t.add(num2);
        }
        Collections.sort(t);
        int max3 = 0;
        int min3 = 0;
        for (int i = 0; i < t.size(); i++) {
            if (i == 0) {
                max3 = t.get(i);
                min3 = t.get(i);
            }
            if (t.get(i) > max3) {
                max3 = t.get(i);
            }
            if (t.get(i) < min3) {
                min3 = t.get(i);
            }
        }
        System.out.println(t);
        System.out.println("Min is......       " + min3);
        System.out.println("Max is.....      " + max3);
        System.out.println("Finished Question #5.......");
        System.out.println("Commencing Question #6......");
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String randomString = "";
        int length = 5;
        Random rand = new Random();
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(rand.nextInt(characters.length()));
        }
        for(int i = 0; i < text.length; i++) {
            randomString += text[i];
        }
        System.out.println(randomString);
        System.out.println("Finished Question #5.......");
        System.out.println("Commencing Question #6......");
        ArrayList<String> tenRandomStrings = new ArrayList<String>();
        String characters1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String randomString2 = "";
        int length2 = 5;
        Random rand2 = new Random();
        char[] text2 = new char[length2];
        for (int i = 0; i < 10; i++) {
            for (int n = 0; n < length2; n++) {
                text2[n] = characters1.charAt(rand2.nextInt(characters1.length()));
            }
            for(int p = 0; p < text.length; p++) {
                randomString2 += text2[p];
            }
            tenRandomStrings.add(randomString2);
        }
        System.out.println(tenRandomStrings);
    }
}