import java.util.ArrayList;
public class BasicResults {
    public static void main(String[] args) {
        // Basic basic13 = new Basic();
        // basic13.PrintOneTo255();
        System.out.println("Commencing Question #1......");
        for (int i = 1; i < 256; i++) {
            System.out.println(i);
        }
        System.out.println("Finished Question #1.......");
        System.out.println("Commencing Question #2......");
        for (int i = 1; i < 256; i++) {
            if( i % 2 == 1 ) {
                System.out.println(i);
            }
        }
        System.out.println("Finished Question #2.......");
        System.out.println("Commencing Question #3......");
        int sumForQuestionNumber3 = 0;
        for (int i = 1; i < 256; i++) {
            sumForQuestionNumber3 += i;
            System.out.println("New Number: " + i + ", Sum: " + sumForQuestionNumber3);
        }
        System.out.println("Finished Question #3.......");
        System.out.println("Commencing Question #4......");
        // {1, 3, 5, 7, 9, 13};
        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(1);
        x.add(3);
        x.add(5);
        x.add(7);
        x.add(9);
        x.add(13);
        // basic13.itterateArray(x);
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i));
        }
        System.out.println("Finished Question #4.......");
        System.out.println("Commencing Question #5......");
        int max = 0;
        ArrayList<Integer> y = new ArrayList<Integer>();
        y.add(-3);
        y.add(-5);
        y.add(-7);
        for (int i = 0; i < y.size(); i++) {
            if (i == 0){
                max += y.get(i);
            }
            if (y.get(i) > max) {
                max = y.get(i);
            }
        }
        System.out.println("Max is.....       " + max);
        for (int i = 0; i < x.size(); i++) {
            if (i == 0){
                max += x.get(i);
            }
            if (x.get(i) > max) {
                max = x.get(i);
            }
        }
        System.out.println("Max is.....       " + max);
        System.out.println("Finished Question #5.......");
        System.out.println("Commencing Question #6......");
        int sum = 0;
        ArrayList<Integer> z = new ArrayList<Integer>();
        z.add(2);
        z.add(10);
        z.add(3);
        for (int i = 0; i < z.size(); i++) {
            sum += z.get(i);
        }
        int average = sum / z.size();
        System.out.println("Average is.......       " + average);
        System.out.println("Finished Question #6.......");
        System.out.println("Commencing Question #7......");
        ArrayList<Integer> q = new ArrayList<Integer>();
        for (int i = 1; i < 256; i++) {
            if( i % 2 == 1 ) {
                q.add(i);
            }
        }
        System.out.println("Odd Array......       " + q);
        System.out.println("Finished Question #7.......");
        System.out.println("Commencing Question #8......");
        int yy = 3;
        int count = 0;
        ArrayList<Integer> w = new ArrayList<Integer>();
        w.add(1);
        w.add(3);
        w.add(5);
        w.add(7);
        for (int i = 0; i < w.size(); i++) {
            if (w.get(i) > yy) {
                count += 1;
            }
        }
        System.out.println("numbers greater than y are......       " + count);
        System.out.println("Finished Question #8.......");
        System.out.println("Commencing Question #9......");
        ArrayList<Integer> sample = new ArrayList<Integer>();
        sample.add(1);
        sample.add(5);
        sample.add(10);
        sample.add(-2);
        ArrayList<Integer> u = new ArrayList<Integer>();
        for (int i = 0; i < sample.size(); i++) {
            // System.out.println(u.get(i) * u.get(i));
            // cannot change index to squared version in the array during code execution due to java being statically typed your first instinct is to multiply the index by itself and then setting index to that product but you cannot because this is a statically typed language instead you might have to just create another array and push the answers there until further notice
            u.add(sample.get(i) * sample.get(i));
        }
        System.out.println(u);
        // System.out.println(u);
        System.out.println("Finished Question #9.......");
        System.out.println("Commencing Question #10......");
        ArrayList<Integer> p = new ArrayList<Integer>();
        for (int i = 0; i < sample.size(); i++) {
            if (sample.get(i) < 0) {
                p.add(0);
            } else {
                p.add(sample.get(i));
            }
        }
        System.out.println(p);
        System.out.println("Finished Question #10.......");
        System.out.println("Commencing Question #11......");
        ArrayList<Integer> t = new ArrayList<Integer>();
        int min2 = 0;
        int max2 = 0;
        int sum2 = 0;
        for (int i = 0; i < sample.size(); i++) {
            if (i == 0) {
                min2 = i;
                max2 = i;
            }
            if (min2 > sample.get(i)) {
                min2 = sample.get(i);
            }
            if (max2 < sample.get(i)) {
                max2 = sample.get(i);
            }
            sum2 += sample.get(i);
        }
        t.add(max2);
        t.add(min2);
        t.add(sum2 / sample.size());
        System.out.println(t);
        System.out.println("Finished Question #11.......");
        System.out.println("Commencing Question #12......");
        int temp = 0;
        ArrayList<Integer> last = new ArrayList<Integer>();
        last.add(1);
        last.add(5);
        last.add(10);
        last.add(7);
        last.add(-2);
        ArrayList<Integer> array = new ArrayList<Integer>();
        // System.out.println(last.size() - 1);
        for (int i = 0; i < last.size(); i++) {
            if ( i == last.size() - 1 ) {
                // temp = last.get(i);
                array.add(0);
                // System.out.println(array);
                break;
            }
            temp = last.get(i + 1);
            array.add(temp);
        }
        System.out.println(array);
        System.out.println("Finished Question #11.......");
        System.out.println("Fin!!!!!!!");
    }
}