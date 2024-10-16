package zooProject;

public class Main {
    public static void main(String[] args) {
        Animal at = new At("At", 500.0, 5);
        printInfo(at);

        Animal kaplan = new Kaplan("Kaplan", 300.0, 3);
        printInfo(kaplan);

        Animal sican = new Sican("Sıçan", 50.0, 2);
        printInfo(sican);
    }

    public static void printInfo(Animal animal) {
        System.out.println("Tür: " + animal.getTurAdi());
        System.out.println("Ağırlık: " + animal.getAgirlik());
        System.out.println("Yaş: " + animal.getYas());
        System.out.println("İlaç Dozu: " + animal.getDosage() + " ml");
        System.out.println("Yem Zamanı: " + animal.getFeedSchedule());
        System.out.println("--------------------------");
    }
}

