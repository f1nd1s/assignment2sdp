// Main.java
public class Main {
    public static void main(String[] args) {
        Vehicle AudiR8 = new Vehicle.Builder()
                .withName("AudiR8")
                .withEngineType("V10")
                .withTransmission("Automatic")
                .withColor("Yellow")
                .withSunroof(false)
                .withNumberOfDoors(2)
                .build();


        Vehicle TeslaModelS = new Vehicle.Builder()
                .withName("TeslaModelS")
                .withEngineType("Electric")
                .withTransmission("Automatic")
                .withColor("White")
                .withSunroof(true)
                .withNumberOfDoors(4)
                .build();


        Vehicle Nissan370Z = new Vehicle.Builder()
                .withName("Nissan370Z")
                .withEngineType("V6")
                .withTransmission("Manual")
                .withColor("Black")
                .withSunroof(true)
                .withNumberOfDoors(4)
                .build();


        System.out.println(AudiR8);
        System.out.println(TeslaModelS);
        System.out.println(Nissan370Z);
    }
}
