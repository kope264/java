package strings;
import java.util.Scanner;
//its just asimple java proagram which gives output of the sting in reverses order 
public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x= sc.nextLine();
        StringBuilder sb =new StringBuilder(x);
        for(int i=0;i<sb.length()/2;i++){  
            int front=i;
            int back=sb.length()-1-i;

            char frontChar=sb.charAt(front);
            char backchar=sb.charAt(back);


            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontChar);
             
        }System.out.println(sb);
        
    }
    
}
