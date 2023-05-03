public class Delegacion {
    private String pais;
    private int nroDeportistas;
    private int medallasOro;
    private int medallasPlata;
    private int medallasBronce;

    //GET Y SET


    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {

        this.pais = pais;

    }

    public void setNroDeportistas(int nroDeportistas) {
        if (nroDeportistas<0){
            nroDeportistas =0;
        }
        this.nroDeportistas = nroDeportistas;
    }
    public int getNroDeportistas() {
        return nroDeportistas;
    }
    public int getMedallasOro() {
        return medallasOro;
    }

    public void setMedallasOro(int medallasOro) {
        if (medallasOro<0){
            medallasOro =0;
        }
        this.medallasOro = medallasOro;
    }

    public int getMedallasPlata() {
        return medallasPlata;
    }

    public void setMedallasPlata(int medallasPlata) {
        if (medallasPlata<0){
            medallasPlata =0;
        }
        this.medallasPlata = medallasPlata;
    }

    public int getMedallasBronce() {
        return medallasBronce;
    }

    public void setMedallasBronce(int medallasBronce) {
        if (medallasBronce<0){
            medallasBronce =0;
        }
        this.medallasOro = medallasOro;
        this.medallasBronce = medallasBronce;
    }

    public Delegacion(String pais, int nroDeportistas, int medallasOro, int medallasPlata, int medallasBronce) {
        this.pais = pais;
        this.nroDeportistas = nroDeportistas;
        this.medallasOro = medallasOro;
        this.medallasPlata = medallasPlata;
        this.medallasBronce = medallasBronce;
    }

    //METODOS

    public String MostrarDelegacion(){
        return ("Pais"+getPais()+"tiene "+getNroDeportistas()+"deportista/as y obtubo un total de "+getMedallasOro()+"medallas de oro,"+getMedallasPlata()+"medallas de plata y "+getMedallasBronce()+"medallas de bronce en total "+CalcularCantidadMedallas()+"medallas");

    }
    public int CalcularCantidadMedallas(){
        return (medallasBronce+medallasOro+medallasPlata);
    }

}
