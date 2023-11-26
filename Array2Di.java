public class Array2Di {
    public static void main(String[] args) {
        String [][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambourghini";
        cars[2][2] = "Tesla";

        for (int i=0; i< cars.length; i++){
            System.out.println();
       
            for (int g=0; g<cars[i].length; g++){
            System.out.print(cars[i][g] + " ");
            }
        }
    }
}