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

  private final int n1;
  private final int s1;
  private final int l1;
  private final int n2;
  private final int s2;
  private final int l2;
  private final int expected;

  public TestCompareBytesBinaryData(int n1, int s1, int l1, int n2, int s2, int l2, int expected) {

    this.n1 = n1;
    this.s1 = s1;
    this.l1 = l1;
    this.n2 = n2;
    this.s2 = s2;
    this.l2 = l2;
    this.expected = expected;

  }


  @Parameterized.Parameters
  public static Collection getParameters() {

    return Arrays.asList(new Object[][]{

      {5,0,5,5,0,5, 0}, //equals
      {5,0,5,5,0,2,3}, //b1>b2 return 5-2
      {12,0,12,5,0,5,7}, //b1>b2 return 12-5
      {5,0,5,12,0,12,-7}, //return negative number
      {5,0,5,12,0,12,-7},

      //pit
      {5,10,0,5,10,0, 0},
      {5,10,0,5,0,5, -5},
      {5,0,5,5,10,0, 5},

    });
  }

  @Test
  public void Test1() {

    byte[] b1 = new byte[n1];
    byte[] b2 = new byte[n2];
    int r;

    r=BinaryData.compareBytes(b1, s1, l1, b2, s2,l2);
    System.out.println(r);
    Assert.assertEquals(expected,r);

  }

  //introduce for coverage case a diverso da b
  @Test
  public void Test2() {

    byte[] b1 = new byte[5];
    b1[0]=5;
    byte[] b2 = new byte[5];
    int r;
    int a = (b1[0] & 0xff);
    int b = (b2[0] & 0xff);
    int result = a-b;
    r=BinaryData.compareBytes(b1, 0, 5, b2, 0,5);
    Assert.assertEquals(result,r);


  }
}




