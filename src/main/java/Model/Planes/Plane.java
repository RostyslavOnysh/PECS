package Model.Planes;

public abstract class Plane {
    private String maker;
    private String model;
    private Integer year;

    public Plane (String maker,String model) {
        this.maker = maker;
        this.model = model;
    }

    public Plane (String maker,String model,Integer year) {
        this.maker = maker;
        this.model = model;
        this.year = year;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
