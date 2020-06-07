import java.util.ArrayList;
public class ListOfExceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add("48");
        myList.add("Goodbye World");

        for(int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
            } catch (Exception e){
                System.out.println("Cannot cast string as an integer");
                System.out.println("The index the error occured is...      " + i);
                System.out.println("The value is...       " + myList.get(i));
            }
        }
    }
}