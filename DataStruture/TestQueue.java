package DataStruture;


public class TestQueue {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        System.out.println(q.isFull());
        q.enQueue(4);
        q.enQueue(5);
        System.out.println(q.isFull());
    }
}
