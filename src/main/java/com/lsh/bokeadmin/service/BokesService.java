package com.lsh.bokeadmin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lsh.bokeadmin.entry.BokeListEntry;
import com.lsh.bokeadmin.entry.Bokes;

public interface BokesService extends IService<Bokes> {

    IPage<BokeListEntry> getBokes(int page, int size, Bokes bokes);
}
