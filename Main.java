public class Main {

    public static void main(String[] args) {

        Restaurant object1 = new Restaurant();

        Restaurant object2 = new Restaurant("flowme","Stepana Bandera st. 45",
                74, 41);

        System.out.println(object2.printCity_restaurants_number());

        Restaurant object3 = new Restaurant("Varenkyhi tut'", " Volodymyra Velykoho st. 23",
                43,30, "Ukrainian", 12, 999,
                10000);

        System.out.println(object1.toString());

        System.out.println(object2.toString());

        System.out.println(object3.toString());

        System.out.println(Restaurant.printStaticCity_restaurants_number());
    }
}
