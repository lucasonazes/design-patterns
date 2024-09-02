package sistema_gerenciamento_biblioteca;

import java.util.ArrayList;

public class Magazine extends LibraryItem {
    public String issueNumber = "";

    public String flipPages() {
        return "You've flipped the page!";
    }

    @Override
    public ArrayList<String> showInfo() {
        ArrayList<String> info = super.showInfo();
        info.add(issueNumber);
        return info;
    }
}
