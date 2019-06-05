/*
 * Microsoft Bot Connector API - v3.0
 * The Bot Connector REST API allows your bot to send and receive messages to channels configured in the  [Bot Framework Developer Portal](https://dev.botframework.com). The Connector service uses industry-standard REST  and JSON over HTTPS.    Client libraries for this REST API are available. See below for a list.    Many bots will use both the Bot Connector REST API and the associated [Bot State REST API](/en-us/restapi/state). The  Bot State REST API allows a bot to store and retrieve state associated with users and conversations.    Authentication for both the Bot Connector and Bot State REST APIs is accomplished with JWT Bearer tokens, and is  described in detail in the [Connector Authentication](/en-us/restapi/authentication) document.    # Client Libraries for the Bot Connector REST API    * [Bot Builder for C#](/en-us/csharp/builder/sdkreference/)  * [Bot Builder for Node.js](/en-us/node/builder/overview/)  * Generate your own from the [Connector API Swagger file](https://raw.githubusercontent.com/Microsoft/BotBuilder/master/CSharp/Library/Microsoft.Bot.Connector.Shared/Swagger/ConnectorAPI.json)    � 2016 Microsoft
 *
 * OpenAPI spec version: v3
 * Contact: botframework@microsoft.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Channel account information needed to route a message
 */
@ApiModel(description = "Channel account information needed to route a message")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-29T10:06:15.114-07:00")
public class ChannelAccount {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("role")
  private RoleTypes role = null;

  public ChannelAccount id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Channel id for the user or bot on this channel (Example: joe@smith.com, or @joesmith or 123456)
   * @return id
  **/
  @ApiModelProperty(value = "Channel id for the user or bot on this channel (Example: joe@smith.com, or @joesmith or 123456)")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ChannelAccount name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Display friendly name
   * @return name
  **/
  @ApiModelProperty(value = "Display friendly name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChannelAccount role(RoleTypes role) {
    this.role = role;
    return this;
  }

   /**
   * Role of the entity behind the account (Example: User, Bot, etc.)
   * @return role
  **/
  @ApiModelProperty(value = "Role of the entity behind the account (Example: User, Bot, etc.)")
  public RoleTypes getRole() {
    return role;
  }

  public void setRole(RoleTypes role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelAccount channelAccount = (ChannelAccount) o;
    return Objects.equals(this.id, channelAccount.id) &&
        Objects.equals(this.name, channelAccount.name) &&
        Objects.equals(this.role, channelAccount.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, role);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelAccount {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

