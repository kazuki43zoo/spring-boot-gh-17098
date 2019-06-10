package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationProperties(prefix = "my")
public class MyProperties {

  private String name;

  @NestedConfigurationProperty
  private ThirdPartyConfiguration configuration;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setConfiguration(ThirdPartyConfiguration configuration) {
    this.configuration = configuration;
  }

  public ThirdPartyConfiguration getConfiguration() {
    return configuration;
  }

}
