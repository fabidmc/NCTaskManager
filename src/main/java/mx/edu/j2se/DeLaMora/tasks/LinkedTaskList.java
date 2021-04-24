package mx.edu.j2se.DeLaMora.tasks;

import java.io.*;
import java.time.format.TextStyle;

public class LinkedTaskList extends AbstractTaskList {

    public Node head ;
    public int size = 0;

    public class Node{
        Task data;
        Node next;

        Node(Task n){
            data = n;
            next = null;
        }

        //METHOD TO INSERT A NEW ELEMENT

        public void add(Task task){
            Node newnode = new Node();
            newnode.data = task;
            newnode.next = null;

            if(head == null){
                head = newnode;}
                else{
                    Node t = head;
                    while(t.next != null){
                        t = t.next;

                }
                    t.next = newnode;

            }


        }

    }
}





