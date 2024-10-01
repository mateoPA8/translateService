package com.example.translate;

public class TranslationDto {
    private String text;

    public TranslationDto(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
