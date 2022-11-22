import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Other.Mechanic;
import Other.Sponsor;
import Transports.Bus;
import Transports.Car;
import Transports.Transport;
import Transports.Truck;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Урок 6. Домашние задания

        Car crLada = new Car("LADA", "2105", 0);
        Car crKia = new Car("KIA", "Sorento", 0);
        Car crBMW = new Car("BMW", "5", 0);
        Car crAudi = new Car("Audi", "80", 0);

        Truck trKamaz = new Truck("Камаз", "55111", 0);
        Truck trVolvo = new Truck("Volvo", "FH16", 0);
        Truck trScania = new Truck("Scania", "Interlink", 0);
        Truck trMaz = new Truck("МАЗ", "5440М9", 0);

        Bus bsLiaz = new Bus("ЛИАЗ", "4292 ", 0);
        Bus bsKamaz = new Bus("Камаз", "6250", 0);
        Bus bsGaz = new Bus("ГАЗель ", "27057", 0);
        Bus bsIkarus = new Bus("Икарус", "250", 0);

        crLada.pitStop();
        System.out.println(crKia.bestLapTime());
        System.out.println(crBMW.maxSpeed());

        trKamaz.pitStop();
        System.out.println(trVolvo.bestLapTime());
        System.out.println(trScania.maxSpeed());

        bsLiaz.pitStop();
        System.out.println(bsKamaz.bestLapTime());
        System.out.println(bsGaz.maxSpeed());

        DriverB driverCar = new DriverB("DriverCar", 10, crAudi);
        DriverC driverTruck = new DriverC("DriverTruck", 2, trMaz);
        DriverD driverBus = new DriverD("DriverBus", 7, bsIkarus);
        System.out.println(driverCar);
        System.out.println(driverTruck);
        System.out.println(driverBus);

        //Урок 7. Домашнtе задание 1
        System.out.println("");
        System.out.println("Урок 7. Домашнее задание 1");

        Mechanic<Car> boris = new Mechanic<>("Борис", "Россия");
        Mechanic<Truck> petr = new Mechanic<>("Петр", "Россия");
        Mechanic<Transport> ivan = new Mechanic<>("Иван", "Россия");
        Mechanic<Car> jonh = new Mechanic<>("Джон", "Германия");
        Mechanic<Truck> frank = new Mechanic<>("Френк", "Швеция");

        Sponsor spElonMusk = new Sponsor("Илон Маск", Sponsor.TypeSponsor.INDIVIDUAL, 1_000_000);
        Sponsor spGoogle = new Sponsor("Google", Sponsor.TypeSponsor.COMPANY, 7_000_000);
        Sponsor spGazProm = new Sponsor("Газпром", Sponsor.TypeSponsor.COMPANY, 200_000);
        Sponsor spPotanin = new Sponsor("Потанин", Sponsor.TypeSponsor.INDIVIDUAL, 50_000);

        crLada.addDriver(driverCar);
        crLada.addSponsors(spPotanin, spGazProm);
        crLada.addMechanics(boris, ivan);

        trScania.addDriver(driverTruck);
        trScania.addSponsors(spGoogle, spElonMusk);
        trScania.addMechanics(frank, ivan);

        bsKamaz.addDriver(driverBus);
        bsKamaz.addSponsors(spGazProm);
        bsKamaz.addMechanics(ivan);

        Set<Transport> racingCars = new HashSet<>();
        racingCars.add(crLada);
        racingCars.add(trScania);
        racingCars.add(bsKamaz);

        for (Transport racingCar : racingCars) {
            printDataTransport(racingCar);
        }

        // Урок 8. Домашние задания
        System.out.println();
        System.out.println("Урок 8. Домашнее задание №1");

        Product apples = new Product("Яблоки", 99, 2);
        Product tomatoes = new Product("Помидоры", 100, 1);
        Product bananas = new Product("Бананы", 60, 1);
        Product apples2 = new Product("Яблоки", 99, 2);

        Set<Product> listOfProducts = new HashSet<>();
        addProduct(listOfProducts, apples);
        addProduct(listOfProducts, tomatoes);
        addProduct(listOfProducts, bananas);
        //addProducts(listOfProducts, apples2);
        System.out.println(listOfProducts.toString());
        markPurchase(apples);
        markPurchase(bananas);
        System.out.println(listOfProducts.toString());
        delProduct(listOfProducts, tomatoes);
        System.out.println(listOfProducts.toString());

        // Урок 8. Домашние задания
        System.out.println();
        System.out.println("Урок 8. Домашнее задание №1. Блок 2");

        Set<Recipe> listOfRecipes = new HashSet<>();
        Recipe borch = new Recipe("Борщ");
        borch.addProducts(listOfProducts);
        borch.calculateRecipePrice();
        System.out.println(borch);

        Recipe shi = new Recipe("Щи");
        shi.addProducts(listOfProducts);
        shi.calculateRecipePrice();
        System.out.println(shi);

        // Урок 8. Домашние задания
        System.out.println();
        System.out.println("Урок 8. Домашнее задание №2. Блок 2");

        List<Integer> listOfValue = new ArrayList<>(20);
        while (listOfValue.size() < 20) {
            listOfValue.add((int) (Math.random() * 1000));
        }
        System.out.println(listOfValue);
