public class Coche {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Coche(String marca, String modelo, int  velocidadMaxima){
        if(marca != null && !marca.isEmpty()){
            this.marca = marca;
        }else{
            this.marca = "Sin marca";
        }

        if(modelo != null && !modelo.isEmpty()){
            this.modelo = modelo;
        }else{
            this.modelo = "Sin modelo";
        }
        if(velocidadMaxima > 0) {
            this.velocidadMaxima = velocidadMaxima;
        } else {
            System.out.println("Velocidad inválida, debe ser mayor a 0.");
        }   
    }

    public String getMarca(){return marca;}
    public String getModelo(){return modelo;}
    public int getVelocidadMaxima(){return velocidadMaxima;}
        //Sett
    public void setMarca(String marca){this.marca = marca;}
    public void setModelo(String modelo){this.modelo = modelo;}
    public void setVelocidadMaxima(int velocidadMaxima){this.velocidadMaxima = velocidadMaxima;}

    public void acelerar(int  incremento) {
        if (incremento > 0) {
        velocidadMaxima += incremento;
        }
    }

    public void mostrarInfo(){
        System.out.println("== MOSTRAR COCHE ==");
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Velocidad: "+ velocidadMaxima);
    }

    @Override
    public String toString(){
        return "Coche:{Marca:'"+marca+"',Modelo:'"+modelo+"', Velocidad:'"+velocidadMaxima+"'}";
    }
}
