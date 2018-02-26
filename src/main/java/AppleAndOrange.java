import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {
    public void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        // Complete this function
        int houseLeft = s;
        int houseRight = t;
        int appleLocation = a;
        int orangeLocation = b;

        List<Integer> applesWithin = new ArrayList<>();

        for (int apple : apples) {
            if(fellInside(houseLeft, houseRight,  appleLocation + apple)) {
                applesWithin.add(apple);
            }
        }

        List<Integer> orangesWithin = new ArrayList<>();

        for (int orange : oranges) {
            if(fellInside(houseLeft, houseRight, orangeLocation + orange)) {
                orangesWithin.add(orange);
            }
        }

        System.out.println(applesWithin.size());
        System.out.println(orangesWithin.size());


    }

    private boolean fellInside(int houseLeft, int houseRight, int location) {
        return location >= houseLeft && location <= houseRight;
    }
}
