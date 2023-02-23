//package com.attrabit.ecom.controller;
//
//import com.attrabit.ecom.model.Activations;
//import com.attrabit.ecom.service.ActivationsService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/activations")
//public class ActivationsController {
//
//    @Autowired
//    private ActivationsService activationsService;
//
//    @GetMapping
//    public ResponseEntity<List<Activations>> getAllActivations() {
//        List<Activations> activations = activationsService.getAllActivations();
//        return new ResponseEntity<>(activations, HttpStatus.OK);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Activations> getActivationById(@PathVariable("id") Long id) {
//        Activations activation = activationsService.getActivationById(id);
//        if (activation == null) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        } else {
//            return new ResponseEntity<>(activation, HttpStatus.OK);
//        }
//    }
//
//    @PostMapping
//    public ResponseEntity<Activations> createActivation(@RequestBody Activations activation) {
//        Activations createdActivation = activationsService.saveActivation(activation);
//        return new ResponseEntity<>(createdActivation, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Activations> updateActivation(@PathVariable("id") Long id, @RequestBody Activations activation) {
//        Activations updatedActivation = activationsService.updateActivation(id, activation);
//        if (updatedActivation == null) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        } else {
//            return new ResponseEntity<>(updatedActivation, HttpStatus.OK);
//        }
//    }
//
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteActivation(@PathVariable("id") Long id) {
//        boolean deleted = activationsService.deleteActivation(id);
//        if (deleted) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//}
//
//
//
//
//
