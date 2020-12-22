package homeWork.interfases.kosmodrom;

import java.io.FileNotFoundException;

public interface IStart {
    boolean controlSystems() throws FileNotFoundException;

    void startEngine();

    void start();
}

