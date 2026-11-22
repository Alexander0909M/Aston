package Lesson_2_4_1;

public class Bowl {

    private int food;

    public Bowl(int food) {
        this.food = Math.max(food, 0);
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("Добавили " + amount + " еды в миску.");
        } else {
            System.out.println("Количество добавляемой еды должно быть положительным.");
        }
    }

    public boolean decreaseFood(int amount) {
        if (amount > 0 && food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }

    public int getFood() {
        return food;
    }
}

