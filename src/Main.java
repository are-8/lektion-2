import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*int age = 30;
        float height = 1.75f;
        char initial = 'A';
        String name = "Alice";
        boolean isStudent = true;

        System.out.println(((Object) age).getClass().getName());
        System.out.println(((Object) height).getClass().getName());
        System.out.println(((Object) initial).getClass().getName());
        System.out.println(((Object) name).getClass().getName());
        System.out.println(((Object) isStudent).getClass().getName());

        System.out.println();

        System.out.println( 10 + 20);
        System.out.println(100 - 30);
        System.out.println(5 * 7);
        System.out.println(20/4);
        System.out.println(10%3);

        System.out.println();
        int a = 15;
        int b = 20;

        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println( a <= b);

        System.out.println();

        int x = 10;
        int y = 5;
        int z = 20;

        System.out.println( x > y && z > y);
        System.out.println( x > y || z < y);

        System.out.println();

        System.out.println((10 + 5) * 2 > 20);

        System.out.println();
        //-----------------------------------
        double AA = 0;
        double BB = 0;


        System.out.print("mata in ett heltal: ");
        AA = scanner.nextDouble();

        System.out.print(" mata in ett annat heltal: ");
        BB = scanner.nextDouble();

        double Hypotenusa = Math.sqrt(AA * AA + BB * BB);
        System.out.println(Hypotenusa);

        int age = 70;

        boolean canVote = (age >= 18);
        boolean canRetire = (age >= 65);

        System.out.println("får du rösta: " + canVote);
        System.out.println("får du gå i pension: " + canRetire);

        int age = 18;

        if (age >= 18){
            System.out.println("du är myndig");
        }
        else{
            System.out.println("du är ej myndig");
        }

        int age = 10;
        boolean hasLicense = true;

        if (age >= 18 && (hasLicense = true)){
            System.out.println("du får köra bil");
        }
        else{
            System.out.println("du får inte köra bil");
        }

        int age = 65;

        if (age < 13){
            System.out.println("barn");
        } else if (age <= 17) {
            System.out.println("tonåring");
        }
        else{
            System.out.println("vuxen");
        }

        int num = 1;

        while(num < 6){
            System.out.println(num);
            num++;
        }

        for (int i = 1; i < 11; i++){
            System.out.println(i);
        }

        int num = 1;

        do {
            System.out.println(num);
            num++;
        }while (num < 6);

        for (int i = 1; i < 11; i++){
            if(i <= 5){
                System.out.println("5 eller mindre");
            }
            else {
                System.out.println("5 eller större");
            }

        }*/

        Car myCar = new Car();

        myCar.brand = "volvo";
        myCar.year = 2020;

        System.out.println("din bil är en " + myCar.brand + " från " + myCar.year);

    }
}