package org.apache.avro.io;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class TestCompareBytesBinaryData {

  private final byte[] b1;
  private final int s1;
  private final int l1;
  private final byte[] b2;
  private final int s2;
  private final int l2;
  private final int expected;

  public TestCompareBytesBinaryData(byte[] b1, int s1, int l1, byte[] b2, int s2, int l2, int expected) {

    this.b1 = b1;
    this.s1 = s1;
    this.l1 = l1;
    this.b2 = b2;
    this.s2 = s2;
    this.l2 = l2;
    this.expected = expected;

  }


  @Parameterized.Parameters
  public static Collection getParameters() {

    return Arrays.asList(new Object[][]{

      //suite minimale
      {new byte[0],0,0,new byte[0],0,0, 0},
      {new byte[0],-1,-1,new byte[0],-1,-1, 0},
      {"proof1".getBytes(),1,5,"proof2".getBytes(),1,5, -1},

      //coverage
      {new byte[5],1,1,new byte[5],1,0,1},

      //pit
      {"proof1".getBytes(),1,5,"proof2".getBytes(),1,4, 1},
      {"proof1".getBytes(),1,4,"proof3".getBytes(),1,5,-1},

    });
  }

  @Test
  public void Test1() {

    int result;

    result=BinaryData.compareBytes(b1, s1, l1, b2, s2,l2);
    Assert.assertEquals(expected,result);

  }


}




