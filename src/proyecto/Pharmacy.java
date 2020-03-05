package proyecto;

import java.util.ArrayList;

public class Pharmacy {
    ArrayList<Medicine> medicines;
    public Pharmacy() {
        this.medicines = new ArrayList<>();
    }

    public ArrayList<Medicine> getMedicines() {
        return medicines;
    }

    public void addMedicine(Medicine medicine) {
        this.medicines.add(medicine);
    }
}
