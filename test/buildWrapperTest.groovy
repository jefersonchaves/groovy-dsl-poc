import org.junit.*
import com.lesfurets.jenkins.unit.*
import static groovy.test.GroovyAssert.*

class buildWrapperTest extends BasePipelineTest {
        
    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp()
    }

    @Test
    public void should_execute_without_errors() throws Exception {
        def script = loadScript("vars/buildWrapper.groovy")
        script.call()
        printCallStack()
    }
}
