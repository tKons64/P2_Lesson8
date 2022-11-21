package Transports;

import Driver.DriverC;

public class Truck extends Transport implements Competable{

    public enum LoadCapacity {
        N1("с полной массой до 3,5 тонн"), //с полной массой до 3,5 тонн
        N2("с полной массой свыше 3,5 до 12 тонн"), //с полной массой свыше 3,5 до 12 тонн
        N3("с полной массой свыше 12 тонн");  //с полной массой свыше 12 тонн

        private String comment;

        LoadCapacity(String comment) {
            this.comment = comment;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }
    }

    private LoadCapacity type;

    public Truck(String brand, String model, int engineVolume) {
        super(brand, model, engineVolume);
    }

    public void addDriver(DriverC driver) {
        super.addDriver(driver);
    }
    @Override
    public void pitStop() {
        System.out.println("Пит-стоп");
    }

    @Override
    public int bestLapTime() {
        return 9;
    }

    @Override
    public int maxSpeed() {
        return 120;
    }
}
