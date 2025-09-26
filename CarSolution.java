import java.util.Scanner;

abstract class Car {
    protected boolean isSedan;
    protected int seats;
    protected int mileage;

    public Car(boolean isSedan, int seats, int mileage) {
        this.isSedan = isSedan;
        this.seats = seats;
        this.mileage = mileage;
    }

    public String getIsSedan() {
        return isSedan ? "is Sedan" : "is not Sedan";
    }

    public String getSeats() {
        return "is " + seats + "-seater";
    }

    public abstract String getMileage();
}

class WagonR extends Car {
    public WagonR(int mileage) {
        super(false, 4, mileage);
    }

    @Override
    public String getMileage() {
        return mileage + " kmpl";
    }
}

class HondaCity extends Car {
    public HondaCity(int mileage) {
        super(true, 4, mileage);
    }

    @Override
    public String getMileage() {
        return mileage + " kmpl";
    }
}

class InnovaCrysta extends Car {
    public InnovaCrysta(int mileage) {
        super(false, 6, mileage);
    }

    @Override
    public String getMileage() {
        return mileage + " kmpl";
    }
}

public class CarSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        int mileage = scan.nextInt();
        scan.close();

        Car car = null;
        String carName = "";

        switch (option) {
            case 0:
                car = new WagonR(mileage);
                carName = "WagonR";
                break;

            case 1:
                car = new HondaCity(mileage);
                carName = "HondaCity";
                break;

            case 2:
                car = new InnovaCrysta(mileage);
                carName = "InnovaCrysta";
                break;

            default:
                System.out.println("Invalid input! \nPress 0 (WagonR) \nPress 1 (HondaCity) \nPress 2 (InnovaCrysta)");
                return;
        }

        System.out.println("A " + carName + " " + car.getIsSedan() + ", "
                + car.getSeats() + ", and has a mileage of around "
                + car.getMileage() + ".");
    }
}
