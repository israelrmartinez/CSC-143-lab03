package exercises;

public class BackTrackProgram {

    private static void goNorthEast(int endX, int endY, int x, int y, String route) {

        if (x == endX && y == endY) {
            System.out.println(route);

        }else if(x <= endX && y <= endY){
            goNorthEast(endX, endY, x, y + 1, route + " N");
            goNorthEast(endX, endY,x + 1, y, route + " E");
            goNorthEast(endX, endY,x + 1, y + 1, route + " NE");
        }

        //OTHERWISE : DO NOTHING
    }

    public static void goNorthEast(int endX, int endY) {
        goNorthEast(endX, endY, 0, 0, "moves:");
    }

    private static void goSouthWest(int endX, int endY, int x, int y, String route) {

        if (x == endX && y == endY) {
            System.out.println(route);

        }else if(x <= endX && y <= endY){
            goSouthWest(endX, endY, x, y - 1, route + " S");
            goSouthWest(endX, endY,x - 1, y, route + " W");
            goSouthWest(endX, endY,x - 1, y - 1, route + " SW");
        }

        //OTHERWISE : DO NOTHING
    }

    public static void goSouthWest(int endX, int endY) {
        goSouthWest(endX, endY, 0, 0, "moves:");
    }

    public static void main(String[] args) {
        goNorthEast(1,2);
        goSouthWest(2, 1);
    }
}
