package _07_12_2023;

public class Sum {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println(sum(number));
    }

    public static int sum(int number){
        int sum = 0;
        while (number > 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
