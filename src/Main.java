import java.util.Scanner;

public class Main {
    // credits to all the code i pasted to make this lol
    // function to generate a random string of length n
    static String gen_string(int n)
    {
        // chose a Character random from this String
        String AlphaNumericString = "*+";
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());
            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }
        return sb.toString();
    }

    // OK JUST SO YALL UNDERTAND: TRONCO (ES) = TRUNK (EN). Im just too lazy to change it
    // adjust length based on int input
    static String buildTronco(int n){
        // nothing random here
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);
        // lets loop n times / 6 cuz good ig? - looks decent, try changing numbers too
        for (int i = 0; i < (n/6); i++){
            sb.append("||");
        }
        if (n/6 == 0){
            // add one cuz funny
            sb.append("|");
        }
        String old_k = sb.toString();

        // multiple lines
        if (n/30 !=0){
            for (int i = 0; i < (old_k.length() / (n/30)); i++){
                sb.append("\n\r" + old_k.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // ask how many levels ( int many )
        // make a randomizer to generate a random string with X chars ( gen_string(int how_many) )
        // make it a tree - tronco ( buildTronco(int length_of_last_level) )
        int many = 0;
        Scanner U_Scan = new Scanner(System.in);
        while (many == 0){
            // ask for how many levels
            System.out.print("Enter the number of branches: ");
            if (U_Scan.hasNextInt())
                many = U_Scan.nextInt();
        }
        // check if its negative
        if (many < 0){
            // we need to draw / print tronco first, so we need to calculate everything first
            System.out.printf(buildTronco(Math.abs(many) + 1)+ "\n\r");

            // generate our thingy
            for(int i = (Math.abs(many) + 1) ; i >= 1; i--){
                // i = 1 cuz else our gen will not work, that's why I add 1 to many
                // call our randomizer and print to line
                System.out.printf(gen_string(i) + "\n\r");
            }
        }
        else{
            // generate our thingy
            for(int i = 1; i < (many + 1); i++){
                // i = 1 cuz else our gen will not work, that's why I add 1 to many
                // call our randomizer and print to line
                System.out.printf(gen_string(i) + "\n\r");
            }
            // build our "tronco" and print it
            System.out.printf(buildTronco(many + 1)+ "\n\r");
        }

    }
}
