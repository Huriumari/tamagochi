import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int choose;

        Cat firstCat = new Cat("Tom");

        do {
            System.out.println(firstCat);
            Scanner sc = new Scanner(System.in);
            System.out.println("\n1.Play\n2.Feed\n3.Wash\n4.Exit");
            choose = sc.nextInt();

            if (choose == 1){
                firstCat.play();
            }

            if (choose == 2){
                firstCat.feed();
            }

            if (choose == 3){
                firstCat.wash();
            }


        }while (choose < 4);




    }

}
