import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 4
        List<House> houses = new ArrayList<House>();

        House house = houses.getFirst();

        if(houses.isEmpty()) {
            throw new NoHousesExeption("There are no houses");
        }
        for(House h : houses) {
            if(h == house) {
                continue;
            }
            if(h.getHeight() / h.getCountFloors() > house.getHeight() / house.getCountFloors()) {
                house = h;
            }
        }
        house.Details();
    }
    public static House enterHouse() {
        Scanner sc = new Scanner(System.in);

        double height, weight;
        String adress, ownerName;
        int floors;

        try {
            height = sc.nextDouble();
            weight = sc.nextDouble();
            adress = sc.next();
            ownerName = sc.next();
            floors = sc.nextInt();
            return new House(height, weight, adress, floors,
                    ownerName);
        }catch (Exception e) {
            System.out.println("Invalid value");
            System.exit(0);

        }
        return null;
    }
}