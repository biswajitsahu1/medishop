package com.medishop.Medicines.service;

import com.medishop.Medicines.entites.Medicine;
import com.medishop.Medicines.rapository.MedicineRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class MedicineServiceImpl implements MedicineService {

    private MedicineRepository medicineRepository;
    private ModelMapper modelMapper;
    @Override
    public List<Medicine> getAllMedicine() {
        return medicineRepository.findAll();
    }

    @Override
    public void createMedicine(Medicine medicine) {
        String medicineId = UUID.randomUUID().toString();
        medicine.setMedicineId(medicineId);
        medicineRepository.save(medicine);
    }

    @Override
    public Medicine findById(String medicineId) {
        return medicineRepository.findById(medicineId).get();
                //medicineRepository.findById(medicineId).orElseThrow(() -> new ResourceNotFoundException("Medicine is not present inside the database "+medicineId));
    }

    @Override
    public void updateMedicine(Medicine medicine) {
        medicineRepository.save(medicine);
    }

    @Override
    public void deleteMedicine(String medicineId) {
        medicineRepository.deleteById(medicineId);
    }

    @Override
    public List<Medicine> searchMedicines(String query) {
        return medicineRepository.searchMedicine(query);
    }

}
