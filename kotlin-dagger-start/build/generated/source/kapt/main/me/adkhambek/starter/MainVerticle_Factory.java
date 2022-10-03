package me.adkhambek.starter;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class MainVerticle_Factory implements Factory<MainVerticle> {
  @Override
  public MainVerticle get() {
    return newInstance();
  }

  public static MainVerticle_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MainVerticle newInstance() {
    return new MainVerticle();
  }

  private static final class InstanceHolder {
    private static final MainVerticle_Factory INSTANCE = new MainVerticle_Factory();
  }
}
