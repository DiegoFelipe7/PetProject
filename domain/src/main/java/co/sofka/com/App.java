package co.sofka.com;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {


     System.out.println("es" + LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

    }
}
