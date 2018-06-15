package workingWithObjects;

public class Vehicle {
    private String name;
    private String model;
    private int litres;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getLitres() {
        return litres;
    }

    public void setLitres(int litres) {
        this.litres = litres;
    }

    @Override
    public int hashCode() {
        int vehicleCode = 10;

        return (vehicleCode * this.getLitres());
    }

    @Override
    public boolean equals(Object object) {
        Vehicle vehicle = (Vehicle) object; //casting to vehicle
        boolean isEqual = this.getName().equals(vehicle.getName()) &&
                this.getModel().equals(vehicle.getModel()) &&
                this.getLitres() == vehicle.getLitres();

        return isEqual;
    }

    //v1.toString();

    @Override
    public String toString() {
        return "My vehicle has a capacity of " + this.getLitres() + " litres";
    }
}
