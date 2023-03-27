package com.mindegg.sdk.generator;

import com.mindegg.sdk.generator.controller.PetsApi;
import com.mindegg.sdk.generator.invoker.ApiClient;
import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) throws com.mindegg.sdk.generator.invoker.ApiException {
        Micronaut.run(Application.class, args);

        ApiClient apiClient = new ApiClient();

        PetsApi petsApi = new PetsApi(apiClient);

        petsApi.listPets(2);
    }
}