
//ユーザの現在の年齢を入力し、10年後の年齢を表示するプログラム
import java.util.Scanner;
//import java.util.function.Predicate;
import java.time.YearMonth;

public class PrintYourAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        int age;
        while (true) {
            System.out.println("何歳ですか?(0 ~ 119の間で入力してください。)");
            str = scanner.next();
            if (str.equals("q") || str.equals("e")) {
                scanner.close();
                System.exit(0);
            }
            try {
                age = Integer.parseInt(str);
                if (age < 0 || age >= 120) {
                    System.out.println("数値が範囲外です。");
                    System.out.println("もう一度入力してください");
                } else {
                    PreviewAge(age);
                }
            } catch (NumberFormatException e) {
                System.out.println("入力の形式が違います。");
                System.out.println("もう一度入力してください");
            }
        }

    }

    static void PreviewAge(int age) {
        int year = YearMonth.now().getYear();
        int birth = year - age;
        String calendar = "";
        if (birth >= 2019) {
            if (birth - 2018 == 1) {
                calendar = "令和元年";
            } else {
                calendar = "令和" + Integer.toString(birth - 2018) + "年";
            }
        } else if (birth >= 1989) {
            if (birth - 1988 == 1) {
                calendar = "平成元年";
            } else {
                calendar = "平成" + Integer.toString(birth - 1988) + "年";
            }
        } else if (birth >= 1926) {
            if (birth - 1925 == 1) {
                calendar = "昭和元年";
            } else {
                calendar = "昭和" + Integer.toString(birth - 1925) + "年";
            }
        } else if (birth >= 1912) {
            if (birth - 1911 == 1) {
                calendar = "大正元年";
            } else {
                calendar = "大正" + Integer.toString(birth - 1911) + "年";
            }
        } else if (birth >= 1868) {
            if (birth - 1867 == 0) {
                calendar = "明治元年";
            } else {
                calendar = "明治" + Integer.toString(birth - 1867) + "年";
            }
        }

        System.out.println("あなたは" + age + "歳ですね。");
        System.out.println("あなたは2030年に、" + (age + (2030 - year)) + "歳ですね。");
        System.out.println("あなたの誕生年は" + calendar + "ですね。");

        System.out.println();
    }
}