package labten;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import labten.data.ResultsTable;
import org.junit.Test;

import java.util.Arrays;

/**
 * A JUnit test suite for ResultsTable.
 * @author
 */

public class TestResultsTable {

  @Test
  public void testConstructResultsTableNotNull() {
    ResultsTable table = new ResultsTable(5);
    long[][] results = table.getResultsTable();
    assertTrue(results != null);
  }
}
