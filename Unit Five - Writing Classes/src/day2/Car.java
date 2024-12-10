package day2;

public class Car {
    private String make;
    private String model;
    private int year;
    private double mileage;

    public Car(String make, String model, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public void setMake(String newMake) {
        make = newMake;
    }

    public void setMileage(double newMileage) {
        mileage = newMileage;
    }
    
    public void setModel(String newModel) {
        model = newModel;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    public String getMake() {
        return make;
    }

    public double getMileage() {
        return mileage;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void displayCarDetails() {
        System.out.println("Make: "+ make + ", Model: " + model + ", Year: "+ year + ", Mileage: "+ mileage);
    }

    public void drive(double milesDriven) {
        mileage += milesDriven;
        System.out.println(mileage);
    }
}
