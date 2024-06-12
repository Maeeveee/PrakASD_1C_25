package P15;

public class graph25 {
    int vertex;
    DoubleLinkedList25 list[];

    public graph25(int v){
        vertex = v;
        list = new DoubleLinkedList25[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList25();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak){
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int totalIn = 0, totalOut = 0;    
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    totalIn++;
                }
            }
        }    
        for (int j = 0; j < list[asal].size(); j++) {
            totalOut++;
        }
    
        System.out.println("InDegree dari gedung " + (char) ('A' + asal) + " : " + totalIn);
        System.out.println("OutDegree dari gedung " + (char) ('A' + asal) + " : " + totalOut);
        System.out.println("Degree dari gedung " + (char) ('A' + asal) + " : " + (totalIn + totalOut));
    }
    
    public void removeEdge(int asal, int tujuan)throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
        
    }
    public void removeAllEdges(){
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }
    public void printGraph()throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (list[i].size>0) {
                System.out.println("gedung "+(char)('A'+i)+" terhubung dengan ");
                for (int j = 0; j < list[i].size; j++) {
                    System.out.print((char) ('A' + list[i].get(j))+"("+list[i].get(j)+"m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
    public boolean isPathExist(int asal, int tujuan) throws Exception {
        boolean[] kunjungan = new boolean[vertex];
        return dfs(asal, tujuan, kunjungan);
    }

    private boolean dfs(int current, int tujuan, boolean[] kunjungan) throws Exception {
        if (current == tujuan) {
            return true;
        }

        kunjungan[current] = true;

        for (int i = 0; i < list[current].size(); i++) {
            int tetangga = list[current].get(i);
            if (!kunjungan[tetangga]) {
                if (dfs(tetangga, tujuan, kunjungan)) {
                    return true;
                }
            }
        }

        return false;
    }
    public void updateJarak(int asal, int tujuan, int jarak) throws Exception {
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                list[asal].updateWeight(i, jarak);
                return;
            }
        }
        throw new Exception("Edge tidak ditemukan");
    }

    public int hitungEdge() {
        int count = 0;
        for (int i = 0; i < vertex; i++) {
            count += list[i].size();
        }
        return count;
    }
}
