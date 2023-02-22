package com.attrabit.ecom.controller;

import com.attrabit.ecom.dto.request.RequestUserDTO;
import com.attrabit.ecom.exception.ApiMessage;
import com.attrabit.ecom.service.RegistrationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RegistrationController {
    private final RegistrationService registrationService;
    @PostMapping("/add")
    public ResponseEntity<String> addUser(@Valid @RequestBody RequestUserDTO dto) throws ApiMessage {
//        System.out.println(dto);
//        User user = new User();
//        user.setFirstName(dto.firstName());
//        user.setLastName(dto.lastName());
//        user.setEmail(dto.email());
//        user.setPhone(dto.phone());
//        user.setPassword(dto.password());
//        if (Objects.equals(dto.phone(), "")) {
//            System.out.println("==================>");
//        }
        registrationService.addUser(dto);
        return new ResponseEntity<>("Inserted user!", HttpStatus.OK);
    }
}
