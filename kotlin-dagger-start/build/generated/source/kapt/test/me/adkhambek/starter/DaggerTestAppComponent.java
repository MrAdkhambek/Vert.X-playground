package me.adkhambek.starter;

import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import io.vertx.core.Vertx;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import me.adkhambek.starter.di.CoreModule;
import me.adkhambek.starter.di.CoreModule_ProvideVertXFactory;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerTestAppComponent {
  private DaggerTestAppComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static TestAppComponent create() {
    return new Builder().build();
  }

  public static final class Builder {
    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder coreModule(CoreModule coreModule) {
      Preconditions.checkNotNull(coreModule);
      return this;
    }

    public TestAppComponent build() {
      return new TestAppComponentImpl();
    }
  }

  private static final class TestAppComponentImpl implements TestAppComponent {
    private final TestAppComponentImpl testAppComponentImpl = this;

    private Provider<Vertx> provideVertXProvider;

    private Provider<Application> applicationProvider;

    private TestAppComponentImpl() {

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.provideVertXProvider = DoubleCheck.provider(CoreModule_ProvideVertXFactory.create());
      this.applicationProvider = DoubleCheck.provider(Application_Factory.create(provideVertXProvider, MainVerticle_Factory.create()));
    }

    @Override
    public Application getApplication() {
      return applicationProvider.get();
    }

    @Override
    public MainVerticle getMainVerticle() {
      return new MainVerticle();
    }

    @Override
    public void inject(MainVerticleTest test) {
      injectMainVerticleTest(test);
    }

    private MainVerticleTest injectMainVerticleTest(MainVerticleTest instance) {
      MainVerticleTest_MembersInjector.injectMainVerticle(instance, new MainVerticle());
      return instance;
    }
  }
}
