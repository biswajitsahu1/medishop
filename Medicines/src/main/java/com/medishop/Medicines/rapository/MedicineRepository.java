package com.medishop.Medicines.rapository;

import com.medishop.Medicines.entites.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MedicineRepository extends JpaRepository<Medicine,String> {

    @Query("SELECT m from Medicine m WHERE " +
            "m.name LIKE CONCAT('%', :query, '%')")
    List<Medicine> searchMedicine(@Param("query") String query);

}
