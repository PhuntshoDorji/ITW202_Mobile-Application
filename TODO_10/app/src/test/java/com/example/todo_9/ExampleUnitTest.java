package com.example.todo_9;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(JUnit4.class)

public class ExampleUnitTest {
    private Calculator calc;
    @Before
    public void setUp(){
        calc= new Calculator();

    }
    @Test
    public void addTwoNumber() {
        double result= calc.Add(1d, 2d);
        assertThat(result,is(equalTo(3d)));
    }
    @Test
    public void AddTwoNumberNegative(){
        double result= calc.Add(-2d,1d);
        assertThat(result,is(equalTo(-1d)));
    }
    @Test
    public void AddTwoNumberFloat(){
        double result=calc.Add(1.11f,2.11f);
        assertThat(result,is(closeTo(3.21,0.01)));
    }
    @Test
    public void subTwoNumber() {
        double result= calc.Sub(1d, 2d);
        assertThat(result,is(equalTo(-1d)));
    }
    @Test
    public void subTwoNumberNegative() {
        double result= calc.Sub(-1d, 2d);
        assertThat(result,is(equalTo(-3d)));
    }
    @Test
    public void subTwoNumberFloat(){
        double result=calc.Sub(1.11f,2.11f);
        assertThat(result,is(closeTo(-1.00,0.01)));
    }
    @Test
    public void mulTwoNumber() {
        double result= calc.Mul(1d, 2d);
        assertThat(result,is(equalTo(2d)));
    }
    @Test
    public void mulTwoNumberzero() {
        double result= calc.Mul(0d, 0d);
        assertThat(result,is(equalTo(0d)));
    }
    @Test
    public void divTwoNumber() {
        double result= calc.Div(2d, 2d);
        assertThat(result,is(equalTo(1d)));
    }
    @Test
    public void divTwoNumberZero() {
        double result= calc.Div(445d, 0d);
        assertThat(result, is(equalTo(Double.POSITIVE_INFINITY)));
    }


}