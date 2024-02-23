public class DragonMain {
    public static void main(String[] args) {
        Dragon dg1 = new Dragon();
        dg1.x = 5;
        dg1.y = 10;
        dg1.width = 10;
        dg1.height = 10;

        dg1.moveLeft();
        dg1.moveUp();
        dg1.moveUp();
        dg1.moveUp();
        dg1.moveLeft();
        dg1.moveRight();
        dg1.moveDown();
        dg1.moveLeft();
        dg1.moveLeft();
        dg1.moveLeft();
        dg1.moveLeft();
        dg1.moveLeft();
        dg1.printPosition();
    }
}