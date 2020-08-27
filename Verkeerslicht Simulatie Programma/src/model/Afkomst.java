package model;

public class Afkomst {

    public Voertuig voertuig;
    public Wegdek wegdek;

    public Afkomst(Wegdek wegdek, Voertuig voertuig)
{
 this.wegdek = wegdek;
 this.voertuig = voertuig;
}
    
    public Voertuig getVoertuig(){return voertuig;}
    public Wegdek getWegdek(){return wegdek;}
    
