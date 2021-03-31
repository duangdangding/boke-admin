package com.lsh.bokeadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lsh.bokeadmin.entry.Users;
import com.lsh.bokeadmin.mapper.UsersMapper;
import com.lsh.bokeadmin.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {
    
    @Autowired
    private UsersMapper usersMapper;
    
}
