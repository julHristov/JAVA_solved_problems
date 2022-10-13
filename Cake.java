import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        int cakeHeight = Integer.parseInt(line1);
        String line2 = scanner.nextLine();
        int cakeWidth = Integer.parseInt(line2);
        int cakeSize = cakeWidth * cakeHeight;
        while (cakeSize > 0){
            String line = scanner.nextLine();
            if(line.equals("STOP")){
                System.out.printf("%d pieces are left.", cakeSize);
                break;
            }else{
                int currentPiece = Integer.parseInt(line);
                cakeSize-=currentPiece;
                if(cakeSize <=0){
                    int diff = Math.abs(cakeSize);
                    System.out.printf("No more cake left! You need %d pieces more.", diff);
                    break;
                }
            }
        }
    }
}
