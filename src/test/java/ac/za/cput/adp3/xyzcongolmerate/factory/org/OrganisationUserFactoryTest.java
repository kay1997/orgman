package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    OrganisationUser organisationUser;

    @Before
    public void setUp() throws Exception
    {
        organisationUser = OrganisationUserFactory.buildOrganisationUser("OG-123", "Kay@gmail.com");
    }

    @Test
    public void buildOrganisationUser() {

        Assert.assertEquals("OG-123", organisationUser.getOrgCode());
        Assert.assertEquals("Kay@gmail.com", organisationUser.getUserEmail());
        System.out.println(organisationUser);
    }
}