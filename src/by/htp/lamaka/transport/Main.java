package by.htp.lamaka.transport;

public class Main {
    public static void main(String[] args) {
        CivilTransport civilTransport = new CivilTransport( 1250,550,6032,"Boeing",12,1350,200,true );
        MilitaryTransport militaryTransport = new MilitaryTransport( 1250,550,6032,"Boeing",12,1350,true,50);
        FreightTransport freightTransport = new FreightTransport(320,120,3130,"MAZ",6,20,5);
        LightTransport lightTransport = new LightTransport(220,180,2670,"BMW",4,15,"Coupe",4);

        System.out.println(civilTransport.getAllChars());
        System.out.println(militaryTransport.getAllChars());
        System.out.println(freightTransport.getAllChars());
        System.out.println(lightTransport.getAllChars());

        System.out.println(lightTransport.getFuelConsumptionByTime(10));
        System.out.println(freightTransport.checkAbilityToTransportByWeight(4));
        System.out.println(civilTransport.checkAbilityToTransportByCountOfPassengers(20));
        System.out.println(militaryTransport.toShot());
        System.out.println(militaryTransport.toEjection());
    }
}
