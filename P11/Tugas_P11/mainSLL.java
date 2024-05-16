package P11.Tugas_P11;

public class mainSLL {
    public static void main(String[] args) {
        SLLMhs25 singLL = new SLLMhs25();
        datamhs25 data = new datamhs25("Anton", 111);
        datamhs25 data2 = new datamhs25("prita", 112);
        datamhs25 data3 = new datamhs25("yusuf", 113);
        datamhs25 data4 = new datamhs25("doni", 114);
        datamhs25 data5 = new datamhs25("sari", 115);

        singLL.print();
        singLL.addFrist(data);
        singLL.print();
        singLL.addLast(data2);
        singLL.print();
        singLL.insertAfter(data2, data4);
        singLL.print();
        singLL.insertAt(3, data3);
        singLL.print();
        singLL.addFrist(data5);
        singLL.print();

    }
}
