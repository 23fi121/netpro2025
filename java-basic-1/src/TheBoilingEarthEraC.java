import java.util.Random;

public class TheBoilingEarthEraC {
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

        System.out.println("猛暑日連続ペア");
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = 0; j < temperatures[0].length; j++) {
                if (temperatures[i][j] >= 35.0 && (j + 1) != temperatures[0].length) {
                    if (temperatures[i][j + 1] >= 35.0) {
                        System.out.print((2016 + i) + "年7月" + (j + 1) + "日： " + temperatures[i][j] + "℃ と ");
                        System.out.println((2016 + i) + "年7月" + (j + 2) + "日： " + temperatures[i][j + 1] + "℃");
                    }
                }
            }
        }

    }
}
