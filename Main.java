public class Main {
    public static void main(String[] args) {
        Character knight = new Character("Knight");
        knight.attack(); // Knight swings a sword!
        knight.defend(); // Using a shield to defend! Dodging to avoid attack! Creating a magic barrier for defense!

        Character wizard = new Character("Wizard");
        wizard.attack(); // Wizard casts a spell!
        wizard.defend(); // Creating a magic barrier for defense!

        Character archer = new Character("Archer");
        archer.attack(); // Archer shoots an arrow!
        archer.defend(); // Dodging to avoid attack!
    }
}
