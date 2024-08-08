import java.util.*;
 public class UserInterface {
     
     public static CommissionInfo generateCommissionObtained(){
         CommissionInfo c=(obj)->{
             String k=(String)obj.getClassType();
             if(k.equalsIgnoreCase("1A") || k.equalsIgnoreCase("2A") || k.equalsIgnoreCase("3A")){
                 return 100;
             }
            return 60;
             
         
         };
        
         return c;
     }
     
    public static void main(String args[]) {
         
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the no of passengers");
         int n=sc.nextInt();
         int p=1;
         double sum=0;
         Ticket t[]=new Ticket[n];
         int i=0;
         while(n!=0){
             System.out.println("Details of Passenger "+(p++)+":");
             System.out.println("Enter the pnr no:");
             long no=sc.nextLong();
             System.out.println("Enter passenger name:");
             String name=sc.next();
             System.out.println("Enter seat no:");
             int sno=sc.nextInt();
             System.out.println("Enter class type:");
             String ct=sc.next();
             System.out.println("Enter ticket fare:");
             double f=sc.nextDouble();
             t[i++]=new Ticket(no,name,sno,ct,f);
             
             n--;
         }
         System.out.println("Commission Obtained");
         CommissionInfo o=generateCommissionObtained();
         for(int j=0;j<i;j++){
             sum+=o.calculateCommissionAmount(t[j]);
         }
         System.out.printf("Commission obtained per each person: Rs.%.2f",sum);
     
     }
     
 }
