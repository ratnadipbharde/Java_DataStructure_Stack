package org.example;


public class Main {

    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printMyStack();
        INode a = myStack.peak();
        System.out.println("Peak: " + a);
        myStack.pop();
        myStack.printMyStack();
        if (myStack.isEmpty()) {
            System.out.println("empty");
        }else {
            System.out.println("not empty");
        }
        System.out.println("Stack Size is : "+myStack.getSize());
    }
}
