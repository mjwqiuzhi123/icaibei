package com.borrow.supermarket.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

public class NullSerializer extends JsonSerializer<Object>
{
  public void serialize(Object arg0, JsonGenerator jgen, SerializerProvider arg2)
    throws IOException, JsonProcessingException
  {
    jgen.writeString("");
  }
}