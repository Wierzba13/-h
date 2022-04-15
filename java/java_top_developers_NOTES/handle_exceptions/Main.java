package handle_exceptions;

import java.util.logging.*;

public class Main {
    private static Logger logger = Logger.getLogger(handle_exceptions.Main.class.getName());
    private static Object MyOwnException;

    public static void main(String[] args) {
/*
        1. Uzywaj nazwy loggera takiej jak nazwa klasy
        2. Ustawianie domyslnego levelu:
            logger.setLevel(Level.INFO);

        3. Kazdy wyjatek jest reprezentowany przez odpowiednia klase ktora moze dziedziczyc z innych wyzej w hierarchii
        4. W javie rozrozniamy wyjatki oznaczone i nieoznaczone
            a) oznaczone:
                - Musza byc zlapane
                - programista nie jest im winny (np. uszkodzenie dysku podczas korzystania z danych na nim sie znajdujacych)
            b) nieoznaczone:
                - moga byc zlapane
                - sa czesto z winy programisty (np. NullPointerExceptions)

        5. Mozemy tworzyc wlasne wyjatki (przyklad na klasie ExampleException)
            Musi rozszerzac klase Exception

*/

//        try {
//            logger.log(Level.INFO, "My info msg");
//        } catch (Exception e) {
//            logger.log(Level.SEVERE, "My error msg", e);
//        }
//
//        logger.log(Level.WARNING, "Warning msg");
//        logger.info("My msg");

        try {
            throw new MyOwnException("Message of my exception");
        } catch (HandleExceptions.MyOwnException e) {
            e.printStackTrace();
        }

    }
}
