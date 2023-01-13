package operators;

public class IfElseIf {
    public static void main(String[] args) {
        int a = 99;
        int b = 1;
        int dwa = 2;
        int tri = 3;
        int pyat = 5;
        int summa = a + b;
        int razryadChisla;
        int value1 = 9;
        int value2 = 99;
        boolean isDevidedOn2, isDevidedOn3, isDevidedOn5, summaChisel, proizvedenieChisel;
        isDevidedOn2 = a % dwa == 0;
        isDevidedOn3 = a % tri == 0;
        isDevidedOn5 = a % pyat == 0;
        summaChisel = (a + b) % dwa == 0;
        proizvedenieChisel = (a * b) % pyat == 0;

        String message = "число а " + a;
        String s2 = "делится на 2";
        String s3 = " делится на 3";
        String s5 = " делится на 5";
        String finalMessage = "";
        String finalMessage2 = "";
        String finalMessage3 = "";


        if (isDevidedOn2) {
            finalMessage = String.join(" ", message, s2);
        }
        if (isDevidedOn3) {
            finalMessage2 = String.join(" ", finalMessage, message, s3);
        }
        if (isDevidedOn5) {
            finalMessage3 = String.join(" ", finalMessage, finalMessage2, message, s5);
        }
        System.out.println(finalMessage3);
        if (!isDevidedOn2 & !isDevidedOn3 & !isDevidedOn5) {
            System.out.println("число а = " + a + " не делится на 2, 3 или 5");
        }
        //задание 1 Сложить 2 числа и проверить, что число четное, если четное - распечатаь число и сообщение. Если НЕчетне - только сообщение.
        if (summaChisel) {
            System.out.println("Число 1 " + a);
            System.out.println("Число 2 " + b);
            System.out.println("Сумма " + a + " и " + b + " четное число");
        } else {
            System.out.println("Сумма " + a + " и " + b + " нечетное число");
        }

        //задание 2 Уножить 2 числа друг на друга и проверить, что результат делится на 5
        if (proizvedenieChisel) {
            System.out.println("Число 1 " + a);
            System.out.println("Число 2 " + b);
            System.out.println("Произведение " + a + " и " + b + " делится на 5");
        } else {
            System.out.println("Произведение " + a + " и " + b + " не делится на 5");
        }
        // как сконвертировать результат вычисления в строку, строку разделить на символы, взять последний символ и сравнить его с символом 5 и символом 0.

        //задание 3* сложить 2 числа и проверить, что число двузначное. Напечатать 3 сообщения: "число однозначное", что только число, если оно двузначное и "число трехзначное и больше".
        // способ 1
        razryadChisla = String.valueOf(summa).length();

        if (razryadChisla == 1) {
            System.out.println("Сумма - число однозначное");

        } else if (razryadChisla == 2) {
            System.out.println(summa);
        } else System.out.println("Сумма - число трехзначное или больше");

        //способ 2


        if (summa<=value1) {
            System.out.println("Сумма - число однозначное");

        } else if ((summa>=value1)&(summa<=value2)) {
            System.out.println(summa);
        } else System.out.println("Сумма - число трехзначное или больше");
// commit and push into repo.Скинуть только ссылку.


    }
}

