import java.util.Scanner;

public class stringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hb= sc.nextLine();
        System.out.println("first string is "+hb);
        System.out.println("length is="+hb.length());
        System.out.println("one ny one charecters");
        for(int i=0;i<hb.length();i++){
            System.out.println(hb.charAt(i));

        }
       
      System.out.println("substring from index 0 to 3" + hb.substring(0, 3));
      String hv=sc.next();
      System.out.println("string 2 is "+hv);
      if(hb.compareTo(hv)==0){
        System.out.println("strings are equal");
      }
      else{
        System.out.println("strings are not equal");
      }
    }
  
        
    }

