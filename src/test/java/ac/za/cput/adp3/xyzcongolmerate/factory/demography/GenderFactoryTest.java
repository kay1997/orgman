package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenderFactoryTest {

    Gender gender;

    @Before
    public void setUp() throws Exception
    {
        gender = GenderFactory.buildGender("Male");
    }

    @Test
    public void buildGender() {

        System.out.println(gender);
        Assert.assertNotNull(gender.getGenderId());
    }
}