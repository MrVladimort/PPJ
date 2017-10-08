
public class Fabryka {
    public static Cukierek[] cukierki = new Cukierek[3];

    public static Cukierek make(int war){
        if(cukierki[war] == null){
            Cukierek tmp;
            switch(war){
                case 0:
                    tmp = new Cukierek("Jabkowy", 10);
                    break;
                case 1:
                    tmp = new Cukierek("Krowka", 8);
                    break;
                default:
                    tmp = new Cukierek("Kasztanek", 5);
            }
            cukierki[war] = tmp;
        }


        return cukierki[war];
    }
}
