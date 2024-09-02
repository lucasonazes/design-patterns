package sistema_gerenciamento_biblioteca;

import java.util.ArrayList;

public class DigitalMedia extends LibraryItem {
    public String fileFormat = "";

    public String play() {
        return "Playing...";
    }

    @Override
    public ArrayList<String> showInfo() {
        ArrayList<String> info = super.showInfo();
        info.add(fileFormat);
        return info;
    }
}
