package com.xmartlabs.base.core.model;

/** Marker interface that should be implemented by the Session object of the application. **/
public interface SessionType {
  /**
   * Retrieves the access token stored in the session, which is ought to be used in the authentication process.
   *
   * @return the stored access token
   */
  String getAccessToken();

  /**
   * Stores the access token, which is ought to be used int the authentication process.
   *
   * @param accessToken the access token to store
   */
  void setAccessToken(String accessToken);
}
