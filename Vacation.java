import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        int spendDaysCounter = 0;
        int daysCounter = 0;

        while (currentMoney < neededMoney && spendDaysCounter < 5) {
            String command = scanner.nextLine();
            double money = Integer.parseInt(scanner.nextLine());
            daysCounter++;
            if (command.equals("spend")) {
                spendDaysCounter++;
                currentMoney -= money;
                if(currentMoney < 0){
                    currentMoney = 0;
                }
            } else {
                currentMoney += money;
                spendDaysCounter = 0;
            }
        }
        if(currentMoney >= neededMoney){
            System.out.printf("You saved the money for %d days.", daysCounter);
        }
        if (spendDaysCounter == 5){
            System.out.println("You can't save the money.");
            System.out.printf("%d", daysCounter);
        }
    }
        }


