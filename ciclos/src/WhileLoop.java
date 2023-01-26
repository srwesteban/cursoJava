import java.sql.SQLOutput;

public class WhileLoop {
    public static void main(String[] args) {

        int count = 0;

        while (count < 10 ){


            count++;

            if (count == 6){
                continue;

            }
            System.out.println("Hola mundo " + count);
            if (count ==9){
                System.out.println("se rompio en 9");
                break;

            }


        }
        System.out.println("Fin");

    }
}
