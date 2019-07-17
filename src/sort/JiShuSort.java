package sort;

public class JiShuSort {

    class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void sort(int[] array) {

        Node[] help = new Node[10];
        Node[] tail = new Node[10];
        for (int i = 0; i < 10; i++) {
            help[i] = new Node(i);
            tail[i] = help[i];
        }
        int n = 1;
        boolean isEnd = false;

        while (!isEnd) {
            isEnd = true;
            n = n * 10;
            for (int i = 0; i < array.length; i++) {
                int left = (array[i] % n) / (n / 10);
                if (left != 0) {
                    isEnd = false;
                }
                Node node = new Node(array[i]);
                tail[left].next = node;
                tail[left] = node;
            }
            int count = 0;
            for (int i = 0; i < 10; i++) {
                Node cur = help[i].next;
                while (cur != null) {
                    array[count++] = cur.value;
                    cur = cur.next;
                }
            }
            for (int i = 0; i < 10; i++) {
                help[i].next = null;
                tail[i] = help[i];
            }
        }

    }

    public static void main(String[] args) {
        JiShuSort sort = new JiShuSort();
        int[] num = new int[]{1002,21,0,0,100,45,86};
        sort.sort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

}
