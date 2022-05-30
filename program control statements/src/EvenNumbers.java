public class EvenNumbers {
    public static void main(String[] args) {
        int number = 100, i;
        int totalEvenNumbers = 0;

        System.out.println("This programs calculates even numbers from 1 to 100");
        //loop that gets all the evn numbers and adds them up;
        for (i = 2; i <= number; i += 2) {
            totalEvenNumbers += i;
        }

        //total
        System.out.println("Total addition of even numbers (1 - 100) is = " + totalEvenNumbers);
    }

}
