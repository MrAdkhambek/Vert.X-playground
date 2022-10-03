package me.adkhambek.starter;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import io.vertx.core.Vertx;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class Application_Factory implements Factory<Application> {
  private final Provider<Vertx> vertxProvider;

  private final Provider<MainVerticle> mainVerticleProvider;

  public Application_Factory(Provider<Vertx> vertxProvider,
      Provider<MainVerticle> mainVerticleProvider) {
    this.vertxProvider = vertxProvider;
    this.mainVerticleProvider = mainVerticleProvider;
  }

  @Override
  public Application get() {
    return newInstance(vertxProvider.get(), mainVerticleProvider.get());
  }

  public static Application_Factory create(Provider<Vertx> vertxProvider,
      Provider<MainVerticle> mainVerticleProvider) {
    return new Application_Factory(vertxProvider, mainVerticleProvider);
  }

  public static Application newInstance(Vertx vertx, MainVerticle mainVerticle) {
    return new Application(vertx, mainVerticle);
  }
}
