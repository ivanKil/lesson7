public class Cat {
    private String name;
    private int appetite;
    private boolean full = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean eat(Plate p) {
        //Задание 3 Если коту удалось покушать (хватило еды), сытость = true.
        full = p.decreaseFood(appetite);
        System.out.println("Кот " + name + (full ? " наелся, съев " + appetite + " еды" : " остался голодным"));
        return full;
    }

    public boolean isHungry() {
        return !full;
    }

    public void printSatietyInfo() {
        System.out.println("Кот " + name + (full ? " сыт" : " голоден"));
    }
}
