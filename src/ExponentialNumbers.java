import java.util.Scanner;

public class ExponentialNumbers {
    public int expNum(int num, int exp
    ) {
        if (num == 1 || exp == 0) return 1;

        return num * expNum(num, exp - 1);
    }
}
