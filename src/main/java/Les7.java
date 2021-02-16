public class Les7 {
    private final static int SOME_FOOD = 30;

    public static void main(String[] args) {
        Plate plate = new Plate(10);
        plate.info();
        plate.addFood(SOME_FOOD);

        Cat[] arrCats = {new Cat("Барсик", 4), new Cat("Борис", 10),
                new Cat("Феликс", 8), new Cat("Мурзик", 12),
                new Cat("Васька", 15), new Cat("Мур", 7)};

        //кормление котов досыта, в случае нехватки пищи добавление её в тарелку
        while (!feedHungriest(arrCats, plate)) {
            plate.addFood(SOME_FOOD);
        }

        plate.info();

        System.out.println("\nВсе коты накормлены:");
        for (Cat cat : arrCats) {
            cat.printSatietyInfo();
        }
    }

    private static boolean feedHungriest(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            if (cat.isHungry() && !cat.eat(plate))
                return false;
        }
        return true;
    }
}