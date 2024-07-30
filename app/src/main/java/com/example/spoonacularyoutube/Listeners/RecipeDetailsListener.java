package com.example.spoonacularyoutube.Listeners;

import com.example.spoonacularyoutube.Models.RecipeDetailsResponse;

public interface RecipeDetailsListener {
    void didFetch(RecipeDetailsResponse response, String message);
    void didError(String message);
}
