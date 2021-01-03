import java.sql.SQLOutput;

public class petlafor {

    public static void main(String[] args) {

        System.out.println("----------------------Zadanie ----------------------1");
        System.out.println();

        for (int i = 91; i>-8 ; i--){

            System.out.print(i +", ");
        }
        System.out.println();
        System.out.println("----------------------Zadanie 2 ----------------------");
        System.out.println();


        for( int i = 62349; i<=62392; i++){
            if (i%2==0){
                System.out.print(i +", ");
            }
        }
        System.out.println();
        System.out.println("----------------------Zadanie 3 ----------------------");
        System.out.println();

        for( int  i = 'a'; i<= 'z'; i++){
            System.out.print( (char)i + ", ");
        }
        System.out.println();
        System.out.println("----------------------Zadanie 4 ----------------------");
        System.out.println();

        int [][] numbers = {{1,4,1},{7,2,2},{6,3,3}};

        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length ;j++){
            System.out.print(numbers[i][j]);
               }
            System.out.println();
        }

    }

}
