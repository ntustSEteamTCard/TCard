package com.TCard.demo.form;



import javax.validation.constraints.Min;
import javax.validation.constraints.Size;


public class NewTopicForm {
    
    @Size(min = 3, max = 50, message = "標題至少為3個字")
    private String title;
    
    @Size(min = 5, message = "至少寫5個字啦~")
    private String content;
    
    @Min(value = 1, message = "至少選一個看板")
    private int sectionId;
    
    public NewTopicForm() {}
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public int getSectionId() {
        return sectionId;
    }
    
    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }
    
}
