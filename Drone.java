
package com.mycompany.drone;

class Drone {

    int energi;
    int kecepatan;
    int ketinggian;
    String merk;
    
    void terbang() {
        
        energi--;
        if (energi > 10) {
            ketinggian++;
            System.out.println("Drone terbang...");
        }
        
        else {
            System.out.println("Drone tidak bisa terbang...");
        }
        
    }
    
    void matikanMesin() {
        
        if (ketinggian > 0) {
            System.out.println("Sedang terbang. Mesin tidak bisa dimatikan...");
        }
        
        else {
            System.out.println("Mesin dimatikan...");
        }
        
    }
    
    void turun() {
        
        ketinggian--;
        energi--;
        System.out.println("Drone turun...");
        
    }
    
    public static void main(String[] args) {
        MainDrone Drone;
        Drone = new MainDrone();
        
        Drone.energi = 17;
        Drone.ketinggian = 201;
        Drone.kecepatan = 54;
        
        Drone.terbang();
    }
}
