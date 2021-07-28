
package banco;


public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declarando objetos del tipo cuenta corriente
        CuentaCorriente cuenta1=new CuentaCorriente();
        CuentaCorriente cuenta2=new CuentaCorriente("Sara Granadino","78978945",1500);
        CuentaCorriente cuenta3=new CuentaCorriente("Adriana Padilla","89456798",6000);
        
        //asignando un nombre a la cuenta1
        cuenta1.setNombre("Alberto Fernandez");
        
        //asignando un numero de telefono a la cuenta1
        cuenta1.setTelefono("23658945");
        
        //abono de cuenta1
        cuenta1.abono(2000);
        
        //cargando a cuenta1
        cuenta1.cargo(600);
        
        //abonando a cuenta3
        cuenta3.abono(75);
        
        //cargando a cuenta1
        cuenta1.cargo(55);
        
        //tranferencia de cuenta2 a cuenta1
        cuenta2.transferencia(cuenta1,100);
        
        //transferencia de cuenta1 a cuenta3
        cuenta1.transferencia(cuenta3, 250);
        
        //transferencia de cuenta3 a cuenta1 
        cuenta3.transferencia(cuenta1, 22);
        
        //mostrando todos los movimientos de cuenta1
        cuenta1.movimientos();
        
        // TODO code application logic here
    }
    
}
