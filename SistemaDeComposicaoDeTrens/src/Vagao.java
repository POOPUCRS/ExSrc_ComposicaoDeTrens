public class Vagao{
    private int id;
    private Trem trem;
    private int capacidadeCarga;

    public Vagao(int id, int capacidadeCarga) {
        this.id = id;
        this.trem = null;
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getId() {
        return id;
    }

    public Trem getTrem() {
        return trem;
    }

    public void vincula(Trem t){
        trem = t;
    }

    public void desvincula(){
        trem = null;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    @Override
    public String toString() {
        return "Vagao: id=" + id + ", trem=" + trem + ", capacidadeCarga=" + capacidadeCarga;
    }
}