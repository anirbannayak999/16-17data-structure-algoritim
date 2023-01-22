package com.bridgelabzalgoritim;

public class Node<R> {
    R data;
    Node<R> next;
    public Node(){
        this.data=data;
        this.next=null;

    }
    public Node(R data){
        this.data=data;



    }
    @Override
    public String toString() {
        return "[data=" + data + ", next=" + next + "]";
    }


}

