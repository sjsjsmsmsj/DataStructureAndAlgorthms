package DataStruture;

public class TestStack {
    public static void main(String[] args) {
        DynamicStack s = new DynamicStack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        //System.out.println("Pop: " + s.pop());
        //System.out.println("Peek: " + s.peek());
        s.push(2);
        s.show();
        
    }

}
