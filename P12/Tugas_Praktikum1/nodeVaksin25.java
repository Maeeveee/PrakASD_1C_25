package P12.Tugas_Praktikum1;

public class nodeVaksin25 {
    dataVaksin25 data;
    nodeVaksin25 next, prev;

    public nodeVaksin25( nodeVaksin25 prev,dataVaksin25 data, nodeVaksin25 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;   
    }
}
