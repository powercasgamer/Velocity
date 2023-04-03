package com.velocitypowered.testplugin;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;import org.slf4j.Logger;

@Plugin(
        id = "test-plugin",
        authors = "Velocity Contributors",
        name = "Test Plugin",
        version = "1.0.0"
)
public class TestPlugin {

  @Inject Logger logger;

  @Subscribe
  public void onProxyInitialization(ProxyInitializeEvent event) {
        this.logger.info("Hello, World!");
    }

}
