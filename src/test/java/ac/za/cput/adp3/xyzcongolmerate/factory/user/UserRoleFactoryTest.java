package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    UserRole userRole;

    @Before
    public void setUp() throws Exception
    {
        userRole = UserRoleFactory.buildUserRole("OF-123", "Kay@gmail.com", "RF-101");
    }
    @Test
    public void buildUserRole() {

        Assert.assertEquals("OF-123", userRole.getOrgCode());
        Assert.assertEquals("Kay@gmail.com", userRole.getUserEmail());
        Assert.assertEquals("RF-101", userRole.getRoleId());
        System.out.println(userRole);
    }
}