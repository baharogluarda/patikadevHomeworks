package zooProject;

public class Kaplan extends Animal {

    public Kaplan(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public double getDosage() {
        return agirlik * 0.15;
    }

    @Override
    public String getFeedSchedule() {
        return "Günde 2 kez yem verilir.";
    }
}

