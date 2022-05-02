public class MethodByPattern {
   public void pattern(int n, int t, boolean isitDown) {
        System.out.print(" " + t);

        if (t <= 0) {
            isitDown = false;
        }

        int condition = isitDown ? (t - 5) : (t + 5);

        if (condition <= n) {
            pattern(n, condition, isitDown);
        }
    }
}
