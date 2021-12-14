package net.torrance.gilleain.sigma;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestIsomorphismTester {

  @Test
  public void testUnequalVertexCountTest() {
    SimpleGraph gA = new SimpleGraph("0:1,1:2");
    SimpleGraph gB = new SimpleGraph("0:1,1:2,2:3");

    IsomorphismResult result = new IsomorphismTester().test(gA, gB);
    assertEquals("Diferent number of vertices", false, result.isIsomorphic());
  }

  @Test
  public void testUnequalEdgeCountTest() {
    SimpleGraph gA = new SimpleGraph("0:1,1:2");
    SimpleGraph gB = new SimpleGraph("0:1,1:2,0:2");

    IsomorphismResult result = new IsomorphismTester().test(gA, gB);
    assertEquals("Diferent number of vertices", false, result.isIsomorphic());
  }

  @Test
  public void testNonMatchingSignatureTest() {
    SimpleGraph gA = new SimpleGraph("0:1,0:2,0:3");
    SimpleGraph gB = new SimpleGraph("0:1,1:2,0:2");

    IsomorphismResult result = new IsomorphismTester().test(gA, gB);
    assertEquals("Diferent number of vertices", false, result.isIsomorphic());
  }

  @Test
  public void testMatchingSignatureTest() {
    SimpleGraph gA = new SimpleGraph("0:1,0:2,1:3,2:3");
    SimpleGraph gB = new SimpleGraph("0:1,0:3,1:2,2:3");

    IsomorphismResult result = new IsomorphismTester().test(gA, gB);
    assertEquals("Diferent number of vertices", true, result.isIsomorphic());
  }

}

