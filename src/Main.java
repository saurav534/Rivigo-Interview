public class Main {


    public static LinkList sort(LinkList head) {
        LinkList zeroStart = null;
        LinkList zeroEnd = null;
        LinkList oneStart = null;
        LinkList oneEnd = null;

        LinkList start = head;

        while(start != null){
            if(start.value == 0){
                if(zeroStart == null){
                    zeroStart = start;
                    zeroEnd = start;
                }else{
                    zeroEnd.setNext(start);
                    zeroEnd = start;
                }
            }
            else {
                if(oneStart == null){
                    oneStart = start;
                    oneEnd = start;
                }else{
                    oneEnd.setNext(start);
                    oneEnd = start;
                }
            }
            start = start.next;
        }

        if(oneEnd !=null){
            oneEnd.setNext(null);
        }
        if(zeroStart == null){
            return oneStart;
        }
        zeroEnd.setNext(oneStart);

        return zeroStart;

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
        LinkList n3 = new LinkList(0);
        LinkList n4 = new LinkList(1);
        LinkList n5 = new LinkList(0);
        LinkList n6 = new LinkList(1);
        LinkList n7 = new LinkList(0);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
        n6.setNext(n7);

        printList(sort(n1));
    }
}