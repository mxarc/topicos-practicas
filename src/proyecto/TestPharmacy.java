package proyecto;

public class TestPharmacy {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.addMedicine(new Medicine("Paracetamol", "ingredient", 5));
        System.out.println("Printing pharmacy info:");
        for (Medicine medicine: pharmacy.getMedicines()
             ) {
            System.out.println(medicine.getData());
        }
    }
}
