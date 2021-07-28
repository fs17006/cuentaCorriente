
package banco;

import java.util.ArrayList;


public class CuentaCorriente {
    
    /*atributos de la clase*/
    private String numero="";
    private double saldo;
    private String nombre;
    private String telefono;
    private ArrayList<String> movimientos=new ArrayList<String>();
    
    /*metodos de la clase*/
    
    /*constructor sin parametros*/
    public CuentaCorriente(){
        this.generaNumero();
    }
    
    /*constructor con parametros*/
   public CuentaCorriente(String nombre, String telefono,double saldo){
       this.generaNumero();
       this.saldo=saldo;
       this.nombre=nombre;
       this.telefono=telefono; 
   }

   /*creacion de metodos setters and getters*/
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<String> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<String> movimientos) {
        this.movimientos = movimientos;
    }
   
   /*Metodo que genera un numero aleatorio que se asigna al atributo numero*/
    private void generaNumero(){
        for(int i=0;i<10;i++){
            numero+=(int)(Math.random()*10);
        }
    }

    /*metodo toString*/
    @Override
    public String toString() {
        return "Numero de cta:"+numero+ " saldo: $"+String.format("%.2f",saldo);
    }
    
    /*metodo para abonar dinero a una cuenta. El movimiento se guarda en la coleccion*/
    void abono(int dinero){
        saldo+=dinero;
        movimientos.add("Abono de $"+dinero+"Saldo $"+String.format("%.2f",saldo));        
    }
    
    /*metodo para sacar dinero de una cuenta.El movimiento se guarda en la coleccion*/
    void cargo(int dinero){
        saldo-=dinero;
        movimientos.add("Cargo de $:"+dinero+" Saldo: $" +String.format("%.2f",saldo));
    }
    
    /*metodo para tranferir dinero de una cuenta a otra*/
    void transferencia(CuentaCorriente cuentaDestino, int dinero){
        saldo-=dinero;
        cuentaDestino.saldo+=dinero;
        movimientos.add("Tranferencia emitida de $:"+dinero+" a la cuenta "+cuentaDestino.numero+" Saldo: $"+String.format("%.2f",saldo));
        cuentaDestino.movimientos.add("Transferencia recibida de $" +dinero+" de la cuenta "+numero+" saldo "+String.format("%.2f",saldo));
    }
    
    /*metodo que lista los movimientos que se hicieron en una cuenta*/
    void movimientos(){
        System.out.println("!**************************!");
        System.out.println("Moimientos de la cuenta "+numero);
        System.out.println("Cuenta a nombre de:"+nombre);
        System.out.println("Telefono:"+telefono);
        System.out.println("------------------------------");
        for(String movimiento:movimientos){
            System.out.println(movimiento);
        }
    }
}
