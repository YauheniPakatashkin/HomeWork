package homeWork.transport;

public class Military  extends AirTransport{
    private boolean ejection;
    private int numberOfMissiles;

    public Military(int horsepower, int maxSpeed, int mass, String brand, int wingspan, int minStripLength, boolean ejection, int numberOfMissiles) {
        super(horsepower, maxSpeed, mass, brand, wingspan, minStripLength);
        this.ejection = ejection;
        this.numberOfMissiles = numberOfMissiles;
    }

    @Override
    public void description() {
        super.description();
        System.out.println("Наличие системы катапультирования "+ejection);
        System.out.println("Количество ракет "+numberOfMissiles);
    }
    private void katapulta(boolean ejection){
        if(ejection)
            System.out.println("катапультирование прошло успешно");
        else
            System.out.println("у вас нет таокй системы");
    }
    private void bang(){
        if(numberOfMissiles>0){
            numberOfMissiles --;
            System.out.println("ракета пошла");
        }
        else System.out.println("боеприпасы отсутствуют");

    }
}
