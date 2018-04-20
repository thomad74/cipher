package labten.data;

import java.util.Arrays;

/**
* A results table that stores data from running a timing experiment
*/

public class ResultsTable {

  private long[][] results;

  private int currentRow;

  private static final int FIRST_ROW = 0;

  private static final int COLUMN_NUMBER = 3;

  private static final int SIZE = 0;

  private static final int TIMING = 1;

  private static final int RATIO = 2;


  public ResultsTable(int rowCount) {
    results = new long [rowCount][COLUMN_NUMBER]
  }
}
