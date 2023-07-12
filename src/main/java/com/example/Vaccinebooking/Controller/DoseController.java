package com.example.Vaccinebooking.Controller;

import com.example.Vaccinebooking.Enum.DoseType;
import com.example.Vaccinebooking.Model.Dose;
import com.example.Vaccinebooking.Service.DoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dose")
public class DoseController {
    @Autowired
    DoseService doseService;

    @PostMapping("/get_dose1")
    public ResponseEntity getDose1(@RequestParam("id") int personId, @RequestParam("doseType") DoseType doseType){
        try{
            Dose doseTaken = doseService.getDose1(personId,doseType);
            return new ResponseEntity(doseTaken, HttpStatus.CREATED);

        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
