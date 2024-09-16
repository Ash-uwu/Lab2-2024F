import java.util.List;

public class DataTypes {
    public static long sum(List<Integer> numbers) {
        long s = 0; // changed int to long
        // type being returned was not specfied when it is int, need to change to long
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}
