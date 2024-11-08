import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        Out.print("Zahl1:");
        int a = In.readInt();
        Out.print("Zahl2:");
        int b = In.readInt();
        Out.print("Zahl3:");
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
