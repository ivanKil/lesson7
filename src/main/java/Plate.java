import java.util.HashMap;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        //Задание 2 Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
        if (food >= n) {
            food -= n;
            return true;
        } else
            return false;
    }

    public void info() {
        System.out.println("Еды в тарелке: " + food);
    }

    //Задание 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
    public void addFood(int someFood) {
        food = food + someFood;
        System.out.println("\nДобавили в тарелку " + someFood + " еды. Теперь в тарелке " + food + " еды");
    }
}
