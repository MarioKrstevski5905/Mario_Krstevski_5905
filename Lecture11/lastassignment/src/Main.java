import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String bank = "";
        double amount = 0;
        try{
        System.out.println("Enter bank: ");
        bank = bufferedReader.readLine();
            System.out.println("Enter the amount: ");
        amount = Double.parseDouble(bufferedReader.readLine());
        Account account = new Account(bank, amount);
        int input = 0;
            System.out.println("Choose from options: ");
            System.out.println("1 - Display bank information");
            System.out.println("2 - Current amount status");
            System.out.println("3 - Add amount");
            System.out.println("4 - Withdraw amount");
            System.out.println("5 - Clear all amount");
            input = Integer.parseInt(bufferedReader.readLine());
            switch(input){
                case 1:
                    System.out.println("Bank info: " + account.getBank());
                    break;
                case 2:
                    System.out.println("Amount info: " + account.getAmount());
                    break;
                case 3:
                    System.out.println("Enter the desired amount: ");
                    double value = Double.parseDouble(bufferedReader.readLine());
                    account.add(value);
                    break;
                case 4:
                    System.out.println("Enter the desired withdraw amount: ");
                    double value1 = Double.parseDouble(bufferedReader.readLine());
                    account.withdraw(value1);
                    break;
                case 5:
                    account.withdraw(account.getAmount());
                    break;
                default:
                    System.out.println("No such option");
            }
    }catch(IOException e){
            System.out.println(e);
        }
     catch(NumberFormatException e){
         System.out.println(e);
    }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

}