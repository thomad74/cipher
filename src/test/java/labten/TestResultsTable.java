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

  @Test
  public void testResultsTableContainsRatio() {
    ResultsTable table = new ResultsTable(3);
    table.addResult(250L, 38L);
    table.addResult(500L, 122L);
    table.addResult(1000L, 533L);
    assertEquals(table.getRowCount(), 3);
    long[][] expected = { {250L, 38L, 0L}, {500L, 122L, 3L}, {1000L, 533L, 4L} };
    assertArrayEquals(table.getResultsTable(), expected);
  }

  @Test
  public void testResultsTableContainsTwoRows() {
    ResultsTable table = new ResultsTable(2);
    table.addResult(250L, 652L);
    assertEquals(table.getRowCount(), 1);
    long[][] expected = { {250L, 652L, 0L}, {0, 0, 0} };
    assertArrayEquals(table.getResultsTable(), expected);
  }

  @Test
  public void testResultsTableToStringDoesNotCrashWithTwoRows() {
    ResultsTable table = new ResultsTable(2);
    table.addResult(250L, 652L);
    assertEquals(table.getRowCount(), 1);
    assertTrue(table.toString() != null);
  }
}
