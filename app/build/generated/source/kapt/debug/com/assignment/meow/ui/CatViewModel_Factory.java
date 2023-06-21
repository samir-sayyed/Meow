package com.assignment.meow.ui;

import com.assignment.meow.api.repository.CatRepository;
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
public final class CatViewModel_Factory implements Factory<CatViewModel> {
  private final Provider<CatRepository> catRepositoryProvider;

  public CatViewModel_Factory(Provider<CatRepository> catRepositoryProvider) {
    this.catRepositoryProvider = catRepositoryProvider;
  }

  @Override
  public CatViewModel get() {
    return newInstance(catRepositoryProvider.get());
  }

  public static CatViewModel_Factory create(Provider<CatRepository> catRepositoryProvider) {
    return new CatViewModel_Factory(catRepositoryProvider);
  }

  public static CatViewModel newInstance(CatRepository catRepository) {
    return new CatViewModel(catRepository);
  }
}
