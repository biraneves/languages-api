package com.biraneves.languages_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LanguageController {

    private final List<Language> languages = List.of(
            new Language("Java", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png", 1),
            new Language("Go", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/go/go_256x256.png", 2),
            new Language("C++", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/cpp/cpp_256x256.png", 3)
    );

    @GetMapping("/languages")
    public List<Language> getLanguages() {

        return languages;

    }

}
