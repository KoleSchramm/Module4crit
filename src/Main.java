import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double average = 0;
        double minimum = 0;
        double maximum = 0;
        double input = 0;

        Scanner scan = new Scanner(System.in);

        for(int i = 1; i<11; i++){
            System.out.println("Input grade " + i + ":");
            input = scan.nextDouble();
            average += input;
            if(i == 1){
                minimum = input;
            }
            else if(input<minimum){
                minimum = input;
            }
            if(i == 1){
                maximum = input;
            }
            else if(input>maximum){
                maximum = input;
            }
        }

        average = average/10;

        System.out.println("Average: " + average);
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
    }
}