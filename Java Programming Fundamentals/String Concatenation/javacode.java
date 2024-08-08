import java.util.*;
 class Authority
 {
     public static void main (String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Inmate's name:");
         String name=sc.nextLine();
         System.out.println("Inmate's father's name:");
         String fname=sc.nextLine();
         name=name.concat(" ").concat(fname);
         char []chars=name.toCharArray();
         for(char c:chars)
         {
         if(Character.isDigit(c)||c=='+'||c=='!'||c=='@'||c=='#'||c=='%'||c=='$'||c=='^'||c=='&'||c=='*')
         {
            System.out.println("Invalid name");
            System.exit(0);
         }
         }
         System.out.println(name.toUpperCase());
     }
     
    }
