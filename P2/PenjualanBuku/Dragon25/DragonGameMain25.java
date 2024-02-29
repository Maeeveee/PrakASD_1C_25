package P2.PenjualanBuku.Dragon25;

public class DragonGameMain25 {
    public static void main(String[] args) {
        int width = 10;
        int height = 10;
        DragonGame25 dragon = new DragonGame25();
        dragon.x = 5;
        dragon.y = 5;
        dragon.width = width;
        dragon.height = height;

        dragon.moveLeft();
        dragon.moveRight();
        dragon.moveDown(); 
        dragon.moveUp();    

        dragon.printPosition(); 
    }
}
