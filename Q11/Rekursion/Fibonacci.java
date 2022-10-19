import java.util.HashMap;
import java.util.Map;

public class Fibonacci
{

    private Map<Long, Long> memo;

    public Fibonacci()
    {
        this.memo = new HashMap<Long, Long>();

        for (int i = 0; i < 100; i++) {
            System.out.println(this.fibonacci(i));
        }
    }

    public long fibonacci(long n) throws IllegalArgumentException{
        if (n < 0) {
            throw new IllegalArgumentException("Input must be > 0");
        }
        else if (n < 2) {
            return 1;
        }
        else if (this.memo.containsKey(n)) {
            return this.memo.get(n);
        }
        else {
            long val = fibonacci(n - 1) + fibonacci(n - 2);
            this.memo.put(n, val);
            return val;
        }
    }
}
