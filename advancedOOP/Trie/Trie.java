import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;
public class Trie {
    public Node root;
    
    public Trie() {
        this.root = new Node();
    }
    
    public void insertWord(String word) {
        // gets the root node;
        Node currentNode = this.root;
        
        // iterates over every character in the word
        for(int i = 0; i < word.length(); i++) {
            // currentLetter is just the character / letter at the iteration
            Character currentLetter = word.charAt(i);
            // ask if the current letter is in the map of the current node
            Node child = currentNode.children.get(currentLetter);
            if(child == null) {
                child = new Node();
                currentNode.children.put(currentLetter, child); 
            } 
            
            currentNode = child;
        }
        currentNode.isCompleteWord = true;
    }
    public void isPrefixValid(String prefix, Trie selectedTrie) {
        // int count = 0;
        // int count2 = 0;
        System.out.println("Success");
        System.out.println(prefix);
        System.out.println(selectedTrie);
        System.out.println(prefix.charAt(1));
        Character letter = prefix.charAt(1);
        System.out.println(letter);
        Set<Character> keys = selectedTrie.root.children.get(letter).children.keySet();
        for(Character key : keys ) {
            // if (key == prefix.charAt(1)) {
                //     count++;
                // }
                // System.out.println(count);
                System.out.println(key);
        }
        // Set<Character> keys1 = selectedTrie.root.children.keySet();
        // for(Character key1 : keys1) {
        //     System.out.println("Test       " + key1);
        //     // if (prefix.charAt(0) == key1) {
        //     //     count ++;
        //     //     count2 ++;
        //     // }
        //     // System.out.println("Count 1        " + count);
        //     // System.out.println("Count 2      " + count2);
        // }
            // if (count == 2) {
                //     return true;
                // }
        // return false;
    }
}