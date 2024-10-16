package zooProject;

public class Sican extends Animal {

    public Sican(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public double getDosage() {
        return agirlik * 0.05;
    }

    @Override
    public String getFeedSchedule() {
        return "Günde 4 kez yem verilir.";
    }
}
