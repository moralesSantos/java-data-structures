import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        // System.out.println(colors); // will not print content on array
        System.out.println(Arrays.toString(colors));

        int[] numbers = {100, 200}; //if you know content of the array

//        for(int i = 0; i< colors.length; i++){
//            System.out.println(colors[i]);
//        }

        //will print out array in reverse (dont forget about index size add the -1)
//        for(int i = colors.length - 1; i >=0; i--){
//            System.out.println(colors[i]);
    //}


        //advance for loop
//        for(String color : colors){
//            System.out.println(color);
//        }



    }


}
