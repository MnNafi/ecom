package com.attrabit.ecom.service;

import com.attrabit.ecom.dto.request.RequestUserDTO;
import com.attrabit.ecom.exception.ApiMessage;


public interface RegistrationService {
    void addUser(RequestUserDTO dto) throws ApiMessage;

}
