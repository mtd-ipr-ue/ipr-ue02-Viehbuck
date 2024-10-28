import libraries.Out;
import libraries.In;

public class ue02_3 {
    public static void main(String[] args) {
        Out.print("X-Wert:");
        double x = In.readDouble();
        Out.print("Y-Wert:");
        double y =In.readDouble();

        double hypothenuse = Math.sqrt(x*x + y*y);

        if(hypothenuse >= 4 && x <= 4 && y<=4 && x > 0 && y > 0){
            Out.print("innerhalb der grünen Fläche");
        }
        else{
            Out.print("Außerhalb der grünen Fläche");
        }
    }
}
