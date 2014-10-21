package weivretni.mixpanel;

import junit.framework.Assert;

import org.junit.Test;

public class SudokuTst {

    private Sudoku source = new Sudoku();

    @Test
    public void tst() {
        Assert.assertFalse(source.is_valid_sudoku_solution("6"));
        Assert.assertTrue(source.is_valid_sudoku_solution("3579642814681235799125874636317958427243186958952461371764593285836712914249831756"));
        Assert.assertTrue(source.is_valid_sudoku_solution("357964281468123579912587463631795842724318695895246137176459328583672914249831756"));
        Assert.assertFalse(source.is_valid_sudoku_solution("457964281468123579912587463631795842724318695895246137176459328583672914249831756"));
        Assert.assertFalse(source.is_valid_sudoku_solution("357964281368124579912587463631795842724318695895246137176459328583672914249831756"));
        Assert.assertFalse(source.is_valid_sudoku_solution("357964281368123579912587463631795842724318695895246137176459328583672914249831756"));
        Assert.assertFalse(source.is_valid_sudoku_solution("057964281368123579912587463631795842724318695895246137176459328583672914249831756"));
        Assert.assertFalse(source.is_valid_sudoku_solution("A57964281368123579912587463631795842724318695895246137176459328583672914249831756"));
    }
}
