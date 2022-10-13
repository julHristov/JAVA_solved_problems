import java.util.Scanner;

public class Biblioteque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchedBook = scanner.nextLine();
        String currentLine = scanner.nextLine();
        int booksCounter = 0;
        boolean isFound = false;
        while (!currentLine.equals("No More Books")) {
            if(currentLine.equals(searchedBook)){
                isFound = true;
                break;
            }
            booksCounter++;
            currentLine = scanner.nextLine();
        }
        if(isFound){
            System.out.printf("You checked %d books and found it.", booksCounter);
        }else{
            System.out.printf("The book you search is not here!\nYou checked %d books.", booksCounter);
        }
        }
    }

