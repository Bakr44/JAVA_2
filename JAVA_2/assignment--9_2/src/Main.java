public class Main {
    public static void main(String[] args) {

        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        System.out.println("First position: (" + p.getX() + ", " + p.getY() +", "+p.getxSpeed()+", "+p.getySpeed()+ ")");

//        p.moveRight();
//        p.moveRight();
        p.moveDown();
        p.moveUp();
        p.moveUp();
        p.moveUp();
        System.out.println("New position: (" + p.getX() + ", " + p.getY() +", "+p.getxSpeed()+", "+p.getySpeed()+ ")");

    }
}