package P12;

public class node25 {
    int data;
    node25 prev, next;

    node25( node25 sebelumnya, int data, node25 berikutnya) {
        prev = sebelumnya;
        this.data = data;
        next = berikutnya;
    }

}
