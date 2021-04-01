package com.lsh.bokeadmin.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface CommonService {

    /**
     * 上传文件至阿里云 oss
     *
     * @param file
     * @param uploadKey
     * @return
     * @throws Exception
     */
    Map<String, Object> uploadOSS(MultipartFile file, String uploadKey) throws Exception;
}
