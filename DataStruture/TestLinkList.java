package DataStruture;

public class TestLinkList {
    public static void main(String[] args) {
        linkedList link = new linkedList();
        link.insert(1);
        link.insert(2);
        link.insert(3);
        link.insertAtStart(4);
        link.insertAt(0, 30);
        link.show();
    }
}
