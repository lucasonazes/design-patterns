package sistema_gerenciamento_biblioteca;

import java.util.ArrayList;

public class LibraryItem implements Borrowable {
    public String title = "";
    public String author = "";
    public String publicationYear = "";
    public boolean borrowed = false;

    public void borrow(){
        this.borrowed = true;
    }

    public void returnItem(){
        this.borrowed = false;
    }

    public ArrayList<String> showInfo() {
        ArrayList<String> info = new ArrayList<String>();
        info.add(this.title);
        info.add(this.author);
        info.add(this.publicationYear);

        return info;
    }
}
