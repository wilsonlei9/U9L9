import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PointTester
{
    public static void main(String[] args)
    {
        ArrayList<Point> arr = new ArrayList<Point>();
        Point a = new Point("A", 1, 2);
        Point b = new Point("B", 5, 7);
        ThreeDPoint c = new ThreeDPoint("C", 3, 6, 2);
        ThreeDPoint d = new ThreeDPoint("D", 5, 8, 4);
        Point e = new Point("E", 0, 0);

        arr.add(e);
        arr.add(b);
        arr.add(a);
        arr.add(d);
        arr.add(c);

        Collections.sort(arr);

        for (int i = 0; i < arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }
    }
}
