package main.week2;

public class StackStrings {
    private String[] stack;
    private int N = 0;

    public StackStrings(){
        stack = new String[1];
    }

    public void push(String item){
        if (stack.length == N) resize(stack.length * 2);
        stack[N++] = item;

    }

    @Override
    public String toString(){
        String stringStack = "";
        for (int i = 0; i < stack.length; i++){
            stringStack = stringStack.concat(" | ");
            stringStack = stringStack.concat(stack[i] != null ? stack[i] : "-");
        }
        return stringStack;
    }

    public void resize(int capacity){
        String[] stackCopy = new String[capacity];
        for(int i = 0; i < N; i++){
            stackCopy[i] = stack[i];
        }
        stack = stackCopy;
    }

    public String pop(){
        if(N == 0){
            return null;
        }
        String item = stack[--N];
        if (N == stack.length/4) resize(stack.length/2);
        stack[N] = null;
        return item;
    }
}
