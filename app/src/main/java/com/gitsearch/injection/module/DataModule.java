package com.gitsearch.injection.module;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {

  @Provides
  @Singleton
  Gson provideGson() {
    return new GsonBuilder()
      .setDateFormat("yyyy-MM-dd HH:mm:ss")
      .disableHtmlEscaping()
      .setPrettyPrinting()
      .create();
  }

}