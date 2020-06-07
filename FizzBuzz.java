public class FizzBuzz {
    public String calculate(int num) {
        String string;
        if(num % 3 == 0 && num % 5 !=0){
            string = "fizz";
            return string;
        } else if(num % 5 == 0 && num % 3 !=0) {
            string = "buzz";
            return string;
        } else if(num % 5 == 0 && num % 3 == 0) {
            string ="FizzBuzz";
            return string;
        } else {
            string = "" + num;
            return string;
        }
    }
}