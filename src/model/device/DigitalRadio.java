package model.device;

public class DigitalRadio extends Device{
    String modulation ="";
    
    public String getModulation(){
        return this.modulation ;
    }
    
    public void setModulation(String modulation){
        this.modulation = modulation;
    }


    @Override
    public void printStatus(){
            System.out.println("------------------------------------");
            System.out.println("| Eu sou um Rádio :)" );
            System.out.println("| Modulação: " + this.modulation );
            System.out.println("| Ativado: " + (this.isEnabled() ? "Sim" : "Não"));
            System.out.println("| Volume: " + this.getVolume() + "%");
            System.out.println("| Canal Atual: " + this.getChannel());
            System.out.println("------------------------------------\n");
        }
    }
