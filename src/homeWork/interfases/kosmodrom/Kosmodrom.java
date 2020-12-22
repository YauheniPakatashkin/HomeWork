package homeWork.interfases.kosmodrom;

import java.io.FileNotFoundException;

public class Kosmodrom {
    public void start(IStart iStart) throws FileNotFoundException {
        if (!iStart.controlSystems()) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            iStart.startEngine();
            System.out.println("Обратный отсчет:");
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
            }
            iStart.start();
        }

    }
}

