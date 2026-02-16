package mooc;


import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        divisibleByThreeInRange(2, 10);

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        int iBeg = beginning;
        int iEnd = end;
        int i = iBeg;
        while (i <= iEnd) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;


        }

    }

}
