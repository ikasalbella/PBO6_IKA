package Tugas.PBO6.IKA;

    public abstract class BangunDatar {
    String warna;
    
    String getwarna() {
        return warna;
    }

    void setWarna(String warna) {
        this.warna = warna;
    }

    abstract float getLuas();
}

