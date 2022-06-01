package com.bridgelabzLinkedList;

 class LinkedList {
        Node node;
        Node tail;
        Node head;

        public void add(int data) {
            Node newnode = new Node(data);
            if (head == null) {
                this.node = newnode;
                this.head = newnode;
                this.tail = newnode;
            } else {
                tail.next= newnode;
                tail = newnode;
            }
        }

        public void display() {
            Node current = head;
            if (head == null) {
                System.out.println("List is Empty");
                return;
            } else {
                System.out.println("Nodes of singly linked list:");
                while (current != null) {
                    System.out.print(current.data + " ");
                    current = current.next;
                }
                System.out.println();
            }
        }


    }