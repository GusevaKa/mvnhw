package ru.netology.srvices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {

    @Test

    public void testMonthOfVacation(){
        VacationService service = new VacationService();

        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;

        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
