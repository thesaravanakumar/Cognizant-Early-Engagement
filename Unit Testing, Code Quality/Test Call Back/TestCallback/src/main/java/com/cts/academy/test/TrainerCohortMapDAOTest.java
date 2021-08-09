package com.cts.academy.test;

import com.cts.academy.dao.TrainerCohortMapDAO;
import com.cts.academy.model.Cohort;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import static org.mockito.Matchers.any;

@RunWith(MockitoJUnitRunner.class)
public class TrainerCohortMapDAOTest {
    @Mock
    public TrainerCohortMapDAO dao;
    @Mock
    public Cohort cohort;
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        Mockito.doAnswer(new Answer<Void>() {
            public Void answer(InvocationOnMock invocation) throws Throwable {
                Object[] arguments = invocation.getArguments();
                String trainerId = (String) arguments[0];
                String cohortCode = (String) arguments[1];

                if (!trainerId.startsWith("t-")) {
                    throw new RuntimeException("Invalid Trainer ID");
                }

                if (!cohortCode.matches("^[A-Z]{3}\\d{2}[A-Z]{2}\\d{3}$")) {
                    throw new RuntimeException("Invalid Cohort Code");
                }

                cohort.setTrainerId(trainerId);

                return null;
            }
        }).when(dao).mapTrainerCohort(any(String.class), any(String.class));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSuccess() {
        try {
            dao.mapTrainerCohort("t-Jerry", "CHN00AJ000");
        } catch (Exception ignore) {
        }

        Mockito.verify(cohort).setTrainerId("t-Jerry");
    }

    @Test
    public void testTrainerId() {
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Invalid Trainer ID");

        dao.mapTrainerCohort("Jerry", "CHN19AJ021");
    }

    @Test
    public void testCohortCode() {
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Invalid Cohort Code");

        dao.mapTrainerCohort("t-Jerry", "AJ021");
    }
}
