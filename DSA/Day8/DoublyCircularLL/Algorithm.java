package com.CircularDoublyLL;

public class Algorithm {

	Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = this.prev = null;
        }
    }

    public Algorithm() {
        head = null;
    }

    // Add node at end
    public void addNode(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev;
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    // Add node at specific position
    public void addByPosition(int pos, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            System.out.println("List is empty");
        } else if (pos == 1) {
            Node tail = head.prev;
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        } else {
            Node temp = head;
            int i = 1;
            while (i < pos - 1 && temp.next != head) {
                temp = temp.next;
                i++;
            }
            if (i == pos - 1) {
                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next.prev = newNode;
                temp.next = newNode;
            } else {
                System.out.println("Position " + pos + " is beyond the list length");
            }
        }
    }

    // Add node after a value
    public void addByValue(int val, int afterVal) {
        Node newNode = new Node(val);
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            if (temp.data == afterVal) {
                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next.prev = newNode;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println(afterVal + " not found");
    }

    // Delete node by position
    public void deleteByPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (pos == 1) {
            if (head.next == head) {
                head = null;
            } else {
                Node tail = head.prev;
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }
        } else {
            Node temp = head;
            int i = 1;
            while (i < pos && temp.next != head) {
                temp = temp.next;
                i++;
            }
            if (i == pos) {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            } else {
                System.out.println("Position not found");
            }
        }
    }

    // Delete node by value
    public void deleteByValue(int val) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            if (temp.data == val) {
                if (temp == head) {
                    if (head.next == head) {
                        head = null;
                    } else {
                        Node tail = head.prev;
                        head = head.next;
                        head.prev = tail;
                        tail.next = head;
                    }
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println(val + " not found");
    }

    // Display list
    public void displayData() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("head");
    }
}
