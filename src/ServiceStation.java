import Transports.Transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Transport>{

    private String titleStation;
    private Queue<T> queue = new LinkedList<>();

    public ServiceStation(String titleStation) {
        this.titleStation = titleStation;
    }

    public void addTransports(T... transports) {
        for (T transport : transports) {
            queue.offer(transport);
        }
    }

    public void toService() {
        T transport = queue.poll();
        if (transport != null) {
            transport.setDiagnosticsPassed(true);
            System.out.println("Проведено ТО для автомобиля - " + transport.getBrand() + " " + transport.getModel());
            toService();
        } else {
            System.out.println("Очередь пуста");
        }
    }

}
