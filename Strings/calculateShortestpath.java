
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

/*
Step	Direction	Valuw (x,y)
Start	             (0,0)
W	    x-1	        (-1,0)
N	    y+1	        (-1,1)
E	    x+1	        (0,1)
E	    x+1	        (1,1)
N	    y+1	        (1,2)
E	    x+1	        (2,2)
S	    y-1	        (2,1)
E	    x+1	        (3,1)
N	    y+1	        (3,2)
N	    y+1	        (3,3)
N	    y+1	        (3,4)

at the end we get 3 4 and apply the formula of x2square + x1square whole square +
 y2square + y1square whole square

 N means up so y+1
 S means down so y -1 

 W is left so x-1 
 E is right so x+1 

 this is graphical representation on x and y axis 

*/