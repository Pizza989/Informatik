import java.util.HashMap;
import java.util.Map;

public class Fakultät
{

    private Map<Integer, Integer> memo;

    public Fakultät()
    {
        this.memo = new HashMap<Integer, Integer>();

        for (int i = 0; i < 100; i++) {
            System.out.println(fakultät(i));
        }
    }

    public int fakultät(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be > 0");
        }
        else if (memo.containsKey(n)) {
            return memo.get(n);
        }
        else if (n < 2) {
            return 1;
        } else {
            int val = n * this.fakultät(n - 1);
            this.memo.put(n, val);
            return val;
        }
    }
}
