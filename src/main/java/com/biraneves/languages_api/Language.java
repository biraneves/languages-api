package com.biraneves.languages_api;

public class Language {

    private final String title;
    private final String image;
    private final int rankPosition;

    public Language(String title, String image, int rankPosition) {

        this.title = title;
        this.image = image;
        this.rankPosition = rankPosition;

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
