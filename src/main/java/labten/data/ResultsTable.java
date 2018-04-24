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
    results = new long [rowCount][COLUMN_NUMBER];
    currentRow = 0;
  }

  public long[][] ResultsTable() {
    return results;
  }

  public void addResult(long size, long timing) {
    results[currentRow][SIZE] = size;
    results[currentRow][TIMING] = timing;

    if (currentRow == FIRST_ROW) {
      results[currentRow][RATIO] = 0L;
    } else {
      if (results[currentRow - 1][TIMING] != 0L) {
        double ratio = ((double)timing / results[currentRow - 1][TIMING]);
        results[currentRow][RATIO] = Math.round(ratio);
      } else {
        results[currentRow][RATIO] = 0L;
      }
    }
    currentRow++;
    }
    public int getRowCount() {
      return currentRow;
    }
    public String toString() {
      String resultsTextual = Arrays.deepToString(results)
          .replace("], ", "\n")
          .replace(", ", "\t\t")
          .replace("[", "")
          .replace("[[", "")
          .replace("]]", "");
      return "Size (#)\tTiming (ms)\tRatio (#)\n" + resultsTextual;
    }
}
