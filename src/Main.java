public class Main {


    public static LinkList sort(LinkList head) {
        return head;
    }

    static void printList(LinkList n) {
        while (n != null) {
            System.out.print(n.value);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkList n1 = new LinkList(0);
        LinkList n2 = new LinkList(1);
        LinkList n3 = new LinkList(1);
        LinkList n4 = new LinkList(0);
        LinkList n5 = new LinkList(1);
        LinkList n6 = new LinkList(0);
        LinkList n7 = new LinkList(1);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
        n6.setNext(n7);

        printList(sort(n1));
    }
}
