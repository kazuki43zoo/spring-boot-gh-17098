package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.boot.context.properties.ConfigurationProperties;

public class ThirdPartyConfiguration {

  private String encoding;

  private boolean enabled;

  private final List<Attribute> attributes = new ArrayList<>();

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public String getEncoding() {
    return encoding;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  public boolean isEnabled() {
    return enabled;
  }

  public void addAttribute(Attribute attribute) {
    this.attributes.add(attribute);
  }

  public List<Attribute> getAttributes() {
    return attributes;
  }

  public static class Attribute {

    private final String name;
    private final Object value;

    public Attribute(String name, Object value) {
      Objects.requireNonNull(name, "'name' must be not null.");
      Objects.requireNonNull(value, "'value' must be not null.");
      this.name = name;
      this.value = value;
    }

    public String getName() {
      return name;
    }

    public Object getValue() {
      return value;
    }

  }

}
