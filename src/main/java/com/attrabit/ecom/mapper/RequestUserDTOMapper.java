package com.attrabit.ecom.mapper;

import com.attrabit.ecom.dto.request.RequestUserDTO;
import com.attrabit.ecom.model.Users;
import com.attrabit.ecom.utils.DateUtils;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class RequestUserDTOMapper implements Function<RequestUserDTO, Users> {
    @Override
    public Users apply(RequestUserDTO dto) {
        Users users = new Users();
        users.setFirstName(dto.firstName());
        users.setLastName(dto.lastName());
        users.setEmail(dto.email());
        users.setPassword(dto.password());
        users.setPhone(dto.phone());
        users.setCreatedAt(DateUtils.getDate());
        return users;
    }
}
