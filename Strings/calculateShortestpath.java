
public class calculateShortestpath {

    public static double ClcDistance(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            char direction = str.charAt(i);

            if (direction == 'W') {
                x--;
            } else if (direction == 'N') {
                y++;
            } else if (direction == 'S') {
                y--;
            } else {
                x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;

        int result = X2 + Y2;

        return result;

    }

    public static void main(String[] args) {

        String str = "WNEENESENNN";

        double Finalresult = ClcDistance(str);
        System.out.println(Finalresult);
    }
}
