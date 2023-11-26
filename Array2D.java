public class Array2D {
    public static void main(String[] args) {
        String [][] cars = {{"Camaro", "Corvette", "Silverado"},
        				{"Mustang","Ranger","F-150"},
        				{"Ferrari", "Lambourghini","Tesla"}};


        for (int i=0; i< cars.length; i++){
            System.out.println();
       
            for (int g=0; g<cars[i].length; g++){
            System.out.print(cars[i][g] + " ");
            }
        }
    }
}