package org.apache.avro.specific;


import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericFixed;
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.EncoderFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RunWith(value = Parameterized.class)
public class TestGetSchemaSpecificData  {
  private final Object o;
  private final Object expected;


  @Parameterized.Parameters
  public static Collection getParameters() throws IOException {

    String stringArray = "{\"type\": \"array\", \"items\": \"null\"}";
    Schema schemaArray = new Schema.Parser().parse(stringArray);

    String stringFixed = "{\"type\" : \"fixed\" , \"name\" : \"data\", \"size\" : 1024}";
    Schema schemaFixed = new Schema.Parser().parse(stringFixed);
    byte[] genericFixedBytes = new byte[1024];


    String stringEnum = "{\"type\": \"enum\",\n" + "  \"name\": \"Suit\",\n"
      + "  \"symbols\" : [\"ARRAY\", \"INT\", \"DIAMONDS\", \"CLUBS\"]\n" + "}";
    Schema schemaEnum = new Schema.Parser().parse(stringEnum);

    String stringRecord = "{\"namespace\": \"example.avro\",\n" + " \"type\": \"record\",\n" + " \"name\": \"User\",\n"
      + " \"fields\": [\n" + "     {\"name\": \"name\", \"type\": \"string\"},\n"
      + "     {\"name\": \"country\",  \"type\": [\"string\", \"null\"]},\n"
      + "     {\"name\": \"favorite_color\", \"type\": [\"string\", \"null\"]}\n" + " ]\n" + "}";
    Schema schemaRecord = new Schema.Parser().parse(stringRecord);




    return Arrays.asList(new Object[][]{

      {5, "int"},
      {null,"null"},
      {5.0,"double"},
      {true, "boolean"},
      {5.2f,"float"},
      {12345678910L,"long"},
      {new Object(),null},
      {new GenericData.Array<>(3, schemaArray),"array"},
      {new GenericData.Fixed(schemaFixed, genericFixedBytes),"data"},
      {new GenericData.Record(schemaRecord),"example.avro.User"},
      {new GenericData.EnumSymbol(schemaEnum,stringEnum),"Suit"},
      {new HashMap<>(),"map"},



      //add for coverage
      {new BigDecimal("0.02"),"string"},
      {new BigInteger(String.valueOf(10)), "string"}



    });
  }

  public TestGetSchemaSpecificData(Object o, Object expected){

    this.o = o;
    this.expected=expected;

  }


  @Test
  public void test(){

    String result = null;

    try{
      result = SpecificData.get().getSchemaName(o);
    }catch( Exception e){
      Assert.assertEquals("Unknown datum type "+ o.getClass().getName()+": "+o,e.getMessage());
    }
    Assert.assertEquals(expected, result);
  }

}
