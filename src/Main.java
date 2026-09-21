import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("skriv ett tal 1-10: ");
        int anvandarTal = scanner.nextInt();
        scanner.nextLine();
        int guess = 5;
        boolean isCorrect = false;

        while (!isCorrect){
            System.out.println("min gissning är " + guess);
            System.out.println("har jag rätt? eller är det för lågt/högt?");
            System.out.print("ange svar: ");

            String answer = scanner.nextLine();

            if (guess == anvandarTal && answer.equals("rätt")){
                isCorrect = true;
            } else if (answer.equals("lågt")) {
                guess++;
            }
            else if (answer.equals("högt")){
                guess--;
            }
            else{
                System.out.println("felaktigt svar..");
            }
        }
        System.out.println("jag vann");
        System.out.println("avslutar program");
    }
}