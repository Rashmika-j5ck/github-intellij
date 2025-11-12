package LW_06;


public class Dog extends Pet {
    private double weight; // Added for Question 4

    @Override
    public String speak() {
        return "Woof! Woof!";
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}