/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.mifos.identity.api.v1.domain;

import io.mifos.anubis.api.v1.domain.PermittableEndpoint;
import io.mifos.core.lang.validation.constraints.ValidIdentifier;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * @author Myrle Krantz
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class PermittableGroup {
  @ValidIdentifier
  private String identifier;

  @NotNull
  @Valid
  private List<PermittableEndpoint> permittables;


  public PermittableGroup() {
  }

  public PermittableGroup(String identifier, List<PermittableEndpoint> permittables) {
    this.identifier = identifier;
    this.permittables = permittables;
  }

  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public List<PermittableEndpoint> getPermittables() {
    return permittables;
  }

  public void setPermittables(List<PermittableEndpoint> permittables) {
    this.permittables = permittables;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PermittableGroup that = (PermittableGroup) o;
    return Objects.equals(identifier, that.identifier) &&
            Objects.equals(permittables, that.permittables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, permittables);
  }

  @Override
  public String toString() {
    return "PermittableGroup{" +
            "identifier='" + identifier + '\'' +
            ", permittables=" + permittables +
            '}';
  }
}
