package sistema_gerenciamento_biblioteca;

import java.util.ArrayList;

public class Book extends LibraryItem {
    public String genre = "";

    public String readSample() {
        return "This is a sample of the book";
    }

    @Override
    public ArrayList<String> showInfo() {
        ArrayList<String> info = super.showInfo();
        info.add(genre);
        return info;
    }
}
