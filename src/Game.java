import Patterns.PatternGame;
import Patterns.Puzzle;

public class Game extends PatternGame {

  public static void main(String[] args) {
    Game game = new Game();
  }

  /** Blue Blue Blue Blue Blue Orange */
  @Override
  public void puzzle0(Puzzle pattern) {
    for (int counter = 0; counter < 5; counter++) {
      pattern.blue();
    }
    pattern.orange();
  }

  /**
   * ROYGBP ROYGBP ROYGBP
   *
   * <p>Red Orange Yellow Blue Green Purple Red Orange Yellow Blue Green Purple Red Orange Yellow
   * Blue Green Purple
   */
  @Override
  public void puzzle1(Puzzle pattern) {
    for (int counter = 0; counter < 3; counter++) {
      pattern.red();
      pattern.orange();
      pattern.yellow();
      pattern.green();
      pattern.blue();
      pattern.purple();
    }
  }

  /** Blue Blue Blue Blue Blue ... Blue (15 blues) */
  @Override
  public void puzzle2(Puzzle pattern) {
    // --- Write code below that matches puzzle 2 ---
    for (int counter = 0; counter < 15; counter++) {
      pattern.blue();
    }
    // ---- end puzzle 2 code -----
  }

  /** Blue Orange Blue Orange Blue Orange Blue Orange */
  @Override
  public void puzzle3(Puzzle pattern) {
    // --- Write code below that matches puzzle 3 ---
    for (int counter = 0; counter < 4; counter++) {
      pattern.blue();
      pattern.orange();
      // ---- end puzzle 3 code -----
    }
  }

  /** Blue Orange Blue Orange Blue Orange Blue Orange Purple */
  @Override
  public void puzzle4(Puzzle pattern) {
    // --- Write code below that matches puzzle 4 ---
    puzzle3(pattern);
    pattern.purple();
    // ---- end puzzle 4 code -----

  }

  /** Purple Blue Orange Blue Orange Blue Orange Blue Orange Purple */
  @Override
  public void puzzle5(Puzzle pattern) {
    // --- Write code below that matches puzzle 5 ---
    pattern.purple();
    puzzle4(pattern);
    // ---- end puzzle 5 code -----
  }

  /** Orange Blue Orange Blue Orange Blue Orange Purple */
  @Override
  public void puzzle6(Puzzle pattern) {
    // --- Write code below that matches puzzle 6 ---
    for (int counter=0;counter<3;counter++){
        pattern.orange();
        pattern.blue();
    }
    pattern.orange();
    pattern.purple();
      // ---- end puzzle 6 code -----
    }


  /**
   * GBO-GBO-GBO-GBO PBO-PBO-PBO-PBO
   *
   * <p>Green Blue Orange Green Blue Orange Green Blue Orange Purple Blue Orange Purple Blue Orange
   * Purple Blue Orange
   */
  @Override
  public void puzzle7(Puzzle pattern) {
    // --- Write code below that matches puzzle 7 ---
        for (int counter=0;counter<4;counter++){
            pattern.green();
            pattern.blue();
            pattern.orange();
        }
        for (int counter=0;counter<4;counter++){
            pattern.purple();
            pattern.blue();
            pattern.orange();
        }
    // ---- end puzzle 7 code -----
  }

  /**
   * R BOBOBO G PYPYPY R
   *
   * <p>Red Blue Orange Blue Orange Blue Orange Green Purple Yellow Purple Yellow Purple Yellow Red
   */
  @Override
  public void puzzle8(Puzzle pattern) {
    // --- Write code below that matches puzzle 8 ---
        pattern.red();
        for (int counter=0;counter<3;counter++){
            pattern.blue();
            pattern.orange();
        }
        pattern.green();
        for (int counter=0;counter<3;counter++){
            pattern.purple();
            pattern.yellow();
        }
        pattern.red();
    // ---- end puzzle 8 code -----
  }

  /** YRBOBOBOBOG YRBOBOBOBOG YRBOBOBOBOG YRBOBOBOBOG */
  @Override
  public void puzzle9(Puzzle pattern) {
    // --- Write code below that matches puzzle 9 ---
      for (int counter=0;counter<4;counter++){
          pattern.yellow();
          pattern.red();
          puzzle3(pattern);
          pattern.green();
      }

    // ---- end puzzle 9 code -----
  }
}
