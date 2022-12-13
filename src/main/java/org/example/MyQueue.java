package org.example;

public class MyQueue {
    private final MyLinkList<Integer> myLinkList;

    public MyQueue() {
        this.myLinkList =new MyLinkList<Integer>();
    }

    public void enQueue(MyNode<Integer> myFirstNode) {
        myLinkList.append(myFirstNode);
    }

    public void printMyQueue(){
       myLinkList.printMyNodes("Queue : ");
    }
}