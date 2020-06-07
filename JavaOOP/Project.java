import java.util.ArrayList;
public class Project {
    public String name;
    public String description;
    public Double initialCost;
    double sum = 0.0;
    ArrayList<Double> prices = new ArrayList<Double>();
    ProjectClassPortfolio portfolio = new ProjectClassPortfolio();
    public void setProjectName(String name) {
        this.name = name;
    }
    public void setProjectDescription(String description) {
        this.description = description;
    }
    public double setProjectCost(double cost) {
        this.initialCost = cost;
        double price2 = cost;
        return price2;
    }
    public Project() {
        this.name = "Default Generic Project";
        this.description = "Default Generic Project Description";
        this.initialCost = 20.00;
        double cost = this.initialCost;
        // portfolio.addToPortfolio(this.name, this.description, this.intitialCost);
        prices.add(cost);
        sum += cost;

    }
    public Project(String name, Double cost) {
        this.name = name;
        this.initialCost = setProjectCost(cost);
        // double price = this.intitialCost;
        this.description = "Default Generic Project Description";
        // portfolio.addToPortfolio(this.name, this.description, this.intitialCost);
    }
    public Project(String name, String description, Double cost) {
        this.name = name;
        this.initialCost = setProjectCost(cost);
        this.description = description;
        
        // double price = this.intitialCost;
        // portfolio.addToPortfolio(this.name, this.description, this.intitialCost);
        // portfolio.getPortfolioCost();
    }
    public void elevatorPitch() {
        // System.out.println(this.name + " : " + this.description);
        System.out.println(this.name + " " + (this.initialCost) + " : " + this.description);
    }
}