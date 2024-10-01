package com.example.translate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TranslatorServiceTest {

    @Autowired
    private TranslatorService translatorService;

    TranslationDto translationDto = new TranslationDto("hello");

    @Test
    public void translate() {
        String translatedText = translatorService.translate(translationDto.getText());
        assertThat(translatedText).isEqualTo("hola");
    }

    @Test
    public void translateUnknownText() {
        TranslationDto unknownTranslationDto = new TranslationDto("unknown");
        String translatedText = translatorService.translate(unknownTranslationDto.getText());
        assertThat(translatedText).isEqualTo("traducción no encontrada");
    }
}