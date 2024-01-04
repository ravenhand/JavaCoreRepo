package task3;

public class Donut {
    private String alak;
    private int meret;
    private String izesites;
    private String alapanyag;
    private String diszites;

    public Donut(String alak, int meret, String izesites, String alapanyag, String diszites) {
        this.alak = alak;
        this.meret = meret;
        this.izesites = izesites;
        this.alapanyag = alapanyag;
        this.diszites = diszites;
    }

    public String getAlak() {
        return alak;
    }

    public void setAlak(String alak) {
        this.alak = alak;
    }

    public int getMeret() {
        return meret;
    }

    public void setMeret(int meret) {
        this.meret = meret;
    }

    public String getIzesites() {
        return izesites;
    }

    public void setIzesites(String izesites) {
        this.izesites = izesites;
    }

    public String getAlapanyag() {
        return alapanyag;
    }

    public void setAlapanyag(String alapanyag) {
        this.alapanyag = alapanyag;
    }

    public String getDiszites() {
        return diszites;
    }

    public void setDiszites(String diszites) {
        this.diszites = diszites;
    }

    @Override
    public String toString() {
        return "Donut{" +
                "alak='" + alak + '\'' +
                ", meret=" + meret +
                ", izesites='" + izesites + '\'' +
                ", alapanyag='" + alapanyag + '\'' +
                ", diszites='" + diszites + '\'' +
                '}';
    }
}

