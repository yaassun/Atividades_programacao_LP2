public class App {
    public static void main (String []args){
        
        ContaCorrente co1 = new ContaCorrente();
        ContaCorrente co2 = new ContaCorrente();
        ContaCorrente co3 = new ContaCorrente();

        Banco b = new Banco("Maria", co2, "Jose", co1, "Luana", co3);
        
        b.creditar("Luana", 1250);
        System.out.println(b.getSaldo("Luana"));
        b.debitar("Luana", 200);
        System.out.println(b.getSaldo("Luana"));
        
        b.creditar("Jose", 40000);
        System.out.println(b.getSaldo("Jose"));
        System.out.println(b.getSaldo("Maria"));
        b.transferir("Jose", "Maria", 30000);
        System.out.println(b.getSaldo("Jose"));
        System.out.println(b.getSaldo("Maria"));
    }
}