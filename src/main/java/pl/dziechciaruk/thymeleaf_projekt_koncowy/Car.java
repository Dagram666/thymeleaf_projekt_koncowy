package pl.dziechciaruk.thymeleaf_projekt_koncowy;

public class Car {

    private String model;
   private  String mark;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Car() {
    }

    public Car(String mark,String model) {
        this.mark = mark;
        this.model = model;
    }
}
