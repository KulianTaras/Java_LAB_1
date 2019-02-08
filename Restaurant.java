public class Restaurant {
    private String restaurant_cuisine;
    private int workers_amount;
    public static int city_restaurants_number;
    protected int annual_profit;
    protected int restaurant_world_top_place;
    public String restaurant_name;
    public int dishes_number_on_menu;
    public String restaurant_address;
    public int tables_number;

    public void setRestaurant_cuisine(String restaurant_cuisine){

        this.restaurant_cuisine = restaurant_cuisine;
    }

    public String getRestaurant_cuisine() {

        return this.restaurant_cuisine;
    }

    public void setWorkers_amount(int workers_amount){

        this.workers_amount = workers_amount;
    }

    public int getWorkers_amount(){

        return this.workers_amount;
    }

    public Restaurant(){
        System.out.println("Congratulations! You've created new restaurant.\n");
        city_restaurants_number++;
    }

    public Restaurant(String restaurant_name, String restaurant_address,int dishes_number_on_menu, int tables_number){
        this ();
        this.restaurant_name = restaurant_name;
        this.restaurant_address = restaurant_address;
        this.dishes_number_on_menu = dishes_number_on_menu;
        this.tables_number = tables_number;
    }

    public Restaurant(String restaurant_name, String restaurant_address,int dishes_number_on_menu, int tables_number,
                      String restaurant_cuisine, int workers_amount, int restaurant_world_top_place,
                      int annual_profit) {
        this (restaurant_name,restaurant_address,dishes_number_on_menu,tables_number);
        this.restaurant_cuisine = restaurant_cuisine;
        this.workers_amount = workers_amount;
        this.restaurant_world_top_place = restaurant_world_top_place;
        this.annual_profit = annual_profit;
    }

    public String toString() {
        String data = "Information about the restaurant:\n" +
                      "Name of restaurant: " + this.restaurant_name + "\n" +
                      "Address of restaurant: " + this.restaurant_address + "\n" +
                      "Number of dishes on menu: " + this.dishes_number_on_menu + "\n"+
                      "Number of tables: " + this.tables_number + "\n"+
                      "Cuisine of the restaurant: " + this.restaurant_cuisine + "\n" +
                      "Amount of workers at restaurant: " + this.workers_amount + "\n" +
                      "Place of the restaurant in world top: " + this.restaurant_world_top_place + "\n" +
                      "Annual profit of the restaurant " + this.annual_profit + "\n";
        return data;
    }
    public static int printStaticCity_restaurants_number(){
        System.out.println("Number of restaurants in the city for now: ");
        return city_restaurants_number;
    }

    public int printCity_restaurants_number(){
        System.out.println("Number of restaurants in the city for now: ");
        return city_restaurants_number;
    }

    public void resetValues(String restaurant_name, String restaurant_address,int dishes_number_on_menu, int tables_number,
                            String restaurant_cuisine, int workers_amount, int restaurant_world_top_place,
                            int annual_profit) {
        this.restaurant_name = restaurant_name;
        this.restaurant_address = restaurant_address;
        this.dishes_number_on_menu = dishes_number_on_menu;
        this.tables_number = tables_number;
        this.restaurant_cuisine = restaurant_cuisine;
        this.workers_amount = workers_amount;
        this.restaurant_world_top_place = restaurant_world_top_place;
        this.annual_profit = annual_profit;

    }
}
