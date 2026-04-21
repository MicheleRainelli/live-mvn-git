package demo.data;

public class Studente {
    private String nome;
    private String cognome;
    private int matricola;
    private String sesso;

    private int esamiPassato;

    public Studente(String nome, String cognome, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    public int getEsamiPassati() {
        return esamiPassati;
    }

    public void setEsamiPassati(int esamiPassati) {
        this.esamiPassati = esamiPassati;
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
