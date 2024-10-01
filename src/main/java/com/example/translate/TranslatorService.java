package com.example.translate;

import java.util.HashMap;
import java.util.Map;

public class TranslatorService {

    private final Map<String, String> translations = new HashMap<>();

    public TranslatorService() {
        translations.put("hello", "hola");
        translations.put("world", "mundo");
    }

    public String translate(String text) {
        return translations.getOrDefault(text.toLowerCase(), "traducción no encontrada");
    }
}