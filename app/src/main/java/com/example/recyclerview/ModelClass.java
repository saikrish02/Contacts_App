package com.example.recyclerview;

public class ModelClass {
    private int imageView1;
    private String text1;
    private String text2;
    private String text3;
    private String line;
    public ModelClass(int imageView1, String text1, String text2, String text3, String line)
     {
         this.imageView1 = imageView1;
         this.text1 = text1;
         this.text2 = text2;
         this.text3 = text3;
         this.line = line;
     }
    public int getImageView1() {
        return imageView1;
    }

    public String getLine() {
        return line;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

    public String getText3() {
        return text3;
    }

    public void setImageView1(int imageView1) {
        this.imageView1 = imageView1;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }
}
