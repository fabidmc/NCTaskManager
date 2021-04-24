package mx.edu.j2se.DeLaMora.tasks;

import org.w3c.dom.*;

import javax.xml.soap.Node;
import java.io.*;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import java.util.LinkedList;



public class LinkedTaskList extends AbstractTaskList {

    public Node head;
    public int length = 0;
    public Node newnode;


    /* Linked list Node*/
    public class Node{
        Task data;
        Node next;
    }


    //METHOD FOR ADDING TASKS;
    int index = 0;

    public void add(Task task) {

        Node node = new Node(task);

        if(head.equals(null)) {
            head = node;
        } else{
            Node newnode = head;
        while (newnode.next != null){
            newnode = newnode.getNext();
        }
        iterator.setNext(node);
        length++;
    }

    // METHOD FOR REMOVING DUPLICATE TASKS
    public boolean remove(Object data) {

        if (head.getNext() == null){
            return false;
        }

        Node iterator = head;

        while(iterator.getNext() != null){

            if (iterator.getNext().getData().equals(data)){
                iterator.setNext(iterator.getNext().getNext());
                length--;
                return true;
            }

            iterator = iterator.getNext();
        }

        return false;
    }


    // METHOD FOR SIZE OF LINKEDLIST
            public int size() {
                return newarr.size();
            }

            //METHOD FOR GETTING TASK


            @Override
            public org.w3c.dom.Node removeChild(org.w3c.dom.Node oldChild) throws DOMException {
                return null;
            }

            @Override
            public org.w3c.dom.Node appendChild(org.w3c.dom.Node newChild) throws DOMException {
                return null;
            }


        public Task next(){
            index++;
            return getTask(index-1);
        }
    }
    }
