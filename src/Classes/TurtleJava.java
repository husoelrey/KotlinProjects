package Classes;

class TurtleJava {
    public TurtleJava(String name) {
        this.name = name;
    }
    public TurtleJava(String name, Integer mAge) {
        this.name = name;
        age = mAge;
    }
    ///The 'this.name' keyword  refers to the 'name' variable defined in the class, while the 'name' keyword on the right refers to the constructor parameter
    /// if u don't want to use this keyword, put the letter 'm' in front of the parameter to avoid complexity

    String tailColor = "Brown";
    String shellColor = "Green";
    int age = 1;
    int footCount = 4;
    String name = "Tosbik";
    String gender = "Male";
    boolean isMarried = false;

    String makeSound() {
        return "WrOg WrOg WrOg WrOg";
    }

    void walk() {

    }

    boolean canSwim() {
        return false;
    }

}

class Main {
    public static void main(String[] args) {
        TurtleJava t1 = new TurtleJava("Tosbik", 11);
        TurtleJava t2 = new TurtleJava("Tosbağa");



    }
}