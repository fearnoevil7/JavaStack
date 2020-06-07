
class ProjectClassTest {
    public static void main(String[] args) {
        ProjectClassPortfolio myPortfolio = new ProjectClassPortfolio();
        // Project myProjects = new Project();
        // Project project = new Project();
        Project project1 = new Project();
        Project project2 = new Project("Janitorial", 15.00);
        Project project3 = new Project("Coding", "Coding Dojo Bootcamp", 10.00);
        System.out.println(project1);
        System.out.println(project2);
        System.out.println(project3);
        myPortfolio.addToPortfolio(project1);
        myPortfolio.addToPortfolio(project2);
        myPortfolio.addToPortfolio(project3);
        // project1.elevatorPitch();
        // project2.elevatorPitch();
        // project3.elevatorPitch();
        myPortfolio.getPortfolio();
        myPortfolio.getCost();
        // myProjects.getCost();
    }
}