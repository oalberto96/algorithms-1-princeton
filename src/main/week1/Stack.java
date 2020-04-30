package main.week1;

public class Stack {
    private Node first;

    private class Node {
        String item;
        Node next;

        public Node(String item){
            this.item = item;
        }

    }

    public void push(String item) {
        Node oldNode = first;
        first = new Node(item);
        first.next = oldNode;
    }

    public String pop() {
        if(first == null){
            throw new StackOverflowError();
        }
        Node item = first;
        first = item.next;
        return item.item;
    }
}
