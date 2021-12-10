/* QUES 1:

Wipro Technologies Bangalore	0	orpiW seigolonhceT erolagnaB
Wipro Technologies, Bangalore	0	orpiW ,seigolonhceT erolagnaB
Wipro Technologies Bangalore	1	Orpiw Seigolonhcet Erolagnab
Wipro Technologies, Bangalore	1	Orpiw ,seigolonhceT Erolagnab
Wipro Technologies, Bangalore	2	ORPIw ,SEIGOLONHCEt EROLAGNAb
*/
import java.util.*;
public class SentenceReform{
    public static String reverse(String word) {
        String out="";
        int i=word.length()-1;
        out+=Character.toString(Character.toUpperCase(word.charAt(i)));
        for(i=word.length()-2;i>-1;i--) {
            out+=Character.toString(Character.toLowerCase(word.charAt(i)));
        }
        return out;
    }
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        String Sentence = sc.nextLine();
        int i=0;
        String word="";
        while(Sentence.charAt(i)!='\0' && i<Sentence.length()-1)
        {
            if(Sentence.charAt(i)==' ') {
                System.out.print(reverse(word)+" ");
                word="";
                i++;
                continue;
            }
            else{
                word+=Character.toString(Sentence.charAt(i));
                i++;
            }
        }
        word+=Character.toString(Sentence.charAt(i));
        System.out.print(reverse(word));
    }
}
