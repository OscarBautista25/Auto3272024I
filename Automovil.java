import java.util.Scanner;

public class Automovil {
    String marca;
    int modelo;
    int velocidadMaxima;
    int velocidadActual = 0;

    enum tipoCom {
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GASNATURAL
    }

    tipoCom tipoCombustible;

    enum tipoAuto {
        CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    }

    tipoAuto tipoAutomovil;

    public Automovil(String marca, int modelo, int velocidadMaxima, int velocidadActual,
            Automovil.tipoCom tipoCombustible, Automovil.tipoAuto tipoAutomovil) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public void acelerar(int incremento) {
        if (velocidadActual + incremento > velocidadMaxima) {
            System.out.println("No se puede incrementar por encima de la velocidad máxima");
        } else {
            velocidadActual = velocidadActual + incremento;
        }
    }
    public void desacelerar(int decremento){
        if (velocidadActual-decremento>=0) {
            velocidadActual=velocidadActual-decremento;
        } else {
            System.out.println("No puede desacelerar a una velocidad menor a 0");
        }
    }
    public void frenar(){
        velocidadActual=0;
    }

    double calcularTiempoLLegada(int distancia){
        return distancia/velocidadActual;
    }
    public void imprimir(){
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " +modelo);
        System.out.println("Velocidad Maxima = " +velocidadMaxima);
        System.out.println("Velocidad Actual = " +velocidadActual);
        System.out.println("Tipo de combutible = " +tipoCombustible);
        System.out.println("Tipo de Automovil = " +tipoAutomovil);
    }
    public static void main(String[] args) {
        /*Automovil auto1 = new Automovil("Ford", 2024, 350, 0, tipoCom.GASOLINA, tipoAuto.SUV);
        auto1.imprimir();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad Actual = " +auto1.velocidadActual);
        auto1.acelerar(20);
        System.out.println("Velocidad Actual = " +auto1.velocidadActual);
        auto1.desacelerar(50);
        System.out.println("Velocidad Actual = " +auto1.velocidadActual);
        auto1.frenar();
        System.out.println("Velocidad Actual = " +auto1.velocidadActual);
        auto1.desacelerar(10);
        */
        Scanner vehiculo = new Scanner(System.in);
        System.out.println("Ingrese los datos del automovil 2:");
        System.out.println("Ingrese la marca del carro");
        String marcaMain = vehiculo.nextLine();
        System.out.println("Ingrese el modelo del carro");
        int modeloMain = vehiculo.nextInt();
        System.out.println("Ingrese la velocidad máxima del carro");
        int velocidadMaximaMain = vehiculo.nextInt();
        System.out.println("Ingrese la velocidad actual");
        int velocidadActualMain = vehiculo.nextInt();
        System.out.println("Escoja el tipo de combustible: ");
        System.out.println("\t 0-Gasolina.   1-Bioetanol     2-Diesel    3-Biodiesel.   4-Gas Natural.");
        tipoCom tipoCombustibleMain = tipoCom.values()[vehiculo.nextInt()];
        System.out.println("Escoja el tipo de automovil: ");
        System.out.println("\t 0-Ciudad.   1-Subcompacto     2-Compacto    3-Familiar.   4-Ejecutivo.   5-SUV");
        tipoAuto tipoAutomovilMain = tipoAuto.values()[vehiculo.nextInt()];

        Automovil automovil2 = new Automovil(marcaMain, modeloMain, velocidadMaximaMain, velocidadActualMain, tipoCombustibleMain, tipoAutomovilMain);
        automovil2.imprimir();
        automovil2.setVelocidadActual(100);
        System.out.println("Velocidad Actual = " +automovil2.velocidadActual);
        automovil2.acelerar(20);
        System.out.println("Velocidad Actual = " +automovil2.velocidadActual);
        automovil2.desacelerar(50);
        System.out.println("Velocidad Actual = " +automovil2.velocidadActual);
        automovil2.frenar();
        System.out.println("Velocidad Actual = " +automovil2.velocidadActual);
        automovil2.desacelerar(10);
        vehiculo.close();      


        
    }



}