package org.example;

public class MyStack {
    private final MyLinkList myLinkList;

    public MyStack() {
        this.myLinkList = new MyLinkList();
    }

    public INode peak() {
        return myLinkList.getHead();
    }

    public INode pop() {
        return myLinkList.pop();
    }

    public void push(INode myNode) {
        myLinkList.add(myNode);
    }

    public void printMyStack() {
        myLinkList.printMyNodes();
    }
}
