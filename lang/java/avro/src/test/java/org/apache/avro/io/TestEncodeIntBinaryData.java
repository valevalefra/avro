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
  private final Object expected;

  public TestEncodeIntBinaryData(int n, int bufSize, int pos, Object expected){

    this.n = n;
    this.bufSize = bufSize;
    this.pos = pos;
    this.expected = expected;
  }


  @Parameterized.Parameters
  public static Collection getParameters() {

    return Arrays.asList(new Object[][]{

      {1, 5, 1, 1},
      {-1, 5, -1, 1},
      {0, 0, 0, "Index 1 out of bounds for length 0"},

      //coverage
      {999999999, 10, 0, 5},
      {1027, 3, 0, 2},
      {1046666, 10, 0, 3},
      {134000000, 10, 0, 4},




    });
  }

  @Test
  public void Test(){

    int result=0;
    byte[] buf = new byte[bufSize];
    try {
     result = BinaryData.encodeInt(n, buf, 1);
     Assert.assertEquals(expected,result);
  }
    catch(Exception e){

    Assert.assertEquals(expected,e.getMessage());
  }

  }

}
