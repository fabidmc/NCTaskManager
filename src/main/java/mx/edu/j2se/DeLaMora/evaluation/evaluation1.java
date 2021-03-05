package mx.edu.j2se.DeLaMora.evaluation;

public class evaluation1 {

    public static double biggestCircle(int[] circles) {
        int max = 0, index = 0;


        for (int i = 0; i < circles.length; i++) {

            if (circles[i] > max) {
                max = circles[i];
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {


        // Circle circ = new Circle(-2);


        int[] circles = new int[3];
        // se define dentro del arreglo el radio de los circulos
        circles[0]=7;
        circles[1]=4;
        circles[2]=5;


        System.out.println(biggestCircle(circles));


    }

}











