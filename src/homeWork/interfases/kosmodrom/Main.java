package homeWork.interfases.kosmodrom;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Kosmodrom kosmodrom = new Kosmodrom();
        Shuttle shuttle = new Shuttle();
        kosmodrom.start(shuttle);
        Falcon falcon9 = new Falcon();
        kosmodrom.start(falcon9);

    }
}
