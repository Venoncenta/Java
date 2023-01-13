public class Boolean {
    public static void main(String[] args) {
        boolean isMathTrue = false;
        int a = 7;
        int b = 10;
        int c = 5;

        int sum;
        sum = a+b+c;
        // результат операции отношения
        isMathTrue = a+b==c;
        System.out.println( "Операция == результат: " + isMathTrue );
        isMathTrue = a!=c;
        System.out.println("Операция != результат: " + isMathTrue);
        isMathTrue = a+c>b;
        System.out.println("Операция > результат: " + isMathTrue);
        isMathTrue = a+b<c;
        System.out.println("Операция < результат: " + isMathTrue);
        isMathTrue = a+b>=c+b;
        System.out.println("Операция >= результат: " + isMathTrue);
        isMathTrue = a+b+c<=c;
        System.out.println("Операция <= результат: " + isMathTrue);


        //результат логической операции
        boolean isFalse = false;
        boolean isTrue= true;
        boolean result;
        boolean isMathTrue2 = 7+5 == 12;


        result =  isMathTrue2| isFalse;

        System.out.println( "Результат: " + result );

        //результат тернарной операции
//        boolean isFalse = false;
//        boolean isTrue= true;
//        boolean result;
//        boolean isMathTrue2 = 7+5 == 12;
//
//
//        result =  isMathTrue2| isFalse;
//
//        System.out.println( "Результат: " + result );
    }

}
