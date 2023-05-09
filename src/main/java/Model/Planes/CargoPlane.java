package Model.Planes;

public class CargoPlane extends Plane {
    private double maxWeight;


    public CargoPlane(String maker, String model) {
        super(maker, model);
    }

    public CargoPlane(String maker, String model, Integer year) {
        super(maker, model, year);
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String getMaker() {
        return super.getMaker();
    }

    @Override
    public void setMaker(String maker) {
        super.setMaker(maker);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public Integer getYear() {
        return super.getYear();
    }

    @Override
    public void setYear(Integer year) {
        super.setYear(year);
    }
}
