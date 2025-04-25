import java.util.Random;

public class TheBoilingEarthEraB {
    public static void main(String[] args) {

        double[][] temperatures = new double[10][31];
        double average = 29.0;
        Random random = new Random();

        for (int i = 0; i < temperatures.length; i++) {
            for (int j = 0; j < temperatures[0].length; j++) {
                double min = average - 5.0;
                double max = average + 5.0;
                double rangeRandom = min + (max - min) * random.nextDouble();
                temperatures[i][j] = Math.round(rangeRandom * 10.0) / 10.0;
            }
            average += 0.3;
        }

        System.out.println("真夏日連続ペア");
        for (int i = 0; i < temperatures[0].length; i++) {
            if (temperatures[9][i] >= 30.0 && (i + 1) != temperatures[0].length) {
                if (temperatures[9][i + 1] >= 30.0) {
                    System.out.print("2025年7月" + (i + 1) + "日： " + temperatures[9][i] + "℃ と ");
                    System.out.println("2025年7月" + (i + 2) + "日： " + temperatures[9][i + 1] + "℃");
                }
            }
        }

    }
}
