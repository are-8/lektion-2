//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 30;
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




    }
}