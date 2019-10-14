package ba.unsa.etf.rpr;

public class Sat {
    private int sati, minute, sekunde;
    public void postavi(int sati, int minute, int sekunde){
        this.sati = sati;
        this.minute = minute;
        this.sekunde = sekunde;
    }
    public Sat(int sati, int minute, int sekunde){
        postavi(sati, minute, sekunde);
    }
    public void sljedeci(){
        this.sekunde++;
        if(this.sekunde==60){ this.sekunde=0; this.minute++; }
        if(this.minute==60){ this.minute=0; this.sati++; }
        if(this.sati==24) this.sati=0;
    }
    public void prethodni(){
        this.sekunde--;
        if(this.sekunde==-1) { this.sekunde=59; this.minute--; }
        if(this.minute==-1) { this.minute=59; this.sati--; }
        if(this.sati==-1) this.sati= 3;
    }
    public void pomjeriZa(int pomak){
        if(pomak>0) for(int i=0; i<pomak; i++) sljedeci();
        else for(int i=0; i<-pomak; i++) prethodni();
    }
    final public int dajSate() { return this.sati; }
    final public int dajMinute() { return this.minute; }
    final public int dajSekunde() { return this.sekunde; }
    final public void ispisi() { System.out.printf("%d:%d:%d\n", sati, minute, sekunde);}

}
