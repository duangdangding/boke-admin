package com.lsh.bokeadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lsh.bokeadmin.entry.Bokes;
import com.lsh.bokeadmin.mapper.BokesMapper;
import com.lsh.bokeadmin.service.BokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BokesServiceImpl extends ServiceImpl<BokesMapper, Bokes> implements BokesService {
    
    @Autowired
    private BokesMapper bokesMapper;
    
}
