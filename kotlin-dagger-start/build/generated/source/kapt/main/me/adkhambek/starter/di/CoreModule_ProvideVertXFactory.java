package me.adkhambek.starter.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import io.vertx.core.Vertx;
import javax.annotation.processing.Generated;

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
public final class CoreModule_ProvideVertXFactory implements Factory<Vertx> {
  @Override
  public Vertx get() {
    return provideVertX();
  }

  public static CoreModule_ProvideVertXFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Vertx provideVertX() {
    return Preconditions.checkNotNullFromProvides(CoreModule.INSTANCE.provideVertX());
  }

  private static final class InstanceHolder {
    private static final CoreModule_ProvideVertXFactory INSTANCE = new CoreModule_ProvideVertXFactory();
  }
}
