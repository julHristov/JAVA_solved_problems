import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        int roomWidth =  Integer.parseInt(line1);
        String line2 = scanner.nextLine();
        int roomLength = Integer.parseInt(line2);
        String line3 = scanner.nextLine();
        int roomHeight = Integer.parseInt(line3);
        int roomValue = roomHeight * roomLength * roomWidth;
        int boxesValueCounter = 0;

        while (boxesValueCounter <=roomValue){
            String line = scanner.nextLine();
            if(line.equals("Done")){
                if(roomValue > 0){
                    System.out.printf("%d Cubic meters left.", roomValue);
                    break;
                } else{
                    int diff = Math.abs(roomValue);
                    System.out.printf("No more free space! You need %d Cubic meters more.", diff);
                    break;
                }
            }else{
                int currentBox = Integer.parseInt(line);
                roomValue-=currentBox;
                if(roomValue <= 0){
                    int diff = Math.abs(roomValue);
                    System.out.printf("No more free space! You need %d Cubic meters more.", diff);
                  break;
                }
            }


        }
    }
}
