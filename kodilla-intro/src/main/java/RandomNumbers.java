import java.util.Random;

public class RandomNumbers {
    int min = 30;
    int max = 0;

    public void drawNumbers() {
        int sum = 0;
        Random random = new Random();

        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum += temp;
            getMax(temp);
            getMin(temp);
            System.out.println("min" + min);
            System.out.println("max" + max);
            System.out.println("sum" + sum);
        }
    }

    private void getMax(int number) {
        if (number > max) {
            max = number;
        }
    }

    private void getMin(int number) {
        if (number < min) {
            min = number;
        }
    }
}
