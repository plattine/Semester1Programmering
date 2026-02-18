package OwnExercises;

public class NumbersArray {
    public static void main(String[] args) {

        int[] numbersArray = {4, 9, 2, 11, 6};


        int sum = 0;
        int highestNumber = numbersArray[0];
        int lowestNumber = numbersArray[0];

        for (int i = 0; i < numbersArray.length; i++) {
            sum = sum + numbersArray[i];
            System.out.println(numbersArray[i]);

            if (numbersArray[i] > highestNumber) {
                highestNumber = numbersArray[i];
            }
            if (numbersArray[i] < lowestNumber){
                lowestNumber = numbersArray[i];
            }

    }
        System.out.println("Sum is: " + sum);
        System.out.println("Highest number is: " + highestNumber);
        System.out.println("Lowest number is: " + lowestNumber);



    }
}
