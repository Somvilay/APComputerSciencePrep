package com.example.andykhuu.apcomputerscienceprep.test;

import com.example.andykhuu.apcomputerscienceprep.Question;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Anthony on 6/12/2017.
 */
public class QuestionTest {
    Question q = new Question("__________ is the brain of a computer.",
            "Hardware",
            "CPU",
            "Memory",
            "Disk",
            "Power Button",
            1,
            0);

    @Test
    public void getUNITID_IDMatch() throws Exception {
        assertEquals(0,q.getUNITID());
    }

    @Test
    public void getUNITID_IDTooHigh() throws Exception {
        assertNotEquals(1000000,q.getUNITID());
    }

    @Test
    public void getUNITID_IDTooLow() throws Exception {
        assertNotEquals(1000000,q.getUNITID());
    }

    @Test
    public void getQuestionPass() throws Exception {
        assertEquals("__________ is the brain of a computer.", q.getQuestion());
    }

    @Test
    public void getQuestionFail() throws Exception {
        assertEquals("__________ is the brain of a computer.", q.getQuestion());
    }
    @Test
    public void getAnswers() throws Exception {
        String[] str = {"Hardware", "CPU", "Memory", "Disk", "Power Button"};
        assertArrayEquals(str, q.getAnswers());
    }

    @Test
    public void getCorrectAnswer() throws Exception {
        assertEquals(1, q.getCorrectAnswer());
    }

}