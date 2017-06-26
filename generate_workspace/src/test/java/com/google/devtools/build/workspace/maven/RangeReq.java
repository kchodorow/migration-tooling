package com.google.devtools.build.workspace.maven;

import org.apache.maven.model.Parent;
import org.apache.maven.model.building.ModelSource;
import org.apache.maven.model.resolution.UnresolvableModelException;

public class RangeReq {
  public static void main(String[] args) {
    DefaultModelResolver defaultModelResolver = new DefaultModelResolver();
    Parent parent = new Parent();
    parent.setGroupId("com.google.guava");
    parent.setArtifactId("guava");
    parent.setVersion("18.0");
    try {
      ModelSource source = defaultModelResolver.resolveModel(parent);
      System.out.println(source);
    } catch (UnresolvableModelException e) {
      e.printStackTrace();
    }
  }
}
