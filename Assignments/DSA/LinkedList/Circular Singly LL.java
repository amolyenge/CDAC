class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node tail;  // we keep ONLY tail pointer

    // ============================
    // Utility: Check Empty
    // ============================
    boolean isEmpty() {
        return tail == null;
    }

    // ============================
    // 1. ADD AT FIRST
    // ============================
    public void addAtFirst(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            tail = newNode;
            tail.next = tail;  // circular
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
        }
    }

    // ============================
    // 2. ADD AT LAST
    // ============================
    public void addAtLast(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;      // new tail
        }
    }

    // ============================
    // 3. ADD AT POSITION (1-based)
    // ============================
    public void addAtPosition(int data, int position) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            addAtFirst(data);
            return;
        }

        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node newNode = new Node(data);
        Node temp = tail.next; // head

        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
            if (temp == tail.next) {
                System.out.println("Position out of range");
                return;
            }
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (temp == tail) {
            tail = newNode; // inserting at last
        }
    }

    // ============================
    // 4. ADD BEFORE A VALUE
    // ============================
    public void addBeforeValue(int value, int data) {
        if (isEmpty()) {
            System.out.println("List empty");
            return;
        }

        Node head = tail.next;

        // If value is at head
        if (head.data == value) {
            addAtFirst(data);
            return;
        }

        Node temp = head;

        while (temp.next != head && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next.data != value) {
            System.out.println("Value not found");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // ============================
    // 5. ADD AFTER A VALUE
    // ============================
    public void addAfterValue(int value, int data) {
        if (isEmpty()) {
            System.out.println("List empty");
            return;
        }

        Node temp = tail.next; // head

        do {
            if (temp.data == value) {
                Node newNode = new Node(data);
                newNode.next = temp.next;
                temp.next = newNode;

                if (temp == tail) {
                    tail = newNode;
                }
                return;
            }
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println("Value not found");
    }

    // ============================
    // 6. DELETE FIRST
    // ============================
    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("List empty");
            return;
        }

        Node head = tail.next;

        if (head == tail) {
            tail = null;
        } else {
            tail.next = head.next;
        }
    }

    // ============================
    // 7. DELETE LAST
    // ============================
    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("List empty");
            return;
        }

        Node head = tail.next;

        if (head == tail) {
            tail = null;
            return;
        }

        Node temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = tail.next;
        tail = temp;
    }

    // ============================
    // 8. DELETE BY POSITION
    // ============================
    public void deleteByPosition(int position) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }

        if (isEmpty()) {
            System.out.println("List empty");
            return;
        }

        if (position == 1) {
            deleteFirst();
            return;
        }

        Node temp = tail.next; // head

        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
            if (temp == tail.next) {
                System.out.println("Position out of range");
                return;
            }
        }

        Node target = temp.next;

        if (target == tail) {
            deleteLast();
        } else {
            temp.next = target.next;
        }
    }

    // ============================
    // 9. DELETE BY VALUE
    // ============================
    public void deleteByValue(int value) {
        if (isEmpty()) {
            System.out.println("List empty");
            return;
        }

        Node head = tail.next;

        // If value at first
        if (head.data == value) {
            deleteFirst();
            return;
        }

        Node temp = head;

        do {
            if (temp.next.data == value) {
                if (temp.next == tail) {
                    deleteLast();
                } else {
                    temp.next = temp.next.next;
                }
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("Value not found");
    }

    // ============================
    // 10. DISPLAY
    // ============================
    public void display() {
        if (isEmpty()) {
            System.out.println("List empty");
            return;
        }

        Node temp = tail.next;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println("(back to head)");
    }

    // ============================
    // 11. PRINT REVERSE (NO MODIFY)
    // ============================
    private void printReverseUtil(Node head, Node current) {
        if (current.next != head)
            printReverseUtil(head, current.next);

        System.out.print(current.data + " -> ");
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("List empty");
            return;
        }
        printReverseUtil(tail.next, tail.next);
        System.out.println("(reverse print)");
    }

    // ============================
    // 12. REVERSE THE CIRCULAR LIST (ACTUAL REVERSE)
    // ============================
    public void reverse() {
        if (isEmpty() || tail.next == tail) return;

        Node prev = tail;
        Node current = tail.next;
        Node nextNode;

        do {
            nextNode = current.next;
            current.next = prev;

            prev = current;
            current = nextNode;
        } while (current != tail.next);

        tail = current;   // new tail
    }
}
