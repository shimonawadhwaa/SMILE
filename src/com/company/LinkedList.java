package com.company;

public class LinkedList {
    public static void main(String[] args) {
        Linked ref=new Linked();
        ref.appendNode(2);
        ref.appendNode(5);
        ref.appendNode(6);
        ref.appendNode(3);
        ref.appendNode(8);
        ref.appendNode(10);
        ref.insertAtBeginning(3);
       // ref.searchWanted(5);
       // ref.setNull();
        //ref.findMid();
        ref.reverseIt();
        ref.show();
        //search wanted element in linkedList
    }
}
class Node{
    int info;
    Node next;
    Node(int info)
    {
        this.info=info;
    }
}
class Linked{
    Node head=null;
    Node ptr;
    void appendNode(int info)
    {
        Node newNode=new Node(info);
        newNode.next=null;
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            ptr=head;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next=newNode;
        }

    }
    void insertAtBeginning(int inf) {
        Node newNode = new Node(inf);
        if (head == null){
            head = newNode;
        newNode.next = null;
    }
            else{
        newNode.next = head;
        head = newNode;
    }

    }
    //set Null to 2nd Last node
    void setNull()
    {
        ptr=head;
        while(ptr.next.next!=null)
        {
            ptr=ptr.next;
        }
        ptr.next=null;
    }
    void show()
    {ptr=head;
        while(ptr!=null)
        {
            System.out.println(ptr.info);
            ptr=ptr.next;
        }
    }


    void searchWanted(int search) {
        ptr=head;
        int count=1;
        while(ptr!=null)
        {
            if(ptr.info==search)
            {
                break;
            }
            ptr=ptr.next;
            count++;
        }
        System.out.println("found at "+count+" position");
    }
    void findMid() {
        Node fp=head;
        Node sp=head;
        while(fp.next!=null)
        {
            sp=sp.next;
            fp=fp.next.next;
        }
        System.out.println(sp.info);
    }

    void reverseIt() {
        Node current=head;
        Node prev=null;
        Node next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
}