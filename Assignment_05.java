
class InvalidUserException extends Exception {
    public InvalidUserException(String message) {
        super(message);
    }
}

class User {
    private String city;
    private String vehicleType;

    public User(String city, String vehicleType) {
        this.city = city;
        this.vehicleType = vehicleType;
    }

    public void validateUser() throws InvalidUserException {
        if (!(city.equals("Pune") || city.equals("Mumbai") || city.equals("Bangalore") || city.equals("Chennai"))){
            throw new InvalidUserException("User must stay in Pune, Mumbai, Bangalore, or Chennai.");
        }
        if (!vehicleType.equals("4-wheeler")) {
            throw new InvalidUserException("User must have a 4-wheeler vehicle.");
        }
    }
}

public class UserValidationApp {
    public static void main(String[] args) {
        try {
            String userCity = "Pune";
            String userVehicleType = "4-wheeler";

            User user = new User(userCity, userVehicleType);
            user.validateUser();
            System.out.println("User is valid.");
        } catch (InvalidUserException e) {
            System.err.println("Invalid User: " + e.getMessage());
        }
    }
}
