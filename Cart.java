import java.util.Scanner;

// display various laptop for user choose
// display whether to customize
// ask to cart out or continue select another product
// once done, display prize 

// Screen e.g. 1080p, 4k, Touchscreen
// RAM e.g. 8GB, 16 GB, 32GB
// HDD e.g. 1TB HDD, 128GB SSD, 256GB SSD, 512 GB SSD
// Processor e.g. i3, i5, i7
// Each component will have varying price

public class Cart{
    
    static int executeLaptop(String laptop) {
        if (laptop.equals("Latitude")) {
          return 3000;
        }
        if (laptop.equals("Inspirion")) {
          return 2000;
        }
        if (laptop.equals("Alienware")) {
          return 4000;
        }
        return 0;
      }
    
        static int executeScreen(String screen) {
            if (screen.equals("1080p")) {
              return 200;
            }
            if (screen.equals("4K")) {
              return 300;
            }
            if (screen.equals("Touchscreen")) {
              return 400;
            }
            return 0;
          }
        
          static int executeRam(String ram) {
            if (ram.equals("8GB")) {
              return 500;
            }
            if (ram.equals("16GB")) {
              return 600;
            }
            if (ram.equals("32GB")) {
              return 700;
            }
            return 0;
          }
        
          static int executeHdd(String hdd) {
            if (hdd.equals("1TB HDD")) {
              return 500;
            }
            if (hdd.equals("128GB SSD")) {
              return 600;
            }
            if (hdd.equals("256GB SSD")) {
              return 700;
            }
            if (hdd.equals("512GB SSD")) {
              return 800;
            }
            return 0;
          }
        
          static int executeCPU(String cpu) {
            if (cpu.equals("i3")) {
              return 900;
            }
            if (cpu.equals("i5")) {
              return 1000;
            }
            if (cpu.equals("i7")) {
              return 1500;
            }
            return 0;
          }

 


public static void main(String[] args) {
    // System.out.println("Plese select a product");
    // System.out.println("Screen:");
    // System.out.println("RAM");
    // System.out.println("HDD");
    // System.out.println("Processor");
    // System.out.println("total price");

    int totalPrice = 0;
    // 1. Choose a Laptop
    String[] laptopOpt = { "Latitude", "Inspirion", "Alienware" };

    int laptopPrice = 0;
    Scanner laptopInput = new Scanner(System.in);

    System.out.println("Plese select a product");

    for (int i = 0; i < laptopOpt.length; i++) {
      System.out.println(i + " . " + laptopOpt[i]);
    }

    Integer laptopIndex = Integer.parseInt(laptopInput.nextLine());

    System.out.println("You have chosen :" + laptopOpt[laptopIndex]);
    laptopPrice = executeLaptop(laptopOpt[laptopIndex]);

    System.out.println("Starting price " + laptopPrice );
    ///// End of Choosing Screen  /////////////////

    // 2. Choose a Screen
    String[] screenOpt = { "1080p", "4K", "Touchscreen" };

    int screenPrice = 0;
    Scanner screenInput = new Scanner(System.in);

    System.out.println("Plese select the type of screen");

    for (int i = 0; i < screenOpt.length; i++) {
      System.out.println(i + " . " + screenOpt[i]);
    }

    Integer screenIndex = Integer.parseInt(screenInput.nextLine());

    System.out.println("You have chosen :" + screenOpt[screenIndex]);
    screenPrice = executeScreen(screenOpt[screenIndex]);

    System.out.println("the type of  screen price is " + screenPrice + " and will be added to the final price" );
    ///// End of Choosing Screen  /////////////////


 // 2. Choose a RAM
 String[] ramOpt = { "8GB", "16GB", "32GB" };

 int ramPrice = 0;
 Scanner ramInput = new Scanner(System.in);

 System.out.println("Plese select the type of screen");

 for (int i = 0; i < ramOpt.length; i++) {
   System.out.println(i + " . " + ramOpt[i]);
 }

 Integer ramIndex = Integer.parseInt(ramInput.nextLine());

 System.out.println("You have chosen :" + ramOpt[ramIndex]);
 ramPrice = executeRam(ramOpt[ramIndex]);

 System.out.println("the type of RAM price is " + ramPrice + " and will be added to the final price" );
 ///// End of Choosing RAM  /////////////////

// 3. Choose a HDD
String[] hddOpt = { "1TB HDD", "128GB SSD", "256GB SSD", "512GB SSD" };

int hddPrice = 0;
Scanner hddInput = new Scanner(System.in);

System.out.println("Plese select the type of RAM");

for (int i = 0; i < hddOpt.length; i++) {
  System.out.println(i + " . " + hddOpt[i]);
}

Integer hddIndex = Integer.parseInt(hddInput.nextLine());

System.out.println("You have chosen :" + hddOpt[hddIndex]);
hddPrice = executeHdd(hddOpt[hddIndex]);

System.out.println("the type of RAM price is " + hddPrice + " and will be added to the final price" );
///// End of Choosing CPU  /////////////////

// 4. Choose a HDD
String[] cpuOpt = { "i3", "i5", "i7" };

int cpuPrice = 0;
Scanner cpuInput = new Scanner(System.in);

System.out.println("Plese select the type of Processor");

for (int i = 0; i < cpuOpt.length; i++) {
  System.out.println(i + " . " + cpuOpt[i]);
}

Integer cpuIndex = Integer.parseInt(cpuInput.nextLine());

System.out.println("You have chosen :" + cpuOpt[cpuIndex]);
cpuPrice = executeHdd(cpuOpt[cpuIndex]);

System.out.println("the type of Procesor price is " + cpuPrice + " and will be added to the final price" );
///// End of Choosing CPU  /////////////////

// 5. Calculate total price
   

   totalPrice = laptopPrice + screenPrice + ramPrice + hddPrice + cpuPrice;
   System.out.println("Total Price of your laptop is RM " + totalPrice  );
///// Calculate total price  /////////////////

}




}