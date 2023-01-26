public class Switch {

    public static void main(String[] args) {
        String clima = "sunnylkj";


        switch (clima){

            case "sunny":

                System.out.println("el tiempo es soleado");
                break;

            case "cloudy":

                System.out.println("el tiempo es nublado");
                break;
            case "rainy":
                System.out.println("esta lloviendo");
                break;

            default:
                System.out.println("default");
                break;



        }
    }
}
