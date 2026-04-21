package demo.data;

public class Studente {
    private String nome;
    private String cognome;
    private int matricola;
    private String sesso;


    private int esamiPassati_1;


    public Studente(String nome, String cognome, int matricola) {
        this.nome = nome;
        //asdasda
        this.cognome = cognome;
        this.matricola = matricola;
    }

    public int getEsamiPassati() {
        return esamiPassati_1;
    }

    public void setEsamiPassati(int esamiPassati) {
        this.esamiPassati_1 = esamiPassati;
    }


    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getMatricola() {
        return matricola;
    }
}
