/*
 * service.proto
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: version not set
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A Hat is a piece of headwear made by a Haberdasher.
 */
@ApiModel(description = "A Hat is a piece of headwear made by a Haberdasher.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-26T23:54:16.913Z")
public class ExampleHat {
  @SerializedName("size")
  private Integer size = null;

  @SerializedName("color")
  private String color = null;

  @SerializedName("name")
  private String name = null;

  public ExampleHat size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * The size of a hat should always be in inches.
   * @return size
  **/
  @ApiModelProperty(value = "The size of a hat should always be in inches.")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public ExampleHat color(String color) {
    this.color = color;
    return this;
  }

   /**
   * The color of a hat will never be &#39;invisible&#39;, but other than that, anything is fair game.
   * @return color
  **/
  @ApiModelProperty(value = "The color of a hat will never be 'invisible', but other than that, anything is fair game.")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public ExampleHat name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of a hat is it&#39;s type. Like, &#39;bowler&#39;, or something.
   * @return name
  **/
  @ApiModelProperty(value = "The name of a hat is it's type. Like, 'bowler', or something.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExampleHat exampleHat = (ExampleHat) o;
    return Objects.equals(this.size, exampleHat.size) &&
        Objects.equals(this.color, exampleHat.color) &&
        Objects.equals(this.name, exampleHat.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, color, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExampleHat {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
