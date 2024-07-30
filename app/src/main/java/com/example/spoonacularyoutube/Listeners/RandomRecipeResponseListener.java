package com.example.spoonacularyoutube.Listeners;

import com.example.spoonacularyoutube.Models.RandomRecipeApiResponse;

public interface RandomRecipeResponseListener {

void didFetch(RandomRecipeApiResponse response, String message);
void didError(String message);


}
