class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    // ===============================
    // 1. ADD AT FIRST
    // ===============================
    public void addAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // ===============================
    // 2. ADD AT LAST
    // ===============================
    public void addAtLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // ===============================
    // 3. ADD AT SPECIFIC POSITION (1-based index)
    // ===============================
    public void addAtPosition(int data, int position) {

        if (position < 1) {
            System.out.println("Invalid Position");
            return;
        }

        if (position == 1) {
            addAtFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of range");
                return;
            }
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // ===============================
    // 4. ADD BEFORE A VALUE
    // ===============================
    public void addBeforeValue(int value, int data) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If value is at first node
        if (head.data == value) {
            addAtFirst(data);
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // ===============================
    // 5. ADD AFTER A VALUE
    // ===============================
    public void addAfterValue(int value, int data) {

        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // ===============================
    // 6. DELETE FIRST
    // ===============================
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List empty");
            return;
        }

        head = head.next;
    }

    // ===============================
    // 7. DELETE LAST
    // ===============================
    public void deleteLast() {
        if (head == null) {
            System.out.println("List empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // ===============================
    // 8. DELETE BY POSITION (1-based)
    // ===============================
    public void deleteByPosition(int position) {

        if (position < 1) {
            System.out.println("Invalid Position");
            return;
        }

        if (head == null) {
            System.out.println("List empty");
            return;
        }

        if (position == 1) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of range");
                return;
            }
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of range");
            return;
        }

        temp.next = temp.next.next;
    }

    // ===============================
    // 9. DELETE BY VALUE
    // ===============================
    public void deleteByValue(int value) {

        if (head == null) {
            System.out.println("List empty");
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found");
            return;
        }

        temp.next = temp.next.next;
    }

    // ===============================
    // 10. DISPLAY
    // ===============================
    public void display() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ===============================
    // 11. REVERSE LINKED LIST (modifies list)
    // ===============================
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next;  // save next
            current.next = prev;      // reverse link
            prev = current;           // move prev forward
            current = nextNode;       // move current forward
        }

        head = prev;
    }

    // ===============================
    // 12. PRINT REVERSE (WITHOUT reversing list)
    // ===============================
    public void printReverse(Node head) {
        if (head == null) return;

        printReverse(head.next);
        System.out.print(head.data + " --> ");
    }

}
