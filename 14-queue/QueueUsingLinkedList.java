class Queue{
    class QueueNode{
    int data;
    QueueNode next;

    QueueNode(int data){
        this.data = data;
        this.next = null;
    }
    }

   public QueueNode head;
    void push(int val){
        QueueNode newNode = new QueueNode(val);
        if(head==null){
            head = newNode;
        } else{
            QueueNode temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    int pop(){
        if(head==null){
            return -1;
        } 
        QueueNode temp = head;
        head = head.next;
        return temp.data;
    }

    int peek(){
        if(head==null){
            return -1;
        }
        return head.data;
    }

    void printList(){
        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }
        QueueNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class QueueUsingLinkedList{
    public static void main(String args[]){
        Queue qu = new Queue();
        qu.push(7);
        qu.push(1);
        qu.push(6);
        qu.push(8);
        qu.pop();
        qu.pop();
        qu.pop();
        qu.pop();
        System.out.println("top element is: " + qu.peek());
        qu.printList();
    }
}