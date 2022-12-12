package org.example;

public class MyStack {
    private final MyLinkList myLinkList;

    public MyStack() {
        this.myLinkList = new MyLinkList();
    }

    public void push(INode myNode) {
        System.out.println("My Stack" + " ");
        myLinkList.add(myNode);
    }

    public void printMyStack() {
        myLinkList.printMyNodes();
    }
}
