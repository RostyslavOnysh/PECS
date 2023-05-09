package Model.Planes;

public class MilitaryPlane extends Plane{
    private String Country;

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public MilitaryPlane(String maker, String model) {
        super(maker, model);
    }

    public MilitaryPlane(String maker, String model, Integer year) {
        super(maker, model, year);
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
