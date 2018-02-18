package com.farhanrizkyf.farhan_1202152159_modul2;


public class Model {
    private String Name;
    private int Cost;
    private int Pict;
    private String Description;

    public Model(String Name, int Cost, int Pict, String Description){
        this.Name = Name;
        this.Cost = Cost;
        this.Pict = Pict;
        this.Description = Description;
    }
    public String getName(){
        return Name;
    }
    public int getCost(){
        return Cost;
    }
    public int getPict(){
        return Pict;
    }
    public String getDescription(){
        return Description;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setCost(int Cost){
        this.Cost = Cost;
    }
    public void setPict(int Pict){this.Pict = Pict;}
    public void setDescription(String Description){
        this.Description= Description;
    }

}
