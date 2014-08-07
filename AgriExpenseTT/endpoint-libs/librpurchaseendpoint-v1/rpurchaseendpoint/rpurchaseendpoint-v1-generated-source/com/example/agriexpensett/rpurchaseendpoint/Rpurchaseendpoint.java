/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-07-22 21:53:01 UTC)
 * on 2014-08-07 at 16:54:58 UTC 
 * Modify at your own risk.
 */

package com.example.agriexpensett.rpurchaseendpoint;

/**
 * Service definition for Rpurchaseendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link RpurchaseendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Rpurchaseendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the rpurchaseendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://onyx-park-618.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "rpurchaseendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Rpurchaseendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Rpurchaseendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "deleteAll".
   *
   * This request holds the parameters needed by the rpurchaseendpoint server.  After setting any
   * optional parameters, call the {@link DeleteAll#execute()} method to invoke the remote operation.
   *
   * @param namespace
   * @return the request
   */
  public DeleteAll deleteAll(java.lang.String namespace) throws java.io.IOException {
    DeleteAll result = new DeleteAll(namespace);
    initialize(result);
    return result;
  }

  public class DeleteAll extends RpurchaseendpointRequest<Void> {

    private static final String REST_PATH = "all/{namespace}";

    /**
     * Create a request for the method "deleteAll".
     *
     * This request holds the parameters needed by the the rpurchaseendpoint server.  After setting
     * any optional parameters, call the {@link DeleteAll#execute()} method to invoke the remote
     * operation. <p> {@link
     * DeleteAll#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param namespace
     * @since 1.13
     */
    protected DeleteAll(java.lang.String namespace) {
      super(Rpurchaseendpoint.this, "GET", REST_PATH, null, Void.class);
      this.namespace = com.google.api.client.util.Preconditions.checkNotNull(namespace, "Required parameter namespace must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public DeleteAll setAlt(java.lang.String alt) {
      return (DeleteAll) super.setAlt(alt);
    }

    @Override
    public DeleteAll setFields(java.lang.String fields) {
      return (DeleteAll) super.setFields(fields);
    }

    @Override
    public DeleteAll setKey(java.lang.String key) {
      return (DeleteAll) super.setKey(key);
    }

    @Override
    public DeleteAll setOauthToken(java.lang.String oauthToken) {
      return (DeleteAll) super.setOauthToken(oauthToken);
    }

    @Override
    public DeleteAll setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (DeleteAll) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public DeleteAll setQuotaUser(java.lang.String quotaUser) {
      return (DeleteAll) super.setQuotaUser(quotaUser);
    }

    @Override
    public DeleteAll setUserIp(java.lang.String userIp) {
      return (DeleteAll) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String namespace;

    /**

     */
    public java.lang.String getNamespace() {
      return namespace;
    }

    public DeleteAll setNamespace(java.lang.String namespace) {
      this.namespace = namespace;
      return this;
    }

    @Override
    public DeleteAll set(String parameterName, Object value) {
      return (DeleteAll) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "deletePurchase".
   *
   * This request holds the parameters needed by the rpurchaseendpoint server.  After setting any
   * optional parameters, call the {@link DeletePurchase#execute()} method to invoke the remote
   * operation.
   *
   * @param keyrep
   * @param namespace
   * @return the request
   */
  public DeletePurchase deletePurchase(java.lang.String keyrep, java.lang.String namespace) throws java.io.IOException {
    DeletePurchase result = new DeletePurchase(keyrep, namespace);
    initialize(result);
    return result;
  }

  public class DeletePurchase extends RpurchaseendpointRequest<Void> {

    private static final String REST_PATH = "purchase/{keyrep}/{namespace}";

    /**
     * Create a request for the method "deletePurchase".
     *
     * This request holds the parameters needed by the the rpurchaseendpoint server.  After setting
     * any optional parameters, call the {@link DeletePurchase#execute()} method to invoke the remote
     * operation. <p> {@link DeletePurchase#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param keyrep
     * @param namespace
     * @since 1.13
     */
    protected DeletePurchase(java.lang.String keyrep, java.lang.String namespace) {
      super(Rpurchaseendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.keyrep = com.google.api.client.util.Preconditions.checkNotNull(keyrep, "Required parameter keyrep must be specified.");
      this.namespace = com.google.api.client.util.Preconditions.checkNotNull(namespace, "Required parameter namespace must be specified.");
    }

    @Override
    public DeletePurchase setAlt(java.lang.String alt) {
      return (DeletePurchase) super.setAlt(alt);
    }

    @Override
    public DeletePurchase setFields(java.lang.String fields) {
      return (DeletePurchase) super.setFields(fields);
    }

    @Override
    public DeletePurchase setKey(java.lang.String key) {
      return (DeletePurchase) super.setKey(key);
    }

    @Override
    public DeletePurchase setOauthToken(java.lang.String oauthToken) {
      return (DeletePurchase) super.setOauthToken(oauthToken);
    }

    @Override
    public DeletePurchase setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (DeletePurchase) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public DeletePurchase setQuotaUser(java.lang.String quotaUser) {
      return (DeletePurchase) super.setQuotaUser(quotaUser);
    }

    @Override
    public DeletePurchase setUserIp(java.lang.String userIp) {
      return (DeletePurchase) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String keyrep;

    /**

     */
    public java.lang.String getKeyrep() {
      return keyrep;
    }

    public DeletePurchase setKeyrep(java.lang.String keyrep) {
      this.keyrep = keyrep;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String namespace;

    /**

     */
    public java.lang.String getNamespace() {
      return namespace;
    }

    public DeletePurchase setNamespace(java.lang.String namespace) {
      this.namespace = namespace;
      return this;
    }

    @Override
    public DeletePurchase set(String parameterName, Object value) {
      return (DeletePurchase) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getAllPurchases".
   *
   * This request holds the parameters needed by the rpurchaseendpoint server.  After setting any
   * optional parameters, call the {@link GetAllPurchases#execute()} method to invoke the remote
   * operation.
   *
   * @param namespace
   * @return the request
   */
  public GetAllPurchases getAllPurchases(java.lang.String namespace) throws java.io.IOException {
    GetAllPurchases result = new GetAllPurchases(namespace);
    initialize(result);
    return result;
  }

  public class GetAllPurchases extends RpurchaseendpointRequest<com.example.agriexpensett.rpurchaseendpoint.model.RPurchaseCollection> {

    private static final String REST_PATH = "rpurchasecollection/{namespace}";

    /**
     * Create a request for the method "getAllPurchases".
     *
     * This request holds the parameters needed by the the rpurchaseendpoint server.  After setting
     * any optional parameters, call the {@link GetAllPurchases#execute()} method to invoke the remote
     * operation. <p> {@link GetAllPurchases#initialize(com.google.api.client.googleapis.services.Abst
     * ractGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param namespace
     * @since 1.13
     */
    protected GetAllPurchases(java.lang.String namespace) {
      super(Rpurchaseendpoint.this, "GET", REST_PATH, null, com.example.agriexpensett.rpurchaseendpoint.model.RPurchaseCollection.class);
      this.namespace = com.google.api.client.util.Preconditions.checkNotNull(namespace, "Required parameter namespace must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetAllPurchases setAlt(java.lang.String alt) {
      return (GetAllPurchases) super.setAlt(alt);
    }

    @Override
    public GetAllPurchases setFields(java.lang.String fields) {
      return (GetAllPurchases) super.setFields(fields);
    }

    @Override
    public GetAllPurchases setKey(java.lang.String key) {
      return (GetAllPurchases) super.setKey(key);
    }

    @Override
    public GetAllPurchases setOauthToken(java.lang.String oauthToken) {
      return (GetAllPurchases) super.setOauthToken(oauthToken);
    }

    @Override
    public GetAllPurchases setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetAllPurchases) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetAllPurchases setQuotaUser(java.lang.String quotaUser) {
      return (GetAllPurchases) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetAllPurchases setUserIp(java.lang.String userIp) {
      return (GetAllPurchases) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String namespace;

    /**

     */
    public java.lang.String getNamespace() {
      return namespace;
    }

    public GetAllPurchases setNamespace(java.lang.String namespace) {
      this.namespace = namespace;
      return this;
    }

    @Override
    public GetAllPurchases set(String parameterName, Object value) {
      return (GetAllPurchases) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getRPurchase".
   *
   * This request holds the parameters needed by the rpurchaseendpoint server.  After setting any
   * optional parameters, call the {@link GetRPurchase#execute()} method to invoke the remote
   * operation.
   *
   * @param namespace
   * @param keyrep
   * @return the request
   */
  public GetRPurchase getRPurchase(java.lang.String namespace, java.lang.String keyrep) throws java.io.IOException {
    GetRPurchase result = new GetRPurchase(namespace, keyrep);
    initialize(result);
    return result;
  }

  public class GetRPurchase extends RpurchaseendpointRequest<com.example.agriexpensett.rpurchaseendpoint.model.RPurchase> {

    private static final String REST_PATH = "rpurchase/{namespace}/{keyrep}";

    /**
     * Create a request for the method "getRPurchase".
     *
     * This request holds the parameters needed by the the rpurchaseendpoint server.  After setting
     * any optional parameters, call the {@link GetRPurchase#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetRPurchase#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param namespace
     * @param keyrep
     * @since 1.13
     */
    protected GetRPurchase(java.lang.String namespace, java.lang.String keyrep) {
      super(Rpurchaseendpoint.this, "GET", REST_PATH, null, com.example.agriexpensett.rpurchaseendpoint.model.RPurchase.class);
      this.namespace = com.google.api.client.util.Preconditions.checkNotNull(namespace, "Required parameter namespace must be specified.");
      this.keyrep = com.google.api.client.util.Preconditions.checkNotNull(keyrep, "Required parameter keyrep must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetRPurchase setAlt(java.lang.String alt) {
      return (GetRPurchase) super.setAlt(alt);
    }

    @Override
    public GetRPurchase setFields(java.lang.String fields) {
      return (GetRPurchase) super.setFields(fields);
    }

    @Override
    public GetRPurchase setKey(java.lang.String key) {
      return (GetRPurchase) super.setKey(key);
    }

    @Override
    public GetRPurchase setOauthToken(java.lang.String oauthToken) {
      return (GetRPurchase) super.setOauthToken(oauthToken);
    }

    @Override
    public GetRPurchase setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetRPurchase) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetRPurchase setQuotaUser(java.lang.String quotaUser) {
      return (GetRPurchase) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetRPurchase setUserIp(java.lang.String userIp) {
      return (GetRPurchase) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String namespace;

    /**

     */
    public java.lang.String getNamespace() {
      return namespace;
    }

    public GetRPurchase setNamespace(java.lang.String namespace) {
      this.namespace = namespace;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String keyrep;

    /**

     */
    public java.lang.String getKeyrep() {
      return keyrep;
    }

    public GetRPurchase setKeyrep(java.lang.String keyrep) {
      this.keyrep = keyrep;
      return this;
    }

    @Override
    public GetRPurchase set(String parameterName, Object value) {
      return (GetRPurchase) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertRPurchase".
   *
   * This request holds the parameters needed by the rpurchaseendpoint server.  After setting any
   * optional parameters, call the {@link InsertRPurchase#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.example.agriexpensett.rpurchaseendpoint.model.RPurchase}
   * @return the request
   */
  public InsertRPurchase insertRPurchase(com.example.agriexpensett.rpurchaseendpoint.model.RPurchase content) throws java.io.IOException {
    InsertRPurchase result = new InsertRPurchase(content);
    initialize(result);
    return result;
  }

  public class InsertRPurchase extends RpurchaseendpointRequest<com.example.agriexpensett.rpurchaseendpoint.model.RPurchase> {

    private static final String REST_PATH = "rpurchase";

    /**
     * Create a request for the method "insertRPurchase".
     *
     * This request holds the parameters needed by the the rpurchaseendpoint server.  After setting
     * any optional parameters, call the {@link InsertRPurchase#execute()} method to invoke the remote
     * operation. <p> {@link InsertRPurchase#initialize(com.google.api.client.googleapis.services.Abst
     * ractGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.example.agriexpensett.rpurchaseendpoint.model.RPurchase}
     * @since 1.13
     */
    protected InsertRPurchase(com.example.agriexpensett.rpurchaseendpoint.model.RPurchase content) {
      super(Rpurchaseendpoint.this, "POST", REST_PATH, content, com.example.agriexpensett.rpurchaseendpoint.model.RPurchase.class);
    }

    @Override
    public InsertRPurchase setAlt(java.lang.String alt) {
      return (InsertRPurchase) super.setAlt(alt);
    }

    @Override
    public InsertRPurchase setFields(java.lang.String fields) {
      return (InsertRPurchase) super.setFields(fields);
    }

    @Override
    public InsertRPurchase setKey(java.lang.String key) {
      return (InsertRPurchase) super.setKey(key);
    }

    @Override
    public InsertRPurchase setOauthToken(java.lang.String oauthToken) {
      return (InsertRPurchase) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertRPurchase setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertRPurchase) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertRPurchase setQuotaUser(java.lang.String quotaUser) {
      return (InsertRPurchase) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertRPurchase setUserIp(java.lang.String userIp) {
      return (InsertRPurchase) super.setUserIp(userIp);
    }

    @Override
    public InsertRPurchase set(String parameterName, Object value) {
      return (InsertRPurchase) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listRPurchase".
   *
   * This request holds the parameters needed by the rpurchaseendpoint server.  After setting any
   * optional parameters, call the {@link ListRPurchase#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public ListRPurchase listRPurchase() throws java.io.IOException {
    ListRPurchase result = new ListRPurchase();
    initialize(result);
    return result;
  }

  public class ListRPurchase extends RpurchaseendpointRequest<com.example.agriexpensett.rpurchaseendpoint.model.CollectionResponseRPurchase> {

    private static final String REST_PATH = "rpurchase";

    /**
     * Create a request for the method "listRPurchase".
     *
     * This request holds the parameters needed by the the rpurchaseendpoint server.  After setting
     * any optional parameters, call the {@link ListRPurchase#execute()} method to invoke the remote
     * operation. <p> {@link ListRPurchase#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @since 1.13
     */
    protected ListRPurchase() {
      super(Rpurchaseendpoint.this, "GET", REST_PATH, null, com.example.agriexpensett.rpurchaseendpoint.model.CollectionResponseRPurchase.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListRPurchase setAlt(java.lang.String alt) {
      return (ListRPurchase) super.setAlt(alt);
    }

    @Override
    public ListRPurchase setFields(java.lang.String fields) {
      return (ListRPurchase) super.setFields(fields);
    }

    @Override
    public ListRPurchase setKey(java.lang.String key) {
      return (ListRPurchase) super.setKey(key);
    }

    @Override
    public ListRPurchase setOauthToken(java.lang.String oauthToken) {
      return (ListRPurchase) super.setOauthToken(oauthToken);
    }

    @Override
    public ListRPurchase setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListRPurchase) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListRPurchase setQuotaUser(java.lang.String quotaUser) {
      return (ListRPurchase) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListRPurchase setUserIp(java.lang.String userIp) {
      return (ListRPurchase) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListRPurchase setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListRPurchase setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListRPurchase set(String parameterName, Object value) {
      return (ListRPurchase) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeRPurchase".
   *
   * This request holds the parameters needed by the rpurchaseendpoint server.  After setting any
   * optional parameters, call the {@link RemoveRPurchase#execute()} method to invoke the remote
   * operation.
   *
   * @param keyrep
   * @param namespace
   * @return the request
   */
  public RemoveRPurchase removeRPurchase(java.lang.String keyrep, java.lang.String namespace) throws java.io.IOException {
    RemoveRPurchase result = new RemoveRPurchase(keyrep, namespace);
    initialize(result);
    return result;
  }

  public class RemoveRPurchase extends RpurchaseendpointRequest<Void> {

    private static final String REST_PATH = "rpurchase/{keyrep}/{namespace}";

    /**
     * Create a request for the method "removeRPurchase".
     *
     * This request holds the parameters needed by the the rpurchaseendpoint server.  After setting
     * any optional parameters, call the {@link RemoveRPurchase#execute()} method to invoke the remote
     * operation. <p> {@link RemoveRPurchase#initialize(com.google.api.client.googleapis.services.Abst
     * ractGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param keyrep
     * @param namespace
     * @since 1.13
     */
    protected RemoveRPurchase(java.lang.String keyrep, java.lang.String namespace) {
      super(Rpurchaseendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.keyrep = com.google.api.client.util.Preconditions.checkNotNull(keyrep, "Required parameter keyrep must be specified.");
      this.namespace = com.google.api.client.util.Preconditions.checkNotNull(namespace, "Required parameter namespace must be specified.");
    }

    @Override
    public RemoveRPurchase setAlt(java.lang.String alt) {
      return (RemoveRPurchase) super.setAlt(alt);
    }

    @Override
    public RemoveRPurchase setFields(java.lang.String fields) {
      return (RemoveRPurchase) super.setFields(fields);
    }

    @Override
    public RemoveRPurchase setKey(java.lang.String key) {
      return (RemoveRPurchase) super.setKey(key);
    }

    @Override
    public RemoveRPurchase setOauthToken(java.lang.String oauthToken) {
      return (RemoveRPurchase) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveRPurchase setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveRPurchase) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveRPurchase setQuotaUser(java.lang.String quotaUser) {
      return (RemoveRPurchase) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveRPurchase setUserIp(java.lang.String userIp) {
      return (RemoveRPurchase) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String keyrep;

    /**

     */
    public java.lang.String getKeyrep() {
      return keyrep;
    }

    public RemoveRPurchase setKeyrep(java.lang.String keyrep) {
      this.keyrep = keyrep;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String namespace;

    /**

     */
    public java.lang.String getNamespace() {
      return namespace;
    }

    public RemoveRPurchase setNamespace(java.lang.String namespace) {
      this.namespace = namespace;
      return this;
    }

    @Override
    public RemoveRPurchase set(String parameterName, Object value) {
      return (RemoveRPurchase) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateRPurchase".
   *
   * This request holds the parameters needed by the rpurchaseendpoint server.  After setting any
   * optional parameters, call the {@link UpdateRPurchase#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.example.agriexpensett.rpurchaseendpoint.model.RPurchase}
   * @return the request
   */
  public UpdateRPurchase updateRPurchase(com.example.agriexpensett.rpurchaseendpoint.model.RPurchase content) throws java.io.IOException {
    UpdateRPurchase result = new UpdateRPurchase(content);
    initialize(result);
    return result;
  }

  public class UpdateRPurchase extends RpurchaseendpointRequest<com.example.agriexpensett.rpurchaseendpoint.model.RPurchase> {

    private static final String REST_PATH = "rpurchase";

    /**
     * Create a request for the method "updateRPurchase".
     *
     * This request holds the parameters needed by the the rpurchaseendpoint server.  After setting
     * any optional parameters, call the {@link UpdateRPurchase#execute()} method to invoke the remote
     * operation. <p> {@link UpdateRPurchase#initialize(com.google.api.client.googleapis.services.Abst
     * ractGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.example.agriexpensett.rpurchaseendpoint.model.RPurchase}
     * @since 1.13
     */
    protected UpdateRPurchase(com.example.agriexpensett.rpurchaseendpoint.model.RPurchase content) {
      super(Rpurchaseendpoint.this, "PUT", REST_PATH, content, com.example.agriexpensett.rpurchaseendpoint.model.RPurchase.class);
    }

    @Override
    public UpdateRPurchase setAlt(java.lang.String alt) {
      return (UpdateRPurchase) super.setAlt(alt);
    }

    @Override
    public UpdateRPurchase setFields(java.lang.String fields) {
      return (UpdateRPurchase) super.setFields(fields);
    }

    @Override
    public UpdateRPurchase setKey(java.lang.String key) {
      return (UpdateRPurchase) super.setKey(key);
    }

    @Override
    public UpdateRPurchase setOauthToken(java.lang.String oauthToken) {
      return (UpdateRPurchase) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateRPurchase setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateRPurchase) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateRPurchase setQuotaUser(java.lang.String quotaUser) {
      return (UpdateRPurchase) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateRPurchase setUserIp(java.lang.String userIp) {
      return (UpdateRPurchase) super.setUserIp(userIp);
    }

    @Override
    public UpdateRPurchase set(String parameterName, Object value) {
      return (UpdateRPurchase) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Rpurchaseendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Rpurchaseendpoint}. */
    @Override
    public Rpurchaseendpoint build() {
      return new Rpurchaseendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link RpurchaseendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setRpurchaseendpointRequestInitializer(
        RpurchaseendpointRequestInitializer rpurchaseendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(rpurchaseendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
