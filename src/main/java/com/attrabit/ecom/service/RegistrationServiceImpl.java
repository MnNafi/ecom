package com.attrabit.ecom.service;

import com.attrabit.ecom.dto.request.RequestUserDTO;
import com.attrabit.ecom.exception.ApiMessage;
import com.attrabit.ecom.mapper.RequestUserDTOMapper;
import com.attrabit.ecom.model.Users;
import com.attrabit.ecom.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService{
    private final RequestUserDTOMapper requestUserDTOMapper;
    private final UserRepository userRepository;

    @Override
    public void addUser(RequestUserDTO dto) throws ApiMessage {
        try {
            Users users = requestUserDTOMapper.apply(dto);
            Users users1 = userRepository.findByEmail(users.getEmail()).orElse(null);
            if (users1 != null){
                throw new ApiMessage("Already user exited!");
            }
            // TODO: 2/16/2023 added user


        }catch (Exception e){
            throw new ApiMessage("Not inserted user!");
        }

    }
}
