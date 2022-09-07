import java.util.Scanner;
public class Main {
    public static String readOne(int num) {

        switch (num) {
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
        }
        return "";
    }

    private static String readLessthanTwenty(int num) {
        switch (num){
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelth";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
        }
        return "";
    }

    public static String readMoreThanTwenty(int numb){
        switch(numb){
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "fourty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "";
        }
    }

    public static String readTwo(int num){
        String result = "";
        if(num <10) {
            return readOne(num);
        }
        else if(num < 20){
            result = readLessthanTwenty(num);
        }
        else if (num <100){
            result = readMoreThanTwenty(num/10) + readOne(num%10);
        }
        return result;

    }
    public static String readThree(int number){
        String result = "";
        if(number % 100 == 0 )
            result = readOne(number/100) + " hundred";
        else
            result = readOne(number /100) + " hundred and " + readTwo(number %100);

        return result;
    }

    public static String readFour(int number){
       return readOne(number/1000) + " thousand " + readThree(number % 1000);
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Xin nhap vao so: ");
        int number =  scanner.nextInt();

        String result = "";

        if(number < 10){
                result = readOne(number %10);
        }
        else if(number < 100){
            result = readTwo(number %100);
        }
        else if (number < 1000){
           result = readThree(number%1000);
        }
        else if(number < 10000){
            result = readFour(number %10000);
        }

        System.out.println(result);

    }
}
