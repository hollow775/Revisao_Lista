public class Celula {
    private Celula proxima;
    private Object elemento;

    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }

    public Object getElemento() {
        return elemento;
    }
    Celula(Celula proxima, Object elemento){
        this.proxima = proxima;
        this.elemento = elemento;
    }
    Celula(Object elemento){
        this.elemento = elemento;
    }
}
