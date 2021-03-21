package com.codegym.form;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class MyUploadFile {
    private String description;

    private CommonsMultipartFile[] files;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CommonsMultipartFile[] getFiles() {
        return files;
    }

    public void setFiles(CommonsMultipartFile[] files) {
        this.files = files;
    }
}
