
package model;

public class Cliente {
    private String nome;
    private String CPF;
    private String RG;
    private Caminhoneiro c1;
    private Viagem viagem1 ;
    private Carreta carreta1;
    
    public Cliente(String nome, String CPF, String RG, Caminhoneiro caminhoneiroc1, Viagem viagem1, Carreta carreta1){
    this.nome= nome;
    this.CPF= CPF;
    this.RG = RG;
    this.c1 = caminhoneiroc1;
    this.carreta1 = carreta1;
    this.viagem1= viagem1;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Caminhoneiro getCaminhoneiroc1() {
        return c1;
    }

    public void setCaminhoneiroc1(Caminhoneiro caminhoneiroc1) {
        this.c1 = caminhoneiroc1;
    }


    public Viagem getViagem1() {
        return viagem1;
    }

    public void setViagem1(Viagem viagem1) {
        this.viagem1 = viagem1;
    }

    public Carreta getCarreta1() {
        return carreta1;
    }

    public void setCarreta1(Carreta carreta1) {
        this.carreta1 = carreta1;
    }


 public void visualizarViagem() {
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Nome do caminhoneiro: " + c1.getNome());
        System.out.println("Modelo da carreta: " + carreta1.getModeloCarreta());
        System.out.println("Destino da viagem: " + viagem1.getDestino());
        System.out.println("Valor do km: " + viagem1.getValorKM() + ", Distância percorrida: " + viagem1.getDistancia() + "km");
        System.out.println("Valor total da viagem: R$" + viagem1.getValorViagem());
    }
}
     
    

