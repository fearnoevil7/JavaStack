import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
public class ProjectClassPortfolio {
    double sum3 = 0;
    ArrayList<Double> prices = new ArrayList<Double>();
    ArrayList<Project> allMyProjects = new ArrayList<Project>();
    HashMap<String, Double> allProjects = new HashMap<String, Double>();
    public void addToPortfolio(Project project) {
        System.out.println(project);
        System.out.println(project.name);
        System.out.println(project.description);
        System.out.println(project.initialCost);
        allMyProjects.add(project);
        // System.out.println(prices);
        System.out.println("Yayyyyyy   Success!!!!!!!");
        System.out.println(allMyProjects);

        // prices.add(price);
    }
    // public void getPortfolioCost() {
    //     for (int i = 0; i < allMyProjects.size(); i++) {
    //         Object aProject = allMyProjects.get(i);
    //         System.out.println("Testing....     " + allMyProjects.get(i));
    //         // System.out.println("Yay Yay Yay successfully grrabbed initial cost" + aProject.initialCost);
    //     }
    // }
    public void getPortfolio() {
        double sum2 = 0;
        // Set<String> projects = allProjects.keySet();
        // for(String project : projects) {
        //     System.out.println(project);
        //     System.out.println(allProjects.get(project));
        //     sum2 += allProjects.get(project);
        //     System.out.println("Success!!!!!!!");
        // }
        for (int i = 0; i < allMyProjects.size(); i++) {
            Project Project1 = allMyProjects.get(i);
            System.out.println("Testing....     " + allMyProjects.get(i));
            System.out.println(Project1.name + " " + Project1.initialCost + " : " + Project1.description);
        }
        System.out.println(" Yesss   Successfully retrieved total cost of portfolio......" + sum2 );
    }
    public double getCost() {
        for (int i = 0; i < allMyProjects.size(); i++) {
            Project project2 = allMyProjects.get(i);
            sum3 += project2.initialCost;
        }
        System.out.println("Successfully retrieved total cost of portfolio......" + sum3 );
        return sum3;
    }
}