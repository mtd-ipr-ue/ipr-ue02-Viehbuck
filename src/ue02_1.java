import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {

        int a = In.readInt();
        int b = In.readInt();
        int c = In.readInt();

        int max = a;

        if(max < b)
        {
            max = b;
        }
        if(max < c){
            max = c;
        }
        Out.print("Das Maximum der Zahlen ist: "+max);    
    }
}
