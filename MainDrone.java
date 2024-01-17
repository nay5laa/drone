package com.mycompany.drone;

class MainDrone {
    
    int energi;
    int kecepatan;
    int ketinggian;
    String merk;
    
    void terbang() {
        
        energi--;
        if (energi > 10) {
            ketinggian++;
            System.out.println("Ketinggian: " + ketinggian);
            System.out.println("Energi: " + energi);
            System.out.println("Drone terbang...");
        }
        
        else {
            System.out.println("Drone tidak bisa terbang. Energi terlalu lemah...");
            System.out.println("Drone jatuh...");
            System.out.println("Ketinggian: " + ketinggian);
            System.out.println("Energ: " + energi);
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
        System.out.println("ketinggian: " + ketinggian);
        System.out.println("Energi: " + energi);
        
    }
    
    void belok() {
        energi--;
        System.out.println("Drone belok...");
        System.out.println("Ketinggian: " + ketinggian);
        System.out.println("Energi: " + energi);
    }
    
    void maju() {
        energi--;
        System.out.println("Drone maju...");
        System.out.println("Ketinggian: " + ketinggian);
        System.out.println("Energi: " + energi);
        System.out.println("Kecepatan: " + kecepatan);
        kecepatan++;
    }
    
    void mundur() {
        energi--;
        System.out.println("Drone mundur...");
        System.out.println("Ketinggian: " + ketinggian);
        System.out.println("Energi: " + energi);
        System.out.println("Kecepatan: " + kecepatan);
        kecepatan++;
    }
    
}
