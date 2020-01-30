package com.company;

public class Tree {
    Node root;
     public Node find(int key){
         Node current = root;
         while (current.key!=key){
             if (current.key<key){
                 current=current.rigthChild;
             }else {
                 current=current.leftChild;
             }
             if (current==null){
                 return null;
             }
         }
         return current;
     }

     public void insert(int key, String data){
         Node node=new Node();
         node.key=key;
         node.data=data;
         if (root==null){
             root=node;
         }else {
             Node current =root;
             Node prev=null;
             while (true){
                 prev =current;

                     if (key < prev.key) {
                         current = current.leftChild;

                         if (current == null) {
                             prev.leftChild = node;
                             return;
                         }
                     }
                     else {
                             current = current.rigthChild;
                             if (current==null){
                                 prev.rigthChild=node;
                                 return;
                             }
                         }



               }
             }
         }

public void print(Node startNode){
      if (startNode!=null){
          print(startNode.leftChild);
          startNode.printNode();
          print(startNode.rigthChild);
      }
}
}

