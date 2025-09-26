public class MinFolds {

    public static int minNumFolds(int h, int w, int h1, int w1) {
        return folds(h, h1) + folds(w, w1);
    }

    public static int folds(int from, int to) {
        int fold = 0;

        while (from > to) {
            if (from / 2 >= to) {
                from = (from + 1) / 2;
            } else {
                from = to;
            }
            fold++;
        }

        return fold;
    }

    public static void main(String[] args) {
        System.out.println(minNumFolds(8, 4, 6, 1));
        System.out.println(minNumFolds(2, 3, 2, 2));
        System.out.println(minNumFolds(2, 1, 4, 3));
    }
}
