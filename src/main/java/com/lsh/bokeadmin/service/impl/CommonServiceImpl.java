package com.lsh.bokeadmin.service.impl;

import com.lsh.bokeadmin.conf.AliyunOssConfig;
import com.lsh.bokeadmin.service.CommonService;
import com.lsh.bokeadmin.utils.AliyunOSSUtil;
import com.lsh.bokeadmin.utils.OSSBootUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@Service
public class CommonServiceImpl implements CommonService {
    @Autowired
    private AliyunOssConfig ossConfig;

    /**
     * 上传文件至阿里云 oss
     *
     * @param file
     * @param uploadKey
     * @return
     * @throws Exception
     */
    @Override
    public Map<String, Object> uploadOSS(MultipartFile file, String uploadKey) throws Exception {

        // 低依赖版本 oss 上传工具
        String fileSuffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf('.'));;
        String ossFileUrlSingle = null;
        ossFileUrlSingle = AliyunOSSUtil.upload(ossConfig.getEndpoint(), ossConfig.getAccessKeyId(),
                ossConfig.getAccessKeySecret(), ossConfig.getBucketName(), ossConfig.getUrl(), file.getInputStream(),
                "upload/demo", fileSuffix);

        // 高依赖版本 oss 上传工具
        String ossFileUrlBoot = null;
        ossFileUrlBoot = OSSBootUtil.upload(ossConfig, file, "upload/demo");

        Map<String, Object> resultMap = new HashMap<>(16);
        resultMap.put("ossFileUrlSingle", ossFileUrlSingle);
        resultMap.put("ossFileUrlBoot", ossFileUrlBoot);

        return resultMap;
    }
}
