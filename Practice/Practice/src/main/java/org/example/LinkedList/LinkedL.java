package org.example.LinkedList;

public class LinkedL {
        Node head;
        class Node{
            String data;
            Node next;

            Node(String data){
                this.data = data;
                this.next = null;
            }
        }

        public void addfirst(String data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;

        }

        public void addlast(String data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            Node currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }




    public static void main(String[] args) {
            LinkedL a = new LinkedL();
            a.addfirst("4");
            a.addfirst("first");
    }

}
