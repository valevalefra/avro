package org.apache.avro.io;

import junit.framework.TestCase;
import org.apache.avro.Schema;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class TestEncodeIntBinaryData  {


  private final int n;
  private final int bufSize;
  private final int pos;
  private final int expected;

  public TestEncodeIntBinaryData(int n, int bufSize, int pos, int expected){

    this.n = n;
    this.bufSize = bufSize;
    this.pos = pos;
    this.expected = expected;
  }


  @Parameterized.Parameters
  public static Collection getParameters() {

    return Arrays.asList(new Object[][]{

      {127, 5, 0, 2},
     // {999999999, 5, 0, 2}, //overflow
      {999999999, 10, 0, 5}, //caso che ricopre tutti gli if
      {4, 5, 0, 1},//caso nessun if
      {1027, 3, 0, 2},

      //introduce for Pit
      {8156, 10, 0, 2},
      {1046666, 10, 0, 3},
      {134000000, 10, 0, 4},



    });
  }

  @Test
  public void Test(){

    byte[] buf = new byte[bufSize];
    int result=BinaryData.encodeInt(n, buf, 1);
    Assert.assertEquals(expected,result);

  }

}
