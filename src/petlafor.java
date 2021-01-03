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
        System.out.println();
        System.out.println("----------------------Zadanie 5 ----------------------");
        System.out.println();

        // wyświetlanie nieposortowanej
        int [] sort = {3,1,-5,20,-6,-18,100};
        for(int i = 0; i< sort.length; i++) {
            System.out.print(sort[i] + ", ");
        }
        System.out.println();
//  sortowanie
        for(int j = 0; j< sort.length; j++) {
            for (int i = 0; i < sort.length - 1; i++) {
                if (sort[i + 1] < sort[i]) {
                    int tmp = sort[i + 1];
                    sort[i + 1] = sort[i];
                    sort[i] = tmp;
                }

            }
        }
        System.out.println();


// wyświetlanie posortowanej
                for(int i = 0; i< sort.length; i++){
                    System.out.print(sort[i] + ", ");
                }
        System.out.println();

        System.out.println();
        System.out.println("----------------------Zadanie 6 ----------------------");
        System.out.println();

    int[] oceny = {3,2,3,5,1};
        System.out.print("dla ocen: ");
        double s=0;
    for(int i=0; i < oceny.length; i++)  {
                s = s+oceny[i];
        double r  = s/5;
        System.out.print(oceny[i] + ", ");
       if  (i == (oceny.length-1)){
           System.out.println();
           System.out.println("średnia: " + r);
          // System.out.println("suma: " + s);
            }
        }

        System.out.println();
        System.out.println("----------------------Zadanie 7 ----------------------");
        System.out.println();

            char[]letters = {'w','z','A','a','t','a','a','A','w','a'};
            int a=0, b=0;
            for (int i=0; i<letters.length; i++){
                if (letters[i]=='a'){
                    a++;}
                else if (letters[i]=='A'){
                    b++;}
            }
        System.out.println("tablica zawiera "+a+" liter/y 'a' i "+ b+ " liter/y 'A'");
    }

}
