class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;

    // =====================================
    // 1. ADD AT FIRST
    // =====================================
    public void addAtFirst(int data) {
        Node newNode = new Node(data);

        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }

        head = newNode;
    }

    // =====================================
    // 2. ADD AT LAST
    // =====================================
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
        newNode.prev = temp;
    }

    // =====================================
    // 3. ADD AT POSITION (1-based)
    // =====================================
    public void addAtPosition(int data, int position) {
        if (position < 1) {
            System.out.println("Invalid position");
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
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;
    }

    // =====================================
    // 4. ADD BEFORE A VALUE
    // =====================================
    public void addBeforeValue(int value, int data) {
        if (head == null) {
            System.out.println("List empty");
            return;
        }

        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        if (temp == head) {
            addAtFirst(data);
            return;
        }

        Node newNode = new Node(data);

        newNode.next = temp;
        newNode.prev = temp.prev;

        temp.prev.next = newNode;
        temp.prev = newNode;
    }

    // =====================================
    // 5. ADD AFTER A VALUE
    // =====================================
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
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;
    }

    // =====================================
    // 6. DELETE AT FIRST
    // =====================================
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // =====================================
    // 7. DELETE AT LAST
    // =====================================
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

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

    // =====================================
    // 8. DELETE BY POSITION
    // =====================================
    public void deleteByPosition(int position) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }

        if (head == null) {
            System.out.println("List empty");
            return;
        }

        if (position == 1) {
            deleteFirst();
            return;
        }

        Node temp = head;

        for (int i = 1; i < position; i++) {
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

        if (temp.next != null)
            temp.next.prev = temp.prev;

        if (temp.prev != null)
            temp.prev.next = temp.next;
    }

    // =====================================
    // 9. DELETE BY VALUE
    // =====================================
    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List empty");
            return;
        }

        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        if (temp == head) {
            deleteFirst();
            return;
        }

        if (temp.next != null)
            temp.next.prev = temp.prev;

        temp.prev.next = temp.next;
    }

    // =====================================
    // 10. DISPLAY FORWARD
    // =====================================
    public void displayForward() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // =====================================
    // 11. DISPLAY BACKWARD
    // =====================================
    public void displayBackward() {
        if (head == null) {
            System.out.println("List empty");
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("null");
    }

    // =====================================
    // 12. REVERSE (modifies list)
    // =====================================
    public void reverse() {
        Node current = head;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev; // new head
        }
    }

    // =====================================
    // 13. PRINT IN REVERSE (just printing, not modifying)
    // =====================================
    public void printReverse(Node head) {
        if (head == null) return;

        printReverse(head.next);
        System.out.print(head.data + " <-> ");
    }
}
