public abstract class Prodotto {

    //Variabili
    private String tipoProdotto;
    private String produttore;
    private String modello;
    private int idProdotto;
    private double prezzoVendita;
    private double prezzoAcquisto;


    //Costruttore
    public Prodotto(String tipoProdotto, String produttore, String modello, int idProdotto, double prezzoVendita, double prezzoAcquisto){
        this.tipoProdotto = tipoProdotto;
        this.produttore = produttore;
        this.modello = modello;
        this.idProdotto = idProdotto;
        this.prezzoVendita = prezzoVendita;
        this.prezzoVendita = prezzoVendita;
    }


    //Getter
    public String getTipoProdotto() {
        return tipoProdotto;
    }

    public String getProduttore() {
        return produttore;
    }

    public String getModello() {
        return modello;
    }

    public int getIdProdotto() {
        return idProdotto;
    }

    public double getPrezzoVendita() {
        return prezzoVendita;
    }

    public double getPrezzoAcquisto() {
        return prezzoAcquisto;
    }

}
