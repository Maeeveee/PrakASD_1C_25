package P12.Tugas_2_Praktikum;

public class nodeFilm25 {
    dataFilm25 data;
    nodeFilm25 next, prev;
    
    public nodeFilm25( nodeFilm25 prev,dataFilm25 data, nodeFilm25 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
