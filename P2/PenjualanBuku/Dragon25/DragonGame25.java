package P2.PenjualanBuku.Dragon25;

public class DragonGame25 {
    int x, y, width, height;

    void moveLeft() {
        x--;
        if (x < 0 || x > width) {
            detectCollision(x, y);
        }
    }

    void moveRight() {
        x++;
        if (x < 0 || x > width) {
            detectCollision(x, y);
        }
    }

    void moveUp() {
        y--;
        if (y < 0 || y > height) {
            detectCollision(x, y);
        }
    }

    void moveDown() {
        y++;
        if (y < 0 || y > height) {
            detectCollision(x, y);
        }
    }

    void printPosition() {
        System.out.println("Current position: (" + x + ", " + y + ")");
    }

    void detectCollision(int x, int y) {
        System.out.println("Game Over");
    }

   
}
