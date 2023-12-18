package _07_12_2023;

public class Power{
    public static void main(String[] args) {
//        Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.
//Операцией возведения в степень пользоваться нельзя!
        if(number(90)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static boolean number(int num) {
        if(num <= 0){
            return false;
        }

        while (num > 1){
            if(num % 2 != 0){
                return false;
            }
            num /= 2;
        }
        return true;
    }



}