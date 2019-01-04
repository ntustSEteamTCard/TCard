package com.TCard.demo.form;

import javax.validation.constraints.Size;


public class NewPostForm {
    
//    @Size(min = 3, message = "你回復的話太少了~")
    private String content;
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
}
