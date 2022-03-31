package com.dalton.mapper;

import com.dalton.dao.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User Sel(int id);
    int insert(User user);
}
