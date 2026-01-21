public class Fifth {


    public static void main(String[] args) {

        Car c = new Car();
//        c.mark = "Mercedes";
//        c.model = "E500";
//        c.hp = 300;
////        c.color = "Black";
//        c.year = 2019;

        c.printCar();

        Car c3 = new Car();
        c3.mark = "Mercedes";
        c3.model = "E500";
        c3.hp = 300;
//       c3.color = "Black";
        c3.year = 2019;


        Car c2 = new Car();
        c2.mark = "BMW";
        c2.model = "E46";
        c2.hp = 210;
        c2.color = "Red";
        c2.year = 2002;


        Car lada = new Car("Lada", "Niva", 2020, "Ag", 75);

//        c.printCar();
//        c2.printCar();
//        lada.printCar();
//
//
//        Car[] cars = {c, c2, c3, lada};
//
//        for (Car s : cars) {
//            s.printCar();
//        }



    }


}
