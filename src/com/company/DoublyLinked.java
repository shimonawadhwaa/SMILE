package com.company;

public class DoublyLinked {
    public static void main(String[] args) {
        DoublyLinkedList ref=new DoublyLinkedList();
        ref.appendNode(2);
        ref.appendNode(4);
        ref.appendNode(5);
        ref.appendNode(7);
        ref.appendNode(11);
        ref.appendNode(3);
        ref.appendNode(6);

        ref.insertNode(6,5);

        ref.deleteNode(4);

        ref.show();
    }
}
class nodes
{
    nodes prev;
    nodes next;
    int info;
    nodes(int info)
    {
        this.info=info;
    }
}
class DoublyLinkedList
{
    nodes head=null;
    nodes ptr;
    void appendNode(int info)
    {
        nodes newNode=new nodes(info);
        newNode.next=null;
        newNode.prev=null;
        if(head==null)
        {
            head=newNode;
        }
        else{
            ptr=head;
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next=newNode;
            newNode.prev=ptr;
        }
    }
    void show()
    {
        ptr=head;
        while(ptr!=null)
        {
            System.out.println(ptr.info);
            ptr=ptr.next;
        }
    }

    void insertNode(int insert, int before) {
        ptr=head;
        nodes newNode=new nodes(insert);
        newNode.next=null;
        newNode.prev=null;
        while(ptr.info!=before)
        {
            ptr=ptr.next;
        }
        newNode.next=ptr.next;
        newNode.prev=ptr.next.prev;
        ptr.next=newNode;
        ptr.next.prev=newNode;
    }

    void deleteNode(int del) {
        ptr=head;
        while(ptr.info!=del)
        {
            ptr=ptr.next;
        }
        ptr.prev.next=ptr.next;
        ptr.next.prev=ptr.prev;
    }
}
