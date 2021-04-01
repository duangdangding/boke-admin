package com.lsh.bokeadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lsh.bokeadmin.entry.Categorys;
import com.lsh.bokeadmin.mapper.CategorysMapper;
import com.lsh.bokeadmin.service.CategorysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorysServiceImpl extends ServiceImpl<CategorysMapper, Categorys> implements CategorysService {
    
    @Autowired
    private CategorysMapper categorysMapper;

    @Override
    public long addCate(Categorys categorys) {
        return categorysMapper.addCate(categorys);
    }
}
