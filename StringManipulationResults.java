public class StringManipulationResults {
    public static void main(String[] args) {
        StringManipulation manipulator = new StringManipulation();
        String str = manipulator.trimAndConcat("       Hello       ", "       World        ");
        System.out.println("Problem 1..." + str);

        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hello World", letter);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
        System.out.println("problem 2a..." + a);
        System.out.println("problem 2b..." + b);
        System.out.println("problem 2c..." + c);

        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer d = manipulator.getIndexOrNull(word, subString);
        Integer e = manipulator.getIndexOrNull(word, notSubString);
        System.out.println("problem 3a..." + d);
        System.out.println("problem 3b..." + e);

        String palabra = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println("problem 4... " + palabra);

    }
}