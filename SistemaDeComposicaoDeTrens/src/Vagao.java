public class Vagao{
    private int id;
    private Trem trem;
    private int capacidadeCarga;

    public Vagao(int id, Trem trem, int capacidadeCarga) {
        this.id = id;
        this.trem = trem;
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getId() {
        return id;
    }

    public Trem getTrem() {
        return trem;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    @Override
    public String toString() {
        return "Vagao: id=" + id + ", trem=" + trem + ", capacidadeCarga=" + capacidadeCarga;
    }
}