//      вариант №1
//        List<Integer> listOfValueDelete = new ArrayList<>();
//        for (int value: listOfValue) {
//            if (!(value % 2 == 0)) {
//                listOfValueDelete.add(value);
//                //System.out.println(listOfValue.indexOf(value));
//            }
//        }
//        System.out.println(listOfValueDelete);
//        listOfValue.removeAll(listOfValueDelete);
//        System.out.println(listOfValue)
//      вариант №2
        Iterator<Integer> listOfValueIterator = listOfValue.iterator();
        while (listOfValueIterator.hasNext()) {
            if (!(listOfValueIterator.next() % 2 == 0)) {
                listOfValueIterator.remove();
            }
        }
        System.out.println(listOfValue);

        // Урок 8. Домашние задания
        System.out.println();
        System.out.println("Урок 8. Домашнее задание №1. Блок 3");

        // Урок 8. Домашние задания
        System.out.println();
        System.out.println("Урок 8. Домашнее задание №2. Блок 3");
        Set<MultiplicationVariant> exampleSheet = new HashSet<>();
        while (exampleSheet.size() < 15) {
            int multiplied = (int) (Math.random() * 10);
            int factor = (int) (Math.random() * 10);
            int result = multiplied * factor;
            String titleExample = multiplied + " * " + factor + " = " + result;

            exampleSheet.add(new MultiplicationVariant(titleExample, multiplied, factor));
        }
        byte count = 0;
        for (MultiplicationVariant multiplicationVariant : exampleSheet) {
            count++;
            System.out.print(count + ". ");
            System.out.println(multiplicationVariant);
        }

        // Урок 8. Домашние задания
        System.out.println();
        System.out.println("Урок 8. Домашнее задание №3. Блок 3");

        Set<Passport> listOfPassports = new HashSet<>();
        Passport Petrov = new Passport("123456789", "Петров", "Виктор", "Константинович", LocalDate.of(1955, 5, 31));
        Passport Ivanova = new Passport("987654321", "Иванова", "Людмила", "Васильевна", LocalDate.of(1953, 9, 17));
        Passport Sidorov = new Passport("123456789", "Сидоров", "Константин", "Викторович", LocalDate.of(1984, 12, 5));

        addPassport(listOfPassports, Petrov);
        addPassport(listOfPassports, Ivanova);
        System.out.println(Petrov);
        System.out.println(listOfPassports.size());
        addPassport(listOfPassports, Sidorov);
        System.out.println(Petrov);
        System.out.println(listOfPassports.size());

    }

    public static void addPassport(Set<Passport> listOfPassports, Passport passport) {
        Passport tempPassport = null;
        if (!listOfPassports.add(passport)) {
            tempPassport = findPassport(listOfPassports, passport.getPassportID());
        }
        if (!(tempPassport == null)) {
            tempPassport.updateTheDataThisPassport(passport);
        }
    }

    public static Passport findPassport(Set<Passport> listOfPassports, String passportID) {
        for (Passport passport : listOfPassports) {
            if (passport.getPassportID().equals(passportID)) {
                return passport;
            }
        }
        return null;
    }


    public static void addProduct(Set<Product> listOfProducts, Product product) {

        if (!listOfProducts.add(product)) {
            throw new RuntimeException("Продукт с таким именнем уже есть в списке!");
        }

    }

    public static void addRecipe(Set<Recipe> listOfRecipes, Recipe recipe) {
        if (!listOfRecipes.add(recipe)) {
            throw new RuntimeException("Рецепт с таким именнем уже есть в списке!");
        }
    }

    public static void delProduct(Set<Product> listOfProducts, Product product) {

        if (listOfProducts.remove(product)) {
            System.out.println("Продукт - /*" + product.getName() + "*/ удален из списка покупок");
        }
    }

    public static void markPurchase(Product product) {
        product.setPurchased(true);
    }

    public static void printDataTransport(Transport transport) {

        System.out.println("Автомобиль " + transport.getBrand() + " " + transport.getModel() +
                ", управляется водителем - " + transport.getDriver());
        System.out.println("Спонсоры:");
        System.out.println(transport.getSponsors());
        System.out.println("Механики:");
        System.out.println(transport.getMechanics());
        System.out.println();

    }

}