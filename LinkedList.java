public class LinkedList {
    private Celula primeira;
    private Celula ultima;
    private int totalElementos = 0;

    void AdicionaComeco(Object elemento){
        Celula nova = new Celula(this.primeira , elemento);
        this.primeira = nova;
        if(this.totalElementos ==0){
            this.ultima = this.primeira;
        }
        this.totalElementos++;
    }
    void adiciona(Object elemento){
        if(this.totalElementos == 0){
            this.AdicionaComeco(elemento);
        }else{
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            this.ultima = nova;
            this.totalElementos++;
        }
    }
    void adiciona(int pos, Object elemento){
        if(pos == 0){
            this.AdicionaComeco(elemento);
        }else if(pos == this.totalElementos){
            this.adiciona(elemento);
        }else{
            Celula anterior = this.PegaCelula(pos-1);
            Celula nova = new Celula(anterior.getProxima(), elemento);
            anterior.setProxima(nova);
            this.totalElementos++;
        }
    }
    boolean PosicaoOcupada(int pos){
        return((pos >= 0)&&(pos < this.totalElementos));
    }
    Celula PegaCelula(int pos){
        if(!this.PosicaoOcupada(pos)){
            throw new IllegalArgumentException("Posicao nao Existe");
        }else{
            Celula atual = this.primeira;
            for(int i=0; i < pos; i++){
                atual = atual.getProxima();
            }
            return(atual);
        }
    }
    Object Pega(int posicao){
        return(this.PegaCelula(posicao).getElemento());
    }
    void removeDoComeco(){
        if(!this.PosicaoOcupada(0)){
            throw new IllegalArgumentException("Posição não Existe");
        }else{
            this.primeira = this.primeira.getProxima();
            this.totalElementos--;
            if(this.totalElementos == 0){
                this.ultima = null;
            }
        }
    }
    boolean Contem(Object elemento){
        Celula atual = this.primeira;
        while(atual!=null){
            if(atual.getElemento().equals(elemento)){
                return(true);
            }
            atual = atual.getProxima();
        }
        return(false);
    }
    int Tamanho(){
        return(this.totalElementos);
    }
}
