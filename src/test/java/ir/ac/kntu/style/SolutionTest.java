/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ir.ac.kntu.style;

import ir.ac.kntu.ArrayReverse;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 10 points
 * @author mhrimaz
 */
public class SolutionTest {
    static {
        System.err.println("$$$GRADER$$$ | { type:\"MSG\" , key:\"TOTAL\" , value:20, priority:1  }  | $$$GRADER$$$");
    }
    @Test
    public void test1() {
        String[] array = new String[]{"A","B","C","D"};
        String[] res = new String[]{"D","C","B","A"};
        ArrayReverse.reverse(array);
        assertArrayEquals(res, array);
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:4 , reason:\"Test Passed.\" } | $$$GRADER$$$" );
    }

    @Test
    public void test2() {
        String[] array = new String[]{"A","B","C"};
        String[] res = new String[]{"C","B","A"};
        ArrayReverse.reverse(array);
        assertArrayEquals(res, array);
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:4 , reason:\"Test Passed.\" } | $$$GRADER$$$" );
    }
    
        @Test
    public void test3() {
        String[] array = new String[]{"A"};
        String[] res = new String[]{"A"};
        ArrayReverse.reverse(array);
        assertArrayEquals(res, array);
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:2 , reason:\"Test Passed.\" } | $$$GRADER$$$" );
    }
}
