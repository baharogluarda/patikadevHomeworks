package zooProject;

public class At extends Animal {

    public At(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public double getDosage() {
        return agirlik * 0.1;
    }

    @Override
    public String getFeedSchedule() {
        return "Günde 3 kez yem verilir";
    }
}
