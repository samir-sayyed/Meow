package com.assignment.meow.data.cat;

import com.assignment.meow.api.MeowService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CatDataSource_Factory implements Factory<CatDataSource> {
  private final Provider<MeowService> meowServiceProvider;

  public CatDataSource_Factory(Provider<MeowService> meowServiceProvider) {
    this.meowServiceProvider = meowServiceProvider;
  }

  @Override
  public CatDataSource get() {
    return newInstance(meowServiceProvider.get());
  }

  public static CatDataSource_Factory create(Provider<MeowService> meowServiceProvider) {
    return new CatDataSource_Factory(meowServiceProvider);
  }

  public static CatDataSource newInstance(MeowService meowService) {
    return new CatDataSource(meowService);
  }
}
