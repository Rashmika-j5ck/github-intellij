package LW_06;

public class Cat extends Pet {
    private String coatColor; // Added for Question 4

    @Override
    public String speak() {
        return "Meow!";
    }

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }
}