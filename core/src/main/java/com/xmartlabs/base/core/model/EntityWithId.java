package com.xmartlabs.base.core.model;

/**
 * Entity that can be uniquely identified with an id of type {@code <T>}.
 *
 * @param <T> the type of the identifying property
 */
public interface EntityWithId<T> {
  /**
   * Retrieves the value of the identifying property.
   *
   * @return the value of the identifying property
   */
  T getId();
}
