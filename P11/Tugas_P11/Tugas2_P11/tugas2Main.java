package P11.Tugas_P11.Tugas2_P11;

public class tugas2Main {
    public static void main(String[] args) {
        SLLTugas2_25 singLL = new SLLTugas2_25();
        dataMhsT2_25 data = new dataMhsT2_25("Anton", 111);
        dataMhsT2_25 data2 = new dataMhsT2_25("prita", 112);
        dataMhsT2_25 data3 = new dataMhsT2_25("yusuf", 113);
        dataMhsT2_25 data4 = new dataMhsT2_25("doni", 114);
        dataMhsT2_25 data5 = new dataMhsT2_25("sari", 115);
        
        System.out.println("Data masuk : ");
        singLL.print();
        singLL.addLast(data);
        singLL.print();
        singLL.addLast(data2);
        singLL.print();
        singLL.addLast(data3);
        singLL.print();
        singLL.addLast(data4);
        singLL.print();
        singLL.addLast(data5);
        singLL.print();

        System.out.println("Data keluar : ");
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeFirst();
        singLL.print();
    }
}
