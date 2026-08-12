import java.util.Scanner;


public class q5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long b1,b2;
        int i=0,remainder=0;

        System.out.println("Enter the first binary number");
        b1=input.nextLong();
        System.out.println("Enter the second binary number");
        b2=input.nextLong();

        int product[]=new int[50];
        
        while(b1!=0|| b2!=0){
            
            product[i++]=(int)((b1%10+b2%10+remainder)%2);
            remainder=(int)((b1%10+b2%10+remainder)/2);
            b1=b1/10;
            b2=b2/10;


        


        }
        if(remainder!=0){
            product[i++]=remainder;
        }

        --i;
        System.out.println("Product of two binary numbers is");
        while(i>=0){
            System.out.print(product[i--]);
        }
        input.close();
        

        
    }
}
