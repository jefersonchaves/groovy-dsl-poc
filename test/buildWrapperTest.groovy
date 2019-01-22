import com.lesfurets.jenkins.unit.BasePipelineTest
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*

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
        assertThat(helper.callStack.findAll { call ->
            call.methodName == "echo"
        }.any { call ->
            callArgsToString(call).contains("Hello there")
        }).isTrue()
    }
}
