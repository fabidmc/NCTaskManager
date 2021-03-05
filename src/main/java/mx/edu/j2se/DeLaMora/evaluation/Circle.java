package mx.edu.j2se.DeLaMora.evaluation;

public class Circle {

    private int radius;

    //Constructor
    public Circle(){
       radius = 1;

    }

    public Circle(int radius){

        this.radius = radius;

        if(radius < 0){
            throw new IllegalArgumentException("Not valid negative arguments !!");

        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;

        if(this.radius < 0){
            throw new IllegalArgumentException("This is not possible...try again");
        }
    }

    public int getArea(){
        return Math.PI * radius * radius;
    }
}
