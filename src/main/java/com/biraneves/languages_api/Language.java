package com.biraneves.languages_api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="mainLanguages")
public class Language {

    @Id
    private String id;
    private final String title;
    private final String image;
    private final int rankPosition;

    public Language(String title, String image, int rankPosition) {

        this.title = title;
        this.image = image;
        this.rankPosition = rankPosition;

    }

    public String getId() {
        return id;
    }

    public String getTitle() {

        return title;

    }

    public String getImage() {

        return image;

    }

    public int getRankPosition() {

        return rankPosition;

    }
}
