class CircularDoublyLinkedList {

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;

    // ===========================
    //     DISPLAY FORWARD
    // ===========================
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " <==> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    // ===========================
    //  DISPLAY REVERSE (NO CHANGE)
    // ===========================
    public void displayReverse() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node tail = head.prev;

        Node temp = tail;
        do {
            System.out.print(temp.data + " <==> ");
            temp = temp.prev;
        } while (temp != tail);

        System.out.println("(back to tail)");
    }

    // ===========================
    //      ADD AT FIRST
    // ===========================
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
            return;
        }

        Node tail = head.prev;

        newNode.next = head;
        newNode.prev = tail;
        tail.next = newNode;
        head.prev = newNode;

        head = newNode;
    }

    // ===========================
    //       ADD AT LAST
    // ===========================
    public void addLast(int data) {
        if (head == null) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node tail = head.prev;

        newNode.next = head;
        newNode.prev = tail;
        tail.next = newNode;
        head.prev = newNode;
    }

    // ===========================
    //     ADD AT POSITION
    // ===========================
    public void addAtPosition(int pos, int data) {
        if (pos <= 1) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int count = 1;

        while (count < pos - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        Node nextNode = temp.next;

        newNode.next = nextNode;
        newNode.prev = temp;
        temp.next = newNode;
        nextNode.prev = newNode;
    }

    // ===========================
    //    ADD BEFORE A VALUE
    // ===========================
    public void addBeforeValue(int value, int data) {
        if (head == null) return;

        Node temp = head;

        do {
            if (temp.data == value) {
                if (temp == head) {
                    addFirst(data);
                } else {
                    Node newNode = new Node(data);

                    Node prevNode = temp.prev;

                    newNode.next = temp;
                    newNode.prev = prevNode;

                    prevNode.next = newNode;
                    temp.prev = newNode;
                }
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("Value not found");
    }

    // ===========================
    //    ADD AFTER A VALUE
    // ===========================
    public void addAfterValue(int value, int data) {
        if (head == null) return;

        Node temp = head;

        do {
            if (temp.data == value) {

                Node newNode = new Node(data);
                Node nextNode = temp.next;

                newNode.next = nextNode;
                newNode.prev = temp;

                temp.next = newNode;
                nextNode.prev = newNode;
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("Value not found");
    }

    // ===========================
    //      DELETE FIRST
    // ===========================
    public void deleteFirst() {
        if (head == null) return;

        if (head.next == head) {
            head = null;
            return;
        }

        Node tail = head.prev;
        head = head.next;

        tail.next = head;
        head.prev = tail;
    }

    // ===========================
    //       DELETE LAST
    // ===========================
    public void deleteLast() {
        if (head == null) return;

        if (head.next == head) {
            head = null;
            return;
        }

        Node tail = head.prev;
        Node newTail = tail.prev;

        newTail.next = head;
        head.prev = newTail;
    }

    // ===========================
    //    DELETE BY POSITION
    // ===========================
    public void deleteAtPosition(int pos) {
        if (head == null) return;

        if (pos == 1) {
            deleteFirst();
            return;
        }

        Node temp = head;
        int count = 1;

        while (count < pos && temp.next != head) {
            temp = temp.next;
            count++;
        }

        Node prevNode = temp.prev;
        Node nextNode = temp.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    // ===========================
    //     DELETE BY VALUE
    // ===========================
    public void deleteByValue(int value) {
        if (head == null) return;

        Node temp = head;

        do {
            if (temp.data == value) {

                if (temp == head) {
                    deleteFirst();
                    return;
                }

                Node prevNode = temp.prev;
                Node nextNode = temp.next;

                prevNode.next = nextNode;
                nextNode.prev = prevNode;

                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("Value not found");
    }
}
