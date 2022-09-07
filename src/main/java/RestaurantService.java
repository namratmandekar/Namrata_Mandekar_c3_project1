import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private static final List<Restaurant> restaurants = new ArrayList<>();

    public Restaurant findRestaurantByName(String restaurantName) throws  restaurantNotFoundException {
            for(Restaurant restau : restaurants)
            {
                if(restau.getName().equals(restaurantName))
                {
                    return restau;
                }
            }

        throw new restaurantNotFoundException(restaurantName);

    }





   public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public void removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}
