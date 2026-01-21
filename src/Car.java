public class Car {

    static int COUNT = 0;
    String mark;
    String model;
    int year;
    String color;
    int hp;


    Car(String mark, String model, int year, String color, int hp) {
        this.mark = mark;
        this.model= model;
        this.year = year;
        this.color = color;
        this.hp = hp;
        COUNT++;
    }

    Car() {

    }



    void printCar() {
        System.out.println(this.mark + " " + this.model + " " + this.year + " " + this.color + " " + this.hp);
    }


    boolean equals(Car car) {
        return  (this.mark.equals(car.mark) && this.model.equals(car.model));
    }


    static void test() {
        COUNT++;
    }


}
