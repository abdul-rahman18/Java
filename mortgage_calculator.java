import java.util.Scanner;
import java.text.NumberFormat;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int principal;
        float interest;
        byte period;
        System.out.print("Principal (1k$ - 1M$) : ");
        principal = scanner.nextInt();
        while(true){
            if(principal>=1000 && principal <=1000000)
                break;
            else{
                System.out.println("Enter a value between 1000 and 1000000");
                System.out.print("Principal (1k$ - 1M$) : ");
                principal = scanner.nextInt();
            }
        }
        System.out.print("Annual Interest rate : ");
        interest = scanner.nextFloat();
        while(true){
            if(interest>0 && interest<=30)
                break;
            else{
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
                System.out.print("Annual Interest rate : ");
                interest = scanner.nextFloat();
            }
        }
        System.out.print("Period (Years) : ");
        period = scanner.nextByte();
        while(true){
            if(period >= 1 && period <= 30)
                break;
            else{
                System.out.println("Enter a value between 1 and 30");
                System.out.print("Period (Years) : ");
                period = scanner.nextByte();
            }
        }
            float monthly_interest = interest/100/12;
            int year_in_months= period*12;
            double result = (principal*monthly_interest*(Math.pow(1+monthly_interest,year_in_months)))/(Math.pow(1+monthly_interest,year_in_months)-1);
            String mortgage = NumberFormat.getCurrencyInstance().format(result);
            System.out.println("Mortgage: " + mortgage);
    }
}