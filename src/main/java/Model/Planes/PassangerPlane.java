package Model.Planes;

public class PassangerPlane extends Plane{
    private int Capacity;
    public PassangerPlane(String maker, String model) {
        super(maker, model);
    }

    public PassangerPlane(String maker, String model, Integer year) {
        super(maker, model, year);
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
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
