import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner (System.in);

        int inLength, i = 0, temp = 0;
        long deciValue = 0;
        double factor;
        char eval;
        String inputValue;


        System.out.print("Enter a hexadecimal number: ");
        inputValue = in.next();


        //Calculation of hexadecimal number
        inLength = inputValue.length();

        if ((inputValue.charAt(0) == '0') & (inputValue.charAt(1) == 'x'))
        {
            i+=2;
        }

        while (i < inLength)
        {
            eval = inputValue.charAt(i);
            if(Character.isDigit(eval)){

                temp = Character.getNumericValue(eval);
                factor = Math.pow(16, inLength - (i + 1));
                deciValue += temp * (long)factor;
            }
            else if (Character.toUpperCase(eval) == 'A')
            {
                factor = Math.pow(16, inLength - (i + 1));
                deciValue += 10 * (long)factor;
            }
            else if (Character.toUpperCase(eval) == 'B')
            {
                factor = Math.pow(16, inLength - (i + 1));
                deciValue += 11 * (long)factor;
            }
            else if (Character.toUpperCase(eval) == 'C')
            {
                factor = Math.pow(16, inLength - (i + 1));
                deciValue += 12 * (long)factor;
            }
            else if (Character.toUpperCase(eval) == 'D')
            {
                factor = Math.pow(16, inLength - (i + 1));
                deciValue += 13 * (long)factor;
            }
            else if (Character.toUpperCase(eval) == 'E')
            {
                factor = Math.pow(16, inLength - (i + 1));
                deciValue += 14 * (long)factor;
            }
            else if (Character.toUpperCase(eval) == 'F')
            {
                factor = Math.pow(16, inLength - (i + 1));
                deciValue += 15 * (long)factor;
            }
            else
            {
                System.out.println("You are making my life so hard!!!!");
            }

            i++;
        }

        //Space Saver method
        //System.out.println(Integer.parseInt(inputValue,16));

        System.out.println("Your number is " + deciValue + " in decimal");
    }
}
