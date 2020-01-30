package com.company;

public class DoubleLinkedList {

    public class Node{

        public int id=0;
        public String value;
        private Node next=null;
        private Node previous=null;
        private Node current;

public Node (String setValue, int setId){
    this.value=setValue;
    this.id=setId;

    if (lenght>=1){
        this.previous = current;
        current.next = this;
        current = this;
    }else {
        current=this;
        tail=this;
    }

    value = setValue;//for what?
    id = setId;//for what?
    lenght++;
}
    }

    private Node head;
    private  Node tail;

    //public String getValue (int id){
     //   return;
    //}

    public void printNode (){

        System.out.println(this.value + " " + this.id);
    }


    public int lenght;

    public DoubleLinkedList(){
        this.lenght=0;
    }

    public void add (String newElement){
        Node node = new Node(newElement, lenght);
    }

    public void add (String newElement, int id){
        Node node = new Node(newElement, id);
    }

    public void remove (int id){
    }

    public void remove (String value){
    }

    public void print (int id){
   if ()
   //int newId = id;
   forPrint.printNode(id);

    }

   /**
    public String find (int id){
     return;
    }

    public int find (String value){
        return;
    }
    **/

}
