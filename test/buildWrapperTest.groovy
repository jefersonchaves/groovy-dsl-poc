import com.lesfurets.jenkins.unit.BasePipelineTest
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.assertThat

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
        assertThat(true).isTrue()
    }
}
