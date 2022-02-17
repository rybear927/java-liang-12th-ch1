package Chapter04;
//(Generate vehicle plate numbers) Assume that a vehicle plate number consists
//of three uppercase letters followed by four digits. Write a program to generate a
//plate number.

public class exercise25 {
    public static void main(String[] args) {

        String licensePlate = "";
        //'A' is 65, 'Z' is 90

        //add letters
        for (int i = 0; i < 3; i++) {
            char letter = (char)((int)(Math.random() * 26) + 65);
            licensePlate += letter;
        }

        //add digits
        for (int i = 0; i < 4; i++) {
            int digit = (int)(Math.random() * 10);
            licensePlate += digit;
        }

        System.out.println("Random plate number: " + licensePlate);
    }
}
