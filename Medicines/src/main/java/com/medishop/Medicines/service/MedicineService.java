package com.medishop.Medicines.service;

import com.medishop.Medicines.entites.Medicine;

import java.util.List;

public interface MedicineService {

    List<Medicine> getAllMedicine();
    void createMedicine(Medicine medicine);
    void updateMedicine(Medicine medicine);

    void deleteMedicine(String medicineId);

    Medicine findById(String medicineId);


    List<Medicine> searchMedicines(String query);

}
