package mx.edu.j2se.DeLaMora.tasks;

import java.util.stream.Stream;
import java.util.Iterator;
import java.util.LinkedList;
import java.time.format.TextStyle;

public class LinkedTaskList extends AbstractTaskList {

    public Node head;
    public int size = 0;

    public class Node {
        Task data;
        Node next;

        Node(Task n) {
            data = n;
            next = null;
        }


        //METHOD TO INSERT A NEW ELEMENT

        public void add(Task task) {
            Node newnode = new Node();
            newnode.data = task;
            newnode.next = null;

            if (head == null) {
                head = newnode;
            } else {
                Node t = head;
                while (t.next != null) {
                    t = t.next;

                }
                t.next = newnode;

            }


        }



        public int size() {
            if (head == null) {
                return 0;
            }
            int size = 0;
            Node current = head;
            while (current != null) {
                size++;
                current = current.next;
            }
            return size;
        }


        public Task getTask(int index) throws IndexOutOfBoundsException {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("This index is not correct");
            }
            Node t = head;
            int count = 0;
            while (count != index) {
                count++;
                t = t.next;
            }
            return t.data;
        }



        public void remove(Task task) {
            Node n = head;
            Node before = null;


            while (n != null && before.data == task) {
                head = n.next;
                n = head;
            }


            while (n != null) {
                while (n != null && n.data != task) {
                    before = n;
                    before = n. next;
                }


                if (n == null)
                    return;

                before.next = n.next;
                n = before.next;
            }
        }



    }

    }






