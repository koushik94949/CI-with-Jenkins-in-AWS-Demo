package junitwebapp;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertLinkPresent;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertTitleEquals;
import static net.sourceforge.jwebunit.junit.JWebUnit.beginAt;
import static net.sourceforge.jwebunit.junit.JWebUnit.clickLink;
import static net.sourceforge.jwebunit.junit.JWebUnit.setBaseUrl;
import static net.sourceforge.jwebunit.junit.JWebUnit.setTestingEngineKey;
 
import org.junit.Before;
import org.junit.Test;
 
import net.sourceforge.jwebunit.util.TestingEngineRegistry;
 
 
public class JWebUnitTest {
    @Before
    public void prepare() {
        setTestingEngineKey(TestingEngineRegistry.TESTING_ENGINE_HTMLUNIT); 
        setBaseUrl("http://localhost:8080/junitwebapp");
    }
 
    @Test
    public void testLoginPage() {
        beginAt("index.html"); 
        assertTitleEquals("Welcome to Worldclass DevOps Workshop batch2 ");
        assertTitleEquals("Hello  DevOps Engineers and Architects!");
    }
     
}
