import org.junit.Test;


public class SmokeTest extends BaseTest
{
	HomePage hp;
	MenPage mp;
	@Test
	public void test1()
	{
	  hp=new HomePage(dr);
	  mp=hp.clickMen().get();
	  mp.verifyMenTitle();
	}

}
