package com.assignment.meow.api.repository;

import com.assignment.meow.data.cat.CatDataSource;
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
public final class CatRepository_Factory implements Factory<CatRepository> {
  private final Provider<CatDataSource> catDataSourceProvider;

  public CatRepository_Factory(Provider<CatDataSource> catDataSourceProvider) {
    this.catDataSourceProvider = catDataSourceProvider;
  }

  @Override
  public CatRepository get() {
    return newInstance(catDataSourceProvider.get());
  }

  public static CatRepository_Factory create(Provider<CatDataSource> catDataSourceProvider) {
    return new CatRepository_Factory(catDataSourceProvider);
  }

  public static CatRepository newInstance(CatDataSource catDataSource) {
    return new CatRepository(catDataSource);
  }
}
