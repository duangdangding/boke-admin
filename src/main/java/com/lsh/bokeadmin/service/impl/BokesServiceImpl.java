package com.lsh.bokeadmin.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lsh.bokeadmin.entry.BokeListEntry;
import com.lsh.bokeadmin.entry.Bokes;
import com.lsh.bokeadmin.mapper.BokesMapper;
import com.lsh.bokeadmin.service.BokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BokesServiceImpl extends ServiceImpl<BokesMapper, Bokes> implements BokesService {
    
    @Autowired
    private BokesMapper bokesMapper;

    @Override
    public IPage<BokeListEntry> getBokes(int page, int size, Bokes bokes) {
        Page<BokeListEntry> pageData = new Page<>(page,size);
        IPage<BokeListEntry> bokes1 = bokesMapper.getBokes(pageData, bokes.getTitle(),bokes.getCateId());
        return bokes1;
    }
}
