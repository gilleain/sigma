package net.torrance.gilleain.sigma;

/**
 * The main action, in a testable place.
 */
public class IsomorphismTester {

  public IsomorphismResult test(SimpleGraph graphA, SimpleGraph graphB) {
    IsomorphismResult result = new IsomorphismResult();

    if (graphA.getVertexCount() != graphB.getVertexCount()) {
      result.setIsomorphic(false);
      return result;
    }

    if (graphA.edges.size() != graphB.edges.size()) {
      result.setIsomorphic(false);
      return result;
    }

    if (!isSignatureIsomorphic(graphA, graphB)) {
      result.setIsomorphic(false);
      return result;
    }

    result.setIsomorphic(true);
    return result;
  }

  public boolean isSignatureIsomorphic(SimpleGraph graphA, SimpleGraph graphB) {
    SimpleGraphSignature sigA = new SimpleGraphSignature(graphA);
    SimpleGraphSignature sigB = new SimpleGraphSignature(graphB);

    String maxCertA = sigA.getMaximalSignature();
    String maxCertB = sigB.getMaximalSignature();

    return maxCertA.equals(maxCertB);
  }

}

