package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataTime {
    public static  String getFormattedCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - HH:mm:ss");

        return now.format(formatter);
    }
}
