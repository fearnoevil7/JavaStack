import java.util.ArrayList;
public class DoublyLinkedList {
    public Node head;
    public Node tail;
    public Node lastNode;
    public int numberOfNodesInList = 0;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void push(Node newNode){
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
        numberOfNodesInList++;
    }

    public void printValuesForward() {
        int count = 0;
        Node current = this.head;
        while(current != null) {
            System.out.println(count + " current node " + current.value);
            current = current.next;
            count++;
        }
    }

    public void printValuesBackward() {
        Node current = this.tail;
        while(current != null) {
            System.out.println(current.value);
            current = current.previous;
        }
    }
    public Node pop() {
        int count = 0;
        Node current = this.head;
        System.out.println(" current node Test!!!" + current.previous);
        Node lastNodeInList = this.lastNode;
        while (current != null) {
            System.out.println("index      " + count + "node      " + current.previous);
            if (current.next.next == null) {
                System.out.println("***************" + current.next.value);
                current.next = null;
                this.tail = current;
                // current.previous = current.previous.previous;
                System.out.println(count + " current node Pop!!!" + this.tail.value);
            }
            if (current == this.lastNode) {
                System.out.println(count + " index   Last Node      " + this.lastNode.value);
            }
            System.out.println("The index is      " + count);
            current = current.next;
            count++;
        }
        return lastNodeInList;
    }
    public boolean contain(Integer val){
        Node current = this.head;
        System.out.println("Processing request.......       ");
        while (current != null) {
            if (current.value == val) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public int size(){
        System.out.println("Counting Doubly Linked List.......       ");
        return numberOfNodesInList;
    }
    public void insertAt(Node newNode, int index) {
        Boolean oddAmountOfNodes = false;
        Boolean evenAmountOfNodes = false;
        int size = this.size();
        if (size % 2 == 0) {
            evenAmountOfNodes = true;
        }
        if (size % 2 == 1) {
            oddAmountOfNodes = true;
        }
        Node nodeInFront;
        Node nodeBehind;
        int counter = 0;
        Node current = this.head;
        while (current != null) {
            if (counter == index) {
                // if (evenAmountOfNodes = true) {
                //     nodeInFront = current.next;
                //     current.next = newNode;
                //     nodeInFront.previous = newNode;
                // }
                // if (oddAmountOfNodes = true) {
                //     nodeBehind = current.previous;
                //     nodeBehind.next = newNode;
                //     current.previous = newNode;
                // }
                nodeInFront = current.next;
                nodeInFront.previous = newNode;
                newNode.next = nodeInFront;
                current.next = newNode;
                newNode.previous = current;
            }
            current = current.next;
            counter ++;
        }
    }
    public int removeAt(int index) {
        Node nodeInFront;
        Node nodeBehind;
        int counter = 0;
        Node current = this.head;
        int temp = 0;
        while (current != null) {
            if (counter == index) {
                temp = current.value;
                nodeInFront = current.next;
                nodeBehind = current.previous;
                nodeInFront.previous = nodeBehind;
                nodeBehind.next = nodeInFront;
            }
            current = current.next;
            counter ++;
        }
        return temp;
    }
}