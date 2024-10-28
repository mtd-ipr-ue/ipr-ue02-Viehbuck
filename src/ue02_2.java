import libraries.Out;
import libraries.In;

public class ue02_2 {
    public static void main(String[] args) {
        Out.print("Jahreszahl:");
        int jahr = In.readInt();
        Out.print("Monat:");
        int monat = In.readInt();
        int days = 0;

        if(monat < 1 || monat > 12){
            Out.print("Fehler, dises Monat gibt es nicht");
        }
        else{
            switch(monat){
                case 1, 3, 5, 7, 8, 10, 12:
                    days = 31;
                    break;
                case 4, 6, 9, 11:
                    days = 30;
                    break;
                case 2:
                    if((jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0)){
                        days = 29;
                    }
                    else{
                        days=28;
                    }
                    break;
                default:
                Out.print("Fehler");
            }
        }
        
        Out.print("Das Monat hat:"+days+" Tage");

    }
}
