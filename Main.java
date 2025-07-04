package VehicleRegistration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Collection<Vehicle> cars = new ArrayList<Vehicle>();

        System.out.println("Hello, Welcome to the Vehicle Registration App");
        System.out.println("1. Enter your vehicle details\n" +
                           "2. View your Vehicle Report\n" +
                           "3. Exit app");

        int menuOption = input.nextInt();

        while ((menuOption == 1) || (menuOption == 2)) {

            if(menuOption ==1){
                Vehicle vehicleObj = new Vehicle();
                int year;
                int millage;
                String make;
                String model;
                String plateNum = "";
                String vinNum;

                System.out.println("Enter the vehicle's make: ");
                make= input.next();

                System.out.println("Enter the vehicle's model: ");
                model = input.next();

                System.out.println("Enter the vheicle's vin number: ");
                vinNum = input.next();
                while(!(vinNum.length() == 17)){
                    System.out.println("Vin  number must be 17 characters long");
                    vinNum = input.next();
                }

                System.out.println("Enter 1. for old license number format, and 2. for new");
                int plateFormat = input.nextInt();
                if(plateFormat == 1){
                    System.out.println("Enter plate number: ");
                    plateNum = input.next();
                } else if (plateFormat ==2) {
                  System.out.println("Enter plate number: ");
                  plateNum = input.next();
                }

                System.out.println("Enter the vehicle's millage: ");
                millage = input.nextInt();

                System.out.println("Enter vehicle's year of manufacture: ");
                year = input.nextInt();

                vehicleObj.setMake(make);
                vehicleObj.setModel(model);
                vehicleObj.setPlateNumber(plateNum);
                vehicleObj.setVin(vinNum);
                vehicleObj.setYear(year);
                vehicleObj.setMillage(millage);

                cars.add(vehicleObj);
                    
            } else if (menuOption == 2) {
                if(cars.isEmpty()){
                    System.out.println("There are no cars captured");
                }else{
                    System.out.println("***************************************\n" +
                                        "VEHICLE REPORT\n" +
                                        "****************************************\n");
                    for(Vehicle vehicleObj: cars){
                        System.out.println("MAKE: " + vehicleObj.getMake() +
                                           "\nMODEL: " + vehicleObj.getModel() +
                                           "\nPLATENUMBER: " + vehicleObj.getPlateNumber() +
                                           "\nVIN: " + vehicleObj.getVin() +
                                           "\nYEAR: " + vehicleObj.getYear() +
                                           "\nMILLAGE: " + vehicleObj.getMillage());
                    }
                }

            }
            System.out.println("Hello, Welcome to the Vehicle Registration App");
            System.out.println("1. Enter your vehicle details\n" +
                               "2. View your Vehicle Report\n" +
                               "3. Exit app");
            menuOption = input.nextInt();
        }
        System.out.println("Thank you for using the Vehicle Registration App!");
    }
}