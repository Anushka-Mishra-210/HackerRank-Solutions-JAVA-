
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        //EXPLANATIONN OF IMMEDIATE ABOVE LINE
 

       /*
       \\b(\\w+)(?:\\W+\\1\\b)+
/
gm
\\ matches the character \ with index 9210 (5C16 or 1348) literally (case sensitive)
b matches the character b with index 9810 (6216 or 1428) literally (case sensitive)
1st Capturing Group (\\w+)
\\ matches the character \ with index 9210 (5C16 or 1348) literally (case sensitive)
w matches the character w with index 11910 (7716 or 1678) literally (case sensitive)
Non-capturing group (?:\\W+\\1\\b)+
+ matches the previous token between one and unlimited times, as many times as possible, giving back as needed (greedy)
\\ matches the character \ with index 9210 (5C16 or 1348) literally (case sensitive)
W matches the character W with index 8710 (5716 or 1278) literally (case sensitive)
\\ matches the character \ with index 9210 (5C16 or 1348) literally (case sensitive)
1 matches the character 1 with index 4910 (3116 or 618) literally (case sensitive)
\\ matches the character \ with index 9210 (5C16 or 1348) literally (case sensitive)
b matches the character b with index 9810 (6216 or 1428) literally (case sensitive)
Global pattern flags
g modifier: global. All matches (don't return after first match)
m modifier: multi line. Causes ^ and $ to match the begin/end of each line (not only begin/end of string)*/

        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}
