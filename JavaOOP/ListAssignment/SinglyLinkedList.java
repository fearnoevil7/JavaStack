public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void remove() {
        Node runner = head;
        while (runner.next !=null) {
            runner = runner.next;
            if (runner.next.next == null) {
                runner.next = null;
            }
        }
    }
    public void printValues() {
        Node runner = head;
        while (runner.next !=null) {
            System.out.println(runner.value);
            runner = runner.next;
        }
        System.out.println(runner.value);
    }
    public int find(int number) {
        Node runner = head;
        int temp = 0;
        int count = 0;
        while (runner.next != null && count < 1) {
            if (runner.value == number && count < 1) {
                temp = runner.value;
                System.out.println("Yay Yay found the desired number....       " + temp);
                count += 1;
            }
            runner = runner.next;
        }
        return temp;
    }
    // public void removeAt(int number) {
    //     Node runner = head;
    //     int count = -1;
    //     while (runner.next != null) {
    //         if (count == number) {
    //             System.out.println("Splended");
    //             runner = null;
    //         }
    //         count += 1;
    //         runner = runner.next;
    //     }
    // }
}