package org.apache.avro.data;

import junit.framework.TestCase;
import org.apache.avro.Schema;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class TestIsValidValueRecordBuilderBase {


  private final Schema.Type typeSchema;
  private final Object value;

  public TestIsValidValueRecordBuilderBase(Schema.Type typeSchema, Object value){

    this.typeSchema = typeSchema;
    this.value = value;

  }

  @Parameterized.Parameters
  public static Collection getParameters() {

    return Arrays.asList(new Object[][]{

      {Schema.Type.NULL, null},
      {Schema.Type.INT, null},
      {Schema.Type.LONG, new Object()},
      {Schema.Type.FLOAT, new Object()},
      {Schema.Type.DOUBLE, new Object()},
      {Schema.Type.BYTES, new Object()},
      {Schema.Type.BOOLEAN, new Object()},
      {Schema.Type.STRING, new Object()},



    });
  }

  @Test
  public void test(){

    Schema.Field f = null;

    if(value==null && typeSchema != Schema.Type.NULL) {
      f = new Schema.Field("f", Schema.create(typeSchema), null, null);
      Assert.assertFalse(RecordBuilderBase.isValidValue(f, value));
      return;
    }
    if(value!=null){
      f = new Schema.Field("f", Schema.create(typeSchema), null, null);
      Assert.assertTrue(RecordBuilderBase.isValidValue(f, value));
      return;
    }

  }

  @Test
  public void testForUnion(){

    // Verify that null values are not valid for a union with no null type:
    Schema unionWithoutNull = Schema.createUnion(Arrays.asList(Schema.create(Schema.Type.STRING), Schema.create(Schema.Type.LONG)));

    Assert.assertTrue(RecordBuilderBase.isValidValue(new Schema.Field("f", unionWithoutNull, null, null), new Object()));
    Assert.assertFalse(RecordBuilderBase.isValidValue(new Schema.Field("f", unionWithoutNull, null, null), null));

    // Verify that null values are valid for a union with a null type:
    Schema unionWithNull = Schema.createUnion(Arrays.asList(Schema.create(Schema.Type.STRING), Schema.create(Schema.Type.NULL)));

    Assert.assertTrue(RecordBuilderBase.isValidValue(new Schema.Field("f", unionWithNull, null, null), new Object()));
    Assert.assertTrue(RecordBuilderBase.isValidValue(new Schema.Field("f", unionWithNull, null, null), null));
  }

}
