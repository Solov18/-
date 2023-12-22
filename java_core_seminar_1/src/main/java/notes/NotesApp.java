package notes;

import utils.DataTime;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotesApp {
    public static void main(String[] args) throws IOException {
        Scanner df = new Scanner(System.in );
        System.out.println("Введите заметку: ");
        String note;
        note = df.nextLine();
        String formatDateTime = DataTime.getFormattedCurrentDateTime();
        String entry = formatDateTime + "-> " + note ;

        File file = new File("notes.txt");

        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(entry + '\n');
            writer.close();
            System.out.println(" Заматка успешно сохранена");
        } catch (IOException e) {
            System.out.println(" Ошибка при записи заметки в файл");
            e.printStackTrace();
        }









    }
}

