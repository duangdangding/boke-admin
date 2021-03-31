package com.lsh.bokeadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lsh.bokeadmin.entry.Labels;
import com.lsh.bokeadmin.mapper.LabelsMapper;
import com.lsh.bokeadmin.service.LabelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LabelsServiceImpl extends ServiceImpl<LabelsMapper, Labels> implements LabelsService {
    
    @Autowired
    private LabelsMapper labelsMapper;
    
}
