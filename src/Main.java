public class Main {

    public static LinkList sortSolutionOne(LinkList head) {
        if(head == null || head.next == null)
            return head;

        LinkList last = head;
        int numOfNodes = 1;
        while(last.next != null)
        {
            last = last.next;
            numOfNodes++;
        }
        LinkList tail = last;
        LinkList ptr = head;
        LinkList prev = head;
        for(int i=0; i<numOfNodes; i++)
        {
            LinkList temp = ptr;
            ptr = ptr.next;
            if(temp.value == 0)
            {
                if(prev != temp)
                {
                    temp.next = head;
                    head = temp;
                    prev.next = ptr;
                }
            }
            else if(temp.value == 1)
            {
                tail.next = temp;
                temp.next = null;
                tail = temp;
                if(prev == temp)
                    head = prev = ptr;
                else
                    prev.next = ptr;
            }
        }
        return head;
    }

    public static LinkList sort(LinkList head) {
        if(head == null || head.next == null)
            return head;
        LinkList oneHead = null;
        LinkList oneTail = null;
        LinkList zeroHead = null;
        LinkList zeroTail = null;
        while(head != null) {
            if(head.value == 0) {
                if(zeroHead == null) {
                    zeroHead = head;
                    zeroTail = head;
                } else {
                    zeroTail.next = head;
                    zeroTail = head;
                }
            } else {
                if(oneHead == null) {
                    oneHead = head;
                    oneTail = head;
                } else {
                    oneTail.next = head;
                    oneTail = head;
                }
            }
            head = head.next;
        }
        if(oneTail != null) {
            oneTail.next = null;
        }
        if(zeroHead == null) {
            zeroHead = oneHead;
        }
        if(zeroTail != null) {
            zeroTail.next = oneHead;
        }
        return zeroHead;
    }

    private static void printList(LinkList n) {
        while (n != null) {
            System.out.print(n.value);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkList n1 = new LinkList(1);
        LinkList n2 = new LinkList(1);
        LinkList n3 = new LinkList(1);
        LinkList n4 = new LinkList(1);
        LinkList n5 = new LinkList(1);
        LinkList n6 = new LinkList(1);
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
