package com.codegym.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DirectoryService {
    private Map<String, String> dic = new HashMap<>();
    {
        dic.put("book","quyen vo");
        dic.put("dog","con cho");
        dic.put("hello","xin chao");
        dic.put("cat","con meo");
        dic.put("computer","may tinh");
    }

    public String lookUp(String keyword){
        String result = dic.get(keyword.trim().toLowerCase());
        return result != null ? result : "Khong tim thay";
    }
}
