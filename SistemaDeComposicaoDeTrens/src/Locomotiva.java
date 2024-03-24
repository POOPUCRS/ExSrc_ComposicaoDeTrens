public class Locomotiva {
    private int id;
    private Trem trem;
    private int capacidadeCarga;
    private int nroMaxVagoes;

    public Locomotiva(int id, int capacidadeCarga, int nroMaxVagoes) {
        this.id = id;
        this.trem = null;
        this.capacidadeCarga = capacidadeCarga;
        this.nroMaxVagoes = nroMaxVagoes;
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

    public int getNroMaxVagoes() {
        return nroMaxVagoes;
    }

    @Override
    public String toString() {
        return "Locomotiva: id=" + id + ", trem=" + trem + ", capacidadeCarga=" + capacidadeCarga + ", nroMaxVagoes="
                + nroMaxVagoes;
    };
}
