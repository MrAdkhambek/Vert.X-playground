package me.adkhambek.starter.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import io.vertx.core.Vertx;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import me.adkhambek.starter.Application;
import me.adkhambek.starter.Application_Factory;
import me.adkhambek.starter.MainVerticle_Factory;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent {
  private DaggerAppComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
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

    public AppComponent build() {
      return new AppComponentImpl();
    }
  }

  private static final class AppComponentImpl implements AppComponent {
    private final AppComponentImpl appComponentImpl = this;

    private Provider<Vertx> provideVertXProvider;

    private Provider<Application> applicationProvider;

    private AppComponentImpl() {

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
  }
}
