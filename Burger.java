package andrijasevic_burger;

public class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayonnaise;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("You created a regular burger with the following ingredients:");
        System.out.println(bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayonnaise);
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = "";
        System.out.println("You created a diet burger with the following ingredients:");
        System.out.println(bun + ", " + meat + ", " + cheese + ", " + greens);
    }

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise, String extraMeat) {
        this.bun = bun;
        this.meat = meat + ", " + extraMeat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("You created a burger with double meat and the following ingredients:");
        System.out.println(bun + ", " + this.meat + ", " + cheese + ", " + greens + ", " + mayonnaise);
    }
}








