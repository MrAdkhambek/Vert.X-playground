package me.adkhambek.starter;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class MainVerticleTest_MembersInjector implements MembersInjector<MainVerticleTest> {
  private final Provider<MainVerticle> mainVerticleProvider;

  public MainVerticleTest_MembersInjector(Provider<MainVerticle> mainVerticleProvider) {
    this.mainVerticleProvider = mainVerticleProvider;
  }

  public static MembersInjector<MainVerticleTest> create(
      Provider<MainVerticle> mainVerticleProvider) {
    return new MainVerticleTest_MembersInjector(mainVerticleProvider);
  }

  @Override
  public void injectMembers(MainVerticleTest instance) {
    injectMainVerticle(instance, mainVerticleProvider.get());
  }

  @InjectedFieldSignature("me.adkhambek.starter.MainVerticleTest.mainVerticle")
  public static void injectMainVerticle(MainVerticleTest instance, MainVerticle mainVerticle) {
    instance.mainVerticle = mainVerticle;
  }
}
