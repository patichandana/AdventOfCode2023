import java.io.File;
import java.util.Scanner;

public class One {
    static int getNumber(String code) {
        int digit1 = -1, digit2 = -1;
        int length = code.length();
        for(int i = 0;i<length;++i) {
            char ch = code.charAt(i);
            // System.out.println(code.charAt(i));
            try {
                int j = (int)ch;
                // System.out.println(j);
                if(j >= 48 && j<=57) {
                    if(digit1 == -1) {
                        digit1 = j-48;
                        digit2 = j-48;
                    } 
                    else
                        digit2 = j-48;
                }
            } catch(Exception e) {
                System.out.println(e);
            }
        }
        int number = 10*digit1 + digit2;
        // System.out.println(digit1 + " " + digit2 + " " + number);
        return number;
    }

    public static void main(String[] args) {
        //file input
        int sum = 0;
        try {
            File inputFile = new File("input.txt");
            Scanner reader = new Scanner(inputFile);
            while(reader.hasNextLine()) {
                String data = reader.nextLine();
                // System.out.println(data);
                sum += One.getNumber(data);
            }
            System.out.println("Total sum is: " + sum);
            reader.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
