package artifactory.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static net.sourceforge.jwebunit.junit.JWebUnit.setTestingEngineKey;
import static net.sourceforge.jwebunit.junit.JWebUnit.setBaseUrl;
import static net.sourceforge.jwebunit.junit.JWebUnit.beginAt;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertTitleEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
    
    
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    @Before
    public void prepare() {
        setTestingEngineKey(TestingEngineRegistry.TESTING_ENGINE_HTMLUNIT); 
        setBaseUrl("http://35.200.147.21:31000/project-1.0-RAMA/");
    }
 
    @Test
    public void testLoginPage() {
        beginAt("index.html");
        System.out.println("Verified the Tittle and Url");    
        assertTitleEquals("Welcome to Continous Integration with Jenkins in AWS Yottabyte session");
    }
  
}
