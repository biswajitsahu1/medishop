package com.medishop.Medicines.controller;

import com.medishop.Medicines.entites.Contact;
import com.medishop.Medicines.entites.Medicine;
import com.medishop.Medicines.service.MedicineService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/admin")
public class MedicineController {

    private MedicineService medicineService;
    private RestTemplate restTemplate;

    //getAll
    @GetMapping("/medicines")
    public String medicines(Model model){
        List<Medicine> medicine = medicineService.getAllMedicine();
        model.addAttribute("medicine",medicine);
        return "medicines";
    }

    //create
    @GetMapping("/new-medicine")
    public String newMedicines(Model model) {
        Medicine medicine =new Medicine();
        model.addAttribute("medicine",medicine);
        return "create_medicine";
    }

    @PostMapping("/new-medicine")
    public String createPost(@Valid @ModelAttribute("medicine") Medicine medicine, BindingResult result, Model model){
        medicineService.createMedicine(medicine);
        return "redirect:/admin/medicines";
    }

    //getById
    @GetMapping("/medicines/{medicineId}/edit")
    public String editMedicines(@PathVariable("medicineId") String medicineId, Model model){
        Medicine medicine = medicineService.findById(medicineId);
        model.addAttribute("medicine", medicine);
        return "edit_medicine";
    }

    //update
    @PostMapping("/medicines/{medicineId}")
    public String updateMedicines(@PathVariable("medicineId") String medicineId,
                             @ModelAttribute("medicine") Medicine medicine,Model model){
        medicine.setMedicineId(medicineId);
        medicineService.updateMedicine(medicine);
        System.out.println("updated");
        return "redirect:/admin/medicines";
    }


    //delete
    @GetMapping("/medicines/{medicineId}/delete")
    public String deleteMedicines(@PathVariable String medicineId){
        medicineService.deleteMedicine(medicineId);
        return "redirect:/admin/medicines";
    }

    @GetMapping("/medicines/{medicineId}/view")
    public String viewPost(@PathVariable String medicineId,Model model){
        Medicine medicine = medicineService.findById(medicineId);
        model.addAttribute("medicine",medicine);
        System.out.println(medicine.getDescription());
        return "view_medicine";
    }

    @GetMapping("/medicines/search")
    public String findMedicines(@RequestParam(value = "query") String query,Model model){
        List<Medicine> medicine=medicineService.searchMedicines(query);
        model.addAttribute("medicine",medicine);
        return "medicines";
    }

    @GetMapping("/stock")
    public String stockReport(Model model){
        List<Medicine> medicine = medicineService.getAllMedicine();
        model.addAttribute("medicine",medicine);
        return "stock_report";
    }

    @GetMapping("/helps")
    public String userHelps(){
        //medicineService.helps();
        //ResponseEntity<ArrayList> Entity = restTemplate.getForEntity("http://localhost:8084/user/contacts", ArrayList.class);
        //ArrayList contacts = restTemplate.getForObject("http://localhost:8084/user/contacts", ArrayList.class);
        //System.out.println(Entity);
        return "helps";
    }
}
