/*
 * https://www.codeeval.com/open_challenges/1
 */

package easy_level;

import java.io.*;
import java.util.*;

public class FizzBuzz {

//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner in = new Scanner(new File(args[0]));        
//        while (in.hasNextLine()) {
//            try {
//                int F    = in.nextInt();
//                int B    = in.nextInt();
//                int upto = in.nextInt();            
//                for (int i = 1; i <= upto; i++) {
//                    String value;
//                    if (i % F == 0 && i % B == 0) value = "FB";
//                    else if (i % F == 0) value = "F";
//                    else if (i % B == 0) value = "B";
//                    else value = "" +i;
//                    System.out.print(value + " ");
//                }
//                System.out.println();
//            }
//            catch(Exception e) {}            
//        }
//        in.close();
//    }
    
    // or
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader in  = new BufferedReader(new FileReader(new File(args[0])));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer input;
        try {
            while ((input = new StringTokenizer(in.readLine(), " ")).countTokens() == 3) {            
                int F    = Integer.parseInt(input.nextToken());
                int B    = Integer.parseInt(input.nextToken());
                int upto = Integer.parseInt(input.nextToken());           
                for (int i = 1; i <= upto; i++) {
                    String value;
                    if (i % F == 0 && i % B == 0) value = "FB";
                    else if (i % F == 0) value = "F";
                    else if (i % B == 0) value = "B";
                    else value = "" +i;
                    out.write(value + " ");
                }
                out.write("\n");
            }           
        }
        catch (NullPointerException e) {}
        in.close();  
        out.flush();
    }

}
