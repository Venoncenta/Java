package operators;

public class IfElseIf {
    public static void main(String[] args) {
        int a = 30;
        int dwa = 2;
        int tri = 3;
        int pyat = 5;
        boolean isDevidedOn2,isDevidedOn3, isDevidedOn5;
        isDevidedOn2 = a%dwa == 0;
        isDevidedOn3 = a%tri == 0;
        isDevidedOn5 = a%pyat == 0;

        String message = "число а "+a;
        String s2 = "делится на 2";
        String s3 = " делится на 3";
        String s5 = " делится на 5";
        String finalMessage = "";
        String finalMessage2 = "";
        String finalMessage3 = "";

        if (isDevidedOn2) {finalMessage= String.join(" ",message,s2);
        }
        if (isDevidedOn3) {finalMessage2= String.join(" ",finalMessage,message,s3);
        }
        if (isDevidedOn5) {finalMessage3= String.join(" ",finalMessage, finalMessage2,message,s5);
        }
        System.out.println(finalMessage3);
        if (!isDevidedOn2&!isDevidedOn3&!isDevidedOn5){
            System.out.println("число а = " + a + " не делится на 2, 3 или 5");
        }

//        задание 1 Сложить 2 числа и проверить, что число четное, если четное - распечатаь число и сообщение. Если НЕчетне - только сообщение.
        //задание 2 Уножить 2 числа друг на друга и проверить, что результат делится на 5
        //задание 3* сложить 2 числа и проверить, что число двузначное. Напечатать 3 сообщения: "число однозначное", что только число, если оно двузначное и "чмсло трехзначное и больше".
// commit and push into repo.Скинуть только ссылку.


    }
}
