package OOP;

/* 10. Enumerations
        to specjalny 'typ klasy' przechowywjacy okreslony zbior wartosci (tu nt, pogody )
        public enum Weather {
            HOT, WARM, COLD
        }
        WARTOSCI ENUM SA: public static final
        ENUM mozna uzyc do: typu zmiennych, case w switch'u
*/

public enum Weather {
    WARM("Its WARM!"),
    HOT("Its HOT!"),
    COLD("Its COLD!");

    private String caution;
    //constructor
    Weather(String caution) {
        this.caution = caution;
    }

    //see Main.java in OOP pack
    public String getCaution() {
        return this.caution;
    }
}
