package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    UserDemography userDemography;

    @Before
    public void setUp() throws Exception
    {
        userDemography = UserDemographyFactory.buildUserDemography( "Kay@gmail.com", "Manager", "GF-12222", "RF-1111", new Date());
    }

    @Test
    public void buildUserDemography() {

        Assert.assertEquals("Kay@gmail.com", userDemography.getUserEmail());
        Assert.assertEquals("Manager", userDemography.getUserTitle());
        Assert.assertEquals("GF-12222", userDemography.getGenderId());
        Assert.assertEquals("RF-1111", userDemography.getRaceId());
        Assert.assertEquals(new Date(), userDemography.getDateOfBirth());
        System.out.println(userDemography);
    }
}