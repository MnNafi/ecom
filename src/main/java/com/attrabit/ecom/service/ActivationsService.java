package com.attrabit.ecom.service;

import com.attrabit.ecom.model.Activations;
import com.attrabit.ecom.repository.ActivationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivationsService {

    @Autowired
    private ActivationsRepository activationsRepository;

    public List<Activations> getAllActivations() {
        return activationsRepository.findAll();
    }

    public Activations getActivationById(Long id) {
        return activationsRepository.findById(id).orElse(null);
    }

    public Activations saveActivation(Activations activation) {
        activationsRepository.save(activation);
        return activation;
    }

    public boolean deleteActivation(Long id) {
        activationsRepository.deleteById(id);
        return false;
    }


    public Activations updateActivation(Long id, Activations activation) {
        return null;
    }
}
