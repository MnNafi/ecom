package com.attrabit.ecom.mapper;

import com.attrabit.ecom.dto.respose.ResponseUserDTO;
import com.attrabit.ecom.model.Users;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class ResponseUserDTOMapper implements Function<Users, ResponseUserDTO> {
    @Override
    public ResponseUserDTO apply(Users users) {
        return new ResponseUserDTO(
                users.getId(), users.getFirstName(), users.getLastName(), users.getEmail(),
                users.getPhone(), users.getPassword(), users.getPermissions(), users.getLastLogin(),
                users.getCreatedAt(), users.getUpdatedAt()
        );
    }
}
